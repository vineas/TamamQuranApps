package com.tutor.tamamquranapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {

    Button bt_1, bt_2, bt_3, bt_5, bt_6, bt_7, bt_8, bt_9, bt_10, bt_11, bt_12, bt_13;

    private void initBinding() {
        bt_1 = findViewById(R.id.but_1);
        bt_2 = findViewById(R.id.but_2);
        bt_3 = findViewById(R.id.but_3);

    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initBinding();

        bt_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, HijaiyahActivity.class);
                startActivity(intent);
            }
        });
    }


}
