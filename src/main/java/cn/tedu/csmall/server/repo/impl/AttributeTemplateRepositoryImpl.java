package cn.tedu.csmall.server.repo.impl;

import cn.tedu.csmall.server.repo.IAttributeTemplateRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AttributeTemplateRepositoryImpl implements IAttributeTemplateRepository {

    public AttributeTemplateRepositoryImpl() {
        System.out.println("AttributeTemplateRepositoryImpl的构造方法已经执行");
    }

}
