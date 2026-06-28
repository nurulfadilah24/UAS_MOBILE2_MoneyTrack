package com.example.money_track;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private Button btnEditProfile, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Menghubungkan variabel dengan ID di XML
        btnEditProfile = findViewById(R.id.btnEditProfile);
        btnLogout = findViewById(R.id.btnLogout);

        // Aksi ketika tombol Edit Profil ditekan
        btnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this, "Membuka halaman Edit Profil", Toast.LENGTH_SHORT).show();
            }
        });

        // Aksi ketika tombol Logout ditekan
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this, "Anda telah Logout", Toast.LENGTH_SHORT).show();
                finish(); // Menutup halaman profil dan kembali ke halaman sebelumnya
            }
        });
    }
}