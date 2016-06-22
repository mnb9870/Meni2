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

public class vegeActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_vege);

        listView = (ListView) findViewById(R.id.listView1);


        // 清單陣列
        adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1);
        adapter.add("中興素食");
        adapter.add("一心臭豆腐");
        adapter.add("響蔬職人");
        adapter.add("舒果");
        adapter.add("胤茹坊");
        adapter.add("卡如那泰式素食");
        adapter.add("南風蔬食咖啡");
        adapter.add("十方蔬食館");
        adapter.add("若水茶軒");
        adapter.add("傳祥園素食手工麵食館");
        adapter.add("永素青花草蔬食堂");




        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub
                ListView listView = (ListView) arg0;
                if(arg2==0){
                    Intent intent = new Intent();
                    intent.setClass(vegeActivity.this, v1.class);
                    startActivity(intent);
                }
                else if (arg2==1){
                    Intent intent = new Intent();
                    intent.setClass(vegeActivity.this, v2.class);
                    startActivity(intent);
                }
                else if (arg2==2){
                    Intent intent = new Intent();
                    intent.setClass(vegeActivity.this, v3.class);
                    startActivity(intent);
                }
                else if (arg2==3){
                    Intent intent = new Intent();
                    intent.setClass(vegeActivity.this, v4.class);
                    startActivity(intent);
                }
                else if (arg2==4){
                    Intent intent = new Intent();
                    intent.setClass(vegeActivity.this, v5.class);
                    startActivity(intent);
                }
                else if (arg2==5){
                    Intent intent = new Intent();
                    intent.setClass(vegeActivity.this, v6.class);
                    startActivity(intent);
                }
                else if (arg2==6){
                    Intent intent = new Intent();
                    intent.setClass(vegeActivity.this, v7.class);
                    startActivity(intent);
                }
                else if (arg2==7){
                    Intent intent = new Intent();
                    intent.setClass(vegeActivity.this, v8.class);
                    startActivity(intent);
                }
                else if (arg2==8){
                    Intent intent = new Intent();
                    intent.setClass(vegeActivity.this, v9.class);
                    startActivity(intent);
                }
                else if (arg2==9){
                    Intent intent = new Intent();
                    intent.setClass(vegeActivity.this, v10.class);
                    startActivity(intent);
                }
                else if (arg2==10){
                    Intent intent = new Intent();
                    intent.setClass(vegeActivity.this, v11.class);
                    startActivity(intent);
                }




                Toast.makeText(
                        vegeActivity.this,
                        "   選單文字："+ listView.getItemAtPosition(arg2).toString(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

  
}
