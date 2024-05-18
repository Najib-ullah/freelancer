package net.dkr.freelancing.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import net.dkr.freelancing.R;
import net.dkr.freelancing.Save_List_Activity;
import net.dkr.freelancing.SearchActivity;
import net.dkr.freelancing.SellerActivity;
import net.dkr.freelancing.SellerMainActivity;
import net.dkr.freelancing.SettingsActivity;


public class ProfileFragment extends Fragment {

    RelativeLayout relativeLayoutSetting,relativeLayoutInterest,relative_save_list ;
    Switch switch_buyer_to_Seller;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        relativeLayoutSetting = view.findViewById(R.id.relative_settings);
        relativeLayoutInterest = view.findViewById(R.id.relative2);
        relative_save_list=view.findViewById(R.id.relative_save_list);
        switch_buyer_to_Seller=view.findViewById(R.id.switch_buyer_to_Seller);


        relativeLayoutSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), SettingsActivity.class);
                startActivity(intent);
            }
        });

        relativeLayoutInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        switch_buyer_to_Seller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), SellerMainActivity.class);
                startActivity(intent);
            }
        });

        relativeLayoutInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), SearchActivity.class);
                startActivity(intent);
            }
        });
        relative_save_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Save_List_Activity.class);
                startActivity(intent);
            }
        });



    }
}