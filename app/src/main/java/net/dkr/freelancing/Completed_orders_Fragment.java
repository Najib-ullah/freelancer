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

public class Completed_orders_Fragment extends Fragment {

    View view;
    RecyclerView rv_completedOrders;
    List<Gig_Model> completed_gig_list;
    AdapterGig adapterGig_completed ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view=inflater.inflate(R.layout.fragment_completed_orders_, container, false);
        rv_completedOrders=view.findViewById(R.id.rv_completed_orders);
        completed_gig_list=new ArrayList<>();
        rv_completedOrders.setLayoutManager(new LinearLayoutManager(requireContext()));

        completed_gig_list.add(new Gig_Model(R.drawable.busone,"3.3","111",true,11,"create, edit,redesign minimalist bussnise ..."));
        completed_gig_list.add(new Gig_Model(R.drawable.bustwo,"3.4","111",true,34,"create, minimalist bussnise ..."));
        completed_gig_list.add(new Gig_Model(R.drawable.cardone,"5.3","21",true,99,"create, edit,redesign minimalist bussnise ..."));
        completed_gig_list.add(new Gig_Model(R.drawable.cardfour,"6.3","111",true,888,"create, edit,bussnise ..."));
        completed_gig_list.add(new Gig_Model(R.drawable.cardthree,"7.3","131",true,99,"create, minimalist bussnise ..."));
        completed_gig_list.add(new Gig_Model(R.drawable.busthree,"4.3","111",true,88,"create, edit,redesign minimalist bussnise ..."));
        completed_gig_list.add(new Gig_Model(R.drawable.one,"2.2","111",true,99,"create, edit,redesign minimalist bussnise ..."));
        completed_gig_list.add(new Gig_Model(R.drawable.two,"4.3","111",true,34,"create,minimalist bussnise ..."));
        completed_gig_list.add(new Gig_Model(R.drawable.three,"1.3","111",true,22,"create, edit,redesign minimalist bussnise ..."));
        completed_gig_list.add(new Gig_Model(R.drawable.four,"2.3","111",true,55,"create, card,redesign  bussnise ..."));

        adapterGig_completed=new AdapterGig(getContext(),completed_gig_list);
        rv_completedOrders.setAdapter(adapterGig_completed);

        return view;
    }
}