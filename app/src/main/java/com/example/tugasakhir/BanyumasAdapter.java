package com.example.tugasakhir;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BanyumasAdapter extends RecyclerView.Adapter<BanyumasAdapter.BanyumasHolder> {

    private Context context;
    private List<Banyumas> banyumasList;

    public BanyumasAdapter(Context context, List<Banyumas> banyumas) {
        this.context = context;
        banyumasList = banyumas;
    }

    @NonNull
    @Override
    public BanyumasHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new BanyumasHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BanyumasHolder holder, int position) {

        Banyumas banyumas = banyumasList.get(position);
        holder.namausaha.setText(banyumas.getNamausaha());
        Glide.with(context).load(banyumas.getFoto()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return banyumasList.size();
    }

    public class BanyumasHolder extends RecyclerView.ViewHolder {

        TextView namausaha;
        ImageView imageView;

        public BanyumasHolder(@NonNull View itemView) {
            super(itemView);

            namausaha = itemView.findViewById(R.id.namaUsaha);
            imageView = itemView.findViewById(R.id.imageviews);
        }
    }
}
