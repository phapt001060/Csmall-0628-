package cn.tedu.csmall.server.ex.handler;

import cn.tedu.csmall.server.ex.ServiceException;
import cn.tedu.csmall.server.web.JsonResult;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    public GlobalExceptionHandler() {
        log.debug("创建统一处理异常的对象：GlobalExceptionHandler");
    }

    @ExceptionHandler
    public JsonResult handlerServiceException(ServiceException e){
        log.error("统一处理ServiceException,将向客户端响应:{}",e.getMessage());
        return JsonResult.fail(e);
    }

    @ExceptionHandler
    public String handleThrowable(Throwable e) {
        log.error("统一处" +
                "理未明确处理的异常【{}】，将向客户端响应：{}", e.getClass().getName(), e.getMessage());
        return "服务器忙，请联系管理员！";
    }
}
