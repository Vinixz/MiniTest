package android.example.com.minitest.view.fragment;

import android.example.com.minitest.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Vinixz on 10/9/2018.
 */

public class AboutUsFragment extends Fragment {

    private View view;

    public AboutUsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(view == null){
            view = inflater.inflate(R.layout.fragment_about_us, container, false);
        }
        return view;
    }
}
