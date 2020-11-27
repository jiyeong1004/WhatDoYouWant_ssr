package com.example.whatdoyouwant_ssr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Final8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final8);
        Button btnDialog = findViewById(R.id.btn_store8_address);
        Button btn8 = findViewById(R.id.btn_store8);
        btnDialog.setOnClickListener(btnListener);
        btn8.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_store8:
                    clicked_btn8("https://map.naver.com/v5/entry/place/992830276?c=14127626.6268642,4506784.5154652,13,0,0,0,dh&placePath=%2Fhome%3Fentry=plt");
                    break;
                case R.id.btn_store8_address:
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Final8Activity.this);
                    dialog.setTitle("가게 주소");
                    dialog.setMessage("신원로 23");
                    dialog.setIcon(R.mipmap.ic_address);
                    dialog.setPositiveButton("확인", null);
                    dialog.show();
            }
        }

        private void clicked_btn8(String url) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
    };
}