package com.example.dvid.demoungdung2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private Button btnBMI;
    private EditText ten;
    private EditText cannang;
    private EditText chieucao;
    private TextView bmi, chuandoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBMI = (Button) findViewById(R.id.btn_BMI);

        cannang = (EditText) findViewById(R.id.edt_can_nang);
        chieucao = (EditText) findViewById(R.id.edt_chieu_cao);
        ten = (EditText) findViewById(R.id.edt_ten);

        bmi = (TextView) findViewById(R.id.tv_BMI);
        chuandoan = (TextView) findViewById(R.id.tv_chuan_doan);

        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double H = Double.parseDouble(chieucao.getText() + "");
                double W = Double.parseDouble(cannang.getText() + "");
                double BMI = W / Math.pow(H, 2);
                String cd = "";
                if (BMI < 18) {
                    cd = "Bạn gầy";
                } else if (BMI <= 24.9) {
                    cd = "Bạn bình thường";
                } else if (BMI <= 29.9) {
                    cd = "Bạn béo phì cấp độ 1";
                } else if (BMI <= 34.9) {
                    cd = "Bạn béo phì cấp độ 2";
                } else {
                    cd = "Bạn béo phì cấp độ 3";
                }
                DecimalFormat dcf = new DecimalFormat("#.###");

                bmi.setText(dcf.format(BMI));

                chuandoan.setText(cd);
                chuandoan.setTextColor(getResources().getColor(R.color.colorgreen));
                if (BMI >= 25) {
                    chuandoan.setTextColor(getResources().getColor(R.color.kobik));
                }
            }
        });
    }
}
