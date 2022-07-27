package com.leul.splogin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TrackAdapter extends BaseAdapter {
    private Context context;
    private TrackModel[] traks;

    TrackAdapter(Context context,TrackModel[] traks){
        this.context=context;
        this.traks=traks;
    }

    @Override
    public int getCount() {
        return traks.length;
    }

    @Override
    public Object getItem(int i) {
        return traks[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TrackModel track=(TrackModel) getItem(i);

        ViewHolder holder;
        if (view==null){
            view = LayoutInflater.from(context).inflate(R.layout.track_item,viewGroup,false);
            holder=new ViewHolder();
            holder.track_image=view.findViewById(R.id.track_image);
            holder.track_title=view.findViewById(R.id.track_title);
            view.setTag(holder);

        }else{
            holder=(ViewHolder) view.getTag();
        }
        holder.track_title.setText(track.getName());
        if(track.isplaying()){
            holder.track_image.setImageResource(R.drawable.ic_baseline_pause_circle);
        }else if(!track.isplaying()){
            holder.track_image.setImageResource(R.drawable.ic_baseline_play_circle);
        }
        else {
            holder.track_image.setImageResource(R.drawable.ic_baseline_play_circle);
        }

        return view;
    }

    static class ViewHolder{
    ImageView track_image;
    TextView track_title;
    }
}
