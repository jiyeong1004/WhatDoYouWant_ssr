package com.example.whatdoyouwant_ssr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Final15Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final15);
        Button btnDialog = findViewById(R.id.btn_store15_address);
        Button btn15 = findViewById(R.id.btn_store15);
        btnDialog.setOnClickListener(btnListener);
        btn15.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_store15:
                    clicked_btn15("https://map.naver.com/v5/entry/place/1395608971?c=14127464.1981791,4506985.1626644,13,0,0,0,dh&placePath=%2Fhome%3Fentry=plt");
                    break;
                case R.id.btn_store15_address:
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Final15Activity.this);
                    dialog.setTitle("가게 주소");
                    dialog.setMessage("관천로 41");
                    dialog.setIcon(R.mipmap.ic_address);
                    dialog.setPositiveButton("확인", null);
                    dialog.show();
            }
        }

        private void clicked_btn15(String url) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
    };
}