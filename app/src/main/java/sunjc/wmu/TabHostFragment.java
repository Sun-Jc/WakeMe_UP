package sunjc.wmu;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.slidingtabs.SlidingTabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabHostFragment extends Fragment {

    //const
    static final String kTABTAG = "tabtag";
    static final int kTabNum = 3;

    //tab host
    ViewPager mPager;
    SlidingTabLayout mTabs;

    //tab page content
    AlarmFragment mAlarmFragment;
    ClockFragment mClockFragment;
    TimerFragment mTimerFragment;

    public TabHostFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tabhost_main, container, false);

        getTabPages();
        setupTabs(rootView);

        return rootView;
    }

    void getTabPages()
    {
        mAlarmFragment = new AlarmFragment();
        mClockFragment = new ClockFragment();
        mTimerFragment = new TimerFragment();

        //@@@@ HERE TO SET ARGUMENTS
    }

    void setupTabs(View v){
        mPager = (ViewPager) v.findViewById(R.id.viewPager);
        mPager.setAdapter(new ViewPagerAdapter(((ActionBarActivity)getActivity()).getSupportFragmentManager()));
        mTabs = (SlidingTabLayout) v.findViewById(R.id.mytabs);
        mTabs.setViewPager(mPager);
    }


    // Adapter for tabs
    class ViewPagerAdapter extends FragmentStatePagerAdapter {

        String[] str;

        FragmentManager fragmentManager;

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
            fragmentManager = fm;
            str = getResources().getStringArray(R.array.tabs);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return str[position];
        }

        public android.support.v4.app.Fragment getItem(int num) {
            if(num == 0){
                return  mAlarmFragment;
            }else if(num == 1){
                return mClockFragment;
            }else{
                return mTimerFragment;
            }
        }

        @Override
        public int getCount() {
            return kTabNum;
        }
    }

}
