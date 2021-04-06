package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {

    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtNama = findViewById(R.id.edNama);
        edtAlamat = findViewById(R.id.edAlamat);
        edtEmail = findViewById(R.id.edEmail);
        edtPassword = findViewById(R.id.edPass);
        edtrepass = findViewById(R.id.edrepass);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (edtNama.getText().toString().isEmpty()){
                    {
                       Snackbar.make(view, "Nama Tidak Boleh Kosong", Snackbar.LENGTH_LONG).show();
                    }
                    if (edtAlamat.getText().toString().isEmpty()) {
                       Snackbar.make(view, "Alamat Tidak Boleh Kosong", Snackbar.LENGTH_LONG).show();
                    }
                    if (edtEmail.getText().toString().isEmpty()) {
                       Snackbar.make(view, "Email Tidak Boleh Kosong", Snackbar.LENGTH_LONG).show();
                    }
                    if (edtPassword.getText().toString().isEmpty())
                        Snackbar.make(view, "Password Tidak Boleh Kosong", Snackbar.LENGTH_LONG).show();
                    }
                    if (edtrepass.getText().toString().isEmpty()) {
                        Snackbar.make(view, "Re-Password Tidak Boleh Kosong", Snackbar.LENGTH_LONG).show();
                    }

                {
                    if (edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil",
                                Toast.LENGTH_LONG).show();

                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        Snackbar.make(view, "Password dan Repassword harus sama!",
                                Snackbar.LENGTH_LONG).show();
                    }
                }

            }
        ;
    });
}
}
