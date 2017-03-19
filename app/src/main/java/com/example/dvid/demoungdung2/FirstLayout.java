package com.example.dvid.demoungdung2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Dvid on 19/03/2017.
 */


public class FirstLayout extends AppCompatActivity {

    private ImageView imgbmi;
    private Button btnOK;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstlayout);

        btnOK = (Button) findViewById(R.id.btn_OK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstLayout.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
