package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;



public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {

    List<Model> modelList;
    Context context;

    public OrderAdapter(Context context, List<Model> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.listitem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String nameofDrink = modelList.get(position).getmDrinkName();
        String descriptionofdrink = modelList.get(position).getmDrinkDetail();
        int images = modelList.get(position).getmDrinkPhoto();

        holder.mDrinkName.setText(nameofDrink);
        holder.mDrinkDescription.setText(descriptionofdrink);
        holder.imageView.setImageResource(images);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView mDrinkName, mDrinkDescription;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mDrinkName = itemView.findViewById(R.id.coffeeName);
           mDrinkDescription = itemView.findViewById(R.id.description);
            imageView = itemView.findViewById(R.id.pizzaImage);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if (position == 0) {
                Intent intent = new Intent(context, InfoActivity.class);
                 context.startActivity(intent);
            } else if (position == 1) {
                Intent intent2 = new Intent(context, LatteActivity.class);
               context.startActivity(intent2);
            }

        }


    }
}
