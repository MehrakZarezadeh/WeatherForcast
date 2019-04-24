package com.mehrak.weatherforcast;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mehrak.weatherforcast.R;

public class IntroPageOneFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View introPageOneView = inflater.inflate(R.layout.fragment_intro_page_one, container, false);
        return introPageOneView;
    }
}
