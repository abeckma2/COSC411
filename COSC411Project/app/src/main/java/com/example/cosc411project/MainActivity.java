package com.example.cosc411project;

import android.os.Bundle;
import android.widget.Button;

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
    public void makeButtons(int number)
    {
        while(true)
        {
            Button button[]=new Button[number];
            for(int i=0;i<number;i++)
            {
                button[i]=new Button(this);
            }
        }
    }
}