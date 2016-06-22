package com.example.user.meni2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton order = (ImageButton) findViewById(R.id.imageButton);
        order.setOnClickListener(gotoorder);


        ImageButton contact = (ImageButton) findViewById(R.id.imageButton4);
        contact.setOnClickListener(gotocon);

        ImageButton news = (ImageButton) findViewById(R.id.imageButton3);
        news.setOnClickListener(gotonews);
    }

    private View.OnClickListener gotoorder = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, orderActivity.class);
            startActivity(intent);
        }

    };
    private View.OnClickListener gotoqwe = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, roomActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener gotocon = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, ContactUs.class);
            startActivity(intent);
        }

    };
    private View.OnClickListener gotonews = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, News.class);
            startActivity(intent);
        }

    };
}
