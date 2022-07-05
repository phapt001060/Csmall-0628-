package cn.tedu.csmall.server.repo.impl;

import cn.tedu.csmall.server.repo.IBrandRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class BrandRepositoryImpl implements IBrandRepository {

    public BrandRepositoryImpl() {
        log.debug("创建数据访问对象：BrandRepositoryImpl");
    }

    @Override
    public void delete() {
        // ...
    }

}
