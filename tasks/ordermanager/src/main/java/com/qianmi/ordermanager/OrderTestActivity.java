package com.qianmi.ordermanager;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.qianmi.baselibrary.BaseActivity;
import com.qianmi.pointmanager.PointActivity;

/**
 * 这个里面不与其他App组件交互，至于此app关联组件交互或其他公共组件交互，
 * 此app只做跳转，业务交给组件做
 */
public class OrderTestActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        findViewById(R.id.btnTestJump).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrderTestActivity.this, PointActivity.class));
            }
        });

    }

}
