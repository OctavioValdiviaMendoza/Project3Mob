package edu.sjsu.android.project1.project1.project3octaviovaldivia;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.sjsu.android.project1.project1.project3octaviovaldivia.databinding.FragmentDetailBinding;


public class DetailFragment extends Fragment {

   private Myitem item;

    public DetailFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null){
            item = getArguments().getParcelable(getString(R.string.argu_key));
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentDetailBinding binding = FragmentDetailBinding.inflate(inflater);
        binding.titleText.setText(item.getNameId());
        binding.imageView.setImageResource(item.getImageId());
        binding.descriptionText.setText(item.getDesId());
        return binding.getRoot();
    }
}