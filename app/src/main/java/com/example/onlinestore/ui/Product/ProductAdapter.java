package com.example.onlinestore.ui.Product;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.onlinestore.R;
import com.example.onlinestore.model.product.Product;

import java.util.ArrayList;


public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder> {

    Context context;
    ArrayList<Product> list;

    public ProductAdapter(Context context, ArrayList<Product> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_item,parent,false);
        return new ProductHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {
        Glide.with(context).load(list.get(position).getProductImage()).into(holder.productDetailsImage);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ProductHolder extends RecyclerView.ViewHolder{

        ImageView productDetailsImage;

        public ProductHolder(@NonNull View itemView) {
            super(itemView);

            productDetailsImage = itemView.findViewById(R.id.product_details_image);
        }
    }
}
