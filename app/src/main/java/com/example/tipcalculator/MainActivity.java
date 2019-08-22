package com.example.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int rated = 0;

    private int useless = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateTip(View v){



        //get references to all elements on app screen
        EditText subtotal = (EditText) findViewById(R.id.subtotal);
        EditText tip = (EditText) findViewById(R.id.tip);
        TextView total = (TextView) findViewById(R.id.totalNum);

        TextView totalTip = (TextView) findViewById(R.id.totalTipNum);

        //get the values from the EditText boxes and convert them to int data types
        double subtotalDbl = Double.parseDouble(subtotal.getText().toString());
        double tipDbl = Double.parseDouble(tip.getText().toString());

        tipDbl = tipDbl/100;

        double totalPrice = subtotalDbl + (subtotalDbl * tipDbl);

        String totalPriceString = String.format("%.2f", totalPrice);

        total.setText("$" + totalPriceString);

        totalTip.setText("$" + (subtotalDbl * tipDbl));

    }

    public void calculateTip10(View v){


        //get references to all elements on app screen
        EditText subtotal = (EditText) findViewById(R.id.subtotal);

        TextView total = (TextView) findViewById(R.id.totalNum);

        TextView totalTip = (TextView) findViewById(R.id.totalTipNum);

        //get the values from the EditText boxes and convert them to int data types
        double subtotalDbl = Double.parseDouble(subtotal.getText().toString());
        double tipDbl = 10;

        tipDbl = tipDbl/100;

        double totalPrice = subtotalDbl + (subtotalDbl * tipDbl);

        String totalPriceString = String.format("%.2f", totalPrice);

        total.setText("$" + totalPriceString);

        totalTip.setText("$" + (subtotalDbl * tipDbl));

    }

    public void calculateTip15(View v){


        //get references to all elements on app screen
        EditText subtotal = (EditText) findViewById(R.id.subtotal);

        TextView total = (TextView) findViewById(R.id.totalNum);

        TextView totalTip = (TextView) findViewById(R.id.totalTipNum);

        //get the values from the EditText boxes and convert them to int data types
        double subtotalDbl = Double.parseDouble(subtotal.getText().toString());
        double tipDbl = 15;

        tipDbl = tipDbl/100;

        double totalPrice = subtotalDbl + (subtotalDbl * tipDbl);

        String totalPriceString = String.format("%.2f", totalPrice);

        total.setText("$" + totalPriceString);

        totalTip.setText("$" + (subtotalDbl * tipDbl));

    }

    public void calculateTip20(View v){


        //get references to all elements on app screen
        EditText subtotal = (EditText) findViewById(R.id.subtotal);

        TextView total = (TextView) findViewById(R.id.totalNum);

        TextView totalTip = (TextView) findViewById(R.id.totalTipNum);

        //get the values from the EditText boxes and convert them to int data types
        double subtotalDbl = Double.parseDouble(subtotal.getText().toString());
        double tipDbl = 20;

        tipDbl = tipDbl/100;

        double totalPrice = subtotalDbl + (subtotalDbl * tipDbl);

        String totalPriceString = String.format("%.2f", totalPrice);

        total.setText("$" + totalPriceString);

        totalTip.setText("$" + (subtotalDbl * tipDbl));

    }

    public void submitReview(View v){


        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        ratingBar.setNumStars(0);

        TextView thanks = (TextView) findViewById(R.id.rateMeEnd);

        TextView thanks2 = (TextView) findViewById(R.id.rateMeEnd2);



        if(rated == 0) {

            thanks.setVisibility(v.VISIBLE);

            rated++;
        }

        else{

            thanks.setVisibility(v.INVISIBLE);

            thanks2.setVisibility(v.VISIBLE);


        }


    }
}
