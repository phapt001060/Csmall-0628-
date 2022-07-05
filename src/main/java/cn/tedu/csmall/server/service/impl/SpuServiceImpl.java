package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.repo.ISpuRepository;
import cn.tedu.csmall.server.service.ISpuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SPU业务实现
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Service
public class SpuServiceImpl implements ISpuService {

    @Autowired
    private ISpuRepository spuRepository;

    public SpuServiceImpl() {
        log.debug("创建业务逻辑对象：SpuServiceImpl");
    }

}
