package com.example.helloworld.listview;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ListActivity {

    String[] members = {
            "Me-Ayush Rout",
            "Geetanjali-Mother",
            "Prasant-Father",
            "Elisha-Sister 1",
            "Manisha-Sister 2",
            "Rohan-Brother",
            "Pet",
            
    };

    Integer[] imageIDs = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7
           
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        AdvancedCustomArrayAdapter adapter =new AdvancedCustomArrayAdapter(this, members, imageIDs);
        setListAdapter(adapter);

    }


}
