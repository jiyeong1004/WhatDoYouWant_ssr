package com.example.whatdoyouwant_ssr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Final6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final6);
        Button btnDialog = findViewById(R.id.btn_store6_address);
        Button btn6 = findViewById(R.id.btn_store6);
        btnDialog.setOnClickListener(btnListener);
        btn6.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_store6:
                    clicked_btn6("https://map.naver.com/v5/entry/place/20860539?c=14129143.4241443,4506741.5196368,15,0,0,0,dh&placePath=%3Fentry=plt");
                    break;
                case R.id.btn_store1_address:
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Final6Activity.this);
                    dialog.setTitle("가게 주소");
                    dialog.setMessage("신원로 40-12");
                    dialog.setIcon(R.mipmap.ic_address);
                    dialog.setPositiveButton("확인", null);
                    dialog.show();
            }
        }

        private void clicked_btn6(String url) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
    };
}