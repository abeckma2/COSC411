package com.example.cosc411project;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class FirstFragment extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_first);
        int i=6;
        makeViews(i);
    }
    public void back(View v)
    {
        finish();
    }
    public void makeViews(int v)
    {
        TextView text[]=new TextView[v];
        for(int i=0;i<v;i++)
        {
            text[i]=new TextView(this);
        }
    }

}