package com.example.goshoes;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goshoes.Adapter.MenuAdapter;
import com.example.goshoes.Models.MenuLogo;

import java.util.ArrayList;
import java.util.List;

public class ShoesActivity extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_shoes);

            RecyclerView albumView = findViewById(R.id.rv_menu);

            List<MenuLogo> albums = new ArrayList<>();
            albums.add(new MenuLogo("https://images.app.goo.gl/c7qQsFwLryTNssTm8", "Converse Men Chucks Taylor 70's"));
            albums.add(new MenuLogo("https://images.app.goo.gl/ow3VXnXzVfJntNgM6", "Vans SK8 HI"));
            albums.add(new MenuLogo("https://images.app.goo.gl/WaUGyj3AbfkCHczx9", "Nike Air Jordan"));
            albums.add(new MenuLogo("https://images.app.goo.gl/R84LfKPyv2VzJVGb6","New Balance 1500"));
            albums.add(new MenuLogo("https://images.app.goo.gl/NiRSAsiKTRfWSmZY7","Adidas Yeezy Boost 700"));
            albums.add(new MenuLogo("https://images.app.goo.gl/yLm8WXRUxugcTQ1R9","Skechers D'Lite Chunky"));

            MenuAdapter adapter = new MenuAdapter(this, albums);
            albumView.setAdapter(adapter);

            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
            albumView.setLayoutManager(layoutManager);
        }

}
