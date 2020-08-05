package com.uvr.slideSQ;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class game_main extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_main);

        Button start, setting, end;

        start = (Button) findViewById(R.id.game_start);
        setting = (Button) findViewById(R.id.game_setting);
        end = (Button) findViewById(R.id.game_end);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  vFlipper.stopFlipping();
                //     finish();  //restarting() 다시 activity를 실행하는 코드
                startActivity(new Intent(game_main.this, game_main2.class));
            }
        });

      /*  setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  vFlipper.stopFlipping();
                //     finish();  //restarting() 다시 activity를 실행하는 코드
                startActivity(new Intent(game_main.this, game_setting.class));
            }
        }); */

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  vFlipper.stopFlipping();
                //     finish();  //restarting() 다시 activity를 실행하는 코드
                startActivity(new Intent(game_main.this, start2.class));
            }
        });
    }


}
