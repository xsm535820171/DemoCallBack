package com.my.democallback;

/**
 * Created by AOW on 2018/7/4.
 */

public class CallBackData {

    //定义接口的成员变量
    public ICallBack iCallBack;

    //给接口对象变量赋值
    public void setCallBack(ICallBack callBack){
        iCallBack=callBack;
    }

//    调用接口对象中的方法
    public void doSomething(String content){
        iCallBack.fail(content);
    }
}
