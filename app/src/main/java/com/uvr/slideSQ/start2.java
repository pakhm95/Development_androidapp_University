package com.uvr.slideSQ;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class start2 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start2);

        Button practice, review, video, game, statistics, developer;
        Button back, setting;

        practice = (Button) findViewById(R.id.practice);
        review = (Button)findViewById(R.id.restudy);
        game = (Button)findViewById(R.id.game);
        video = (Button)findViewById(R.id.video);
        statistics = (Button)findViewById(R.id.statistics);
        setting = (Button)findViewById(R.id.settting_start);
        developer = (Button)findViewById(R.id.developer);

        practice.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  vFlipper.stopFlipping();
           //     finish();  //restarting() 다시 activity를 실행하는 코드
                startActivity(new Intent(start2.this, practice.class));

            }
        });

        review.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  vFlipper.stopFlipping();
                //     finish();  //restarting() 다시 activity를 실행하는 코드
                startActivity(new Intent(start2.this, review.class));

            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  vFlipper.stopFlipping();
                //     finish();  //restarting() 다시 activity를 실행하는 코드
                startActivity(new Intent(start2.this, videoRecord.class));

            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  vFlipper.stopFlipping();
                //     finish();  //restarting() 다시 activity를 실행하는 코드
                startActivity(new Intent(start2.this, SettingsActivity.class));

            }
        });

        developer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  vFlipper.stopFlipping();
                //     finish();  //restarting() 다시 activity를 실행하는 코드
                startActivity(new Intent(start2.this, developer.class));

            }
        });

        game.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  vFlipper.stopFlipping();
                //     finish();  //restarting() 다시 activity를 실행하는 코드
                startActivity(new Intent(start2.this, game_main.class));

            }
        });

    }


}
