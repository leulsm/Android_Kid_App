package com.leul.kidabc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Objects;
//LIST OF ALPHABET A-Z WITH BUTTON CLICK MUSICS
public class alpha extends AppCompatActivity {
Button a,b,c,d,e,f,g,h,i,j,k,l,mm,n,o,p,q,r,s,t,u,v,w,x,y,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
        //Action bar color
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.new_color1)));
       // BACK GROUND COLOR FOR LINEAR LAYOUT
        LinearLayout m=findViewById(R.id.ll);
        m.setBackgroundColor(Color.parseColor("#e5ba84"));
        //FIND BY ID
        a=findViewById(R.id.A);
        b=findViewById(R.id.B);
        d=findViewById(R.id.D);
        e=findViewById(R.id.E);
        f=findViewById(R.id.F);
        g=findViewById(R.id.G);
        h=findViewById(R.id.H);
        i=findViewById(R.id.I);
        j=findViewById(R.id.J);
        k=findViewById(R.id.K);
        l=findViewById(R.id.L);
        mm=findViewById(R.id.M);
        n=findViewById(R.id.N);
        o=findViewById(R.id.O);
        p=findViewById(R.id.P);
        q=findViewById(R.id.Q);
        r=findViewById(R.id.R);
        s=findViewById(R.id.S);
        t=findViewById(R.id.T);
        u=findViewById(R.id.U);
        v=findViewById(R.id.V);
        w=findViewById(R.id.W);
        x=findViewById(R.id.X);
        y=findViewById(R.id.Y);
        z=findViewById(R.id.Z);

// GET MEDIAPLAYER TO PLAY SONGS
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.a_song);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.b_song);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.d);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.e);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.f);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.g);
        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.h);
        final MediaPlayer mp9 = MediaPlayer.create(this, R.raw.i);
        final MediaPlayer mp0 = MediaPlayer.create(this, R.raw.j);
        final MediaPlayer mp11 = MediaPlayer.create(this, R.raw.k);
        final MediaPlayer mp12 = MediaPlayer.create(this, R.raw.l);
        final MediaPlayer mp13= MediaPlayer.create(this, R.raw.m);
        final MediaPlayer mp14= MediaPlayer.create(this, R.raw.n);
        final MediaPlayer mp15= MediaPlayer.create(this, R.raw.o);
        final MediaPlayer mp16= MediaPlayer.create(this, R.raw.p);
        final MediaPlayer mp17= MediaPlayer.create(this, R.raw.q);
        final MediaPlayer mp18= MediaPlayer.create(this, R.raw.r);
        final MediaPlayer mp19= MediaPlayer.create(this, R.raw.s);
        final MediaPlayer mp10= MediaPlayer.create(this, R.raw.t);
        final MediaPlayer mp111= MediaPlayer.create(this, R.raw.u);
        final MediaPlayer mp112 = MediaPlayer.create(this, R.raw.v);
        final MediaPlayer mp113 = MediaPlayer.create(this, R.raw.w);
        final MediaPlayer mp114 = MediaPlayer.create(this, R.raw.x);
        final MediaPlayer mp115 = MediaPlayer.create(this, R.raw.y);
        final MediaPlayer mp116 = MediaPlayer.create(this, R.raw.z);
// BUTTON ONCLICK MUSIC FUNCTIONS
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    // If the music is playing
                    if(mp1.isPlaying() == true)
                        // Pause the music player
                        mp1.pause();
                        // If it's not playing
                    else
                        // Resume the music player
                        mp1.start();
                }

        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp2.isPlaying() == true)
                    // Pause the music player
                    mp2.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp2.start();
            }

        });
        c=findViewById(R.id.C);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.a_song);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp3.isPlaying() == true)
                    // Pause the music player
                    mp3.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp3.start();
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp4.isPlaying() == true)
                    // Pause the music player
                    mp4.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp4.start();
            }

        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp5.isPlaying() == true)
                    // Pause the music player
                    mp5.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp5.start();
            }

        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp6.isPlaying() == true)
                    // Pause the music player
                    mp6.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp6.start();
            }

        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp7.isPlaying() == true)
                    // Pause the music player
                    mp7.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp7.start();
            }

        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp8.isPlaying() == true)
                    // Pause the music player
                    mp8.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp8.start();
            }

        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp9.isPlaying() == true)
                    // Pause the music player
                    mp9.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp9.start();
            }

        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp0.isPlaying() == true)
                    // Pause the music player
                    mp0.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp0.start();
            }

        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp11.isPlaying() == true)
                    // Pause the music player
                    mp11.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp11.start();
            }

        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp12.isPlaying() == true)
                    // Pause the music player
                    mp12.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp12.start();
            }

        });
        mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp13.isPlaying() == true)
                    // Pause the music player
                    mp13.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp13.start();
            }

        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp14.isPlaying() == true)
                    // Pause the music player
                    mp14.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp14.start();
            }

        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp15.isPlaying() == true)
                    // Pause the music player
                    mp15.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp15.start();
            }

        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp16.isPlaying() == true)
                    // Pause the music player
                    mp16.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp16.start();
            }

        });        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp17.isPlaying() == true)
                    // Pause the music player
                    mp17.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp17.start();
            }

        });        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp18.isPlaying() == true)
                    // Pause the music player
                    mp18.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp18.start();
            }

        });        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp19.isPlaying() == true)
                    // Pause the music player
                    mp19.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp19.start();
            }

        });        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp10.isPlaying() == true)
                    // Pause the music player
                    mp10.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp10.start();
            }

        });        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp111.isPlaying() == true)
                    // Pause the music player
                    mp111.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp111.start();
            }

        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp112.isPlaying() == true)
                    // Pause the music player
                    mp112.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp112.start();
            }

        });        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp113.isPlaying() == true)
                    // Pause the music player
                    mp113.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp113.start();
            }

        });        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp114.isPlaying() == true)
                    // Pause the music player
                    mp114.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp114.start();
            }

        });        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp115.isPlaying() == true)
                    // Pause the music player
                    mp115.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp115.start();
            }

        });        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the music is playing
                if(mp116.isPlaying() == true)
                    // Pause the music player
                    mp116.pause();
                    // If it's not playing
                else
                    // Resume the music player
                    mp116.start();
            }

        });
    }
}