package com.example.welcome.fliptee;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class accountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        final EditText phone=(EditText)findViewById(R.id.phontID);
        final EditText address=(EditText)findViewById(R.id.addressID);
        final RadioGroup radioGroup=(RadioGroup)findViewById(R.id.radioID);
        final TextView name=(TextView) findViewById(R.id.nameID);
        final TextView email=(TextView)findViewById(R.id.emailID);
        final Button but=(Button)findViewById(R.id.updateID);

        SharedPreferences shap=getSharedPreferences("LOGIN_GOOGLE",MODE_PRIVATE);
        SharedPreferences.Editor editor=shap.edit();
        String ema = shap.getString("email","");
        String nam=shap.getString("name","");
        name.setText(nam);
        email.setText(ema);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                SharedPreferences shap=getSharedPreferences("LOGIN_GOOGLE",MODE_PRIVATE);
                SharedPreferences.Editor editor=shap.edit();
                String pho=phone.getText().toString();
                editor.putString("phone",pho);
                String add=address.getText().toString();
                editor.putString("address",add);


            }
        });



    }
}
