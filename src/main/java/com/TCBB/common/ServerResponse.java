package com.TCBB.common;

/**
 * Created by muzheng
 */

import java.io.Serializable;

/**
 * 得到的response要进行json序列化，为web app端口提供接口
 * 进行ServerResponse构造函数
 */
public class ServerResponse<T> implements Serializable {

    private int status;
    private String msg;
    private T data;

    private ServerResponse(int Status){
        this.status=status;
    }

    private ServerResponse(int status,T data){
        this.status=status;
        this.data=data;
    }

    private  ServerResponse(int status,String msg){
        this.status=status;
        this.msg=msg;
    }

    private ServerResponse(int status,String mag,T data){
        this.status=status;
        this.msg=mag;
        this.data=data;
    }
}
