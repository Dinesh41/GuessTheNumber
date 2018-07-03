package com.stalnobcrs.guessgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int rnum;
    public void makeToast(String s)
    {
        Toast.makeText(MainActivity.this,s, Toast.LENGTH_SHORT).show();
    }
    public void Guess(View view)
    {
        EditText num=(EditText)findViewById(R.id.entered);
        int n=Integer.parseInt(num.getText().toString());
        if(n>rnum)
        {
            //Toast.makeText(MainActivity.this,"Lower",Toast.LENGTH_LONG).show();
            makeToast("Lower");
        }
        else if(n<rnum)
        {
            //Toast.makeText(MainActivity.this, "Higher", Toast.LENGTH_SHORT).show();
            makeToast("Higher");
        }
        else
        {
            //Toast.makeText(MainActivity.this,"You are Correct",Toast.LENGTH_LONG).show();
            makeToast("You are correct.Try again dude");
            Random ran=new Random();
            rnum=ran.nextInt(10)+1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random ran=new Random();
        rnum=ran.nextInt(10)+1;
    }
}
