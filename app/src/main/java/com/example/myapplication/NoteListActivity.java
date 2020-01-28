package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.myapplication.models.Notes;

public class NoteListActivity extends AppCompatActivity {
    private static  final  String TAG ="NoteListActivity";
    // UI compontnts
    private RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_note_list);
        recyclerView=findViewById(R.id.RecyclerView);

        Notes notes=new Notes("some title","some content","some timestamp");
        Log.d(TAG, "onCreate: my notes"+getTitle());
    }
}
