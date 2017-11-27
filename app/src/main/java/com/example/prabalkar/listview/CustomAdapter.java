package com.example.prabalkar.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by prabalkar on 21/11/17.
 */

public class CustomAdapter extends BaseAdapter {

    String result [];
    Context context;

    private static LayoutInflater inflater = null;
    public CustomAdapter(MainActivity mainActivity, String [] prgrmNameList){
        result = prgrmNameList;
        context = mainActivity;
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder{
        TextView tv;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup viewGroup ) {
        Holder holder = new Holder();
        View rowView ;
             rowView = inflater.inflate(R.layout.program_list, null);
             holder.tv = (TextView) rowView.findViewById(R.id.text2);
        holder.tv.setText(result[position]);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();

            }
        });

        return rowView;
    }
}
