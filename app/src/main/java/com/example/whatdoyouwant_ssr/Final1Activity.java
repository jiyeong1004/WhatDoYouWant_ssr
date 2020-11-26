package com.example.whatdoyouwant_ssr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Final1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final1);
        Button btnDialog = findViewById(R.id.btn_store1_address);
        Button btn1 = findViewById(R.id.btn_store1);
        btnDialog.setOnClickListener(btnListener);
        btn1.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_store1:
                    clicked_btn1("https://map.naver.com/v5/search/%EC%8B%A0%EB%A6%BC%20%EC%B9%B4%ED%8E%98%EB%B2%A0%EB%84%A4/place/31318071?c=14125820.8020710,4507090.2635783,13,0,0,0,dh&placePath=%3Fentry%253Dpll%2526");
                    break;
                case R.id.btn_store1_address:
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Final1Activity.this);
                    dialog.setTitle("가게 주소");
                    dialog.setMessage("남부순환로 1600-1");
                    dialog.setIcon(R.mipmap.ic_address);
                    dialog.setPositiveButton("확인", null);
                    dialog.show();
            }
        }

        private void clicked_btn1(String url) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
    };
}