package com.tutor.tamamquranapps;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity  extends AppCompatActivity {
    Button bt_mul, bt_pet;

    private void initBinding() {
        bt_mul = findViewById(R.id.bt_mul);
        bt_pet = findViewById(R.id.bt_pet);

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initBinding();

        bt_mul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        bt_pet.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, PetunjukActivity.class);
                startActivity(intent);
            }
        });


    }


}
