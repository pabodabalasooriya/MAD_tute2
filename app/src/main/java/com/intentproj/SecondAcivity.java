package com.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondAcivity extends AppCompatActivity {

    TextView value_1;
    TextView value_2;
    TextView method;
    Button add;
    Button minus;
    Button devide;
    Button multipication;
    EditText previous;

    String N1;
    String N2;

    double val1,val2,total = 0;

    CharSequence message = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_acivity);

        value_1 =(TextView) findViewById(R.id.value_1);
        value_2 =(TextView) findViewById(R.id.value_2);
        method = (TextView) findViewById(R.id.answer);

        add = (Button)findViewById(R.id.btn_2);
        minus = (Button)findViewById(R.id.btn_3);
        multipication = (Button)findViewById(R.id.btn_4);
        devide = (Button)findViewById(R.id.btn_5);


        Intent given = getIntent();

        N1 = given.getStringExtra("NUM1");
        N2 = given.getStringExtra("NUM2");

        value_1.setText(N1);
        value_2.setText(N2);

        val1 = Double.parseDouble(N1);
        val2 = Double.parseDouble(N2);

        final Context context = getApplicationContext();

       add.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               method.setText(val1 + "+" + val2 + "=" + (val1 + val2));



           }
       });
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                method.setText(val1 + "-" + val2 + "=" + (val1 - val2));



            }
        });
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                method.setText(val1 + "*" + val2 + "=" + (val1 * val2));



            }
        });
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                method.setText(val1 + "/" + val2 + "=" + (val1 / val2));



            }
        });


    }
}
