package com.zzptc.zengyangsheng.exam;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class LoginActivity extends AppCompatActivity {
    private LinearLayout activityfirstLogin;
    private RelativeLayout activityLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        activityLogin = (RelativeLayout) findViewById(R.id.activity_login);
        activityfirstLogin = (LinearLayout) findViewById(R.id.activity_first_login);
        //给布局添加渐变动画：属性动画
        ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(activityLogin,"alpha",1.0f,0.0f);
        alphaAnimator.setDuration(3000);
        alphaAnimator.start();


        //动画结束后 进行主页面跳转
        alphaAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {


            }

            @Override
            public void onAnimationEnd(Animator animation) {

                startActivity(new Intent(LoginActivity.this,MainActivity.class));
                overridePendingTransition(R.anim.enter_anim,R.anim.exit_anim);
                finish();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

    }
}
