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
        setContentView(R.layout.activity_final13);
        Button btnDialog = findViewById(R.id.btn_store13_address);
        Button btn13 = findViewById(R.id.btn_store13);
        btnDialog.setOnClickListener(btnListener);
        btn13.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_store13:
                    clicked_btn13("https://map.naver.com/v5/entry/place/1377509210?c=14127779.5009208,4506908.7256362,13,0,0,0,dh&placePath=%2Fhome%3Fentry=plt");
                    break;
                case R.id.btn_store13_address:
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Final13Activity.this);
                    dialog.setTitle("가게 주소");
                    dialog.setMessage("신원로 5길 13");
                    dialog.setIcon(R.mipmap.ic_address);
                    dialog.setPositiveButton("확인", null);
                    dialog.show();
            }
        }

        private void clicked_btn13(String url) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
    };
}