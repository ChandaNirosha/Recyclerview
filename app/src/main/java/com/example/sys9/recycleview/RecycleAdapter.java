package com.example.sys9.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecycleAdapter extends RecyclerView.Adapter {
    Context context;
    String[] arr;
    int[] images;
    ViewHolderClass viewHolderClass;

public RecycleAdapter(MainActivity mainActivity, String[] arr, int[] images) {
    context = mainActivity;
    this.arr = arr;
    this.images = images;


}

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.recycler_adapter,viewGroup,false);
        viewHolderClass=new ViewHolderClass(view);
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        viewHolderClass.textView.setText(arr[i]);
        viewHolderClass.image.setImageResource(images[i]);


    }

    @Override
    public int getItemCount() {
        return arr.length;
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
    TextView textView;
    ImageView image;
    public ViewHolderClass(@NonNull View itemView){
        super(itemView);
        textView=itemView.findViewById(R.id.name);
        image=itemView.findViewById(R.id.image);
    }
    }
}
