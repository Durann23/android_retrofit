package com.example.retrofit_jadr.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit_jadr.R;
import com.example.retrofit_jadr.models.Pokemon;

import java.util.List;

import kotlin.Result;

public class PokeAdapter extends RecyclerView.Adapter<PokeAdapter.ViewHolder> {
    @NonNull
     List<Pokemon> poke;

    public PokeAdapter(List<Pokemon> pok){
        this.poke=pok;
    }

    @Override
    public PokeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View v=layoutInflater.inflate(R.layout.view,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PokeAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return poke.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nom;
        ImageView img;
        Pokemon.Result pk;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nom=itemView.findViewById(R.id.tvNombre);
            img=itemView.findViewById(R.id.tvImagen);
        }
        public void SetData(Pokemon.Result pkm){
            this.pk=pkm;
            nom.setText(pkm.getName());
            //img.setImageDrawable();


        }
    }
}
