package cn.tedu.csmall.server.service;

import cn.tedu.csmall.server.repo.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    public ICategoryRepository categoryRepository;

    public CategoryService() {
        System.out.println("CategoryService的构造方法已经执行");
    }

}
