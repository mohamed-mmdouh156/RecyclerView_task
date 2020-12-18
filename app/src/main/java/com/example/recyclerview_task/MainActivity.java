package com.example.recyclerview_task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        ArrayList <item_obj> list_item = new ArrayList<>();

        list_item.add(new item_obj("Mohamed Mmdouh Mohamed " , R.drawable.user , "20 Year" , "Android Developer" ,"2 Year" ));
        list_item.add(new item_obj("Ahmed Mohamed Ahmed " , R.drawable.user , "30 Year" , "Web Developer" ,"5 Year" ));
        list_item.add(new item_obj("Mahmoud Mohamed Mohamed " , R.drawable.user , "30 Year" , "Android Developer" ,"7 Year" ));
        list_item.add(new item_obj("Ali Mohamed" , R.drawable.user , "40 Year" , "Android Developer" ,"10 Year" ));
        list_item.add(new item_obj("Mohamed Mmdouh Mohamed " , R.drawable.user , "20 Year" , "Android Developer" ,"2 Year" ));
        list_item.add(new item_obj("Ahmed Mohamed Ahmed " , R.drawable.user , "30 Year" , "Web Developer" ,"5 Year" ));
        list_item.add(new item_obj("Mahmoud Mohamed Mohamed " , R.drawable.user , "30 Year" , "Android Developer" ,"7 Year" ));
        list_item.add(new item_obj("Ali Mohamed" , R.drawable.user , "40 Year" , "Android Developer" ,"10 Year" ));

        Recycler_adapter adapter = new Recycler_adapter(list_item);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);

    }
}