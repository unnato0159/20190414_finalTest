package com.tje.a20190414_finaltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText inputKee;
    EditText inputKg;
    Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputKee = findViewById(R.id.inputKee);
        inputKg = findViewById(R.id.inputKg);
        confirm = findViewById(R.id.confirm);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double kee= Double.parseDouble(inputKee.getText().toString());
               double kg = Double.parseDouble(inputKg.getText().toString());


                double result = 0;
                result =  kg / ( kee*kee);
                String  keee = "";

                if(result <18.5){
                    keee = "저체중";
                }else if(result < 25 && result >23  ){
                    keee = "정상";

                }else if(result >25 && result <30 ){
                    keee ="비만";

                }else if(result>30){
                    keee="고도비만";

                }

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("keee",keee);
                startActivity(intent);
            }
        });
    }
}
