package com.masai.videoplayer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<NowShowing> ModelList;

    public HomeAdapter(ArrayList<NowShowing> ModelList){
        this.ModelList =ModelList;

    }
    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
        NowShowing nowShowing = ModelList.get(position);
        holder.setData(nowShowing);

    }

    @Override
    public int getItemCount() {
        return ModelList.size();
    }
}
