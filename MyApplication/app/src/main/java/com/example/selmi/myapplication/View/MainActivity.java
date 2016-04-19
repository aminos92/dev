package com.example.selmi.myapplication.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.example.selmi.myapplication.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

Button cours,exercice,favories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cours = (Button)findViewById(R.id.cours);
        exercice = (Button)findViewById(R.id.exercice);
        favories = (Button)findViewById(R.id.favories);

        cours.setOnClickListener(this);
        exercice.setOnClickListener(this);
        favories.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.cours){

            Intent intent=new Intent(MainActivity.this,CoursFragment.class);
            startActivity(intent);
        }else  if (v.getId()==R.id.exercice){

            Intent intent=new Intent(MainActivity.this,Exercicefragment.class);
            startActivity(intent);
        }else  if (v.getId()==R.id.favories){

            Intent intent=new Intent(MainActivity.this,FavorieFragment.class);
            startActivity(intent);
        }
    }
}
