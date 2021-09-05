package com.example.recyclerview_notify;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<viewHolder> {
    private ClickListener clickListener;
    private ArrayList<Model> dataList = new ArrayList<>();

    public Adapter(ClickListener clickListener, ArrayList<Model> dataList) {
        this.clickListener = clickListener;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new viewHolder(view,clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Model model = dataList.get(position);
        holder.setData(model);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
