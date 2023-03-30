package com.example.cosc411project;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//import io.realm.mongodb.AppException;

import androidx.appcompat.app.AppCompatActivity;


public class SecondFragment extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_second);
    }
    public void back(View v)
    {
        finish();
    }
    public void next(View v)
    {
        EditText name=(EditText) findViewById(R.id.edit_one);
        EditText email=(EditText) findViewById(R.id.edit_two);


    }

}