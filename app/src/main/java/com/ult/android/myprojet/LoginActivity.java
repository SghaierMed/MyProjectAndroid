package com.ult.android.myprojet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button breg = (Button) findViewById(R.id.btRegister);
        Button bcnx = (Button) findViewById(R.id.btLogin);

        bcnx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent icnx = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(icnx);
            }
        });

        breg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ireg = new Intent(getApplicationContext(), InscriptionActivity.class);
                startActivity(ireg);
            }
        });


    }
}