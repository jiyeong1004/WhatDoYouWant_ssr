package com.example.whatdoyouwant_ssr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Final13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final10);
        Button btnDialog = findViewById(R.id.btn_store10_address);
        Button btn10 = findViewById(R.id.btn_store10);
        btnDialog.setOnClickListener(btnListener);
        btn10.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_store10:
                    clicked_btn10("https://map.naver.com/v5/search/%EC%8B%9C%EC%9E%A5%EB%B6%84%EC%8B%9D/place/1344551600?c=14128799.4575170,4506643.5846943,15,0,0,0,dh&placePath=%3F%2526");
                    break;
                case R.id.btn_store10_address:
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Final13Activity.this);
                    dialog.setTitle("가게 주소");
                    dialog.setMessage("관천로 19");
                    dialog.setIcon(R.mipmap.ic_address);
                    dialog.setPositiveButton("확인", null);
                    dialog.show();
            }
        }

        private void clicked_btn10(String url) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
    };
}