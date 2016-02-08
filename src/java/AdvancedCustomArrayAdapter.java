package com.example.helloworld.listview;


import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdvancedCustomArrayAdapter extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] members;
    private final Integer[] imageIds;

    public AdvancedCustomArrayAdapter(
            Activity context, String[] members, Integer[] imageIds) {
        super(context, R.layout.lvrowlayout2, members);
        this.context = context;
        this.members = members;
        this.imageIds = imageIds;
    }

    static class ViewContainer {
        public ImageView imageView;
        public TextView txtTitle;
        public TextView txtDescription;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewContainer viewContainer;
        View rowView = view;

        
        Log.d("CustomArrayAdapter",String.valueOf(position));

        
        if (rowView == null) {

            Log.d("CustomArrayAdapter", "New");
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(R.layout.lvrowlayout2, null, true);

            
            viewContainer = new ViewContainer();

            
            viewContainer.txtTitle = (TextView)
                    rowView.findViewById(R.id.txtMemberName);
            viewContainer.txtDescription = (TextView)
                    rowView.findViewById(R.id.txtDescription);
            viewContainer.imageView = (ImageView) rowView.findViewById(R.id.icon);

            
            rowView.setTag(viewContainer);
        } else {

                       
            Log.d("CustomArrayAdapter", "Recycling");
            
            viewContainer = (ViewContainer) rowView.getTag();
        }

        
        viewContainer.txtTitle.setText(members[position]);
        viewContainer.txtDescription.setText(members[position] +
                " My Family!!!");
        viewContainer.imageView.setImageResource(imageIds[position]);
        return rowView;
    } 
}


