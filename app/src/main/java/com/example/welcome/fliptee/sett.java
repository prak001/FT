package com.example.welcome.fliptee;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Rishab Batra on 20-11-2016.
 */

public class sett extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sett);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("LOGIN_GOOGLE",0);
        String email = sharedPreferences.getString("email","");
        String name=sharedPreferences.getString("name","");
        TextView nameText=(TextView)findViewById(R.id.name_id);
        TextView emailText=(TextView)findViewById(R.id.email_id);
        TextView creditText=(TextView)findViewById(R.id.credits_id);
        nameText.setText(name);
        emailText.setText(email);
        creditText.setText("0");

    }
}