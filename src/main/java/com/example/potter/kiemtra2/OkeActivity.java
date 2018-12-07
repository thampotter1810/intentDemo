package com.example.potter.kiemtra2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class OkeActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oke);

        tv = findViewById(R.id.textView);
        /*Intent intentGetValues = getIntent();

        String chuoi = intentGetValues.getStringExtra("chuoi1");*/

        Intent getIntent = getIntent();

        //lấy dữ liệu từ intent ra
        Bundle bundle = getIntent.getBundleExtra("goi1");
        //lấy dữ liệu trong bundle ra
        int x = bundle.getInt("so1");
        String chuoi1 = bundle.getString("chuoi2");

        tv.setText(chuoi1);

        Toast.makeText(getApplicationContext(),"du lieu ban da lay: "+x,Toast.LENGTH_LONG).show();

    }
}
