package android.example.com.minitest.view.adapter;

import android.example.com.minitest.R;
import android.example.com.minitest.model.Item;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Vinixz on 10/9/2018.
 */

public class ItemRVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private List<Item> items;

    public ItemRVAdapter(List<Item> items) {
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_linear, parent, false);
        return new LinearVH(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final LinearVH vh = (LinearVH) holder;
        vh.setData();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    private class LinearVH extends RecyclerView.ViewHolder{
        TextView tvTitle, tvDate;
        ImageView ivCover;

        LinearVH(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDate = itemView.findViewById(R.id.tv_date);
            ivCover = itemView.findViewById(R.id.iv_cover);
        }

        void setData(){
            final Item item = items.get(getAdapterPosition());
            tvTitle.setText(item.title);
            tvDate.setText(item.date);
            ivCover.setImageResource(item.imagePath);
        }
    }
}
