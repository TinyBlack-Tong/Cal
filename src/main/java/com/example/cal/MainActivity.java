package com.example.cal;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private double result;
    private String words;
    private String s1;
    private String s2;
    private String s3;
    private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button bpoint;
    private Button b_plus;
    private Button b_minus;
    private Button b_div;
    private Button b_result;
    private Button b_mul;
    private Button b_clean;
    private Button b_sin;
    private Button b_cos;
    private Button b_tan;
    private Button b_tenSquare;
    private Button b_Fac;
    private Button b_double;
    private Button b_pow;
    private boolean flag=true;
    private Button b_left;
    private Button b_right;
    private Button b_two;
    private Button b_sixteen;
    private Button b_special;
//
//    private Button b_back;


//    private Spinner spi;
    private TextView number;

    private boolean a=false;



    private TextView textView1;
    private TextView t_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {






        super.onCreate(savedInstanceState);

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.land);
            b_sin=findViewById(R.id.b_sin);
            b_cos = findViewById(R.id.b_cos);
            b_tan = findViewById(R.id.b_tan);
            b_tenSquare = findViewById(R.id.b_tenSquare);
            b_double = findViewById(R.id.b_double);
            b_pow = findViewById(R.id.b_pow);
            b_Fac=findViewById(R.id.b_fac);
            b_left=findViewById(R.id.b_left);
            b_right=findViewById(R.id.b_right);
            b_two=findViewById(R.id.b_two);
            b_sixteen=findViewById(R.id.b_sixteen);
            b_two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(textView1.getText().toString().contains(".")||textView1.getText().toString().length()==0){
                        Toast.makeText(MainActivity.this,"( ⊙ o ⊙ )啊！！请你输入整数哦亲！",Toast.LENGTH_LONG).show();
                        textView1.setText("");
                    }
                    else{
                        getTwo();
                    }


                }
            });

            b_sixteen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(textView1.getText().toString().contains(".")||textView1.getText().toString().length()==0){
                        textView1.setText("");
                        Toast.makeText(MainActivity.this,"( ⊙ o ⊙ )啊！！请你输入整数哦亲！",Toast.LENGTH_LONG).show();
                    }
                  else{
                        getSixteen();
                    }

                }
            });
            b_left.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    textView1.setText(textView1.getText().toString()+" "+"("+" ");

                }
            });
            b_right.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView1.setText(textView1.getText().toString()+" "+")"+" ");
                }
            });

            b_sin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(textView1.getText().toString().length()==0){
                        Toast.makeText(MainActivity.this,"点我之前请先输入一个数字吧~",Toast.LENGTH_LONG).show();
                    }
                    else{
                        textView1.setText(String.valueOf(getSin()));
                    }


                }
            });
            b_cos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(textView1.getText().toString().length()==0){
                        Toast.makeText(MainActivity.this,"点我之前请先输入一个数字吧~",Toast.LENGTH_LONG).show();
                    }else{

                        textView1.setText(String.valueOf(getCos()));
                    }

                }
            });

            b_tan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(textView1.getText().toString().length()==0){
                        Toast.makeText(MainActivity.this,"点我之前请先输入一个数字吧~",Toast.LENGTH_LONG).show();
                    }else{
                        textView1.setText(String.valueOf(getTan()));
                    }


                }
            });

            b_tenSquare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(textView1.getText().toString().length()==0){
                        Toast.makeText(MainActivity.this,"点我之前请先输入一个数字吧~",Toast.LENGTH_LONG).show();
                    }
                        else{
                        textView1.setText(String.valueOf(getTenSquare()));
                    }

                }
            });
            b_double.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(textView1.getText().toString().length()==0){
                        Toast.makeText(MainActivity.this,"点我之前请先输入一个数字吧~",Toast.LENGTH_LONG).show();
                    }else{
                        textView1.setText(String.valueOf(getDouble()));
                    }


                }
            });

                b_pow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(textView1.getText().toString().length()==0){
                            Toast.makeText(MainActivity.this,"点我之前请先输入一个数字吧~",Toast.LENGTH_LONG).show();
                        }
                        else
                    if(flag){
                        textView1.setText(textView1.getText().toString()+" "+","+" ");
                        flag=false;
                        onStop();
                    }else{
                        flag=true;
//
//                        Log.d("MainActivity", "1");
                        textView1.setText(String.valueOf(getPow()));
                        onStart();
                    }

                    }
                });

                b_Fac.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(textView1.getText().toString().length()==0){
                            Toast.makeText(MainActivity.this,"点我之前请先输入一个数字吧~",Toast.LENGTH_LONG).show();
                        }else {
                            textView1.setText(String.valueOf(getFac()));
                        }


                    }
                });

        }

        else if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.main);
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            b_special=findViewById(R.id.b_special);
            b_special.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(MainActivity.this,TransActivity.class);
                    startActivity(intent);
