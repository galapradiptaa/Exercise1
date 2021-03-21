package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edemail, edpassword;
    String usr, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignin);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usr = edemail.getText().toString();
                pwd = edpassword.getText().toString();

                if (usr.equals("") || pwd.equals(""))
                {
                     Toast.makeText(MainActivity.this, "Email atau Password harus diisi!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    if (usr.equals("Gala") && pwd.equals("12345"))
                    {
                        Toast.makeText(MainActivity.this, "LOGIN SUKSES!", Toast.LENGTH_SHORT).show();
                        Bundle b = new Bundle();
                        b.putString("a", usr.trim());
                        b.putString("b", pwd.trim());
                        Intent i = new Intent(getApplicationContext(), ActivityKedua.class);
                        i.putExtras(b);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Email atau Password Salah!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}