package com.example.practiceactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);
        setTitle("View Lists");
        //Get the intent from Main to use here
        Intent j = getIntent();
        //define variable string, and use key to add it to the new intent
        String name = j.getStringExtra("Title");
        //to check for null values under the condition that the name variable is missing
        //if the value is null: use this alternate text
//        if(name){
        ((TextView)findViewById(R.id.serviceTitle)).setText(name);
//        }
        //Otherwise display the name from the value in the name string
//        else {
//            ((TextView)findViewById(R.id.serviceTitle)).setText("");
//        }
    }

    public void resetTitle(){}

}