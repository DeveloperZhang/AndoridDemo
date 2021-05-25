package com.example.jit.helloworld1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
//                getIntent().putExtra("age",20);
//                startActivity(intent);
//            }


            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                getIntent().putExtra("age",20);
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 2) {
            String s = data.getStringExtra("name");
            System.out.println("data = [" + s + "]");
        }
    }
}
