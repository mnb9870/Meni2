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

public class foreignActivity extends AppCompatActivity {


    private ListView listView;
    private ArrayAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_foreign);

        listView = (ListView) findViewById(R.id.listView1);


        // 清單陣列
        adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1);
        adapter.add("西堤");
        adapter.add("養機場");
        adapter.add("小順豐");
        adapter.add("水相");
        adapter.add("Subway");
        adapter.add("麥當勞");
        adapter.add("肯德基");
        adapter.add("光和鹽");
        adapter.add("NuPasta");
        adapter.add("鯊魚咬吐司");
        adapter.add("小義大利");
        adapter.add("喬伊歐爸爸");
        adapter.add("金色三麥");
        adapter.add("七分SO");
        adapter.add("樂沐");



        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub
                ListView listView = (ListView) arg0;
                if(arg2==0){
                    Intent intent = new Intent();
                    intent.setClass(foreignActivity.this, f1.class);
                    startActivity(intent);
                }
                else if (arg2==1){
                    Intent intent = new Intent();
                    intent.setClass(foreignActivity.this, f2.class);
                    startActivity(intent);
                }
                else if (arg2==2){
                    Intent intent = new Intent();
                    intent.setClass(foreignActivity.this, f3.class);
                    startActivity(intent);
                }
                else if (arg2==3){
                    Intent intent = new Intent();
                    intent.setClass(foreignActivity.this, f4.class);
                    startActivity(intent);
                }
                else if (arg2==4){
                    Intent intent = new Intent();
                    intent.setClass(foreignActivity.this, f5.class);
                    startActivity(intent);
                }
                else if (arg2==5){
                    Intent intent = new Intent();
                    intent.setClass(foreignActivity.this, f6.class);
                    startActivity(intent);
                }
                else if (arg2==6){
                    Intent intent = new Intent();
                    intent.setClass(foreignActivity.this, f7.class);
                    startActivity(intent);
                }
                else if (arg2==7){
                    Intent intent = new Intent();
                    intent.setClass(foreignActivity.this, f8.class);
                    startActivity(intent);
                }
                else if (arg2==8){
                    Intent intent = new Intent();
                    intent.setClass(foreignActivity.this, f9.class);
                    startActivity(intent);
                }
                else if (arg2==9){
                    Intent intent = new Intent();
                    intent.setClass(foreignActivity.this, f10.class);
                    startActivity(intent);
                }
                else if (arg2==10){
                    Intent intent = new Intent();
                    intent.setClass(foreignActivity.this, f11.class);
                    startActivity(intent);
                }
                else if (arg2==11){
                    Intent intent = new Intent();
                    intent.setClass(foreignActivity.this, f12.class);
                    startActivity(intent);
                }
                else if (arg2==12){
                    Intent intent = new Intent();
                    intent.setClass(foreignActivity.this, f13.class);
                    startActivity(intent);
                }
                else if (arg2==13){
                    Intent intent = new Intent();
                    intent.setClass(foreignActivity.this, f14.class);
                    startActivity(intent);
                }
                else if (arg2==14){
                    Intent intent = new Intent();
                    intent.setClass(foreignActivity.this, f15.class);
                    startActivity(intent);
                }





                Toast.makeText(
                        foreignActivity.this,
                        "   選單文字："+ listView.getItemAtPosition(arg2).toString(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

}
