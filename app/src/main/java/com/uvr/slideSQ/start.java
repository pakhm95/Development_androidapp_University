package com.uvr.slideSQ;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class start extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        Button button_start;

        button_start = (Button)findViewById(R.id.btn_get_started);

        button_start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  vFlipper.stopFlipping();
           //     finish();  //restarting() 다시 activity를 실행하는 코드
                startActivity(new Intent(start.this, start2.class));

            }
        });
    }
}
