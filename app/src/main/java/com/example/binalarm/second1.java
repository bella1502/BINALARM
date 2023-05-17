package com.example.binalarm;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class second1 extends Fragment {

    TextView View, next;
    ImageView imageView;
    FloatingActionButton floatingActionButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_second1, container, false );

        View=root.findViewById(R.id.textView);
        next=root.findViewById(R.id.textView2);
        imageView=root.findViewById(R.id.imageView2);
        floatingActionButton=root.findViewById(R.id.fab);

        imageView.animate().translationY(2000).setDuration(1000).setStartDelay(4000);
        View.animate().translationY(2000).setDuration(1000).setStartDelay(4000);
        next.animate().translationY(2000).setDuration(1000).setStartDelay(4000);
        floatingActionButton.animate().translationY(2000).setDuration(1000).setStartDelay(4000);

        return root;
    }
}