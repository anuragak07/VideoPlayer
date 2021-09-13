package com.masai.videoplayer;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView mtvUserId;
    private TextView mtvTitle;
    private TextView mtvStoryLine;
    private TextView mTvYear;
    private TextView mtvReleaseDate;
    private VideoView mIvMovie;
    public ViewHolder(@NonNull  View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvUserId =itemView.findViewById(R.id.tvUserID);
        mtvTitle =itemView.findViewById(R.id.tvTitle);
        mtvStoryLine=itemView.findViewById(R.id.tvStoryLine);
        mTvYear=itemView.findViewById(R.id.tvYear);
        mtvReleaseDate=itemView.findViewById(R.id.tvReleaseDate);
        mIvMovie=itemView.findViewById(R.id.IvMovie);
    }
    public void setData(NowShowing nowShowing){
        mtvUserId.setText(nowShowing.getId());
        mtvTitle.setText(nowShowing.getTitle());
        mtvStoryLine.setText(nowShowing.getStoryline());
        mIvMovie.setVideoPath(nowShowing.getVideoUrl());
        mtvReleaseDate.setText(nowShowing.getReleaseDate());
        mTvYear.setText(nowShowing.getYear());
    }
}
