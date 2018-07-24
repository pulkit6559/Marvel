package com.example.android.marvelfandom;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class ViewHolder extends RecyclerView.ViewHolder {
    public ViewHolder(View itemView) {
        super(itemView);
    }

    public void bindType(ListItem item) {

    }
}