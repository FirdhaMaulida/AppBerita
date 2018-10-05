package com.polinema.appsberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        findViewById(R.id.back);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.back:
                startActivity(new Intent(this, Activity.class));
        }
    }
}
