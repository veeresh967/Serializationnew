package com.veeresh.b37_serialization;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    //DECLARE ALL VARIABLES OF SECOND SCREEN
    private TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //INITIALIZE ALL VARIABLES OF SECOND SCREEN
        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);

        //TASK 3 : RECEIVE STUDENT OBJECT AND DISPLAY DETAILS ON TEXT VIEWS.
        //A. OPEN INTENT
        Intent in = getIntent();
        //B. OPEN BUNDLE
        Bundle b = in.getExtras();
        //C. GET STUDENT OBJECT - USING GET SERIALIZABLE METHOD.
        Student s = (Student) b.getSerializable("obj");
        Trainer t = (Trainer) b.getSerializable("obj2");

        //D. DISPLAY STUDENT DETAILS ON 3 TEXT VIEWS.
        tv1.setText(s.getName());
        tv2.setText(s.getEducation());
        tv3.setText(s.getMobile());
    }
}
