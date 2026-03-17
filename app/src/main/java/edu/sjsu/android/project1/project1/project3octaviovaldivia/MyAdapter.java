package edu.sjsu.android.project1.project1.project3octaviovaldivia;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import edu.sjsu.android.project1.project1.project3octaviovaldivia.databinding.RowLayoutBinding;

import java.util.List;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private final List<Myitem> mValues;
    private OnItemClickListener listener;

    public MyAdapter(List<Myitem> items, OnItemClickListener listener) {
        mValues = items;
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(RowLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Myitem item = mValues.get(position);
        holder.binding.icon.setImageResource(item.getImageId());
        holder.binding.name.setText(item.getNameId());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public RowLayoutBinding binding;
        public ViewHolder(RowLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            binding.getRoot().setOnClickListener(v->listener.onItemClick(getLayoutPosition()));

        }
    }
}