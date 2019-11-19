package com.example.aurora;
import android.content.Intent;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;


public class BlobFragment extends Fragment { private AnimatedVectorDrawable blob;
    private AnimatedVectorDrawable pause;
    private AnimatedVectorDrawable play;
    private ImageView blobView;
    private ImageView pp_button;
    private boolean tick = true;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, //return all views in UI
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.blob_fragment, container, false);
        //initializing and animating buttons
        initializeButtons();
        animateButtons();
        //initializing and animating blob
        initializeBlob();
        animateBlob();
        return view;
    }

    //helper methods
    void playMusic(){
        pp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
    void stopMusic(){
        pp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    void animate(View view) {
        AnimatedVectorDrawable drawable = tick ? pause : play;
        pp_button.setImageDrawable(drawable);
        drawable.start();
        tick = !tick;
    }

    void initializeButtons(){
        pp_button = (ImageView) view.findViewById(R.id.pause_play_b);
        pause =  (AnimatedVectorDrawable) ResourcesCompat.getDrawable(getResources(), R.drawable.avd_pause_play_button, null);
        play = (AnimatedVectorDrawable) ResourcesCompat.getDrawable(getResources(), R.drawable.avd_play_pause_button, null);
    }

    void animateButtons(){
        pp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animate(null);
            }
        });
    }

    void initializeBlob() {
        blobView = (ImageView) view.findViewById(R.id.blob_o);
        blob = (AnimatedVectorDrawable) ResourcesCompat.getDrawable(getResources(), R.drawable.blob_ocean, null);
    }

    void animateBlob() {
        blobView.setImageDrawable(blob);
        blob.start();
    }
}
