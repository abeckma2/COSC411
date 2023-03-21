package com.example.cosc411project;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.content.Context;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;


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
    final RelativeLayout lin=(RelativeLayout) findViewById(R.id.linear);
    public void makeViews(int v)
    {
        TextView words[]=new TextView[v];
        for(int i=0;i<v;i++)
        {
            words[i]=new TextView(this);
            words[i].setId(TextView.generateViewId());
            words[i].setBackgroundColor(Color.BLACK);
            words[i].setTextColor(Color.parseColor("#000000"));
            words[i].setTextSize(TypedValue.COMPLEX_UNIT_SP,30);
            words[i].setGravity(Gravity.CENTER);
            RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(0,0);
            if(i>0)
            {
                params.addRule(RelativeLayout.BELOW,words[i-1].getId());
            }
            params.width= ViewGroup.LayoutParams.WRAP_CONTENT;
            params.height=(int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,50,getResources().getDisplayMetrics());
            params.topMargin=1;
            words[i].setLayoutParams(params);
            lin.addView(words[i]);

        }
    }

}