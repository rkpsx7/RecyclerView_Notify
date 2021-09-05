package com.example.recyclerview_notify;

import android.widget.LinearLayout;
import android.widget.TextView;

public interface ClickListener {
   void onItemClicked(TextView textView, LinearLayout linearLayout, int position,boolean isUnTouched);
}
