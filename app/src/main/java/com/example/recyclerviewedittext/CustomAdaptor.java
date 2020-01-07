package com.example.recyclerviewedittext;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public  class CustomAdaptor extends RecyclerView.Adapter<CustomAdaptor.ViewHolder> {
    ArrayList<DataItems> dataItems;
    CustomAdaptor( ArrayList<DataItems> dataItems){
        this.dataItems=dataItems;
    }

    public void setFilter(List<DataItems> newList) {
        dataItems = new ArrayList<>();
        dataItems.addAll(newList);
        notifyDataSetChanged();

    }



    @NonNull
    @Override
    public CustomAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_layout,parent,false);
        return new ViewHolder(view);
    }




    @Override
    public void onBindViewHolder(@NonNull CustomAdaptor.ViewHolder holder, final int position) {

        DataItems objDataItems= dataItems.get(position);
        holder.title.setText(objDataItems.title);
        holder.movieImage.setImageDrawable(holder.movieImage.getContext().getResources().getDrawable(objDataItems.imageId));
        holder.year.setText(objDataItems.year);
        holder.genre.setText(objDataItems.genre);
        holder.rating.setText(objDataItems.rating);

    }


    @Override
    public int getItemCount() {
        return dataItems.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView movieImage ;
        TextView year;
        TextView genre;
        TextView rating;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.movie_title);
            movieImage = itemView.findViewById(R.id.movie_image);
            year=itemView.findViewById(R.id.year);
            genre=itemView.findViewById(R.id.movie_genres);
            rating=itemView.findViewById(R.id.movie_rating);


        }
    }
}








//        holder.title.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(dataItems, MainActivity.class);
//                intent.putExtra("Movieimage",dataItems.get(position).imageId);
//                intent.putExtra("Title",dataItems.get(position).title);
//                intent.putExtra("Year",dataItems.get(position).year);
//                intent.putExtra("Genre",dataItems.get(position).genre);
//                intent.putExtra("Rating",dataItems.get(position).rating);
//                MainActivity(intent);
//            }
//        });