package com.example.selmi.myapplication.Controller;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.selmi.myapplication.Model.Cours;
import com.example.selmi.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Selmi on 28/02/2016.
 */
public class CoursAdapter extends BaseAdapter {

    private Context context;

    ArrayList<Cours> _CoursArrayList;

    public CoursAdapter(Context context, ArrayList<Cours> coursArrayList) {
        this.context = context;
        this._CoursArrayList = coursArrayList;
    }



    @Override
    public int getCount() {
        return _CoursArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return _CoursArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(context);

            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.item_cours_adapter, null);

            // set value into textview
            ImageView imageView = (ImageView) gridView
                    .findViewById(R.id.grid_item_image);

            imageView.setImageResource(R.drawable.android);


        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }
}
