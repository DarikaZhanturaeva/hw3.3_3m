package com.geeks.hw33_3m;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.hw33_3m.databinding.ItemMusicBinding;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicViewHolder> {

    private ArrayList<Music> musicList;

    public MusicAdapter(ArrayList<Music> musicList) {
        this.musicList = musicList;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MusicViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        holder.onBind(musicList.get(position));
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }
}

class MusicViewHolder extends RecyclerView.ViewHolder {
    private ItemMusicBinding binding;

    public MusicViewHolder(@NonNull ItemMusicBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(Music music) {
        binding.tvMusician.setText(music.getMusician());
        binding.tvName.setText(music.getName());
    }
}
