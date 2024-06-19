package com.example.javarecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


class CustomAdapter extends RecyclerView.Adapter<TransViewHolder> {
        Context context;
        List<Item> items;

        public CustomAdapter(Context context, List<Item> items) {
            this.context = context;
            this.items = items;
        }


        @Override
        public TransViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new TransViewHolder(LayoutInflater.from(context).inflate(R.layout.adapter_item_row, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull TransViewHolder holder, int position) {
            holder.nameTrans.setText(items.get(position).getName());
            holder.dateTrans.setText(items.get(position).getDate());
            holder.amountTrans.setText(items.get(position).getAmount());
        }

        @Override
        public int getItemCount() {
            return items.size();
        }
    }
