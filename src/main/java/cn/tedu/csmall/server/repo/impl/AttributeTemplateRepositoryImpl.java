package cn.tedu.csmall.server.repo.impl;

import cn.tedu.csmall.server.repo.IAttributeTemplateRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class AttributeTemplateRepositoryImpl implements IAttributeTemplateRepository {

    public AttributeTemplateRepositoryImpl() {
        log.debug("创建数据访问对象：AttributeTemplateRepositoryImpl");
    }

}
