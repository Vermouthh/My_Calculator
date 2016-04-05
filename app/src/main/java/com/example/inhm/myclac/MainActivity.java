package com.example.inhm.myclac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText  edit1,edit2,edit3;
    Button btn1,btn2,btn3,btn4,btn5,btn6,
            btn7,btn8,btn9,btn10,btnAdd,btnSub,btnMul,btnDiv;
    int num1, num2;
    Integer Result;

    String editst1="",editst2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("계산기 Application");

        edit1 = (EditText) findViewById(R.id.editText);
        edit2 = (EditText) findViewById(R.id.editText2);
        edit3 = (EditText) findViewById(R.id.editText3);


        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn10 = (Button) findViewById(R.id.button10);
        btnAdd = (Button) findViewById(R.id.button11);
        btnSub = (Button) findViewById(R.id.button12);
        btnMul = (Button) findViewById(R.id.button13);
        btnDiv = (Button) findViewById(R.id.button14);



        View.OnClickListener clisten = new View.OnClickListener(){
            public void onClick(View v) {

                switch(v.getId()) {

                    case R.id.button:
                        if(edit1.isFocused()){
                            editst1 += "1";
                            edit1.setText(editst1);
                        }
                        else {
                            editst2 += 1;
                            edit2.setText(editst2);
                        }
                        break;
                    case R.id.button2:
                        if(edit1.isFocused()) {
                            editst1 += "2";
                            edit1.setText(editst1);
                        }
                        else {
                            editst2 += "2";
                            edit2.setText(editst2);
                        }
                        break;
                    case R.id.button3:
                        if(edit1.isFocused()) {
                            editst1 += "3";
                            edit1.setText(editst1);
                        }
                        else {
                            editst2 += "3";
                            edit2.setText(editst2);
                        }
                        break;
                    case R.id.button4:
                        if(edit1.isFocused()) {
                            editst1 += "4";
                            edit1.setText(editst1);
                        }
                        else {
                            editst2 += "4";
                            edit2.setText(editst2);
                        }
                        break;
                    case R.id.button5:
                        if(edit1.isFocused()) {
                            editst1 += "5";
                            edit1.setText(editst1);
                        }
                        else {
                            editst2 += "5";
                            edit2.setText(editst2);
                        }
                        break;
                    case R.id.button6:
                        if(edit1.isFocused()) {
                            editst1 += "6";
                            edit1.setText(editst1);
                        }
                        else {
                            editst2 += "6";
                            edit2.setText(editst2);
                        }
                        break;
                    case R.id.button7:
                        if(edit1.isFocused()) {
                            editst1 += "7";
                            edit1.setText(editst1);
                        }
                        else {
                            editst2 += "7";
                            edit2.setText(editst2);
                        }
                        break;
                    case R.id.button8:
                        if(edit1.isFocused()) {
                            editst1 += "8";
                            edit1.setText(editst1);
                        }
                        else {
                            editst2 += "8";
                            edit2.setText(editst2);
                        }
                        break;
                    case R.id.button9:
                        if(edit1.isFocused()) {
                            editst1 += "9";
                            edit1.setText(editst1);
                        }
                        else {
                            editst2 += "9";
                            edit2.setText(editst2);
                        }
                        break;
                    case R.id.button10:
                        if(edit1.isFocused()) {
                            editst1 += "0";
                            edit1.setText(editst1);
                        }
                        else {
                            editst2 += "0";
                            edit2.setText(editst2);
                        }
                        break;

                    case R.id.button11:

                        num1 = Integer.parseInt(edit1.getText().toString());
                        num2 = Integer.parseInt(edit2.getText().toString());

                        Result = num1 + num2;
                        break;
                    case R.id.button12:
                        num1 = Integer.parseInt(edit1.getText().toString());
                        num2 = Integer.parseInt(edit2.getText().toString());

                        Result = num1 - num2;
                        break;
                    case R.id.button13:
                        num1 = Integer.parseInt(edit1.getText().toString());
                        num2 = Integer.parseInt(edit2.getText().toString());

                        Result = num1 * num2;
                        break;
                    case R.id.button14:
                        num1 = Integer.parseInt(edit1.getText().toString());
                        num2 = Integer.parseInt(edit2.getText().toString());

                        Result = num1 / num2;
                        break;
                }


                edit3.setText("계산결과: "+Result);
                }
            };
            btn1.setOnClickListener(clisten);
        btn2.setOnClickListener(clisten);
        btn3.setOnClickListener(clisten);
        btn4.setOnClickListener(clisten);
        btn5.setOnClickListener(clisten);
        btn6.setOnClickListener(clisten);
        btn7.setOnClickListener(clisten);
        btn8.setOnClickListener(clisten);
        btn9.setOnClickListener(clisten);
        btn10.setOnClickListener(clisten);
        btnAdd.setOnClickListener(clisten);
        btnSub.setOnClickListener(clisten);
        btnMul.setOnClickListener(clisten);
        btnDiv.setOnClickListener(clisten);
    }

}
