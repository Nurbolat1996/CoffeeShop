package com.makerspace.coffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int amountOfCoffee = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void minusButtonOnClick(View view){
        amountOfCoffee = amountOfCoffee - 1;
        if(amountOfCoffee < 1){
            amountOfCoffee = 1;
        }
        TextView priceTV = findViewById(R.id.amount);
        priceTV.setText(""+amountOfCoffee);
    }

    public void plusButtonOnClick(View view){
        amountOfCoffee++;
        if(amountOfCoffee > 10){
            amountOfCoffee = 10;
        }
        TextView priceTV = findViewById(R.id.amount);
        priceTV.setText(""+amountOfCoffee);
    }
}
