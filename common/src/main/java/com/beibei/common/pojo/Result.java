package com.beibei.common.pojo;


import lombok.Data;

@Data
public class Result<T> {

    private boolean flag ;

    private Integer code;

    private String message;

    private T data;


    public Result(boolean flag, Integer code, String message, T data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result(){
        this.flag = true;
        this.code = StatuCode.OK;
        this.message = "success";
    }
}
