package com.example.intentexplicittruyenthamso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txtTruyen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtTruyen = (TextView) findViewById(R.id.textViewThamSo);
        Intent intent = getIntent();
        String truyenChuoi = intent.getStringExtra("dulieu");
        int duLieuSo = intent.getIntExtra("dulieuso",1234);
        String[] mangChuoi = intent.getStringArrayExtra("dulieumang");

        HocSinh hs = (HocSinh) intent.getSerializableExtra("dulieuhs");

        txtTruyen.setText(truyenChuoi+" "+duLieuSo+ " "+ mangChuoi[1] + hs.getHoTen() +"-"+hs.getNamsinh());
    }
}
