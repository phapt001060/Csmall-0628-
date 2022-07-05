package cn.tedu.csmall.server.service;

import cn.tedu.csmall.server.pojo.dto.BrandAddNewDTO;

public interface IBrandService {
    /**
     * 增加品牌
     * @param brandAddNewDTO
     */
    void addNew(BrandAddNewDTO brandAddNewDTO);
}
