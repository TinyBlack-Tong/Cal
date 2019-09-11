package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class TransActivity extends AppCompatActivity {

    private TextView number;
    private String sign;
    private TextView t_result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trans);


        Button translate=findViewById(R.id.translate);
        Button b0 = findViewById(R.id.b0);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button b_cc=findViewById(R.id.b_cc);
        Button b_back=findViewById(R.id.back);
        Button tanslate=findViewById(R.id.translate);
        final Spinner spi=findViewById(R.id.spi);
        t_result=findViewById(R.id.t_result);
        number=findViewById(R.id.number);


        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a = number.getText().toString();
                double b = Double.valueOf(a);


                if (sign.equals("km")) {
//                                t_result.setText("m"+1000*b);
                    Log.d("MainActivity", a);
                    t_result.setText(+1000 * b + "      米（m）\n\n" + 1000000 * b + "    毫米（mm） \n\n"
                            + 2 * b + "    里\n\n" + 100000 * b + "厘米（cm）");
                } else if (sign.equals("m")) {

                    t_result.setText(+100 * b + "     里米（m）     \n\n" + 0.001 * b + "     千米（km） \n\n"
                            + 1000 * b + "     毫米（mm）\n\n" + 3 * b + "尺");

                } else if (sign.equals("kg")) {

                    t_result.setText(+2 * b + "     斤     \n\n" + 20 * b + "     量 \n\n"
                            + 1000 * b + "     克（g）\n\n" + 0.001 * b + "     顿");
                } else if (sign.equals("g")) {
                    t_result.setText(+0.002 * b + "    斤\n\n " + 1000 * b + "    毫克（mg）\n\n" + 0.001 * b + "    千克（kg）\n\n"
                            + 1e-6 * b + "    吨（t）");
                } else if (sign.equals("平方米")) {

                    t_result.setText(+0.0001 * b + "     公顷（ha）\n\n" + 0.0015 * b + "    亩\n\n" + 10000 * b + "    平方厘米\n\n");
                }
                else if(sign.equals("摄氏度")){
                    t_result.setText(+33.8*b+"     摄氏度\n\n");
                }
            }
        });

        spi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String words = number.getText().toString();
                sign =spi.getSelectedItem().toString();

                if (sign=="km") {

                    Log.d("MainActivity",words);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        b_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        b_cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number.setText(number.getText().toString() + "0");

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                number.setText(number.getText().toString() + "1");

            }


        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number.setText(number.getText().toString() + "2");

            }


        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                number.setText(number.getText().toString() + "3");

            }


        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                number.setText(number.getText().toString() + "4");


            }


        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                number.setText(number.getText().toString() + "5");


            }


        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                number.setText(number.getText().toString() + "6");

            }


        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                number.setText(number.getText().toString() + "7");

            }


        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                number.setText(number.getText().toString() + "8");

            }


        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                number.setText(number.getText().toString() + "9");

            }


        });


    }
}
