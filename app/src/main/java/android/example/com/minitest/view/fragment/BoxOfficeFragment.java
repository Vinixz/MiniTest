package android.example.com.minitest.view.fragment;

import android.example.com.minitest.R;
import android.example.com.minitest.model.Item;
import android.example.com.minitest.view.adapter.ItemRVAdapter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Vinixz on 10/9/2018.
 */

public class BoxOfficeFragment extends Fragment {

    private View view;
    private RecyclerView rv;
    private ItemRVAdapter rvAdapter;

    public BoxOfficeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(view == null){
            view = inflater.inflate(R.layout.fragment_box_office, container, false);
        }
        init();
        event();
        return view;
    }

    public void init(){
        rv = view.findViewById(R.id.rv_box_office);
        rvAdapter = new ItemRVAdapter(Item.items);
    }

    public void event(){
        rv.setHasFixedSize(true);
        rv.setLayoutManager( new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        rv.setAdapter(rvAdapter);
    }
}
