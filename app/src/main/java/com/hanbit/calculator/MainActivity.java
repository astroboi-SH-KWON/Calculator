package com.hanbit.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.calculator.domain.CalcDTO;
import com.hanbit.calculator.service.CalcService;
import com.hanbit.calculator.service.CalcServiceImpl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etNum1,etNum2;
    Button btPlus,btMinus,btMulti,btDiv,btEq;
    TextView tvResult;
    int result ;
    CalcService service;
    CalcDTO cal;
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
        service = new CalcServiceImpl();
        cal = new CalcDTO();

    }

    @Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(String.valueOf(etNum1.getText()));
        int num2 = Integer.parseInt(String.valueOf(etNum2.getText()));
        cal.setNum1(num1);
        cal.setNum2(num2);

        switch(v.getId()){
            case R.id.btPlus:
                result =service.plus(cal);
                break;
            case R.id.btMinus:
                result = service.minus(cal);
                break;
            case R.id.btMulti:
                result = service.multi(cal);
                break;
            case R.id.btDiv:
                result = service.divid(cal);
                break;
            case R.id.btEq:
                tvResult.setText("RESULT : " +result);
                break;

        }

    }
}
