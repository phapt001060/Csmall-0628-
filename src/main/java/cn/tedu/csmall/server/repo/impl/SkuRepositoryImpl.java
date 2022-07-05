package cn.tedu.csmall.server.repo.impl;

import cn.tedu.csmall.server.repo.ISkuRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class SkuRepositoryImpl implements ISkuRepository {

    public SkuRepositoryImpl() {
        log.debug("创建数据访问对象：SkuRepositoryImpl");
    }

}
