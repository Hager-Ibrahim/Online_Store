package com.example.onlinestore.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.onlinestore.R;
import com.example.onlinestore.model.home.Item.Item;

import java.util.List;

public class BestOffersAdapter extends RecyclerView.Adapter<BestOffersAdapter.OffersViewHolder> {

    Context context;
    List<Item> itemList;


    public BestOffersAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public OffersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.best_offers_item, parent, false);
        return new OffersViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull OffersViewHolder holder, int position) {
        Glide.with(context).load(itemList.get(position).getCategoryImage()).into(holder.bestOfferImg);
        holder.bestOfferName.setText(itemList.get(position).getEnglishName());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class OffersViewHolder extends RecyclerView.ViewHolder {

        TextView bestOfferName ;
        ImageView bestOfferImg ;

        public OffersViewHolder(@NonNull View itemView) {
            super(itemView);

            bestOfferName = itemView.findViewById(R.id.best_offer_name);
            bestOfferImg = itemView.findViewById(R.id.bestOfferImg);
        }
    }
}
