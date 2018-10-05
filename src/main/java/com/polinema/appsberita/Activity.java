package com.polinema.appsberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
    }

    public void klik(View view) {
        Intent inten = new Intent(Activity.this, Activity2.class);
        startActivity(inten);

        findViewById(R.id.actv2);




    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.actv2:
                startActivity(new Intent(this, Activity2.class));
        }
    }
}
