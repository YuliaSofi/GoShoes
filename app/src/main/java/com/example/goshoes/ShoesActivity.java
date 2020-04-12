package com.example.goshoes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goshoes.Adapter.MenuAdapter;
import com.example.goshoes.Models.MenuLogo;

import java.util.ArrayList;
import java.util.List;

public class ShoesActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_shoes);

            RecyclerView menuView = findViewById(R.id.rv_menu);


            List<MenuLogo> menuLogos = new ArrayList<>();
            menuLogos.add(new MenuLogo("https://www.shopmyexchange.com/products/images/xlarge/1453280_1074.jpg", "Converse Men Chucks Taylor 70's"));
            menuLogos.add(new MenuLogo("https://images.vans.com/is/image/Vans/D5IB8C-HERO?$583x583$", "Vans SK8 HI"));
            menuLogos.add(new MenuLogo("https://cf.shopee.co.id/file/aafe2dbe91ed08577a42e4ba82cbff7e", "Nike Air Jordan"));
            menuLogos.add(new MenuLogo("https://s3.bukalapak.com/img/3501883245/w-1000/Sepatu_New_Balance_1500_Yard_Pack_made_in_england_PREMIUM.jpg","New Balance 1500"));
            menuLogos.add(new MenuLogo("https://assets.urbanasia.media//SneakerAdidas.jpeg","Adidas Yeezy Boost 700"));
            menuLogos.add(new MenuLogo("https://i.pinimg.com/564x/f8/80/4c/f8804c170a812ff1706695ee856eab80.jpg","Skechers D'Lite Chunky"));

            MenuAdapter adapter = new MenuAdapter(this, menuLogos);
            menuView.setAdapter(adapter);

            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
            menuView.setLayoutManager(layoutManager);
        }

}
