package cn.tedu.csmall.server.repo.impl;

import cn.tedu.csmall.server.repo.IBrandRepository;

// @Repository
public class BrandRepositoryImpl implements IBrandRepository {

    public BrandRepositoryImpl() {
        System.out.println("BrandRepositoryImpl的构造方法已经执行");
    }

    @Override
    public void delete() {
        // ...
    }

}
