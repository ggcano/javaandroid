package com.example.javarecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
    }



    private void initRecyclerView(){
        RecyclerView mRecyclerView = findViewById(R.id.mRecyclerview);
       // recyclerView.setAdapter(customAdapter);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Jorge Lopez","2222",333333));
        items.add(new Item("Vanesa Lope","3 Ene",100000));
        items.add(new Item("Pepe Lopez","2 Ene",22222));

       // lista.add("s",as)

        // Esta línea mejora el rendimiento, si sabemos que el contenido
        // no va a afectar al tamaño del RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // Nuestro RecyclerView usará un linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        // Asociamos un adapter (ver más adelante cómo definirlo)
        adapter = new CustomAdapter(this,items);
        mRecyclerView.setAdapter(adapter);


    }



}