package com.cpgs.ouat.design;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    UserProfileAdapter userProfileAdapter;
    List<UserModel> userModelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        userModelList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        userModelList.add(new UserModel(R.mipmap.ic_launcher_round,"Ranajeet","33MCA/16","8598898294"));
        userModelList.add(new UserModel(R.mipmap.ic_launcher_round,"Ranajeet","33MCA/16","8598898294"));
        userModelList.add(new UserModel(R.mipmap.ic_launcher_round,"Ranajeet","33MCA/16","8598898294"));
        userModelList.add(new UserModel(R.mipmap.ic_launcher_round,"Ranajeet","33MCA/16","8598898294"));
        userModelList.add(new UserModel(R.mipmap.ic_launcher_round,"Ranajeet","33MCA/16","8598898294"));
        userModelList.add(new UserModel(R.mipmap.ic_launcher_round,"Ranajeet","33MCA/16","8598898294"));
        userModelList.add(new UserModel(R.mipmap.ic_launcher_round,"Ranajeet","33MCA/16","8598898294"));
        userModelList.add(new UserModel(R.mipmap.ic_launcher_round,"Ranajeet","33MCA/16","8598898294"));
        userModelList.add(new UserModel(R.mipmap.ic_launcher_round,"Ranajeet","33MCA/16","8598898294"));
        userProfileAdapter = new UserProfileAdapter(userModelList,this);

    }
}
