package cn.tedu.csmall.server.repo.impl;

import cn.tedu.csmall.server.repo.ISkuRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SkuRepositoryImpl implements ISkuRepository {

    public SkuRepositoryImpl() {
        System.out.println("SkuRepositoryImpl的构造方法已经执行");
    }

}
