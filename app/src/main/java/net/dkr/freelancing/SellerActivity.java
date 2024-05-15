package net.dkr.freelancing;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import net.dkr.freelancing.fragments.SellerAboutFragment;
import net.dkr.freelancing.fragments.SellerGigFragment;
import net.dkr.freelancing.fragments.SellerReviewFragment;

public class SellerActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller);
        Toolbar toolbar=findViewById(R.id.toolbar_seller);
        ivBack = findViewById(R.id.iv_seller_back);
        bottomNavigationView = findViewById(R.id.bottom_seller);

//
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("Seller Profile");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportFragmentManager().beginTransaction().add(new SellerAboutFragment(), "seller").replace(R.id.frameLayout_seller, new SellerAboutFragment()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = null;
                if (menuItem.getItemId() == R.id.menu_seller_about) {
                    fragment = new SellerAboutFragment();
                } else if (menuItem.getItemId() == R.id.menu_seller_gig) {
                    fragment = new SellerGigFragment();

                } else if (menuItem.getItemId() == R.id.menu_seller_review) {
                    fragment = new SellerReviewFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_seller,fragment).commit();

                return true;
            }
        });




    }

    //for going back to home
   
}