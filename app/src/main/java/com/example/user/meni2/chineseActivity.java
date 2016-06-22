package com.example.user.meni2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class chineseActivity extends AppCompatActivity {



    private ListView listView;
    private ArrayAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_chinese);

        listView = (ListView) findViewById(R.id.listView1);


        // 清單陣列
        adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1);
        adapter.add("鼎泰豐");
        adapter.add("阿秋大肥鵝");
        adapter.add("財神爺滷肉飯");
        adapter.add("清一色牛肉麵");
        adapter.add("品虹橋滬川料理");
        adapter.add("金饌脆皮烤鴨");
        adapter.add("天越食堂");
        adapter.add("印月創意東方宴");
        adapter.add("吉野便當");
        adapter.add("森記便當");
        adapter.add("三商巧福");
        adapter.add("翠園小館港式飲茶");
        adapter.add("蘇杭小館");
        adapter.add("向上水餃");
        adapter.add("吉峰蒸餃");
        adapter.add("小瀋陽酸菜白肉鍋");
        adapter.add("曉明湯包");



        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub
                ListView listView = (ListView) arg0;
                if(arg2==0){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese1.class);
                    startActivity(intent);
                }
                else if (arg2==1){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese2.class);
                    startActivity(intent);
                }
                else if (arg2==2){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese3.class);
                    startActivity(intent);
                }
                else if (arg2==3){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese4.class);
                    startActivity(intent);
                }
                else if (arg2==4){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese5.class);
                    startActivity(intent);
                }
                else if (arg2==5){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese6.class);
                    startActivity(intent);
                }
                else if (arg2==6){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese7.class);
                    startActivity(intent);
                }
                else if (arg2==7){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese8.class);
                    startActivity(intent);
                }
                else if (arg2==8){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese9.class);
                    startActivity(intent);
                }
                else if (arg2==9){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese10.class);
                    startActivity(intent);
                }
                else if (arg2==10){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese11.class);
                    startActivity(intent);
                }
                else if (arg2==11){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese12.class);
                    startActivity(intent);
                }
                else if (arg2==12){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese13.class);
                    startActivity(intent);
                }
                else if (arg2==13){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese14.class);
                    startActivity(intent);
                }
                else if (arg2==14){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese15.class);
                    startActivity(intent);
                }
                else if (arg2==15){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese16.class);
                    startActivity(intent);
                }
                else if (arg2==16){
                    Intent intent = new Intent();
                    intent.setClass(chineseActivity.this, chinese17.class);
                    startActivity(intent);
                }



                Toast.makeText(
                        chineseActivity.this,
                        "   選單文字："+ listView.getItemAtPosition(arg2).toString(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    }



