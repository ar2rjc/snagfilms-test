package com.example.snagapp.home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.snagapp.R;
import com.example.snagapp.data.to.Film;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FilmsAdapter extends RecyclerView.Adapter<FilmsAdapter.ViewHolder> {

    private List<Film> films;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_film, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Film film = films.get(position);
        holder.fimName.setText(film.getTitle());
        // TODO - Load placeholder in case there isn't an image available
        Picasso.get().load(film.getImages().getImage().get(0).getSrc()).into(holder.filmImage);
    }

    @Override
    public int getItemCount() {
        return films == null ? 0 : films.size();
    }

    public void updateDataSet(List<Film> films) {
        this.films = films;
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.filmName)
        TextView fimName;
        @BindView(R.id.filmImage)
        ImageView filmImage;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
