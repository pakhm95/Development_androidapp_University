package com.uvr.slideSQ;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class review extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review);
        setTitle(R.string.title_activity_review);

        final String[] review = {"수혈","피내주사","피하주사","입원관리"};

        ListView list = (ListView)findViewById(R.id.listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,review   );
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),review[i],Toast.LENGTH_LONG).show();
                //finish();  //restarting() 다시 activity를 실행하는 코드
                if(review[i]=="수혈") {
                    startActivity(new Intent(review.this, review_blood.class));
                }else if(review[i]=="피하주사"){
                    startActivity(new Intent(review.this, review_under.class));
                }else if(review[i]=="피내주사"){
                    startActivity(new Intent(review.this, review_inside.class));
                }else if(review[i]=="입원관리"){
                    startActivity(new Intent(review.this, review_ipwon.class));
                }

            }
        });

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case android.R.id.home:{
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
