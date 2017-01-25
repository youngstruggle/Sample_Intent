package com.onfocus.sample_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sub1Activity extends AppCompatActivity {

    private Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        btnMove = (Button) findViewById(R.id.btn_move);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sub1Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
