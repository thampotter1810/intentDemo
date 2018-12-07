package com.example.potter.kiemtra2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnbOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnbOk = findViewById(R.id.button1);

        //bắt sự kiện click vào nút OK

        btnbOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,OkeActivity.class);
                /*String test ="CLB Tin Học";
                intent.putExtra("chuoi1",test);*/

                Bundle bundle = new Bundle();

                //đưa dữ liệu vào trong bundle
                bundle.putString("chuoi2","Ban Lap trinh ung dung");
                bundle.putInt("so1", 266987444);

                bundle.putChar("aaa",'c');
                //đưa dữ liệu vào tring intent
                intent.putExtra("goi1",bundle);

                //chuyển intent đi
                startActivity(intent);



                //Toast.makeText(getApplicationContext(), "bạn vừa click vào nút OK!", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
