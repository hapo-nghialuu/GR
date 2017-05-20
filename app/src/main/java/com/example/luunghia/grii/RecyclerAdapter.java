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

public class RecyclerAdapter extends android.support.v7.widget.RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    ArrayList<Lesson> lessons = new ArrayList<Lesson>();
    Context ctx;

    public RecyclerAdapter(ArrayList<Lesson> lessons, Context ctx){
        this.lessons = lessons;
        this.ctx = ctx;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView itemImage;
        TextView itemTitle;
        TextView itemDetail;
        ArrayList<Lesson> lessons = new ArrayList<Lesson>();
        Context ctx;
        public ViewHolder(View itemView, Context ctx, ArrayList<Lesson> lessons) {
            super(itemView);
            this.lessons = lessons;
            this.ctx = ctx;
            itemView.setOnClickListener(this);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail =
                    (TextView)itemView.findViewById(R.id.item_detail);
        }


        @Override
        public void onClick(View view) {
            int postion = getAdapterPosition();
            Lesson lesson = this.lessons.get(postion);
            Intent intent = new Intent(this.ctx, DetailsLesson.class);
            intent.putExtra("images", lesson.getImages());
            intent.putExtra("titles", lesson.getTitles());
            this.ctx.startActivity(intent);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view, ctx, lessons);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Lesson LES = lessons.get(position);
        holder.itemTitle.setText(LES.getTitles());
        holder.itemImage.setImageResource(LES.getImages());
    }

    @Override
    public int getItemCount() {
        return lessons.size();
    }
}
