package com.example.money_track;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvUsername;
    private LinearLayout btnTambahTransaksi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Memastikan mengarah ke file XML activity_input_transaksi
        setContentView(R.layout.activity_input_transaksi);

        // Hubungkan variabel Java dengan ID komponen di XML
        tvUsername = findViewById(R.id.tvUsername);
        btnTambahTransaksi = findViewById(R.id.btnTambahTransaksi);

        // Mengatur nama secara dinamis
        tvUsername.setText("[Nama Pengguna]");

        // Aksi klik tombol Tambah Transaksi
        btnTambahTransaksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Membuka Menu Tambah Transaksi", Toast.LENGTH_SHORT).show();
            }
        });
    }
}