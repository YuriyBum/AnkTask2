package com.berum.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView hw = (TextView) findViewById(R.id.helloworld);
        Sale sale = new Sale();
        int[] res = sale.decryptData(new int[]{5, 100, 20, 66, 16}, 50, 1,3);
        String hello = "";
        assert res != null;
        for(int k = 1; k < res.length; k++) {
            if (k == res.length-1 ) {
                hello = hello + res[k];
            }
            else {
                hello = hello + res[k] + ",";
            }
        }
        hw.setText(hello);

    }

}
