package com.example.willstanleycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button minus;
    private Button multiply;
    private Button divide;
    private TextView info;
    private TextView result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private double val1 = Double.NaN;
    private double val2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                info.setText(info.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                info.setText(info.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                info.setText(info.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                info.setText(info.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                info.setText(info.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                info.setText(info.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                info.setText(info.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                info.setText(info.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                info.setText(info.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                info.setText(info.getText().toString() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

            }
        });
    }

    private void setupUIViews()
    {
        zero = (Button)findViewById(R.id.button00);
        one = (Button)findViewById(R.id.button01);
        two = (Button)findViewById(R.id.button02);
        three = (Button)findViewById(R.id.button03);
        four = (Button)findViewById(R.id.button04);
        five = (Button)findViewById(R.id.button05);
        six = (Button)findViewById(R.id.button06);
        seven = (Button)findViewById(R.id.button07);
        eight = (Button)findViewById(R.id.button08);
        nine = (Button)findViewById(R.id.button09);
        add = (Button)findViewById(R.id.buttonPlus);
        minus = (Button)findViewById(R.id.buttonMin);
        multiply = (Button)findViewById(R.id.buttonMult);
        divide = (Button)findViewById(R.id.buttonDiv);
        info = (TextView)findViewById(R.id.textInsert);
        result = (TextView)findViewById(R.id.textDisplay);


    }

}