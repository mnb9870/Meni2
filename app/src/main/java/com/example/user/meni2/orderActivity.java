package com.example.user.meni2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class orderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        ImageButton chinese = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton foreign = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton vege = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton snack = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton drink = (ImageButton) findViewById(R.id.imageButton9);

        chinese.setOnClickListener(gotochinese);
        foreign.setOnClickListener(gotoforeign);
        vege.setOnClickListener(gotovege);
        snack.setOnClickListener(gotosnack);
        drink.setOnClickListener(gotodrink);

    }

    private View.OnClickListener gotochinese = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(orderActivity.this, chineseActivity.class);
            startActivity(intent);
        }

    };
    private View.OnClickListener gotoforeign = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(orderActivity.this, foreignActivity.class);
            startActivity(intent);
        }

    };
    private View.OnClickListener gotovege = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(orderActivity.this, vegeActivity.class);
            startActivity(intent);
        }

    };
    private View.OnClickListener gotosnack = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(orderActivity.this, snackActivity.class);
            startActivity(intent);
        }

    };
    private View.OnClickListener gotodrink = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(orderActivity.this, drinkActivity.class);
            startActivity(intent);
        }

    };

}
