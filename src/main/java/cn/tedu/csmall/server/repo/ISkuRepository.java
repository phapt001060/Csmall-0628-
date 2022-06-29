package cn.tedu.csmall.server.repo;

import cn.tedu.csmall.server.service.ISkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ISkuRepository {

    public ISkuRepository() {
        System.out.println("ISkuRepository的构造方法已执行");
    }
}
