package com.example.hello1;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.sql.SQLIntegrityConstraintViolationException;

public class MainActivity extends AppCompatActivity {


    TextView m_txtHello;
    EditText m_eTxtName;
    EditText m_eTxtNoOne;
    EditText m_eTxtNoTwo;
    TextView m_eTxtResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Definerer hvilke knapper der er tale om.
        m_eTxtNoOne = this.findViewById(R.id.eTxtNoOne);
        m_eTxtNoTwo = this.findViewById(R.id.eTxtNoTwo);
        m_eTxtResult = this.findViewById(R.id.txtResult);

        m_txtHello = this.findViewById(R.id.txtHello);
        m_eTxtName = this.findViewById(R.id.eTxtName);

        Button btnOk = this.findViewById(R.id.btnOk);

        //Calls OnClickOK method. (button)
        btnOk.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onClickOk();
            }
        });

        //Button Add two numbers
        Button btnAdd = this.findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onClickAdd();
            }
        });

        Button btnSub = this.findViewById(R.id.btnSub);
        btnSub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onClickSub();
            }
        });

        Button btnMulti = this.findViewById(R.id.btnMulti);
        btnMulti.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onClickMulti();
            }
        });

        Button btnDiv = this.findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                onClickDiv();
            }
        });
    }

    private void onClickOk()
    {
        Log.d("Hello1", "ok is clicked - ");

        String name = m_eTxtName.getText().toString();
        m_txtHello.setText("Hello " + name + "! Have a nice day :-)!");
        Toast.makeText(this, "Toast " + name, Toast.LENGTH_SHORT).show();
    }

    private void onClickAdd()
    {
        double noOne = Double.parseDouble(m_eTxtNoOne.getText().toString());
        double noTwo = Double.parseDouble(m_eTxtNoTwo.getText().toString());

        String result = String.valueOf(noOne + noTwo);

        m_eTxtResult.setText(result);
    }

    private void onClickSub()
    {
        double noOne = Double.parseDouble(m_eTxtNoOne.getText().toString());
        double noTwo = Double.parseDouble(m_eTxtNoTwo.getText().toString());

        String result = String.valueOf(noOne - noTwo);

        m_eTxtResult.setText(result);
    }

    private void onClickMulti()
    {
        double noOne = Double.parseDouble(m_eTxtNoOne.getText().toString());
        double noTwo = Double.parseDouble(m_eTxtNoTwo.getText().toString());

        String result = String.valueOf(noOne * noTwo);

        m_eTxtResult.setText(result);
    }

    private void onClickDiv()
    {
        double noOne = Double.parseDouble(m_eTxtNoOne.getText().toString());
        double noTwo = Double.parseDouble(m_eTxtNoTwo.getText().toString());

        String result = String.valueOf(noOne / noTwo);

        m_eTxtResult.setText(result);
    }

    

}