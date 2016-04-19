package com.example.selmi.myapplication.View;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.GridView;

import com.example.selmi.myapplication.Controller.CoursAdapter;
import com.example.selmi.myapplication.Model.Cours;
import com.example.selmi.myapplication.Model.Pdf;
import com.example.selmi.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Selmi on 28/02/2016.
 */
public class Exercicefragment extends Activity {

    GridView gridView;
    ArrayList<Cours> coursArrayList;
    List<Pdf> pdfList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cours_fragment);

        coursArrayList = new ArrayList<Cours>();
        pdfList = new ArrayList<Pdf>();
        pdfList.add(new Pdf("pdf","url"));

        for (int i=0;i<20;i++){

            coursArrayList.add(new Cours("non","","",pdfList));
        }


        gridView = (GridView)findViewById(R.id.gridView1);

        gridView.setAdapter(new CoursAdapter(this, coursArrayList));

    }

}
