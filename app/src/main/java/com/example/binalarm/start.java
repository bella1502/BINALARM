package com.example.binalarm;

import android.annotation.SuppressLint;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class start extends AppCompatActivity {
    ImageView imageView;
    ImageView img;
    TextView textView;
    private static int NUM_PAGES=1;
    private ViewPager viewPager;
   // private ScreenSlidePageAdapter pageAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        imageView=findViewById(R.id.imageView);
        textView=findViewById(R.id.textView4);

        img=findViewById(R.id.image);

        viewPager=findViewById(R.id.view_pager);



        img.animate().translationY(-2500).setDuration(1000).setStartDelay(3000);
        imageView.animate().translationY(2000).setDuration(1000).setStartDelay(3000);
        textView.animate().translationY(2000).setDuration(1000).setStartDelay(3000);

       /* pageAdapter= new ScreenSlidePageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);*/


    }

    /*private static class ScreenSlidePageAdapter extends FragmentStatePagerAdapter {

        public ScreenSlidePageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {

            switch (i)
            {
                case 0:
                    return new second1();
            }
            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }*/
}