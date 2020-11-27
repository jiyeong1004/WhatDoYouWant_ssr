package com.example.whatdoyouwant_ssr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Final7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final7);
        Button btnDialog = findViewById(R.id.btn_store7_address);
        Button btn7 = findViewById(R.id.btn_store7);
        btnDialog.setOnClickListener(btnListener);
        btn7.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_store7:
                    clicked_btn7("https://map.naver.com/v5/search/%EC%8B%A0%EB%A6%BC%20%EC%95%84%EC%A0%80%EC%94%A8%20%EB%8B%AD%EA%B0%95%EC%A0%95/place/38419372?c=14125553.2724720,4507032.9358071,13,0,0,0,dh&placePath=%3Fentry%253Dpll%2526");
                    break;
                case R.id.btn_store7_address:
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Final7Activity.this);
                    dialog.setTitle("가게 주소");
                    dialog.setMessage("관천로 45-1");
                    dialog.setIcon(R.mipmap.ic_address);
                    dialog.setPositiveButton("확인", null);
                    dialog.show();
            }
        }

        private void clicked_btn7(String url) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
    };
}