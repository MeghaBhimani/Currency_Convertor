package com.example.currencyconvertor;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double converted_r;
    double r;
    String currency;
    CheckBox ch, ch1, ch2, ch3;
    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }
    public void Check(View v)
    {
        if(ch.isChecked()) {
            currency = "Euro";
        }
        if(ch1.isChecked()) {
            currency = "Dollar";
        }
        if(ch2.isChecked() ){
        currency = "AUD";
        }
        if(ch3.isChecked()) {
            currency = "AED";
        }

    }
    @SuppressLint("DefaultLocale")
    public void convertFunction (View view){
        EditText editText =(EditText) findViewById(R.id.editText);
        r= Double.parseDouble(editText.getText().toString());
        if(currency.equals("Euro")){
            converted_r=r*0.011;
            makeToast("€"+String.format("%.3f",converted_r));
        }
        else if(currency.equals("Dollar")){
            converted_r=r*0.014;
            makeToast("$"+String.format("%.3f",converted_r));
        }
        else if(currency.equals("AUD")){
            converted_r=r*0.017;
            makeToast("AUD"+String.format("%.3f",converted_r));
        }
        else if(currency.equals("AED")){
            converted_r=r*0.0502;
            makeToast("AED"+String.format("%.3f",converted_r));
        }
    }

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch=(CheckBox)findViewById(R.id.checkBox);
        ch1=(CheckBox)findViewById(R.id.checkBox2);
        ch2=(CheckBox)findViewById(R.id.checkBox3);
        ch3=(CheckBox)findViewById(R.id.checkBox4);
    }
}