package com.example.cosc411project;

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

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.cosc411project.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i=3;
        makeButtons(i);
    }
    final ScrollView scroll=(ScrollView)findViewById(R.id.scroll);
    final RelativeLayout lin=(RelativeLayout) findViewById(R.id.linear);
    public void makeButtons(int number)
    {
        while(true)
        {
            Button button[]=new Button[number];
            for(int i=0;i<number;i++)
            {
                button[i]=new Button(this);
                button[i].setId(Button.generateViewId());
                button[i].setBackgroundColor(Color.BLACK);
                button[i].setTextColor(Color.parseColor("#009900"));
                button[i].setTextSize(TypedValue.COMPLEX_UNIT_SP,30);
                button[i].setGravity(Gravity.CENTER);

                RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(0,0);
                if(i>0)
                {
                    params.addRule(RelativeLayout.BELOW,button[i-1].getId());
                }
                params.width=params.MATCH_PARENT;
                params.height=(int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,50,getResources().getDisplayMetrics());
                params.topMargin=1;
                button[i].setLayoutParams(params);
                lin.addView(button[i]);
            }
        }
    }
    public void login(View view)
    {
        Intent secondActivity=new Intent(this,SecondFragment.class);
        startActivity(secondActivity);
    }
}