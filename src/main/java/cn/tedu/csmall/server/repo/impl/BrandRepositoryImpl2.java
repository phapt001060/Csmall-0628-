package cn.tedu.csmall.server.repo.impl;

// 当前类仅用于测试Spring的自动装配机制，无实质作用
// @Repository
@Deprecated
public class BrandRepositoryImpl2
        // implements IBrandRepository
{

    public BrandRepositoryImpl2() {
        System.out.println("BrandRepositoryImpl的构造方法已经执行");
    }

    // @Override
    public void delete() {
        // ...
    }

}
