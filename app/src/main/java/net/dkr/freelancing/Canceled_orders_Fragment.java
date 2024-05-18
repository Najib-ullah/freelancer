package net.dkr.freelancing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.dkr.freelancing.adapter.AdapterGig;
import net.dkr.freelancing.model.Gig_Model;

import java.util.ArrayList;
import java.util.List;

public class Canceled_orders_Fragment extends Fragment {

    View view;
    RecyclerView rv_canceleddOrders;
    List<Gig_Model> canceled_gig_list;
    AdapterGig adapterGig_canceled ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_canceled_orders_, container, false);
        rv_canceleddOrders=view.findViewById(R.id.rv_canceled_orders);
        canceled_gig_list=new ArrayList<>();
        rv_canceleddOrders.setLayoutManager(new LinearLayoutManager(requireContext()));

        canceled_gig_list.add(new Gig_Model(R.drawable.cardone,"5.3","21",true,99,"create, edit,redesign minimalist bussnise ..."));
        canceled_gig_list.add(new Gig_Model(R.drawable.cardfour,"6.3","111",true,888,"create, edit,bussnise ..."));
        canceled_gig_list.add(new Gig_Model(R.drawable.cardthree,"7.3","131",true,99,"create, minimalist bussnise ..."));
        canceled_gig_list.add(new Gig_Model(R.drawable.busthree,"4.3","111",true,88,"create, edit,redesign minimalist bussnise ..."));
        canceled_gig_list.add(new Gig_Model(R.drawable.one,"2.2","111",true,99,"create, edit,redesign minimalist bussnise ..."));

        adapterGig_canceled=new AdapterGig(getContext(),canceled_gig_list);
        rv_canceleddOrders.setAdapter(adapterGig_canceled);
        return view;
    }
}