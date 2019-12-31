package com.example.onlinestore.ui.Product;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.onlinestore.R;
import com.example.onlinestore.model.home.Item.Item;
import com.example.onlinestore.model.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity implements ProductInterface{

    ProductPresenter productPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        productPresenter = new ProductPresenter(this);
        productPresenter.getProductsList();

    }


    @Override
    public void setProductsListForRecyclerView(List<Item> itemLists) {



        ArrayList<Product> products = new ArrayList<>();

        for(int i = 0 ; i < itemLists.size(); i++ ){
            Log.v("iii",itemLists.get(i).getCategoryImage() );
            products.add(new Product(itemLists.get(i).getCategoryImage()));
        }
        RecyclerView staggeredRecycler = findViewById(R.id.staggeredRecycler);
        StaggeredGridLayoutManager staggeredManager =
                new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        staggeredRecycler.setLayoutManager(staggeredManager);


        ProductAdapter productAdapter = new ProductAdapter(this,products);
        staggeredRecycler.setAdapter(productAdapter);


    }

    @Override
    public void setFailureMsg(String failureMsg) {
        Toast.makeText(this, failureMsg, Toast.LENGTH_LONG).show();
    }
}
