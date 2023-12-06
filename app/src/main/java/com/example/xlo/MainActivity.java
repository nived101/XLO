package com.example.xlo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usname,pass;
    Button log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LoginActivity", "onCreate");
        usname=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.password);
        log=(Button)findViewById(R.id.loginButton);
        log.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if(usname.getText().toString().equals("nivedkm")&& pass.getText().toString().equals("123niv"))
                {
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    Intent i =new Intent(MainActivity.this,dashboard.class);
                    startActivity(i);

                }
                else
                {
                    Toast.makeText(MainActivity.this,"LOGIN UNSUCCESFUL",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LoginActivity", "onStart");
        // The activity is about to become visible
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LoginActivity", "onResume");
        // The activity has become visible (now it "resumes")
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LoginActivity", "onResume");
        // Another activity is taking focus (this activity is about to be "paused")
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LoginActivity", "onStop");
        // The activity is no longer visible (it is now "stopped")
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LoginActivity", "onRestart");
        // The activity is about to restart (after being stopped)
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LoginActivity", "onDestroy");
        // The activity is about to be destroyed
    }
}