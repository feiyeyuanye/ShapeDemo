package com.example.xwxwaa.myapplication;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * 动态改变shape
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv_shape_use);
        // 先设置背景
        tv.setBackgroundResource(R.drawable.shape_use);
        GradientDrawable gradientDrawable = (GradientDrawable) tv.getBackground();
        // 设置shape类型，这里是矩形
        gradientDrawable.setShape(GradientDrawable.RECTANGLE);
        // 圆角角度
        gradientDrawable.setCornerRadius(dp2px(this,20));
        // 填充色
        gradientDrawable.setColor(getResources().getColor(R.color.colorAccent));
        // 边框
        gradientDrawable.setStroke(dp2px(this,1),getResources().getColor(R.color.colorPrimary));

    }

    //dp转px；
    public static int dp2px(Context mContext, int dp){
        return (int) (dp * mContext.getResources().getDisplayMetrics().density + 0.5);
    }
}
