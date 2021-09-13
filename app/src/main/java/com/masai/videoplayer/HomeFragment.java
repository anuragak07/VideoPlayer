package com.masai.videoplayer;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Path;


public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<NowShowing> ModelList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
    }
    private void callApi(){
        ApiService apiService = Network.getRetrofitInstance().create(ApiService.class);

        apiService.getUser().enqueue(new Callback<List<NowShowing>>() {
            @Override
            public void onResponse(Call<List<NowShowing>> call, Response<List<NowShowing>> response) {
               if(response.body()!=null){
                   ModelList = (ArrayList<NowShowing>) response.body();
                   setRecyclerView();
               }


            }

            @Override
            public void onFailure(Call<List<NowShowing>> call, Throwable t) {
                Toast.makeText(getContext(),t.getLocalizedMessage(),Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void setRecyclerView() {
        HomeAdapter homeAdapter = new HomeAdapter(ModelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(homeAdapter);
    }
}

