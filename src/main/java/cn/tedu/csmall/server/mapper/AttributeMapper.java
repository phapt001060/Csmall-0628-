package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Attribute;
import cn.tedu.csmall.server.repo.impl.AttributeRepositoryImpl;

public interface AttributeMapper {
    /**
     *
     * @param attribute
     * @return
     */
    int insert(Attribute attribute);
}
