package cn.tedu.csmall.server.repo;

import cn.tedu.csmall.server.service.IAlbumService;
import cn.tedu.csmall.server.service.IAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IAttributeRepository implements IAttributeService {
    @Autowired
    public IAlbumService iAlbumService;
    public IAttributeRepository() {
        System.out.println("IAttributeRepository的构造方法已执行");
    }
}