//                    setContentView(R.layout.trans);
//                    number = findViewById(R.id.number);








                }
            });

        }


        textView1 = findViewById(R.id.textView1);
        words = textView1.getText().toString();

         b0 = findViewById(R.id.b0);
         b1 = findViewById(R.id.b1);
         b2 = findViewById(R.id.b2);
         b3 = findViewById(R.id.b3);
         b4 = findViewById(R.id.b4);
         b5 = findViewById(R.id.b5);
         b6 = findViewById(R.id.b6);
         b7 = findViewById(R.id.b7);
         b8 = findViewById(R.id.b8);
         b9 = findViewById(R.id.b9);
         bpoint = findViewById(R.id.bpoint);
         final Button b_plus = findViewById(R.id.b_plus);
         b_minus = findViewById(R.id.b_minus);
         b_mul = findViewById(R.id.b_mul);

         b_div = findViewById(R.id.b_div);

         Button b_clean = findViewById(R.id.b_clean);
         b_result=findViewById(R.id.b_result);



        //加号按钮 实现在文本框里的操作数后添加操作符的功能
        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(textView1.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this,"在此之前，先输入一个数字吧！",Toast.LENGTH_LONG).show();
                }
                else{

                    textView1.setText(textView1.getText().toString() + " " + "+" + " ");

                }


            }
        });


        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView1.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this,"在此之前，先输入一个数字吧！",Toast.LENGTH_LONG).show();
                }
                else{

                    textView1.setText(textView1.getText().toString() + " " + "-" + " ");

                }
            }
        });

        b_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(textView1.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this,"在此之前，先输入一个数字吧！",Toast.LENGTH_LONG).show();
                }
                else{

                    textView1.setText(textView1.getText().toString() + " " + "*" + " ");

                }
            }

        });


        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(textView1.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this,"在此之前，先输入一个数字吧！",Toast.LENGTH_LONG).show();
                }
                else{

                    textView1.setText(textView1.getText().toString() + " " + "/" + " ");

                }

            }
        });

        b_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView1.getText().toString().length()==0){

                    Toast.makeText(MainActivity.this, "就算是小黑，也要输入一个数字哦~", Toast.LENGTH_LONG).show();
                }
                else {
                    getResult();
                }
            }
        });



        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView1.toString().charAt(0)==0){
                    return;
                }else{
                    textView1.setText(textView1.getText().toString() + "0");
                }




            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "1");

            }


        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView1.setText(textView1.getText().toString() + "2");

            }


        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "3");

            }


        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "4");


            }


        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "5");



            }


        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "6");

            }


        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "7");

            }


        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "8");

            }


        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "9");

            }


        });
        bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    textView1.setText(textView1.getText().toString() + ".");

            }


        });


        //可能会有问题

