package cn.tedu.csmall.server.repo.impl;

import cn.tedu.csmall.server.repo.IAttributeRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AttributeRepositoryImpl implements IAttributeRepository {

    public AttributeRepositoryImpl() {
        System.out.println("AttributeRepositoryImpl的构造方法已经执行");
    }

}
