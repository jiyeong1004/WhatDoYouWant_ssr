package com.example.whatdoyouwant_ssr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Final11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final11);
        Button btnDialog = findViewById(R.id.btn_store11_address);
        Button btn11 = findViewById(R.id.btn_store11);
        btnDialog.setOnClickListener(btnListener);
        btn11.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_store11:
                    clicked_btn11("https://map.naver.com/v5/entry/place/13539946?c=14129102.8169730,4506562.3703517,15,0,0,0,dh&placePath=%3Fentry=plt");
                    break;
                case R.id.btn_store11_address:
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Final11Activity.this);
                    dialog.setTitle("가게 주소");
                    dialog.setMessage("관천로 19");
                    dialog.setIcon(R.mipmap.ic_address);
                    dialog.setPositiveButton("확인", null);
                    dialog.show();
            }
        }

        private void clicked_btn11(String url) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
    };
}