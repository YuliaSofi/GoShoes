package com.example.goshoes.Models;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.goshoes.R;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.items.AbstractItem;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MenuItem extends AbstractItem<MenuItem, MenuItem.ViewHolder> {

    private String logo;
    private String name;

    public MenuItem(String logo, String name) {
        this.logo = logo;
        this.name = name;
    }

    @NonNull
    @Override
    public ViewHolder getViewHolder(View v) {
        return new ViewHolder(v);
    }

    @Override
    public int getType() {
        return R.id.rv_menu;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_logo;
    }

    public class ViewHolder extends FastAdapter.ViewHolder<MenuItem> {

        ImageView logoImage;
        TextView nameText;

        public ViewHolder(View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
        }

        @Override
        public void bindView(MenuItem item, List<Object> payloads) {
            Picasso.get().load(item.logo).into(logoImage);
            nameText.setText(item.name);
        }

        @Override
        public void unbindView(MenuItem item) {
            logoImage.setImageBitmap(null);
            nameText.setText(null);
        }
    }
}
