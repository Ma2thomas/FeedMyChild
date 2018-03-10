package com.example.sourabh_.childtrackingsystem;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;

/**
 * Created by Anjo on 3/10/2018.
 */

public class popup extends Activity {
    ImageButton b1;
    private PopupWindow mPopupWindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.popup);

        DisplayMetrics d1 =new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(d1);
        int width =d1.widthPixels;
        int height=d1.heightPixels;
        getWindow().setLayout((int)(width*.8),(int)(height*.6));
        b1=(ImageButton)findViewById(R.id.ib_close);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
            }


}