package com.leul.kidabc;

import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Objects;
// ACTIVITY FOR THE LIST OF MUSICS
public class musics extends AppCompatActivity {
    VideoView videoView;
    ListView listView;
    ArrayList<String>videoList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musics);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.new_color1)));

        videoView=findViewById(R.id.vd);
        listView=findViewById(R.id.lv);
        videoList= new ArrayList<>();
        videoList.add("vd1");
        videoList.add("vd2");
        videoList.add("vd3");
        videoList.add("vd4");
        videoList.add("vd5");

        adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,videoList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
               switch(position){
                   case 0:
                       videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vd1));
                       break;
                   case 1:
                       videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vd2));
                       break;
                   case 3:
                       videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vd3));
                       break;
                   case 4:
                       videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vd4));
                       break;
                   case 5:
                       videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vd5));
                       break;
                   default:
                       break;

               }
               videoView.setMediaController(new MediaController(musics.this));
               videoView.requestFocus();
               videoView.start();

            }
        });


    }
}