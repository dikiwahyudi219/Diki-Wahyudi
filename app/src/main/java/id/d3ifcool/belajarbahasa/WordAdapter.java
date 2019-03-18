package id.d3ifcool.belajarbahasa;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Word> mData;

    public WordAdapter(Context mContext, ArrayList<Word> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext) .inflate(R.layout.list_bahasa, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Word word = mData.get(position);
        holder.indo_textView.setText(word.getLinguisWord());
        holder.Daerah_textView.setText(word.getDefaultWord());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        final TextView indo_textView;
        final TextView Daerah_textView;

        public ViewHolder (View itemView) {
            super(itemView);
            indo_textView = itemView.findViewById(R.id.indo_textView);
            Daerah_textView = itemView.findViewById(R.id.default_textView);
        }
    }
}

