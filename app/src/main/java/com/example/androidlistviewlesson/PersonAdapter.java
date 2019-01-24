package com.example.androidlistviewlesson;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonAdapter extends ArrayAdapter<String> {

    private String[] values;
    private LayoutInflater inflater;


   public PersonAdapter(Context context, String [] values) {
       super(context, -1, values);

       this.values = values;
       inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

   }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {

       View listItem = inflater.inflate(R.layout.list_item_layout, parent, false);

        TextView nameView = listItem.findViewById(R.id.name);
        TextView titleView = listItem.findViewById(R.id.title);
        ImageView imageView = listItem.findViewById(R.id.picture);

        String name = values[position];
        nameView.setText(name);
        titleView.setText("Familjemedlem");

        if(name.equals("David")){
            imageView.setImageResource(R.drawable.businessman);
        }
        else{
            imageView.setImageResource(R.drawable.businessman);
        }


        return listItem;
    }
}
