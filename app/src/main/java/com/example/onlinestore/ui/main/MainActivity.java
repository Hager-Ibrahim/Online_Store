package com.example.onlinestore.ui.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.onlinestore.R;
import com.example.onlinestore.ui.fragment.offers.OfferFragment;
import com.example.onlinestore.ui.fragment.Category.CategoryFragment;
import com.example.onlinestore.ui.fragment.account.AccountFragment;
import com.example.onlinestore.ui.fragment.cart.CartFragment;
import com.example.onlinestore.ui.fragment.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(setNavigationViewListener());


        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener setNavigationViewListener(){

                return new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        Fragment selectedFragment = null;

                        switch (menuItem.getItemId()) {
                            case R.id.nav_home:
                                selectedFragment = new HomeFragment();
                                break;
                            case R.id.nav_product:
                                selectedFragment = new CategoryFragment();
                                break;
                            case R.id.nav_cart:
                                selectedFragment = new CartFragment();
                                break;
                            case R.id.nav_offer:
                                selectedFragment = new OfferFragment();
                                break;
                            case R.id.nav_account:
                                selectedFragment = new AccountFragment();
                                break;
                        }

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                selectedFragment).commit();

                        return true;
                    }
                };
    }

}
