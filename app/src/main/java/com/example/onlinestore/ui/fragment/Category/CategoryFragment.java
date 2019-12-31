package com.example.onlinestore.ui.fragment.Category;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;

import com.example.onlinestore.R;
import com.example.onlinestore.model.category.Product;

import java.util.ArrayList;

public class CategoryFragment extends Fragment {

    Toolbar productToolbar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_categoty, container, false);

        setToolBar(view);
        setListProducts(view);
        return view;
    }

    private void setToolBar(View view){
        productToolbar = view.findViewById(R.id.products_toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(productToolbar);    }


    public void setListProducts(View view){
        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.add(new Product(getResources().getDrawable(R.drawable.dresss),
                getResources().getString(R.string.dress)));
        productArrayList.add(new Product(getResources().getDrawable(R.drawable.jala),
                getResources().getString(R.string.jalabya)));
        productArrayList.add(new Product(getResources().getDrawable(R.drawable.blouse),
                getResources().getString(R.string.blouse)));
        productArrayList.add(new Product(getResources().getDrawable(R.drawable.child),
                getResources().getString(R.string.kids)));
        productArrayList.add(new Product(getResources().getDrawable(R.drawable.besht),
                getResources().getString(R.string.cloak)));
        productArrayList.add(new Product(getResources().getDrawable(R.drawable.outfit),
                getResources().getString(R.string.outfit)));
        productArrayList.add(new Product(getResources().getDrawable(R.drawable.soiree),
                getResources().getString(R.string.evening_dress)));
        productArrayList.add(new Product(getResources().getDrawable(R.drawable.mor),
                getResources().getString(R.string.morocan)));

        RecyclerView productRecycler = view.findViewById(R.id.productsRecycler);
        productRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        productRecycler.setAdapter(new CategoryAdapter(getContext(),productArrayList));

    }
}
