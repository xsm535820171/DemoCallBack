package com.my.democallback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * 接口回调是指：把使用某一接口的类创建的对象的引用赋给该接口声明的接口变量，
 *              那么该接口变量就可以调用被类实现的接口的方法。
 *在A类中定义了一个方法，这个方法中用到了一个接口和该接口中的抽象方法，
 *   但是抽象方法没有具体的实现，需要B类去实现，B类实现该方法后，它本身不会去调用该方法，
 *   而是传递给A类，供A类去调用，这种机制就称为回调。
 */

public class MainActivity extends AppCompatActivity {

    Button callback_button;
    TextView callback_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callback_button= (Button) findViewById(R.id.callback_button);
        callback_text= (TextView) findViewById(R.id.callback_text);

        callback_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallBackData callBackData = new CallBackData();
                callBackData.setCallBack(new ICallBack() {
                    @Override
                    public void fail(String content) {
                        callback_text.setText(content);
                    }
                });

                callBackData.doSomething("我是回调数据，开心");
            }
        });



    }
}
