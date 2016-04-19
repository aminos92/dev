package com.example.selmi.myapplication.View;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public class CoursFragment extends Activity{

    GridView gridView;
    ArrayList<Cours>coursArrayList;
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

   /* @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this
        View view;
        view = inflater.inflate(R.layout.cours_fragment, container, false);
        
        coursArrayList = new ArrayList<Cours>();
        pdfList = new ArrayList<Pdf>();
        pdfList.add(new Pdf("pdf","url"));
        
        for (int i=0;i<10;i++){
            
            coursArrayList.add(new Cours("non","","",pdfList));
        }


        gridView = (GridView) view.findViewById(R.id.gridView1);

        gridView.setAdapter(new CoursAdapter(getActivity(), coursArrayList));
        return view;
    }*/
}
