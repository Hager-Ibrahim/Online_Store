package com.example.onlinestore.ui.fragment.Category;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinestore.R;
import com.example.onlinestore.model.category.Product;
import com.example.onlinestore.ui.Product.ProductActivity;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ProductsHolder> {

    Context context ;
    List<Product> productList ;

    public CategoryAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       return new ProductsHolder(LayoutInflater.from(context).inflate(R.layout.category_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsHolder holder, int position) {
        holder.productImg.setImageDrawable(productList.get(position).getProductImage());
        holder.productText.setText(productList.get(position).getProductName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openProductActivity = new Intent(context, ProductActivity.class);
                context.startActivity(openProductActivity);
            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ProductsHolder extends RecyclerView.ViewHolder{

        ImageView productImg ;
        TextView productText ;

        public ProductsHolder(@NonNull View itemView) {
            super(itemView);
            productImg = itemView.findViewById(R.id.product_image);
            productText = itemView.findViewById(R.id.product_title);
        }
    }
}
