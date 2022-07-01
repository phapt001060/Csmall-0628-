package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.repo.ISpuRepository;
import cn.tedu.csmall.server.service.ISpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpuServiceImpl implements ISpuService {

    @Autowired
    public ISpuRepository spuRepository;

    public SpuServiceImpl() {
        System.out.println("SpuServiceImpl的构造方法已经执行");
    }

}
