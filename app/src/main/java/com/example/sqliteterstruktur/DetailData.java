package com.example.sqliteterstruktur;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailData extends AppCompatActivity {
    TextView tx_nama, tx_no, tx_tanggal, tx_alamat, tx_jenkel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_data);
        Mahasiswa ms = new Mahasiswa();
        tx_no.setText(ms.getNomor());
        tx_nama.setText(ms.getNama());
        tx_tanggal.setText(ms.getTanggal());
        tx_alamat.setText(ms.getAlamat());
        tx_jenkel.setText(ms.getJenkel());
    }

    public void init(){
        tx_nama = (TextView) findViewById(R.id.edit_nama);
        tx_alamat = (TextView) findViewById(R.id.edit_alamat);
        tx_jenkel = (TextView) findViewById(R.id.edit_jenkel);
        tx_no = (TextView) findViewById(R.id.edit_nomor);
        tx_tanggal = (TextView) findViewById(R.id.edit_tanggal);
    }
}
