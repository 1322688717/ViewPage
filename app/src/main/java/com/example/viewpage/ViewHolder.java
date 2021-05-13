package com.example.viewpage;

import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public LinearLayout container;
    public ViewHolder(@NonNull View itemView) {

        super(itemView);
        container = itemView.findViewById(R.id.container);
    }

}
