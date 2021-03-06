package com.example.whatdoyouwant_ssr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Final5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final5);
        Button btnDialog = findViewById(R.id.btn_store5_address);
        Button btn5 = findViewById(R.id.btn_store5);
        btnDialog.setOnClickListener(btnListener);
        btn5.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_store5:
                    clicked_btn5("https://map.naver.com/v5/entry/place/1372378905?c=14127798.6101779,4506803.6247223,13,0,0,0,dh&placePath=%2Fhome%3Fentry=plt");
                    break;
                case R.id.btn_store5_address:
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Final5Activity.this);
                    dialog.setTitle("가게 주소");
                    dialog.setMessage("신원로 40-11");
                    dialog.setIcon(R.mipmap.ic_address);
                    dialog.setPositiveButton("확인", null);
                    dialog.show();
            }
        }

        private void clicked_btn5(String url) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
    };
}