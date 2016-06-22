package com.example.user.meni2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class drinkActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_drink);

        listView = (ListView) findViewById(R.id.listView1);


        // 清單陣列
        adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1);
        adapter.add("50嵐");
        adapter.add("清心");
        adapter.add("大苑子");
        adapter.add("Mr.Wish");
        adapter.add("喬治派克");
        adapter.add("丸作");
        adapter.add("清玉");
        adapter.add("北回木瓜牛奶");
        adapter.add("COME BUY");
        adapter.add("杯樂");
        adapter.add("鮮茶道");
        adapter.add("喫茶");
        adapter.add("春水堂");
        adapter.add("85度c");
        adapter.add("星巴克");



        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub
                ListView listView = (ListView) arg0;
                if(arg2==0){
                    Intent intent = new Intent();
                    intent.setClass(drinkActivity.this, d1.class);
                    startActivity(intent);
                }
                else if (arg2==1){
                    Intent intent = new Intent();
                    intent.setClass(drinkActivity.this, d2.class);
                    startActivity(intent);
                }
                else if (arg2==2){
                    Intent intent = new Intent();
                    intent.setClass(drinkActivity.this, d3.class);
                    startActivity(intent);
                }
                else if (arg2==3){
                    Intent intent = new Intent();
                    intent.setClass(drinkActivity.this, d4.class);
                    startActivity(intent);
                }
                else if (arg2==4){
                    Intent intent = new Intent();
                    intent.setClass(drinkActivity.this, d5.class);
                    startActivity(intent);
                }
                else if (arg2==5){
                    Intent intent = new Intent();
                    intent.setClass(drinkActivity.this, d6.class);
                    startActivity(intent);
                }
                else if (arg2==6){
                    Intent intent = new Intent();
                    intent.setClass(drinkActivity.this, d7.class);
                    startActivity(intent);
                }
                else if (arg2==7){
                    Intent intent = new Intent();
                    intent.setClass(drinkActivity.this, d8.class);
                    startActivity(intent);
                }
                else if (arg2==8){
                    Intent intent = new Intent();
                    intent.setClass(drinkActivity.this, d9.class);
                    startActivity(intent);
                }
                else if (arg2==9){
                    Intent intent = new Intent();
                    intent.setClass(drinkActivity.this, d10.class);
                    startActivity(intent);
                }
                else if (arg2==10){
                    Intent intent = new Intent();
                    intent.setClass(drinkActivity.this, d11.class);
                    startActivity(intent);
                }
                else if (arg2==11){
                    Intent intent = new Intent();
                    intent.setClass(drinkActivity.this, d12.class);
                    startActivity(intent);
                }
                else if (arg2==12){
                    Intent intent = new Intent();
                    intent.setClass(drinkActivity.this, d13.class);
                    startActivity(intent);
                }
                else if (arg2==13){
                    Intent intent = new Intent();
                    intent.setClass(drinkActivity.this, d14.class);
                    startActivity(intent);
                }
                else if (arg2==14){
                    Intent intent = new Intent();
                    intent.setClass(drinkActivity.this, d15.class);
                    startActivity(intent);
                }



                Toast.makeText(
                        drinkActivity.this,
                        "   選單文字："+ listView.getItemAtPosition(arg2).toString(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

}
