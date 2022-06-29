package cn.tedu.csmall.server.repo;

import cn.tedu.csmall.server.service.ISpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ISpuRepository {

    public ISpuRepository() {
        System.out.println("ISpuRepository的构造方法已执行");
    }
}
