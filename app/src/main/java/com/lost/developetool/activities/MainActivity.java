package com.lost.developetool.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;

import com.lost.developetool.R;

/**
 * 工具类汇总
 */
public class MainActivity extends AppCompatActivity {

    private CardView cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv = (CardView) findViewById(R.id.cv);

    }
}




