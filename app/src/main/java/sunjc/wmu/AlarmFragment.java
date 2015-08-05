package sunjc.wmu;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AlarmFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class AlarmFragment extends Fragment {


    public AlarmFragment() {
        // Required empty public constructor
    }

    /*public static AlarmFragment getInstance(int position){
        AlarmFragment alarmFragment = new AlarmFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        alarmFragment.setArguments(args);
        return alarmFragment;
    }*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_alarm_clocks, container, false);
        return rootView;
    }
}
