package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.controller.BrandController;
import cn.tedu.csmall.server.repo.IBrandRepository;
import cn.tedu.csmall.server.repo.impl.BrandRepositoryImpl;
import cn.tedu.csmall.server.repo.impl.BrandRepositoryImpl2;
import cn.tedu.csmall.server.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements IBrandService {

    @Autowired
    public IBrandRepository brandRepository;

    public BrandServiceImpl() {
        System.out.println("BrandServiceImpl的构造方法已经执行");
    }

}
