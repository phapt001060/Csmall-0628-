package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.repo.ICategoryRepository;
import cn.tedu.csmall.server.repo.impl.CategoryRepositoryImpl;
import cn.tedu.csmall.server.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    public ICategoryRepository categoryRepository;

    public CategoryService() {
        System.out.println("CategoryService的构造方法已经执行");
    }

}
