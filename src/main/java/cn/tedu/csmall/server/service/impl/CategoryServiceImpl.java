package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.mapper.CategoryMapper;
import cn.tedu.csmall.server.pojo.dto.CategoryAddNewDTO;
import cn.tedu.csmall.server.pojo.entity.Brand;
import cn.tedu.csmall.server.pojo.entity.Category;
import cn.tedu.csmall.server.repo.ICategoryRepository;
import cn.tedu.csmall.server.service.ICategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类别业务实现
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;
    @Autowired
    private CategoryMapper categoryMapper;

    public CategoryServiceImpl() {
        log.debug("创建业务逻辑对象：CategoryServiceImpl");
    }

    @Override
    public void addNew(CategoryAddNewDTO categoryAddNewDTO) {
        log.debug("开始处理创建类别的业务，参数：{}", categoryAddNewDTO);
        // 检查此类别（尝试创建的类别）的名称有没有被使用
        // 如果已经被使用，则不允许创建
        String name = categoryAddNewDTO.getName();
        int count = categoryMapper.countByName(name);
        if (count > 0) {
            String message = "创建类别失败，类别名称【" + name + "】已经被占用！";
            log.error(message);
            throw new RuntimeException(message);
        }

        // 创建实体对象（Mapper的方法的参数是实体类型）
        Category category = new Category();

        // 将当前方法参数的值复制到Brand实体类型的对象中
        BeanUtils.copyProperties(categoryAddNewDTO, category);
        // 补全属性值（不由客户端提交的属性的值，应该在插入之前补全）
        category.setDepth(0); // 临时
        category.setIsParent(0); // 临时

        // 将类别数据写入到数据库中
        log.debug("即将向表中写入数据：{}", category);
        categoryMapper.insert(category);
    }

}
