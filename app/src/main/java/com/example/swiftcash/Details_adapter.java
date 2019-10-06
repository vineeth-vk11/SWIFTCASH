package com.example.swiftcash;

import android.app.Dialog;
import android.content.Context;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Details_adapter extends RecyclerView.Adapter<Details_adapter.ViewHolder> {
    Context mContext;
    List<details_model> mData;
    Dialog chatlayout;

    public Details_adapter(Context mContext, List<details_model> mData) {
        this.mContext = mContext;
        this.mData = mData;

    }

    @NonNull
    @Override
    public Details_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.details_item,parent,false);
        final ViewHolder viewHolder = new ViewHolder(v);

        chatlayout = new Dialog(mContext);
        chatlayout.setContentView(R.layout.fragment_chat);


        viewHolder.m_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name = chatlayout.findViewById(R.id.name);
                name.setText(mData.get(viewHolder.getAdapterPosition()).getUsername());
                chatlayout.show();
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Details_adapter.ViewHolder holder, int position) {
        holder.m_username.setText(mData.get(position).getUsername());
        holder.m_distance.setText(mData.get(position).getDistance());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView m_username;
        private TextView m_distance;
        private ImageButton m_chat;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            m_distance = itemView.findViewById(R.id.distance_detail);
            m_username = itemView.findViewById(R.id.user_name);
            m_chat = itemView.findViewById(R.id.chat);
        }

    }
}
