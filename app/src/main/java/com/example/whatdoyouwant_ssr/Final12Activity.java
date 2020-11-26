package com.example.whatdoyouwant_ssr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Final12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final12);
        Button btnDialog = findViewById(R.id.btn_store12_address);
        Button btn10 = findViewById(R.id.btn_store12);
        btnDialog.setOnClickListener(btnListener);
        btn10.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_store10:
                    clicked_btn10("https://map.naver.com/v5/search/%EC%8B%A0%EB%A6%BC%20%ED%82%B9%EC%BD%A9%EB%B6%80%EB%8C%80%EC%B0%8C%EA%B0%9C/place/36684013?c=14125897.2390993,4506927.8348932,13,0,0,0,dh&placePath=%3Fentry%253Dpll%2526");
                    break;
                case R.id.btn_store10_address:
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Final12Activity.this);
                    dialog.setTitle("가게 주소");
                    dialog.setMessage("신림로 59길 15-12");
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