package edu.sjsu.android.project1.project1.project3octaviovaldivia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.sjsu.android.project1.project1.project3octaviovaldivia.databinding.FragmentInfoBinding;


public class infoFragment extends Fragment {

    public infoFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentInfoBinding binding = FragmentInfoBinding.inflate(inflater);
        binding.button.setOnClickListener( v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(getString(R.string.phoneNum)));
            startActivity(intent);
        });

        return binding.getRoot();
    }
}