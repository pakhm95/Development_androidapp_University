package com.uvr.slideSQ;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class PUnder extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under);

        Button btnStart, btnStop;
        final ViewFlipper vFlipper;

       // btnStart = (Button) findViewById(R.id.btnStart);
//        btnStop = (Button) findViewById(R.id.btnStop);

        vFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);

        vFlipper.setFlipInterval(3000);


//        btnStart.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                vFlipper.startFlipping();
//            }
//        });

//        btnStop.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//              //  vFlipper.stopFlipping();
//                finish();  //restarting() 다시 activity를 실행하는 코드
//                startActivity(new Intent(PUnder.this, PUnder.class));
//
//            }
//        });

//        //thread에서 UI를 접근하는 코드
//        new Thread() {
//            public void run() {
//                for(int i =0;i<23;i++) {
//                    runOnUiThread(new Runnable(){
//                        public void run() {
//                            vFlipper.showNext();
//                        }
//                    });
//                    SystemClock.sleep(1000);
//                }
//            }
//
//        }.start();
        //각 사진의 time을 milisecond로 표시하여 넣는다.
        final int[] term={10,30,25,40,15,10,20,30,60,10,10,10,60,10,30,5,25,20,5,60,20,25,30};
        new Thread() {
            public void run() {
                for(int i =0;i<23;i++) {
                    SystemClock.sleep(term[i]*1000);
                    runOnUiThread(new Runnable(){
                        public void run() {
                            vFlipper.showNext();
                        }
                    });

                }
            }
        }.start();

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
