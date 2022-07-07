package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.mapper.BrandMapper;
import cn.tedu.csmall.server.pojo.dto.BrandAddNewDTO;
import cn.tedu.csmall.server.pojo.entity.Brand;
import cn.tedu.csmall.server.repo.IBrandRepository;
import cn.tedu.csmall.server.service.IBrandService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 品牌业务实现
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Service
public class BrandServiceImpl implements IBrandService {

    @Autowired
    private IBrandRepository brandRepository;
    @Autowired
    private BrandMapper brandMapper;

    public BrandServiceImpl() {
        log.debug("创建业务逻辑对象：BrandServiceImpl");
    }

    @Override
    public void addNew(BrandAddNewDTO brandAddNewDTO) {
        log.debug("开始处理创建品牌的业务，参数：{}", brandAddNewDTO);
        // 检查此品牌（尝试创建的品牌）的名称有没有被使用
        // 如果已经被使用，则不允许创建
        String name = brandAddNewDTO.getName();
        int count = brandMapper.countByName(name);
        if (count > 0) {
            String message = "创建品牌失败，品牌名称【" + name + "】已经被占用！";
            log.error(message);
            throw new RuntimeException(message);
        }

        // 创建实体对象（Mapper的方法的参数是实体类型）
        Brand brand = new Brand();

        // 将当前方法参数的值复制到Brand实体类型的对象中
        BeanUtils.copyProperties(brandAddNewDTO, brand);
        // 补全属性值（不由客户端提交的属性的值，应该在插入之前补全）
        brand.setSales(0);
        brand.setProductCount(0);
        brand.setCommentCount(0);
        brand.setPositiveCommentCount(0);
        brand.setEnable(1);

        // 将品牌数据写入到数据库中
        log.debug("即将向表中写入数据：{}", brand);
        brandMapper.insert(brand);
    }

}
