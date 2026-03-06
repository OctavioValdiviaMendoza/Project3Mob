package edu.sjsu.android.project1.project1.project3octaviovaldivia;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import edu.sjsu.android.project1.project1.project3octaviovaldivia.placeholder.PlaceholderContent.PlaceholderItem;
import edu.sjsu.android.project1.project1.project3octaviovaldivia.databinding.RowLayoutBinding;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private final List<Myitem> mValues;

    public MyAdapter(List<Myitem> items) {
        mValues = items;
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

        }
    }
}