package com.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText num1;
    EditText num2;
    Button button1;

    String N1;
    String N2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        num1 = (EditText)findViewById(R.id.edit_text1);
        num2 = (EditText)findViewById(R.id.value_2);

        button1 = (Button)findViewById(R.id.btn_1);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondAcivity.class);
                intent.putExtra("NUM1",num1.getText().toString());
                intent.putExtra("NUM2",num2.getText().toString());

                Context context = getApplicationContext();
                //The context to use. Usually your Application or Activity object
                CharSequence message = "You just clicked the OK button";
                //Display string
                int duration = Toast.LENGTH_SHORT;
                //How long the toast message will lasts

                Toast toast = Toast.makeText(context, message, duration);

                toast.show();
                startActivity(intent);
                toast.setGravity(Gravity.TOP| Gravity.LEFT, 0, 0);
            }
        });






        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the CustomToast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
        //Creating the Toast object
        Toast toast1 = new Toast(getApplicationContext());
        toast1.setDuration(Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast1.setView(layout);
        //setting the view of custom toast layout
        toast1.show();

    }
}
