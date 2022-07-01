package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.repo.ISkuRepository;
import cn.tedu.csmall.server.service.ISkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkuServiceImpl implements ISkuService {

    @Autowired
    public ISkuRepository skuRepository;

    public SkuServiceImpl() {
        System.out.println("SkuServiceImpl的构造方法已经执行");
    }

}
