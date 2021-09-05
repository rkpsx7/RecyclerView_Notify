package com.example.recyclerview_notify;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewHolder extends RecyclerView.ViewHolder {
    boolean isUnTouched = true;
    private TextView tvTitle;
    private LinearLayout linearLayout;
    private ClickListener clickListener;

    public viewHolder(@NonNull View itemView,ClickListener clickListener) {
        super(itemView);
        this.clickListener = clickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        linearLayout = itemView.findViewById(R.id.linearLayout);
        tvTitle = itemView.findViewById(R.id.tvTitle);
    }
    void setData(Model model){
        tvTitle.setText(model.getTitle());
        linearLayout.setOnClickListener(v -> {

            clickListener.onItemClicked(tvTitle,linearLayout,getAdapterPosition(),isUnTouched);

            if (isUnTouched) {
                tvTitle.setTextColor(Color.parseColor("#ffffff"));
                linearLayout.setBackgroundColor(Color.parseColor("#0099cc"));
                isUnTouched = false;
            } else {
                tvTitle.setTextColor(Color.parseColor("#0099cc"));
                linearLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                isUnTouched = true;
            }
        });
    }
}
