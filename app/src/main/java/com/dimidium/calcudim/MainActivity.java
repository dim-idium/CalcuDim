package com.dimidium.calcudim;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonNull;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonMultiply;
    Button buttonDivide;
    Button buttonResult;
    Button buttonClean;
    TextView displayResult;

    String resultTyping = " ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayResult = findViewById(R.id.displayResult);
        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);
        buttonNull = findViewById(R.id.buttonNull);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonClean = findViewById(R.id.buttonClean);
        buttonResult = findViewById(R.id.buttonResult);


        displayResult.setOnClickListener(this);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonNull.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonClean.setOnClickListener(this);
        buttonResult.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.buttonOne) {
            resultTyping = resultTyping + "1";
        } else if (view.getId() == R.id.buttonTwo) {
            resultTyping = resultTyping + "2";
        } else if (view.getId() == R.id.buttonThree) {
            resultTyping = resultTyping + "3";
        }else if (view.getId() == R.id.buttonFour) {
            resultTyping = resultTyping + "4";
        } else if (view.getId() == R.id.buttonFive) {
            resultTyping = resultTyping + "5";
        } else if (view.getId() == R.id.buttonSix) {
            resultTyping = resultTyping + "6";
        } else if (view.getId() == R.id.buttonSeven) {
            resultTyping = resultTyping + "7";
        } else if (view.getId() == R.id.buttonEight) {
            resultTyping = resultTyping + "8";
        } else if (view.getId() == R.id.buttonNine) {
            resultTyping = resultTyping + "9";
        }  else if (view.getId() == R.id.buttonNull) {
            resultTyping = resultTyping + "0";
        } else if (view.getId() == R.id.buttonPlus) {
            resultTyping = resultTyping + "+";
        }else if (view.getId() == R.id.buttonMinus) {
            resultTyping = resultTyping + "-";
        }else if (view.getId() == R.id.buttonMultiply) {
            resultTyping = resultTyping + "*";
        }else if (view.getId() == R.id.buttonDivide) {
            resultTyping = resultTyping + "/";
        }else if (view.getId() == R.id.buttonResult) {


            StringChar stringChar1 =  new StringChar(resultTyping);
            resultTyping = stringChar1.resultString;
            displayResult.setText(resultTyping );


        }else if (view.getId() == R.id.buttonClean) {
            resultTyping = " ";
        }
        displayResult.setText(resultTyping);

    }
}