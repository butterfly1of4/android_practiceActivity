package com.example.practiceactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_service);
        setTitle("Select Service");
        Intent i = getIntent();

    }

    public void viewList(View v){
        Intent j = new Intent(this, ViewListActivity.class);
        Button button = (Button) v;
        String name = button.getText().toString();
        button.setOnClickListener(this::viewList);
  if(name.equals("hulu")) {
          button.findViewById(R.id.hulu).callOnClick();
          name="HULU";
          } else if(name.equals("netflix")) {
          button.findViewById(R.id.netflix).callOnClick();
          name="Netflix";
          } else if(name.equals("amazon")) {
          button.findViewById(R.id.amazon).callOnClick();
          name="Amazon";
          } else if(name.equals("hbo")) {
          button.findViewById(R.id.hbo).callOnClick();
          name="HBO";
          } else if(name.equals("disney")) {
          button.findViewById(R.id.disney).callOnClick();
          name="Disney+";
          }

        j.putExtra("Title",name);
            //start the new activity (compose)
        startActivity(j);
//        button.setOnClickListener(this::viewList);

    }
}
//
//
//  if(name == "hulu") {
//          button.findViewById(R.id.hulu).callOnClick();
//          name="HULU";
//          } else if(name == "netflix") {
//          button.findViewById(R.id.netflix).callOnClick();
//          name="Netflix";
//          } else if(name == "amazon") {
//          button.findViewById(R.id.amazon).callOnClick();
//          name="Amazon";
//          } else if(name == "hbo") {
//          button.findViewById(R.id.hbo).callOnClick();
//          name="HBO";
//          } else if(name == "disney") {
//          button.findViewById(R.id.disney).callOnClick();
//          name="Disney+";
//          }


//    Button button = (Button) v;
//    //        String name = button.getText().toString();
//    String name = ((Button) v).getText().toString();
//    Button hulu = (Button) findViewById(R.id.hulu);
//    Button netflix = (Button) findViewById(R.id.netflix);
//    Button amazon = (Button) findViewById(R.id.amazon);
//    Button hbo = (Button) findViewById(R.id.hbo);
//    Button disney = (Button) findViewById(R.id.disney);



//   if(button.findViewById(R.id.hulu).callOnClick()){
//           name="Hulu";
//           } else if(button.findViewById(R.id.netflix).callOnClick()){
//           name="Netflix";
//           } else if(button.findViewById(R.id.amazon).callOnClick()){
//           name="Amazon";
//           } else if(button.findViewById(R.id.hbo).callOnClick()){
//           name="HBO";
//           } else if(button.findViewById(R.id.disney).callOnClick()){
//           name="Disney+";
//           }