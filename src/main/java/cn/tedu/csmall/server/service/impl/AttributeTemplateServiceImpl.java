package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.ex.ServiceException;
import cn.tedu.csmall.server.mapper.AttributeTemplateMapper;
import cn.tedu.csmall.server.pojo.dto.AttributeTemplateAddNewDTO;
import cn.tedu.csmall.server.pojo.entity.AttributeTemplate;
import cn.tedu.csmall.server.repo.IAttributeTemplateRepository;
import cn.tedu.csmall.server.service.IAttributeTemplateService;
import cn.tedu.csmall.server.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 属性模板业务实现
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Service
public class AttributeTemplateServiceImpl implements IAttributeTemplateService {

    @Autowired
    private IAttributeTemplateRepository attributeTemplateRepository;
    @Autowired
    private AttributeTemplateMapper attributeTemplateMapper;

    public AttributeTemplateServiceImpl() {
        log.debug("创建业务逻辑对象：AttributeTemplateServiceImpl");
    }

    @Override
    public void addNew(AttributeTemplateAddNewDTO attributeTemplateAddNewDTO) {
        log.debug("开始处理创建属性模板的业务，参数：{}", attributeTemplateAddNewDTO);
        // 根据参数中的name，调用Mapper的countByName()进行统计
        String name = attributeTemplateAddNewDTO.getName();
        int count = attributeTemplateMapper.countByName(name);
        // 判断统计结果是否大于0
        if (count > 0) {
            // 是：抛出异常
            String message = "创建属性模板失败，属性模板名称【" + name + "】已经被占用！";
            log.error(message);
            throw new ServiceException(ServiceCode.ERR_CONFLICT, message);
        }

        // （注意：不需要写if对应的else，因为抛出异常就不会继续向下执行，如果能执行到下面的代码则不满足if条件）

        // 创建AttributeTemplate类型的对象
        AttributeTemplate attributeTemplate = new AttributeTemplate();
        // 将参数中的值复制到以上创建的对象中
        BeanUtils.copyProperties(attributeTemplateAddNewDTO, attributeTemplate);
        // 判断AttributeTemplate的sort有没有值，如果没有，则设置为0
        if (attributeTemplate.getSort() == null) {
            attributeTemplate.setSort(0);
        }

        // 调用Mapper的insert()方法执行插入数据，并获取返回结果
        int rows = attributeTemplateMapper.insert(attributeTemplate);
        // 如果返回结果不为1，则抛出异常
        if (rows != 1) {
            String message = "创建属性模板失败，服务器忙，请稍后再次尝试！";
            log.error(message);
            throw new ServiceException(ServiceCode.ERR_INSERT, message);
        }
    }

}
