package com.example.amirulsufi.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_username;
    private EditText et_password;
    private Button btn_login;
    private TextView tv_continue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN); // move ui when softkeyboard appear
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        btn_login = (Button) findViewById(R.id.btn_login);
        tv_continue = (TextView) findViewById(R.id.tv_continue);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = et_username.getText() + "";
                String password = et_password.getText() + "";

                if (username.equalsIgnoreCase("test") && password.equalsIgnoreCase("123456")) {
                    Toast.makeText(MainActivity.this, "Login Success!", Toast.LENGTH_SHORT).show();
                    Intent myIntent = new Intent(MainActivity.this,
                            HomeActivity.class);
                    startActivity(myIntent);
                } else if (!username.equalsIgnoreCase("test")){
                    Toast.makeText(MainActivity.this, "Wrong username!, Please try again.", Toast.LENGTH_SHORT).show();
                } else if (!password.equalsIgnoreCase("123456")){
                    Toast.makeText(MainActivity.this, "Wrong password!, Please try again.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Login Failed!, Please try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tv_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Continue without login", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(MainActivity.this,
                        HomeActivity.class);
                startActivity(myIntent);
            }
        });


    }
}
