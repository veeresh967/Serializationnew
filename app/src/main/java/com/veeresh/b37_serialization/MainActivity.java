package com.veeresh.b37_serialization;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //DECLARE ALL VARIABLES OF MAIN SCREEN
    private EditText et1, et2, et3;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //INITIALIZE ALL VARIABLES OF MAIN SCREEN
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText3);
        b1 = (Button) findViewById(R.id.button1);

        //IMPLEMENT BUTTON CLICK LISTENER
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TASK 2 : SEND STUDENT OBJECT TO SECOND ACTIVITY
                //A. READ DATA FROM EDIT TEXT BOXES
                String name = et1.getText().toString();
                String education = et2.getText().toString();
                String mobile = et3.getText().toString();
                //B. CREATE STUDENT OBJECT WITH ABOVE VALUES
                Student s = new Student(name, education, mobile);
                Trainer t = new Trainer("satish","android");
                //C. CREATE INTENT FOR SECOND ACTIVITY
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                //D. PASS STUDENT OBJECT TO INTENT - AS PUT EXTRA
                in.putExtra("obj", s);
                in.putExtra("obj2", t);
                //E. START THE ACTIVITY
                startActivity(in);
            }
        });
    }
}
