package com.example.goshoes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goshoes.Models.Detail;
import com.example.goshoes.Models.MenuLogo;
import com.example.goshoes.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder>{

    private Context context;
    private List<MenuLogo> items;
    private ArrayList<Detail> listDetail;

    public MenuAdapter(Context context, List<MenuLogo> items) {
        this.context = context;
        this.items = items;
    }
    public ArrayList<Detail> getListDetail() { return listDetail; }

    public void setListDetail(ArrayList<Detail> listDetail){ this.listDetail = listDetail;}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_logo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        //MenuLogo item = items.get(position);
        MenuLogo item = items.get(position);

        Picasso.get().load(item.getLogo()).into(holder.logoImage);
        holder.nameText.setText(item.getName());

    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText;

        Button button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);

            button = itemView.findViewById(R.id.button2);
        }

    }


}
