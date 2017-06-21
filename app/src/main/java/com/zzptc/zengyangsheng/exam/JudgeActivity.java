package com.zzptc.zengyangsheng.exam;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2017/6/21 021.
 */

public class JudgeActivity extends AppCompatActivity {
    private SharedPreferences mSharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mSharedPreferences = getSharedPreferences("shared_data", Context.MODE_PRIVATE);

        boolean flag = mSharedPreferences.getBoolean("is_first_launch",true);

        if (flag){
            //第一次启动 欢迎界面
            startActivity(new Intent(this,LoginActivity.class));
        }else {
            //否则进入主界面
            startActivity(new Intent(this,MainActivity.class));
        }

        finish();
    }



}
