package net.dkr.freelancing;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import net.dkr.freelancing.adapter.AdapterGig;
import net.dkr.freelancing.adapter.AdapterSellerSkill;
import net.dkr.freelancing.model.Gig_Model;
import net.dkr.freelancing.model.SellerSkillModel;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    RecyclerView rv_shop_by,rv_show_gigs;
    List<SellerSkillModel> shop_by_list;
    List<Gig_Model> gig_list;
    AdapterSellerSkill adapter_shop_by ;
    AdapterGig adapterGig ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        rv_shop_by=findViewById(R.id.rv_search_shop_by);
        rv_show_gigs=findViewById(R.id.rv_show_gigs);
        shop_by_list=new ArrayList<>();
        gig_list=new ArrayList<>();

        rv_shop_by.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        rv_show_gigs.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        shop_by_list.add(new SellerSkillModel("style"));
        shop_by_list.add(new SellerSkillModel("service includes"));
        shop_by_list.add(new SellerSkillModel("seller level"));
        shop_by_list.add(new SellerSkillModel("price"));
        shop_by_list.add(new SellerSkillModel("Logo Option"));
        shop_by_list.add(new SellerSkillModel("Budget"));

        gig_list.add(new Gig_Model(R.drawable.busone,"3.3","111",true,11,"create, edit,redesign minimalist bussnise ..."));
        gig_list.add(new Gig_Model(R.drawable.bustwo,"3.4","111",true,34,"create, minimalist bussnise ..."));
        gig_list.add(new Gig_Model(R.drawable.busthree,"4.3","111",true,88,"create, edit,redesign minimalist bussnise ..."));
        gig_list.add(new Gig_Model(R.drawable.one,"2.2","111",true,99,"create, edit,redesign minimalist bussnise ..."));
        gig_list.add(new Gig_Model(R.drawable.two,"4.3","111",true,34,"create,minimalist bussnise ..."));
        gig_list.add(new Gig_Model(R.drawable.three,"1.3","111",true,22,"create, edit,redesign minimalist bussnise ..."));
        gig_list.add(new Gig_Model(R.drawable.four,"2.3","111",true,55,"create, card,redesign  bussnise ..."));
        gig_list.add(new Gig_Model(R.drawable.cardone,"5.3","21",true,99,"create, edit,redesign minimalist bussnise ..."));
        gig_list.add(new Gig_Model(R.drawable.cardfour,"6.3","111",true,888,"create, edit,bussnise ..."));
        gig_list.add(new Gig_Model(R.drawable.cardthree,"7.3","131",true,99,"create, minimalist bussnise ..."));

        adapter_shop_by = new AdapterSellerSkill(this,shop_by_list);
        adapterGig=new AdapterGig(this,gig_list);

        rv_shop_by.setAdapter(adapter_shop_by);
        rv_show_gigs.setAdapter(adapterGig);

    }
}