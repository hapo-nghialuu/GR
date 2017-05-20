package com.example.luunghia.grii;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class VideoLearningRecyclerAdapter extends android.support.v7.widget.RecyclerView.Adapter<VideoLearningRecyclerAdapter.ViewHolder>{
    ArrayList<Video> videos = new ArrayList<Video>();
    Context ctx;

    public VideoLearningRecyclerAdapter(ArrayList<Video> videos, Context ctx){
        this.videos = videos;
        this.ctx = ctx;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView itemImage;
        TextView itemTitle;
        TextView itemDetail;
        ArrayList<Video> videos = new ArrayList<Video>();
        Context ctx;
        public ViewHolder(View itemView, Context ctx, ArrayList<Video> videos) {
            super(itemView);
            this.videos = videos;
            this.ctx = ctx;
            itemView.setOnClickListener(this);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail =(TextView)itemView.findViewById(R.id.item_detail);
        }


        @Override
        public void onClick(View view) {
            int postion = getAdapterPosition();
            Video video = this.videos.get(postion);
            Intent intent = new Intent(this.ctx, VideoDetails.class);
            intent.putExtra("images", video.getImages());
            intent.putExtra("titles", video.getTitles());
            intent.putExtra("details", video.getDetails());
            this.ctx.startActivity(intent);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view, ctx, videos);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Video VID = videos.get(position);
        holder.itemTitle.setText(VID.getTitles());
        holder.itemImage.setImageResource(VID.getImages());
    }

    @Override
    public int getItemCount() {
        return videos.size();
    }
}