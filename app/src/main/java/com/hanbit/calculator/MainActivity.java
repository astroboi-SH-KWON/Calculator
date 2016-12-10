package com.hanbit.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etNum1,etNum2;
    Button btPlus,btMinus,btMulti,btDiv,btEq;
    TextView tvResult;
    int result ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1= (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        btPlus = (Button) findViewById(R.id.btPlus);
        btMinus = (Button) findViewById(R.id.btMinus);
        btMulti = (Button) findViewById(R.id.btMulti);
        btDiv = (Button) findViewById(R.id.btDiv);
        btEq = (Button) findViewById(R.id.btEq);
        tvResult= (TextView) findViewById(R.id.tvResult);
        btPlus.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btMulti.setOnClickListener(this);
        btDiv.setOnClickListener(this);
        btEq.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(String.valueOf(etNum1.getText()));
        int num2 = Integer.parseInt(String.valueOf(etNum2.getText()));

        switch(v.getId()){
            case R.id.btPlus:
                result = num1 + num2;
                break;
            case R.id.btMinus:
                result = num1 - num2;
                break;
            case R.id.btMulti:
                result = num1*num2;
                break;
            case R.id.btDiv:
                result = num1/num2;
                break;
            case R.id.btEq:
                tvResult.setText("RESULT : " +result);
                break;

        }

    }
}
