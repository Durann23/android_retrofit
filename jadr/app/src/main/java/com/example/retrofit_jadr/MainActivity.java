package com.example.retrofit_jadr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.retrofit_jadr.adapter.PokeAdapter;
import com.example.retrofit_jadr.models.Pokemon;

import java.util.List;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvPkm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPkm=findViewById(R.id.rvPokemon);

        Retrofit rf=new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                //.addConverterFactory()
                .build();

    }


}