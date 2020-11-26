package com.example.whatdoyouwant_ssr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Final3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final3);
        Button btnDialog = findViewById(R.id.btn_store3_address);
        Button btn3 = findViewById(R.id.btn_store3);
        btnDialog.setOnClickListener(btnListener);
        btn3.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_store3:
                    clicked_btn3("https://map.naver.com/v5/entry/place/19474836?c=14129704.3970936,4506638.2968658,13,0,0,0,dh&placePath=%2Fhome%3Fentry=plt");
                    break;
                case R.id.btn_store3_address:
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Final3Activity.this);
                    dialog.setTitle("가게 주소");
                    dialog.setMessage("신림로 59길 15-13");
                    dialog.setIcon(R.mipmap.ic_address);
                    dialog.setPositiveButton("확인", null);
                    dialog.show();
            }
        }

        private void clicked_btn3(String url) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
    };
}