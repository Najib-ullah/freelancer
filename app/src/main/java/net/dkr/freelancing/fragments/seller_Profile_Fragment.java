package net.dkr.freelancing.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;

import net.dkr.freelancing.R;
import net.dkr.freelancing.SellerActivity;
import net.dkr.freelancing.Seller_Earning_Activity;
import net.dkr.freelancing.SettingsActivity;

public class seller_Profile_Fragment extends Fragment {


    RelativeLayout relative_seller_Earnings ,relative_seller_my_profile;
    Switch switch_buyer_to_Seller;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seller__profile_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        relative_seller_Earnings=view.findViewById(R.id.relative_seller_Earnings);
        relative_seller_my_profile=view.findViewById(R.id.relative_seller_my_profile);
        switch_buyer_to_Seller=view.findViewById(R.id.switch_buyer_to_Seller);





        relative_seller_Earnings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Seller_Earning_Activity.class);
                startActivity(intent);


            }
        });
        relative_seller_my_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), SellerActivity.class);
                startActivity(intent);
            }
        });
        switch_buyer_to_Seller.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    Activity activity = getActivity();
                    activity.onBackPressed();
                }
            }
        });
    }
}