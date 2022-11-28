package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    RadioGroup radioGroup1;
    LinearLayout linearLayout1;
    Button button1;
    TextView textView1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton radioButton1;
        RadioButton radioButton2;
        RadioButton radioButton3;
        EditText editText1,editText2;
        RadioGroup radioGroup1;
        LinearLayout linearLayout1;
        Button button1;
        TextView textView1;
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        textView1=findViewById(R.id.textView1);
        radioButton3=findViewById(R.id.radioButton3);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton1=findViewById(R.id.radioButton1);
        radioGroup1=(RadioGroup) findViewById(R.id.radioGroup1);
        linearLayout1=findViewById(R.id.linearLayout1);
        button1=findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int edit1 = Integer.parseInt(editText1.getText().toString());
                int edit2 = Integer.parseInt(editText2.getText().toString());
                int ID=radioGroup1.getCheckedRadioButtonId();
                radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int ID) {
                        switch (ID){
                            case R.id.radioButton1:
                                int c=edit1+edit2;
                                textView1.setText("The Sum of "+edit1 +" and "+edit2+" is " + c);
                                break;
                            case R.id.radioButton2:
                                int d=edit1-edit2;
                                textView1.setText("The Difference of "+edit1 +" and "+edit2+" is " + d);
                                break;
                            case R.id.radioButton3:
                                int e=edit1*edit2;
                                textView1.setText("The Multiplication of "+edit1 +" and "+edit2+" is " + e);
                                break;
                        }
                    }
                });
            }
        });
    }
} 