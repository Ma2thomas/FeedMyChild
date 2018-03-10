package com.example.sourabh_.childtrackingsystem;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

public class ConfirmActivity extends AppCompatActivity {
    Button b1, b2, b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ConfirmActivity.this, DoneActivity.class);
                startActivity(in);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(ConfirmActivity.this, MAPActivity.class);
                startActivity(inte);
            }
        });
          b3.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent in =new Intent(ConfirmActivity.this, popup.class);
                  startActivity(in);
              }
          });
    }
}









