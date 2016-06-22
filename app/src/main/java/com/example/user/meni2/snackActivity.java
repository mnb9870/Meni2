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

public class snackActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_snack);

        listView = (ListView) findViewById(R.id.listView1);


        // 清單陣列
        adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1);
        adapter.add("紅茶臭豆腐");
        adapter.add("86碳烤雞排");
        adapter.add("海邊小屋");
        adapter.add("巧朵滋匈牙利煙囪捲");
        adapter.add("波西飛薯");
        adapter.add("黃金賊");
        adapter.add("黃金右腿");
        adapter.add("黃金左腿");
        adapter.add("豬寶盒");
        adapter.add("魚要醬吃");
        adapter.add("麻辣魚蛋");
        adapter.add("懶人蝦");
        adapter.add("地瓜球");
        adapter.add("冰火菠蘿油");
        adapter.add("官芝霖");
        adapter.add("激旨燒鳥");
        adapter.add("蛤?!貝你發現");



        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub
                ListView listView = (ListView) arg0;
                if(arg2==0){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s1.class);
                    startActivity(intent);
                }
                else if (arg2==1){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s2.class);
                    startActivity(intent);
                }
                else if (arg2==2){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s3.class);
                    startActivity(intent);
                }
                else if (arg2==3){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s4.class);
                    startActivity(intent);
                }
                else if (arg2==4){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s5.class);
                    startActivity(intent);
                }
                else if (arg2==5){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s6.class);
                    startActivity(intent);
                }
                else if (arg2==6){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s7.class);
                    startActivity(intent);
                }
                else if (arg2==7){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s8.class);
                    startActivity(intent);
                }
                else if (arg2==8){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s9.class);
                    startActivity(intent);
                }
                else if (arg2==9){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s10.class);
                    startActivity(intent);
                }
                else if (arg2==10){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s11.class);
                    startActivity(intent);
                }
                else if (arg2==11){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s12.class);
                    startActivity(intent);
                }
                else if (arg2==12){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s13.class);
                    startActivity(intent);
                }
                else if (arg2==13){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s14.class);
                    startActivity(intent);
                }
                else if (arg2==14){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s15.class);
                    startActivity(intent);
                }
                else if (arg2==15){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s16.class);
                    startActivity(intent);
                }
                else if (arg2==16){
                    Intent intent = new Intent();
                    intent.setClass(snackActivity.this, s17.class);
                    startActivity(intent);
                }




                Toast.makeText(
                        snackActivity.this,
                        "   選單文字："+ listView.getItemAtPosition(arg2).toString(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

}
