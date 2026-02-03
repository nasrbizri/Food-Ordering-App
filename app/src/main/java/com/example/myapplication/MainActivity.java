package com.example.myapplication;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Model> modelList;
    RecyclerView recyclerView;
    OrderAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        modelList = new ArrayList<>();
        modelList.add(new Model("Pizza", getString(R.string.pizza), R.drawable.pizza ));
        modelList.add(new Model("Latte", getString(R.string.lattee), R.drawable.lattee));


        // recyclerview
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(null));


        // adapter
        mAdapter = new OrderAdapter(this, modelList);
        recyclerView.setAdapter(mAdapter);




    }
}