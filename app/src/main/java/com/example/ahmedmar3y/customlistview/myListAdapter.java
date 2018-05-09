package com.example.ahmedmar3y.customlistview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ahmed mar3y on 09/05/2018.
 */

public class myListAdapter extends ArrayAdapter<String> {
    private final Activity context;

    String[] mainTitle;
    String[] subTitle;
    Integer[] icons;


    public myListAdapter(Activity context, String[] mainTitle, String[] subTitle, Integer[] icons) {
        // 1 context
        // 2 mylistView
        // main Title

        super(context, R.layout.mylist, mainTitle);
        this.context=context;
        this.mainTitle = mainTitle;
        this.subTitle = subTitle;
        this.icons = icons;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.mainTitle);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subTitle);

        titleText.setText(mainTitle[position]);
        imageView.setImageResource(icons[position]);
        subtitleText.setText(subTitle[position]);

        return rowView;


//        return super.getView(position, convertView, parent);
    }
}
