package net.dkr.freelancing.fragments;


import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import net.dkr.freelancing.Active_orders_Fragment;
import net.dkr.freelancing.Canceled_orders_Fragment;
import net.dkr.freelancing.Completed_orders_Fragment;
import net.dkr.freelancing.R;
import net.dkr.freelancing.adapter.AdapterGig;
import net.dkr.freelancing.adapter.AdapterSellerSkill;
import net.dkr.freelancing.adapter.ManageOrdersFragmentAdapter;
import net.dkr.freelancing.model.Gig_Model;

import java.util.ArrayList;
import java.util.List;

public class ManageOrderFragment extends Fragment {
    View myFragment;
    ViewPager viewPager;
    TabLayout tabLayout;

    Context context;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myFragment =inflater.inflate(R.layout.fragment_manga_order, container, false);
        viewPager=myFragment.findViewById(R.id.view_pager);
        tabLayout=myFragment.findViewById(R.id.tab_order_layout);




        return myFragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {

        ManageOrdersFragmentAdapter adapter=new ManageOrdersFragmentAdapter(getChildFragmentManager());
        adapter.addFragment(new Active_orders_Fragment(),"Active Orders");
        adapter.addFragment(new Completed_orders_Fragment(),"Completed Orders");
        adapter.addFragment(new Canceled_orders_Fragment(),"Canceled Orders");

        viewPager.setAdapter(adapter);

    }
}