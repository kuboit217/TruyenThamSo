package com.example.intentexplicittruyenthamso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTruyenThamSo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTruyenThamSo = (Button) findViewById(R.id.buttonThamSo);

        btnTruyenThamSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("dulieu","Du lieu bang chuoi");
                intent.putExtra("dulieuso",2020);
                String[] arrayMang = {"Android","IOS","PHO"};
                intent.putExtra("dulieumang",arrayMang);
                HocSinh hocSinh = new HocSinh("Viet",2020);
                intent.putExtra("dulieuhs",hocSinh);*/

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("dulieu","viet dinh");
                bundle.putInt("dulieuso",2020);
                String[] arrMang = {"Android","IOS"};
                bundle.putStringArray("dulieumang",arrMang);
                HocSinh hocSinh = new HocSinh("Viet",1991);
                bundle.putSerializable("dulieuhs",hocSinh);

                intent.putExtra("truyenthamso",bundle);

                startActivity(intent);
            }
        });
    }
}
