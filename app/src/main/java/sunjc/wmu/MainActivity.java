package sunjc.wmu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;

import com.google.slidingtabs.SlidingTabLayout;

public class MainActivity extends ActionBarActivity {

    TabHostFragment mTabHostFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (null == savedInstanceState)
            createFragment();
    }

    private void createFragment() {
        android.app.FragmentManager fManager = getFragmentManager();
        FragmentTransaction fTransaction = fManager.beginTransaction();

        mTabHostFragment = new TabHostFragment();

        // Adding the new fragment
        fTransaction.add(R.id.mainContainer, mTabHostFragment);
        fTransaction.commit();
    }
}