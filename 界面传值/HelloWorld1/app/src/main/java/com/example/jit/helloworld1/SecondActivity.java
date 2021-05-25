package com.example.jit.helloworld1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        int age = intent.getIntExtra("age", 1);
        TextView textView = findViewById(R.id.textView2);
        textView.setText(age + "");

        Button btn1 = findViewById(R.id.btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                setResult(2,intent);
                intent.putExtra("name", "Tom");
                finish();
            }
        });

    }
}
