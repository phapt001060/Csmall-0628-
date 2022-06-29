package cn.tedu.csmall.server.repo;

import cn.tedu.csmall.server.service.IAttributeTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IAttributeTemplateRepository implements IAttributeTemplateService {
    @Autowired
    public IAttributeTemplateService iAttributeTemplateService;
    public IAttributeTemplateRepository() {
        System.out.println("IAttributeTemplateRepository的构造方法已执行");
    }
}
