package edu.sjsu.android.project1.project1.project3octaviovaldivia;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import edu.sjsu.android.project1.project1.project3octaviovaldivia.Myitem;

/**
 * A fragment representing a list of Items.
 */
public class ListFragment extends Fragment {
    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    private int LAST_ITEM_INDEX;
    private ArrayList<Myitem> items;

    public ListFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        items = new ArrayList<>();
        // TODO: add 5 images and replace the images
        items.add(new Myitem(R.drawable.ic_launcher_background,R.string.name1,R.string.des1));
        items.add(new Myitem(R.drawable.ic_launcher_background,R.string.name1,R.string.des1));
        items.add(new Myitem(R.drawable.ic_launcher_background,R.string.name1,R.string.des1));
        //Todo: add at least 2 more items

        LAST_ITEM_INDEX= items.size() - 1;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_, container, false);
        MyAdapter adapter = new MyAdapter(items);
        ((RecyclerView) view).setAdapter(adapter);
        return view;
    }

        private void onItemClick(int position){
            if (position == LAST_ITEM_INDEX){
                showWarning();
            }
            else{
                goDetail(position);
            }
        }

        private void goDetail(int position){
            // TODO: go to the detail page of the selected item
            //through navigation component
        }

        private void showWarning(){
            //in lect notes
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setMessage("A serious warning");
            builder.setPositiveButton("yes", (dialog, which) ->{
                goDetail(LAST_ITEM_INDEX);
            });
            builder.setNegativeButton("No", (Dialog, which) ->
            {

            });
            builder.create().show();
        }



}