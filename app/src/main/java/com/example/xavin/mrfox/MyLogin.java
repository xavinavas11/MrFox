package com.example.xavin.mrfox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyLogin extends AppCompatActivity {
    Button btn_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_entrar = (Button) findViewById(R.id.btn_entrar);

        listeners();

    }

    private void listeners() {

        btn_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyLogin.this, MyMain.class);
                startActivity(i);
            }
        });
    }
}
