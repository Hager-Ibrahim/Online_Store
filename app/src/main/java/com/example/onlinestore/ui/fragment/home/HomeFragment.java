package com.example.onlinestore.ui.fragment.home;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.onlinestore.R;
import com.example.onlinestore.model.home.category.Category;
import java.util.ArrayList;

public class HomeFragment  extends Fragment  {

    Toolbar mainToolbar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.home_fragment, container, false);

        setToolBar();
        setCategoryList(view);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private void setToolBar(){
        mainToolbar = getActivity().findViewById(R.id.mainToolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(mainToolbar);    }


    private void setCategoryList(View view){

       ArrayList<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(getActivity().getResources().getString(R.string.jalabya), R.drawable.ic_soiree_dress));
        categoryList.add(new Category(getActivity().getResources().getString(R.string.jalabya), R.drawable.ic_jalabya));
        categoryList.add(new Category(getActivity().getResources().getString(R.string.jalabya), R.drawable.ic_maghrebi));
        categoryList.add(new Category(getActivity().getResources().getString(R.string.jalabya), R.drawable.ic_short_jalabya));
        categoryList.add(new Category(getActivity().getResources().getString(R.string.jalabya), R.drawable.ic_dress));
        categoryList.add(new Category(getActivity().getResources().getString(R.string.jalabya), R.drawable.ic_besht));
        categoryList.add(new Category(getActivity().getResources().getString(R.string.jalabya), R.drawable.ic_skirt_blouse));

        RecyclerView mRecyclerView = view.findViewById(R.id.categoryRecycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));
        mRecyclerView.setAdapter(new CategoryAdapter(getContext(), categoryList));
    }


}
