package com.example.binalarm;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private Context context;
    int totalTab;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public ViewPagerAdapter(Context context, FragmentManager supportFragmentManager, int totalTab) {
        super(supportFragmentManager);
        this.context = context;
        this.totalTab = totalTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new LoginTabFragment();
            case 1:
                return new SignTabFragment();
            default:
                return null;
        }
        }

    @Override
    public int getCount() {
        return totalTab;
    }
}
