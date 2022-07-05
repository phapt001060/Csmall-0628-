package cn.tedu.csmall.server.service;

import cn.tedu.csmall.server.pojo.dto.BrandAddNewDTO;

/**
 * 品牌业务接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
public interface IBrandService {

    /**
     * 创建品牌
     *
     * @param brandAddNewDTO 需要创建的品牌数据
     */
    void addNew(BrandAddNewDTO brandAddNewDTO);

}
