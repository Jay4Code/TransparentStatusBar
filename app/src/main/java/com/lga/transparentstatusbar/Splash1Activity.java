package com.lga.transparentstatusbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Splash1Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash1);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Splash1Activity.this, Splash2Activity.class));
            }
        });
    }
}
