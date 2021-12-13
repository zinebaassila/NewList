package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ActionMenuItemView;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        setTitle(getLocalClassName());
        EditText text=(EditText)findViewById(R.id.saisi);

        Button rollButton = (Button) findViewById(R.id.login);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NewsActivity.class);
                String txt=text.getText().toString();
                intent.putExtra("login",txt);
                startActivity(intent);
                //Intent intent = new Intent(getApplicationContext(), NewsActivity.class);
                //startActivity(intent);
            }
        });

    }
}