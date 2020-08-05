package com.uvr.slideSQ;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class game_main2 extends AppCompatActivity {

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_main2);

        final Button b_trans, id_injection, sc_injection, h_managemant, v_sign;

        b_trans = (Button) findViewById(R.id.b_trans);
        id_injection = (Button) findViewById(R.id.id_injection);
        sc_injection = (Button) findViewById(R.id.sc_injection);
        h_managemant = (Button) findViewById(R.id.h_managemant);
        v_sign = (Button) findViewById(R.id.v_sign);

        b_trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(game_main2.this, b_trens_main.class));
            }
        });

        sc_injection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(game_main2.this, sc_main.class));
            }
        });

        id_injection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(game_main2.this, id_main.class));
            }
        });

        h_managemant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(game_main2.this, h_managemant.class));
            }
        });

        v_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(game_main2.this, v_sign.class));
            }
        });
    }
}
