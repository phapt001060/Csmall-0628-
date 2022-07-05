package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.repo.ISkuRepository;
import cn.tedu.csmall.server.service.ISkuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SKU业务实现
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Service
public class SkuServiceImpl implements ISkuService {

    @Autowired
    private ISkuRepository skuRepository;

    public SkuServiceImpl() {
        log.debug("创建业务逻辑对象：SkuServiceImpl");
    }

}
