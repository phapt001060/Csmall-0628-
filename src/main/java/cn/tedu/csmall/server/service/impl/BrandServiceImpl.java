package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.controller.BrandController;
import cn.tedu.csmall.server.mapper.BrandMapper;
import cn.tedu.csmall.server.pojo.dto.BrandAddNewDTO;
import cn.tedu.csmall.server.pojo.entity.Brand;
import cn.tedu.csmall.server.repo.IBrandRepository;
import cn.tedu.csmall.server.repo.impl.BrandRepositoryImpl;
import cn.tedu.csmall.server.repo.impl.BrandRepositoryImpl2;
import cn.tedu.csmall.server.service.IBrandService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class BrandServiceImpl implements IBrandService {

    @Autowired
    public IBrandRepository brandRepository;

    @Autowired
    private BrandMapper brandMapper;

    public BrandServiceImpl() {
        System.out.println("BrandServiceImpl的构造方法已经执行");
    }

    @Override
    public void addNew(BrandAddNewDTO brandAddNewDTO) {
        log.debug("准备开始处理增加品牌的业务，参数：{}", brandAddNewDTO);
        // 检查此品牌（尝试增加的品牌）的名称有没有被使用
        // 如果已经被使用，则不允许增加
        String name = brandAddNewDTO.getName();
        int count = brandMapper.countByName(name);
        if(count > 0){
            throw new RuntimeException("增加类别失败，类别名称【" + name + "】已经被占用！");
        }
        // 创建实体对象 mapper的方法的参数是实体类型
        Brand brand = new Brand();
        // 将当前方法参数的值复制到Brand实体类型的对象中
        BeanUtils.copyProperties(brandAddNewDTO, brand);
        //补全属性值
        brand.setSales(0);
        brand.setProductCount(0);
        brand.setCommentCount(0);
        brand.setPositiveCommentCount(0);
        brand.setEnable(1);

        // 将品牌数据写入到数据库中
        brandMapper.insert(brand);
    }
}
