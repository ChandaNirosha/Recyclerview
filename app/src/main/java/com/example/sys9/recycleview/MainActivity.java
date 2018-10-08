package com.example.sys9.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    String []arr={"sth","sth1","sth2","sth3","sth4"};
    int[]images={R.drawable.img1,R.drawable.img2,R.drawable.image3,R.drawable.image4,R.drawable.image5};
    ArrayAdapter<String>adapter;
    RecycleAdapter recycleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recycleAdapter=new  RecycleAdapter(this,arr,images);
        recyclerView.setAdapter(recycleAdapter);
        




    }
}
