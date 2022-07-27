package com.leul.splogin;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class musiclisten extends AppCompatActivity {
    private ListView listView;
    private TrackModel[] tracklist;
    private MediaPlayer mediaPlayer;
    private TrackAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musiclisten);

        listView=findViewById(R.id.track_list_view);
        loadTracks();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                loadTracks();

                TrackModel track= tracklist[i];

                if(mediaPlayer !=null){
                    if(mediaPlayer.isPlaying()){
                        mediaPlayer.stop();
                        mediaPlayer.reset();
                        mediaPlayer.pause();
                        track.setIsplaying(false);
                    }

                }
                try{
                    mediaPlayer=MediaPlayer.create(musiclisten.this, track.getId());
                    if(mediaPlayer.isPlaying()){
                        mediaPlayer.stop();
                        mediaPlayer.reset();
                        mediaPlayer.pause();
                        track.setIsplaying(false);
                    }else{
                        mediaPlayer.start();
                        track.setIsplaying(true);
                    }

                }catch (Exception e){
                    Log.e("Exception",e.getMessage());
                }
            }
        });
    }
    public void loadTracks(){
        tracklist=new TrackModel[]{
        new TrackModel(R.raw.animalalphabet,"ALPHA_ONE",false),
        new TrackModel(R.raw.appletozebra,"ALPHA_TWO",false),
        new TrackModel(R.raw.dreamenglishtraditionalabc,"ALPHA_THREE",false)

        };

        adapter=new TrackAdapter(musiclisten.this, tracklist);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.reset();
            }
        }
    }
}