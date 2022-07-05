package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.repo.IAttributeTemplateRepository;
import cn.tedu.csmall.server.service.IAttributeTemplateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 属性模版业务实现
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Service
public class AttributeTemplateServiceImpl implements IAttributeTemplateService {

    @Autowired
    private IAttributeTemplateRepository attributeTemplateRepository;

    public AttributeTemplateServiceImpl() {
        log.debug("创建业务逻辑对象：AttributeTemplateServiceImpl");
    }

}