//        b_result.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//                if(textView1.getText().toString().length()==0){
//                    Toast.makeText(MainActivity.this,"在此之前，先输入一个数字吧！",Toast.LENGTH_LONG).show();
//                }
//                else{
//                    getResult();
//
//                }
//
//
//
//
//            }
//        });

        b_clean.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                textView1.setText("");
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()){
            case R.id.help:
                Toast.makeText(this,"1",Toast.LENGTH_LONG).show();
                break;
            case R.id.tell:
                Toast.makeText(this,"tell",Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }



    private void getResult() {

        String words = textView1.getText().toString();

        textView1.setText(""+(String.valueOf(evaluateExpressin(words))));
    }

    private Double getSin() {

        String words = textView1.getText().toString();
        Double a=Math.toRadians(Double.valueOf(words));
        Math.sin(a);

        return Math.sin(a);
    }

    private Double getCos() {

        String words = textView1.getText().toString();
        Double a=Math.toRadians(Double.valueOf(words));

        return Math.cos(a);
    }


    private double getEasy() {
        String words = textView1.getText().toString();

        String s1 = words.substring(0, words.indexOf(" "));
        //运算符
        String op = words.substring(words.indexOf(" ") + 1, words.indexOf(" ") + 2);
        //运算符后的数字
        String s2 = words.substring(words.indexOf(" ") + 3);
        if (!s1.equals("") && !s2.equals("")) {
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            if (op.equals("+")) {
                result = d1 + d2;
            } else if (op.equals("-")) {
                result = d1 - d2;
            } else if (op.equals("*")) {
                result = d1 * d2;
            } else if (op.equals("/")) {
                if (d2 == 0) {
                    result = 0;
                } else {
                    result = d1 / d2;
                }
            }

        }
        return result;
    }

    private Double getTan() {

        String words = textView1.getText().toString();
        Double a=Math.toRadians(Double.valueOf(words));


        return Math.tan(a);
    }

    private int getTenSquare(){

        String words = textView1.getText().toString();

        int a=Integer.valueOf(words);
        int result=1;
        for(int i=0;i<a;i++){


            result=10*result;
        }

        return result;


    }

    private double getDouble(){

        double a;
        String words = textView1.getText().toString();

        a=Double.valueOf(words);



        return a*a;
    }


    private double getPow(){
        double a1;
        double a2;
        String words = textView1.getText().toString();
        String s1 = words.substring(0, words.indexOf(" "));
        String s2 = words.substring(words.indexOf(" ") + 1, words.indexOf(" ") + 2);
        String s3 = words.substring(words.indexOf(" ") + 3);
        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s3);
        return Math.pow(a,b);

    }

//    阶乘
    private int getFac(){


        String words=textView1.getText().toString();

        int a=Integer.valueOf(words);

        int result=1;

        for(int i=1;i<=a;i++){

            result*=i;
        }


        return result;

    }

    private void getTwo(){
        String words=textView1.getText().toString();
        int a=Integer.valueOf(words);
        String b;
        b=Integer.toBinaryString(a);

        textView1.setText(textView1.getText().toString()+"-->"+String.valueOf(b));
    }

    private void getSixteen(){
        String words=textView1.getText().toString();
        int a=Integer.valueOf(words);
        String b;
        b=Integer.toHexString(a);

        textView1.setText(textView1.getText().toString()+"-->"+String.valueOf(b));
    }

    public static double evaluateExpressin(String expression){
        //操作数
        Stack<Double> operandStack=new Stack<>();
        //操作符
        Stack<Character> operatorStack=new Stack<>();

        expression=insertBlanks(expression);

        String[] tokens=expression.split(" ");

        for(String token:tokens){
            if(token.length()==0){

                continue;
            }else if(token.charAt(0)=='+'||token.charAt(0)=='-'){

                while (!operatorStack.isEmpty()&&
                          (operatorStack.peek()=='+'||
                           operatorStack.peek()=='-'||
                           operatorStack.peek()=='*'||
                           operatorStack.peek()=='/')){
                    processAnOperator(operandStack,operatorStack);
                }

                operatorStack.push(token.charAt(0));
            }
            else if(token.charAt(0)=='*'||token.charAt(0)=='/'){
                while (!operatorStack.isEmpty()&&(operatorStack.peek()=='*'||
                        operatorStack.peek()=='/')){

                    processAnOperator(operandStack,operatorStack);
                }
                operatorStack.push(token.charAt(0));
            }
            else if(token.trim().charAt(0)=='('){
                operatorStack.push('(');
            }

            else if(token.trim().charAt(0)==')'){
                while(operatorStack.peek()!='('){
                    processAnOperator(operandStack,operatorStack);

                }
                operatorStack.pop();
            }
            else{
                operandStack.push(new Double(token));
            }
        }

          while(!operatorStack.isEmpty()){

              processAnOperator(operandStack,operatorStack);

          }
        return operandStack.pop();

    }

    public static void processAnOperator(Stack<Double> operandStack,Stack<Character> operatorStack){

        char op=operatorStack.pop();
        double op1=operandStack.pop();
        double op2=operandStack.pop();
        if(op=='+')
            operandStack.push(op2+op1);
        else if(op=='-')
            operandStack.push(op2-op1);
        else if(op=='*')
            operandStack.push(op2*op1);
        else if(op=='/')
            operandStack.push(op2/op1);

    }



    public static String insertBlanks(String s){
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)==')'||
                s.charAt(i)=='+'||s.charAt(i)=='-'||
                    s.charAt(i)=='*'||s.charAt(i)=='/')
                result+=" "+s.charAt(i)+" ";
            else
                result+=s.charAt(i);

        }
        return result;
    }



}
