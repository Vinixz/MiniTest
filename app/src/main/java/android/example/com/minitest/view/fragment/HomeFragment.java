package android.example.com.minitest.view.fragment;

import android.example.com.minitest.R;
import android.example.com.minitest.model.Item;
import android.example.com.minitest.view.adapter.ItemVPAdapter;
import android.example.com.minitest.view.component.CustomViewPager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;

/**
 * Created by Vinixz on 10/9/2018.
 */

public class HomeFragment extends Fragment {

    private View view;
    private SliderLayout slider;
    private CustomViewPager vpRating, vpViews;
    private ItemVPAdapter vpRatingAdapter, vpViewsAdapter;

    public HomeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(view == null){
            view = inflater.inflate(R.layout.fragment_home, container, false);
        }
        init();
        event();
        return view;
    }

    public void init(){
        slider = view.findViewById(R.id.slider);
        vpRating = view.findViewById(R.id.vp_top_rating);
        vpViews = view.findViewById(R.id.vp_top_views);
    }

    public void event(){
        DefaultSliderView textSliderView1 = new DefaultSliderView(getContext());
        textSliderView1.image(R.drawable.venom);
        DefaultSliderView textSliderView2 = new DefaultSliderView(getContext());
        textSliderView2.image(R.drawable.crazy_rich_asians);
        slider.addSlider(textSliderView1);
        slider.addSlider(textSliderView2);

        vpRatingAdapter = new ItemVPAdapter(getContext(), Item.items);
        vpRating.setAdapter(vpRatingAdapter);
        vpViewsAdapter = new ItemVPAdapter(getContext(), Item.items);
        vpViews.setAdapter(vpViewsAdapter);
    }
}
