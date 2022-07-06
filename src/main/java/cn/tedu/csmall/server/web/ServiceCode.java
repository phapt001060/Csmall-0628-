package cn.tedu.csmall.server.web;

/**
 * 业务状态码
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
public final class ServiceCode {

    /**
     * 成功
     */
    public static final int OK = 20000;
    /**
     * 错误：冲突，通常是因为出现了重复的数据
     */
    public static final int ERR_CONFLICT = 40900;
    /**
     * 错误：插入数据失败
     */
    public static final int ERR_INSERT = 50000;
    /**
     * 错误：删除数据失败
     */
    public static final int ERR_DELETE = 50001;
    /**
     * 错误：更新数据失败
     */
    public static final int ERR_UPDATE = 50002;
    /**
     * 错误：未处理的异常
     */
    public static final int ERR_UNKNOWN = 59999;

}
