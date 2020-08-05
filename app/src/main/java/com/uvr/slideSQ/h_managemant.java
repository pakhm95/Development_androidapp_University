package com.uvr.slideSQ;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class h_managemant extends AppCompatActivity  {
    String answer = "yes";
    int count = 0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.h_managemant);

        Button submit, back;

        ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10,iv11,iv12,iv13,iv14,iv15,iv16;

        LinearLayout uplinear1,uplinear2,uplinear3,uplinear4,uplinear5,uplinear6,uplinear7,uplinear8,uplinear9,uplinear10,uplinear11,uplinear12,uplinear13,uplinear14,uplinear15,uplinear16;
        LinearLayout dnlinear1,dnlinear2,dnlinear3,dnlinear4,dnlinear5,dnlinear6,dnlinear7,dnlinear8,dnlinear9,dnlinear10,dnlinear11,dnlinear12,dnlinear13,dnlinear14;

        iv1 = findViewById(R.id.image1);
        iv1.setTag("yes");
        iv1.setBackground(new ShapeDrawable(new OvalShape()));
        iv1.setClipToOutline(true);
        iv1.setOnTouchListener(mTouchListener);
        iv2 = findViewById(R.id.image2);
        iv2.setTag("no");
        iv2.setBackground(new ShapeDrawable(new OvalShape()));
        iv2.setClipToOutline(true);
        iv2.setOnTouchListener(mTouchListener);
        iv3 = findViewById(R.id.image3);
        iv3.setTag("no");
        iv3.setBackground(new ShapeDrawable(new OvalShape()));
        iv3.setClipToOutline(true);
        iv3.setOnTouchListener(mTouchListener);
        iv4 = findViewById(R.id.image4);
        iv4.setTag("yes");
        iv4.setBackground(new ShapeDrawable(new OvalShape()));
        iv4.setClipToOutline(true);
        iv4.setOnTouchListener(mTouchListener);
        iv5 = findViewById(R.id.image5);
        iv5.setTag("no");
        iv5.setBackground(new ShapeDrawable(new OvalShape()));
        iv5.setClipToOutline(true);
        iv5.setOnTouchListener(mTouchListener);
        iv6 = findViewById(R.id.image6);
        iv6.setTag("yes");
        iv6.setBackground(new ShapeDrawable(new OvalShape()));
        iv6.setClipToOutline(true);
        iv6.setOnTouchListener(mTouchListener);
        iv7 = findViewById(R.id.image7);
        iv7.setTag("yes");
        iv7.setBackground(new ShapeDrawable(new OvalShape()));
        iv7.setClipToOutline(true);
        iv7.setOnTouchListener(mTouchListener);
        iv8 = findViewById(R.id.image8);
        iv8.setTag("no");
        iv8.setBackground(new ShapeDrawable(new OvalShape()));
        iv8.setClipToOutline(true);
        iv8.setOnTouchListener(mTouchListener);
        iv9 = findViewById(R.id.image9);
        iv9.setTag("yes");
        iv9.setBackground(new ShapeDrawable(new OvalShape()));
        iv9.setClipToOutline(true);
        iv9.setOnTouchListener(mTouchListener);
        iv10 = findViewById(R.id.image10);
        iv10.setTag("no");
        iv10.setBackground(new ShapeDrawable(new OvalShape()));
        iv10.setClipToOutline(true);
        iv10.setOnTouchListener(mTouchListener);
        iv11 = findViewById(R.id.image11);
        iv11.setTag("yes");
        iv11.setBackground(new ShapeDrawable(new OvalShape()));
        iv11.setClipToOutline(true);
        iv11.setOnTouchListener(mTouchListener);
        iv12 = findViewById(R.id.image12);
        iv12.setTag("yes");
        iv12.setBackground(new ShapeDrawable(new OvalShape()));
        iv12.setClipToOutline(true);
        iv12.setOnTouchListener(mTouchListener);
        iv13 = findViewById(R.id.image13);
        iv13.setTag("yes");
        iv13.setBackground(new ShapeDrawable(new OvalShape()));
        iv13.setClipToOutline(true);
        iv13.setOnTouchListener(mTouchListener);
        iv14 = findViewById(R.id.image14);
        iv14.setTag("no");
        iv14.setBackground(new ShapeDrawable(new OvalShape()));
        iv14.setClipToOutline(true);
        iv14.setOnTouchListener(mTouchListener);
        iv15 = findViewById(R.id.image15);
        iv15.setTag("yes");
        iv15.setBackground(new ShapeDrawable(new OvalShape()));
        iv15.setClipToOutline(true);
        iv15.setOnTouchListener(mTouchListener);
        iv16 = findViewById(R.id.image16);
        iv16.setTag("yes");
        iv16.setBackground(new ShapeDrawable(new OvalShape()));
        iv16.setClipToOutline(true);
        iv16.setOnTouchListener(mTouchListener);

        uplinear1 = findViewById(R.id.uplinear1);
        uplinear1.setOnDragListener(mDragListener);
        uplinear2 = findViewById(R.id.uplinear2);
        uplinear2.setOnDragListener(mDragListener);
        uplinear3 = findViewById(R.id.uplinear3);
        uplinear3.setOnDragListener(mDragListener);
        uplinear4 = findViewById(R.id.uplinear4);
        uplinear4.setOnDragListener(mDragListener);
        uplinear5 = findViewById(R.id.uplinear5);
        uplinear5.setOnDragListener(mDragListener);
        uplinear6 = findViewById(R.id.uplinear5);
        uplinear6.setOnDragListener(mDragListener);
        uplinear7 = findViewById(R.id.uplinear5);
        uplinear7.setOnDragListener(mDragListener);
        uplinear8 = findViewById(R.id.uplinear5);
        uplinear8.setOnDragListener(mDragListener);
        uplinear9 = findViewById(R.id.uplinear5);
        uplinear9.setOnDragListener(mDragListener);
        uplinear10 = findViewById(R.id.uplinear5);
        uplinear10.setOnDragListener(mDragListener);
        uplinear11 = findViewById(R.id.uplinear5);
        uplinear11.setOnDragListener(mDragListener);
        uplinear12 = findViewById(R.id.uplinear5);
        uplinear12.setOnDragListener(mDragListener);
        uplinear13 = findViewById(R.id.uplinear5);
        uplinear13.setOnDragListener(mDragListener);
        uplinear14 = findViewById(R.id.uplinear5);
        uplinear14.setOnDragListener(mDragListener);
        uplinear15 = findViewById(R.id.uplinear5);
        uplinear15.setOnDragListener(mDragListener);
        uplinear16 = findViewById(R.id.uplinear5);
        uplinear16.setOnDragListener(mDragListener);

        dnlinear1 = findViewById(R.id.dnlinear1);
        dnlinear1.setOnDragListener(mDragListener);
        dnlinear2 = findViewById(R.id.dnlinear2);
        dnlinear2.setOnDragListener(mDragListener);
        dnlinear3 = findViewById(R.id.dnlinear3);
        dnlinear3.setOnDragListener(mDragListener);
        dnlinear4 = findViewById(R.id.dnlinear4);
        dnlinear4.setOnDragListener(mDragListener);
        dnlinear5 = findViewById(R.id.dnlinear5);
        dnlinear5.setOnDragListener(mDragListener);
        dnlinear6 = findViewById(R.id.dnlinear6);
        dnlinear6.setOnDragListener(mDragListener);
        dnlinear7 = findViewById(R.id.dnlinear7);
        dnlinear7.setOnDragListener(mDragListener);
        dnlinear8 = findViewById(R.id.dnlinear8);
        dnlinear8.setOnDragListener(mDragListener);
        dnlinear9 = findViewById(R.id.dnlinear9);
        dnlinear9.setOnDragListener(mDragListener);
        dnlinear10 = findViewById(R.id.dnlinear10);
        dnlinear10.setOnDragListener(mDragListener);
        dnlinear11 = findViewById(R.id.dnlinear11);
        dnlinear11.setOnDragListener(mDragListener);
        dnlinear12 = findViewById(R.id.dnlinear12);
        dnlinear12.setOnDragListener(mDragListener);
        dnlinear13 = findViewById(R.id.dnlinear13);
        dnlinear13.setOnDragListener(mDragListener);
        dnlinear14 = findViewById(R.id.dnlinear14);
        dnlinear14.setOnDragListener(mDragListener);



        back = (Button)findViewById(R.id.back);
        submit = (Button)findViewById(R.id.submit);


        final TextView chronView = (TextView)findViewById(R.id.chron);

        CountDownTimer countDownTimer = new CountDownTimer(600000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {

                long getMin = millisUntilFinished - (millisUntilFinished / (60 * 60 * 1000));
                String min = String.valueOf(getMin / (60 * 1000));

                String second = String.valueOf((getMin % (60 * 1000)) / 1000);

                if(min.length() == 1) {
                    min = "0" + min;
                }
                if(second.length() == 1) {
                    second = "0" + second;
                }
                chronView.setText(min + ":" + second);

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(),game_main2.class);
                startActivity(intent);
                Toast.makeText(h_managemant.this, "제한시간 초과", Toast.LENGTH_SHORT).show();
            }
        }.start();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(h_managemant.this, game_main2.class));
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count >= 8) {
                    startActivity(new Intent(h_managemant.this, game_finish.class));
                } else {
                    startActivity(new Intent(h_managemant.this, game_finish2.class));
                }

            }
        });
    }

    View.OnTouchListener mTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData clip = ClipData.newPlainText("","");
                view.startDrag(clip, new CanvasShadow(view, (int)event.getX(), (int)event.getY()), view,0);
                view.setVisibility(View.INVISIBLE);
                return true;
            }
            return false;
        }
    };

    class CanvasShadow extends View.DragShadowBuilder {
        int mWidth, mHeight;
        int mX, mY;

        public CanvasShadow(View v, int x, int y) {
            super(v);
            mWidth = v.getWidth();
            mHeight = v.getHeight();
            mX = x;
            mY = y;
        }

        public void onProvideShadowMetrics(Point shadowSize, Point shadowTouchPoint) {
            shadowSize.set(mWidth,mHeight);
            shadowTouchPoint.set(mX,mY);
        }

        public void onDrawShadow(Canvas canvas){
            super.onDrawShadow(canvas);
        }
    }
    View.OnDragListener mDragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            switch (event.getAction()) {

                case DragEvent.ACTION_DRAG_STARTED:
                    return true;

                case DragEvent.ACTION_DRAG_ENTERED:
                    return true;

                case DragEvent.ACTION_DRAG_EXITED:
                    return true;

                case DragEvent.ACTION_DROP:
                    View view = (View)event.getLocalState();
                    ViewGroup parent = (ViewGroup)view.getParent();
                    parent.removeView(view);
                    LinearLayout newparent = (LinearLayout)v;
                    newparent.addView(view);
                    view.setVisibility(View.VISIBLE);

                    String ivKey = (String)view.getTag();

                    if(ivKey.equals(answer)){
                        count = count + 1;
                        Toast.makeText(getApplication(),"정답",Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplication(),"오답",Toast.LENGTH_SHORT).show();
                    }

                    return true;

                case DragEvent.ACTION_DRAG_ENDED:
                    if (event.getResult() == false) {
                        ((View)(event.getLocalState())).setVisibility(View.VISIBLE);
                    }


                    return true;
            }
            return true;
        }
    };
}

