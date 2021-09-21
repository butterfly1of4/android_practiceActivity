package com.example.practiceactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");

    }
//
    public void selectService(View v){
        Intent i = new Intent(this, SelectServiceActivity.class);
        Button button = findViewById(R.id.selectView);
        startActivity(i);
        button.setOnClickListener(this::selectService);
}
//
public void createList(View v){
    Intent i = new Intent(this, CreateListActivity.class);
    Button button = findViewById(R.id.selectAdd);
    startActivity(i);
    button.setOnClickListener(this::createList);
}
}

//        String name = ((Button)v).getText().toString();
//
//        i.putExtra("NAME", name);
//
//    //Method for composeMessage- since it's a button, it takes the View type v
//    public void viewList(View v){
//        //Intent to link Main to Compose
//        Intent i = new Intent(this, ViewListActivity.class);
//        //Define a string w/ a variable name, Cast the getText to EditText & store in String
//        String name = ((Button)v).getText().toString();
//        //use the intent i to define a label and list the variable name from above
//        i.putExtra("NAME", name);
//        //start the new activity (compose)
//        startActivity(i);
//    }