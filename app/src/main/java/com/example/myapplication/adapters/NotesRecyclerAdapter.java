package com.example.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.models.Notes;

import java.util.ArrayList;

public class NotesRecyclerAdapter extends RecyclerView.Adapter<NotesRecyclerAdapter.ViewHolder> {
    private ArrayList<Notes> mNotes=new ArrayList<>();

    public NotesRecyclerAdapter(ArrayList<Notes> Notes) {
        this.mNotes = Notes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_note_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(mNotes.get(position).getTitle());
        holder.timestamp.setText(mNotes.get(position).getTimestamp());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
         TextView title,timestamp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            timestamp=itemView.findViewById(R.id.timestamp);
        }
    }
}
