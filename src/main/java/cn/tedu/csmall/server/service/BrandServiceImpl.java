package cn.tedu.csmall.server.service;

import cn.tedu.csmall.server.repo.IBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl {

    @Autowired
    public IBrandRepository brandRepositoryImpl2;

    public BrandServiceImpl() {
        System.out.println("BrandServiceImpl的构造方法已经执行");
    }

    public void test() {
        brandRepositoryImpl2.delete();
    }

}
