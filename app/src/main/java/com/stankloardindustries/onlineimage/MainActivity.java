package com.stankloardindustries.onlineimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<ImageModel> list;
    ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String uri = "https://images.pexels.com/photos/3473525/pexels-photo-3473525.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940";
        String uri2 = "https://images.pexels.com/photos/57690/pexels-photo-57690.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940";

        Picasso.get().load(uri).placeholder(R.drawable.sample).into(img1);
        Picasso.get().load(uri2).placeholder(R.drawable.sample).into(img2);

        rv = findViewById(R.id.rvImage);
        list = new ArrayList<>();

        ImageAdapter imgAdapter = new ImageAdapter(list, getApplicationContext());
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rv.setAdapter(imgAdapter);
        rv.setNestedScrollingEnabled(false);
        rv.setLayoutManager(llm);
    }
}