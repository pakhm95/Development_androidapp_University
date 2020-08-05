package com.uvr.slideSQ;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class game_finish2 extends AppCompatActivity {

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.game_finish2);

        Button main_back;

        TextView text1 = (TextView)findViewById(R.id.timer);

        main_back = (Button)findViewById(R.id.main_back);

        main_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(game_finish2.this, game_main.class));
            }
        });


    }
}
