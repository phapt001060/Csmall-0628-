package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.repo.IAttributeRepository;
import cn.tedu.csmall.server.repo.impl.AttributeRepositoryImpl;
import cn.tedu.csmall.server.service.IAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttributeServiceImpl implements IAttributeService {

    @Autowired
    public IAttributeRepository attributeRepository;

    public AttributeServiceImpl() {
        System.out.println("AttributeServiceImpl的构造方法已经执行");
    }

}
