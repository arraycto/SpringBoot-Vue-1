package com.example.demo2.model;

public class Result {
    private Integer code;
    private String msg;
    private Object data;

    //static
    public static Result ok(Integer code,String msg){
        return new Result(200,"登录成功");
    }
    public static Result ok(Integer code,String msg,Object data){
        return new Result(200,"登录成功",data);
    }
    public static Result error(Integer code,String msg){
        return new Result(500,"登录失败");
    }
    public static Result error(Integer code,String msg,Object data){
        return new Result(500,"登录失败",data);
    }

    //构造
    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    //get set
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
