package com.example.javarecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TransViewHolder extends RecyclerView.ViewHolder {


    TextView nameTrans,idTrans,amountTrans,dateTrans;



    public TransViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTrans = itemView.findViewById(R.id.txt_name_trans);
        idTrans = itemView.findViewById(R.id.txt_id_trans);
        amountTrans = itemView.findViewById(R.id.txt_amount_trans);
        dateTrans = itemView.findViewById(R.id.txt_date_trans);
    }
}
