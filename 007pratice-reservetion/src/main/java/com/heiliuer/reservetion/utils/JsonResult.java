package com.heiliuer.reservetion.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hao.wang on 2017-5-12.
 */
public class JsonResult {

    public static final int STATUS_OK = 0;
    public static final int STATUS_ERROR = -1;
    int status;
    String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    Object data;

    public JsonResult(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public JsonResult(int status) {
        this.status = status;
    }

    public JsonResult(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public JsonResult() {
    }

    public JsonResult(int status, List<ObjectError> allErrors) {
        this(status, allErrors.stream().map(error -> error.getDefaultMessage()).collect(Collectors.joining(",")));
    }

    public JsonResult(int status, BindingResult result) {
        this(status, result.getAllErrors());
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
