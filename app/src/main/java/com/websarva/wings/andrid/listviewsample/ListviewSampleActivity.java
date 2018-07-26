package com.websarva.wings.andrid.listviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListviewSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_sample);
    }
    private class ListItemClickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?>parent, View view,int position,long id){
            String item =(String)parent.getItemAtPosition(position);
            String show = "あなたが選んだ定食:"+item;
            Toast.makeText(ListviewSampleActivity.this,show,Toast.LENGTH_LONG).show();
            ListView lvMenu = findViewById(R.id.lvMenu);
            lvMenu.setOnItemClickListener(new ListItemClickListener());
        }
    }
}

