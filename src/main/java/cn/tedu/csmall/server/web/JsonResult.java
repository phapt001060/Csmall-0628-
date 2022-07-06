package cn.tedu.csmall.server.web;

import cn.tedu.csmall.server.ex.ServiceException;
import lombok.Data;

/**
 * 用于封装服务器端向客户端响应结果的类型
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Data
public final class JsonResult {

    /**
     * 业务状态码
     */
    private Integer code;
    private String message;

    public static JsonResult ok() {
        JsonResult jsonResult = new JsonResult();
        jsonResult.code = ServiceCode.OK;
        return jsonResult;
    }

    public static JsonResult fail(ServiceException e) {
        return fail(e.getServiceCode(), e.getMessage());
    }

    public static JsonResult fail(Integer code, String message) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.code = code;
        jsonResult.message = message;
        return jsonResult;
    }

}
