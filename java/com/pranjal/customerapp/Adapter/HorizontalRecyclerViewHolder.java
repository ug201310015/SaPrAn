package com.pranjal.customerapp.Adapter;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pranjal.customerapp.R;

/**
 * Created by royalpranjal on 1/28/2017.
 */

public class HorizontalRecyclerViewHolder extends RecyclerView.ViewHolder{

    public ImageView imageView;
    public TextView textView;

    public HorizontalRecyclerViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.cardViewImageView);
        textView = (TextView) itemView.findViewById(R.id.cardViewTextView);
    }
}

