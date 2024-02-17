package com.geeks.hw33_3m;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geeks.hw33_3m.databinding.FragmentMainBinding;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private FragmentMainBinding binding;

    private ArrayList<Music> musicList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the
        // layout for this fragment
        binding= FragmentMainBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lodData();
        MusicAdapter adapter =new MusicAdapter(musicList);
        binding.rvMusic.setAdapter(adapter);

    }

    private void lodData() {
        musicList.add(new Music("Вдвоем","Asik & ZaRina"));
        musicList.add(new Music("Эсимде","Бегиш"));
        musicList.add(new Music("Заманчивая","Matrang"));
        musicList.add(new Music("Наряд ангела","RICK"));
        musicList.add(new Music("Жармашып","FREEMAN 996"));
        musicList.add(new Music("Клятвы","Asik"));
        musicList.add(new Music("7:00","Baga"));
        musicList.add(new Music("Сигаретный дым","Gaspar"));
        musicList.add(new Music("Online","RICK"));
        musicList.add(new Music("Sugar","Zubi & anatu"));
    }

}