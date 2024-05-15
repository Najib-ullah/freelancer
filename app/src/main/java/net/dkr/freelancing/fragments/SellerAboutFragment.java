package net.dkr.freelancing.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.dkr.freelancing.adapter.AdapterSellerLanguage;
import net.dkr.freelancing.adapter.AdapterSellerSkill;
import net.dkr.freelancing.R;
import net.dkr.freelancing.model.SellerLanguageModel;
import net.dkr.freelancing.model.SellerSkillModel;

import java.util.ArrayList;
import java.util.List;

public class SellerAboutFragment extends Fragment {

    RecyclerView rvLanguage,rvSkill;
    List<SellerSkillModel> sellerSkillModelList;
    List<SellerLanguageModel> sellerLanguageModelList;
    AdapterSellerLanguage adapterSellerLanguage;
    AdapterSellerSkill adapterSellerSkill ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        sellerLanguageModelList = new ArrayList<>();
        sellerSkillModelList = new ArrayList<>();
        return inflater.inflate(R.layout.fragment_seller_about, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvLanguage = view.findViewById(R.id.rv_seller_languages);
        rvSkill = view.findViewById(R.id.rv_seller_skills);

        rvSkill.setLayoutManager(new GridLayoutManager(getContext(),3));
        rvLanguage.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));

        sellerSkillModelList.add(new SellerSkillModel("Android"));
        sellerSkillModelList.add(new SellerSkillModel("Android Studio"));
        sellerSkillModelList.add(new SellerSkillModel("Java"));
        sellerSkillModelList.add(new SellerSkillModel("Kotlin"));

        sellerLanguageModelList.add(new SellerLanguageModel("Pashto","Native"));
        sellerLanguageModelList.add(new SellerLanguageModel("Dari","National"));
        sellerLanguageModelList.add(new SellerLanguageModel("Arabi","Region"));
        sellerLanguageModelList.add(new SellerLanguageModel("English","Profissional"));

        adapterSellerLanguage = new AdapterSellerLanguage(getContext(),sellerLanguageModelList);
        adapterSellerSkill = new AdapterSellerSkill(getContext(),sellerSkillModelList);

        rvLanguage.setAdapter(adapterSellerLanguage);
        rvSkill.setAdapter(adapterSellerSkill);

    }
}