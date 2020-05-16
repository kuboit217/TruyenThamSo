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
        Bundle bundle = intent.getBundleExtra("truyenthamso");

        String truyenChuoi = bundle.getString("dulieu");
        int duLieuSo = bundle.getInt("dulieuso",1234);
        String[] mangChuoi = bundle.getStringArray("dulieumang");

        HocSinh hs = (HocSinh) bundle.getSerializable("dulieuhs");

        txtTruyen.setText(truyenChuoi+" "+duLieuSo+ " "+ mangChuoi[1] + hs.getHoTen() +"-"+hs.getNamsinh());
    }
}
