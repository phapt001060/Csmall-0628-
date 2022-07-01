package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Brand;

public interface BrandMapper {

    /**
     * 插入品牌数据
     * @param brand 品牌数据
     * @return 受影响的行数，成功插入数据时，将返回1
     */
    int insert(Brand brand);

}
