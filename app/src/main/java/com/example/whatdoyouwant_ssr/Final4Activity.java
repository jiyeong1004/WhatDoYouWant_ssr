package com.example.whatdoyouwant_ssr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Final4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final4);
        Button btnDialog = findViewById(R.id.btn_store4_address);
        Button btn4 = findViewById(R.id.btn_store4);
        btnDialog.setOnClickListener(btnListener);
        btn4.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_store4:
                    clicked_btn4("https://map.naver.com/v5/entry/place/13306074?c=14129081.3190588,4506419.0509237,15,0,0,0,dh");
                    break;
                case R.id.btn_store4_address:
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Final4Activity.this);
                    dialog.setTitle("가게 주소");
                    dialog.setMessage("신원로 23");
                    dialog.setIcon(R.mipmap.ic_address);
                    dialog.setPositiveButton("확인", null);
                    dialog.show();
            }
        }

        private void clicked_btn4(String url) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
    };
}