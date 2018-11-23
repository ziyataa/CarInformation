package com.ziyata.carinformation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AdapterMobil extends RecyclerView.Adapter<AdapterMobil.ViewHolder> {
    Context context;
    String [] namaMobil;
    int [] gambarMobil;

    public AdapterMobil(Context context, String[] namaMobil, int[] gambarMobil) {
        this.context = context;
        this.namaMobil = namaMobil;
        this.gambarMobil = gambarMobil;
    }

    @NonNull
    @Override
    public AdapterMobil.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_mobil, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMobil.ViewHolder viewHolder, int i) {
        viewHolder.txtNama.setText(namaMobil[i]);
        Glide.with(context).load(gambarMobil[i]).into(viewHolder.imgLogo);

    }

    @Override
    public int getItemCount() {
        return gambarMobil.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLogo;
        TextView txtNama;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgLogo = itemView.findViewById(R.id.imgList);
            txtNama = itemView.findViewById(R.id.txtListTitle);
        }
    }
}
