package com.example.goshoes;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.goshoes.Models.Detail;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_SEPATU = "extra_sepatu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.imageDetail);
        TextView namaSepatu = findViewById(R.id.text_name);
        TextView ukuranSepatu= findViewById(R.id.text_name);
        TextView hargaSepatu= findViewById(R.id.text_name);
        TextView bahanSepatu= findViewById(R.id.text_name);

        Detail detail = getIntent().getParcelableExtra(EXTRA_SEPATU);

        //Glide.with(this).load(song.getGambarSepatu()).into(imageView);
        Picasso.get().load(Detail.getGambarSepatu()).into(imageView);
        namaSepatu.setText(detail.namaSepatu());
        ukuranSepatu.setText(detail.getUkuranSepatu());
        hargaSepatu.setText(detail.getHargaSepatu());
        bahanSepatu.setText(detail.getBahanSepatu());
    }
}
