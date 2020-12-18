package com.example.recyclerview_task;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler_adapter extends RecyclerView.Adapter<Recycler_adapter.view_holder> {

    ArrayList<item_obj> data ;

    public Recycler_adapter(ArrayList<item_obj> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item , parent , false);

        view_holder holder = new view_holder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull view_holder holder, int position) {

        item_obj item = data.get(position);

        holder.user_img.setImageResource(item.getImage());
        holder.Name.setText(item.getName());
        holder.Age.setText(item.getAge());
        holder.Career.setText(item.getCareer());
        holder.Experience.setText(item.getExperience());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class view_holder extends RecyclerView.ViewHolder{

        TextView Name ,Age ,Career ,Experience ;
        ImageView user_img ;
        Button details ;

        public view_holder(@NonNull View itemView) {
            super(itemView);

            user_img = itemView.findViewById(R.id.item_img);
            Name = itemView.findViewById(R.id.item_name);
            Age = itemView.findViewById(R.id.item_age);
            Career = itemView.findViewById(R.id.item_career);
            Experience = itemView.findViewById(R.id.item_experience);
            details = itemView.findViewById(R.id.item_details_btn);

        }

    }


}
