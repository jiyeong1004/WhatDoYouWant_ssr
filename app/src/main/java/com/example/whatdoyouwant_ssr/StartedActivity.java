package com.example.whatdoyouwant_ssr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class StartedActivity extends AppCompatActivity {

    private ImageButton choice1;
    private ImageButton choice2;

    int[] images = new int[]{ // 14강
            R.drawable.store1,
            R.drawable.store2,
            R.drawable.store3,
            R.drawable.store4,
            R.drawable.store5,
            R.drawable.store6,
            R.drawable.store7,
            R.drawable.store8,
            R.drawable.store9,
            R.drawable.store10,
            R.drawable.store11,
            R.drawable.store12,
            R.drawable.store13,
            R.drawable.store14,
    };

    int[] images1 = new int[]{ // 8강
            0, 0, 0, 0, 0, 0, 0, R.drawable.store15
    };

    int[] images2 = new int[]{ // 4강
            0, 0, 0, 0
    };

    int[] images3 = new int[]{ // 결승
            0, 0
    };

    int images4 = 0; // 최종

    int chk = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_started);

        choice1 = findViewById(R.id.choice1);
        choice2 = findViewById(R.id.choice2);

        random(images);

        for(int i = 0; i < 14; i += 2){
            choice1.setBackgroundResource(images[i]);
            choice2.setBackgroundResource(images[i+1]);

            chk = i;

            choice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    images1[chk/2] = images[chk];
                }
            });
            choice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    images1[chk/2] = images[chk+1];
                }
            });
        }

        random(images1);

        for(int i = 0; i < 8; i += 2){
            choice1.setBackgroundResource(images1[i]);
            choice2.setBackgroundResource(images1[i+1]);

            chk = i;

            choice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    images2[chk/2] = images1[chk];
                }
            });
            choice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    images2[chk/2] = images1[chk+1];
                }
            });
        }

        random(images2);

        for(int i = 0; i < 4; i += 2){
            choice1.setBackgroundResource(images2[i]);
            choice2.setBackgroundResource(images2[i+1]);

            chk = i;

            choice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    images3[chk/2] = images2[chk];
                }
            });
            choice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    images3[chk/2] = images2[chk+1];
                }
            });
        }

        choice1.setBackgroundResource(images3[0]);
        choice2.setBackgroundResource(images3[1]);
        choice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                images4 = images3[0];
                showFinal(images4);
            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                images4 = images3[1];
                showFinal(images4);
            }
        });
    }


    public void showFinal(int images4) {
        switch (images4) {
            case R.drawable.store1:
                Intent intent1 = new Intent(StartedActivity.this, Final1Activity.class);
                StartedActivity.this.startActivity(intent1);
                break;
            case R.drawable.store2:
                Intent intent2 = new Intent(StartedActivity.this, Final2Activity.class);
                StartedActivity.this.startActivity(intent2);
                break;
            case R.drawable.store3:
                Intent intent3 = new Intent(StartedActivity.this, Final3Activity.class);
                StartedActivity.this.startActivity(intent3);
                break;
            case R.drawable.store4:
                Intent intent4 = new Intent(StartedActivity.this, Final4Activity.class);
                StartedActivity.this.startActivity(intent4);
                break;
            case R.drawable.store5:
                Intent intent5 = new Intent(StartedActivity.this, Final5Activity.class);
                StartedActivity.this.startActivity(intent5);
                break;
            case R.drawable.store6:
                Intent intent6 = new Intent(StartedActivity.this, Final6Activity.class);
                StartedActivity.this.startActivity(intent6);
                break;
            case R.drawable.store7:
                Intent intent7 = new Intent(StartedActivity.this, Final7Activity.class);
                StartedActivity.this.startActivity(intent7);
                break;
            case R.drawable.store8:
                Intent intent8 = new Intent(StartedActivity.this, Final8Activity.class);
                StartedActivity.this.startActivity(intent8);
                break;
            case R.drawable.store9:
                Intent intent9 = new Intent(StartedActivity.this, Final9Activity.class);
                StartedActivity.this.startActivity(intent9);
                break;
            case R.drawable.store10:
                Intent intent10 = new Intent(StartedActivity.this, Final10Activity.class);
                StartedActivity.this.startActivity(intent10);
                break;
            case R.drawable.store11:
                Intent intent11 = new Intent(StartedActivity.this, Final11Activity.class);
                StartedActivity.this.startActivity(intent11);
                break;
            case R.drawable.store12:
                Intent intent12 = new Intent(StartedActivity.this, Final12Activity.class);
                StartedActivity.this.startActivity(intent12);
                break;
            case R.drawable.store13:
                Intent intent13 = new Intent(StartedActivity.this, Final13Activity.class);
                StartedActivity.this.startActivity(intent13);
                break;
            case R.drawable.store14:
                Intent intent14 = new Intent(StartedActivity.this, Final14Activity.class);
                StartedActivity.this.startActivity(intent14);
                break;
            case R.drawable.store15:
                Intent intent15 = new Intent(StartedActivity.this, Final15Activity.class);
                StartedActivity.this.startActivity(intent15);
                break;
        }
    }

    public void random(int images[]){
        for (int x = 0; x < images.length; x++) { // 랜덤 배열 생성
            int i = (int) (Math.random() * images.length);
            int j = (int) (Math.random() * images.length);

            int tmp = images[i];
            images[i] = images[j];
            images[j] = tmp;
        }
    }
}