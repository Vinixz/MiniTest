package android.example.com.minitest.view.adapter;

import android.content.Context;
import android.example.com.minitest.R;
import android.example.com.minitest.model.Item;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vinixz on 10/9/2018.
 */

public class ItemVPAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private List<Item> items;

    public ItemVPAdapter(Context context, List<Item> items){
        this.context = context;
        this.items = new ArrayList<>();
        this.items = items;
    }

    @Override
    public int getCount() {
        return this.items.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(final ViewGroup container, final int position) {
        TextView tvTitle;
        ImageView ivCover;

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ViewGroup itemView = (ViewGroup) layoutInflater.inflate(R.layout.row_item_grid, container, false);

        tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
        ivCover = (ImageView) itemView.findViewById(R.id.iv_cover);

        Item item= this.items.get(position);
        tvTitle.setText(item.title);
        ivCover.setImageResource(item.imagePath);

        container.addView(itemView);
        return itemView;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        ((ViewPager) container).removeView((CardView) object);
    }

    @Override
    public float getPageWidth(int position) {
        return 0.4f;
    }
}
