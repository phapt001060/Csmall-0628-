package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.repo.IAttributeRepository;
import cn.tedu.csmall.server.service.IAttributeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 属性业务实现
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Service
public class AttributeServiceImpl implements IAttributeService {

    @Autowired
    private IAttributeRepository attributeRepository;

    public AttributeServiceImpl() {
        log.debug("创建业务逻辑对象：AttributeServiceImpl");
    }

}
