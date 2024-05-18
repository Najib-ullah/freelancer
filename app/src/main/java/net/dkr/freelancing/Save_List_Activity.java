package net.dkr.freelancing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import net.dkr.freelancing.adapter.AdapterGig;
import net.dkr.freelancing.model.Gig_Model;

import java.util.ArrayList;
import java.util.List;

public class Save_List_Activity extends AppCompatActivity {

    RecyclerView rv_saved_list;
    List<Gig_Model>saved_list;
    AdapterGig adapterGig_saved_gig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_list);

        rv_saved_list=findViewById(R.id.rv_Save_gig_list);
        saved_list=new ArrayList<>();
        rv_saved_list.setLayoutManager(new LinearLayoutManager(this));

        saved_list.add(new Gig_Model(R.drawable.busone,"3.3","111",true,11,"create, edit,redesign minimalist bussnise ..."));
        saved_list.add(new Gig_Model(R.drawable.one,"2.2","111",true,99,"create, edit,redesign minimalist bussnise ..."));
        saved_list.add(new Gig_Model(R.drawable.two,"4.3","111",true,34,"create,minimalist bussnise ..."));
        saved_list.add(new Gig_Model(R.drawable.three,"1.3","111",true,22,"create, edit,redesign minimalist bussnise ..."));
        saved_list.add(new Gig_Model(R.drawable.four,"2.3","111",true,55,"create, card,redesign  bussnise ..."));
        saved_list.add(new Gig_Model(R.drawable.cardone,"5.3","21",true,99,"create, edit,redesign minimalist bussnise ..."));
        saved_list.add(new Gig_Model(R.drawable.cardfour,"6.3","111",true,888,"create, edit,bussnise ..."));
        saved_list.add(new Gig_Model(R.drawable.cardthree,"7.3","131",true,99,"create, minimalist bussnise ..."));
        adapterGig_saved_gig=new AdapterGig(this,saved_list);
        rv_saved_list.setAdapter(adapterGig_saved_gig);

    }
}