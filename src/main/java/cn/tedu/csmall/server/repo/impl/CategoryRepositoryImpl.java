package cn.tedu.csmall.server.repo.impl;

import cn.tedu.csmall.server.repo.ICategoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepositoryImpl implements ICategoryRepository {

    public CategoryRepositoryImpl() {
        System.out.println("CategoryRepositoryImpl的构造方法已经执行");
    }
}
