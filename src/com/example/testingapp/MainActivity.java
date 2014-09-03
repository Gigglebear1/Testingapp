package com.example.testingapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;



public class MainActivity extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);

        Button calc = (Button)findViewById(R.id.button1);
        calc.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                EditText number = (EditText)findViewById(R.id.inputText);
                TextView display = (TextView)findViewById(R.id.display);

                double num = Double.parseDouble(number.getText().toString());

                // first option
                num = num * 5;    
                    
                display.setText(num + "");           
            }
        });
}
}
