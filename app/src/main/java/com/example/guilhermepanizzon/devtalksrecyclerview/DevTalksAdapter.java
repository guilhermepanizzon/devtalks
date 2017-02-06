package com.example.guilhermepanizzon.devtalksrecyclerview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by guilhermepanizzon on 06/02/17.
 */

public class DevTalksAdapter extends RecyclerView.Adapter<DevTalksAdapter.DevTalksViewHolder> {
    private Context mContext;
    private List<DevTalks> devTalksList;

    public DevTalksAdapter(Context mContext, List<DevTalks> devTalksList){
        this.mContext = mContext;
        this.devTalksList = devTalksList;
    }

    @Override
    public DevTalksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.devtalks_card, parent, false);
        return new DevTalksViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DevTalksViewHolder holder, int position) {
        DevTalks devTalks = devTalksList.get(position);
        holder.speakerName.setText(devTalks.getSpeakerName());
        holder.subject.setText(devTalks.getSubject());
        holder.thumbnailSubject.setImageResource(devTalks.getThumbnailSubject());
    }

    @Override
    public int getItemCount() {
        return devTalksList.size();
    }

    public class DevTalksViewHolder extends RecyclerView.ViewHolder{

        public TextView speakerName, subject;
        public ImageView thumbnailSubject;

        public DevTalksViewHolder(View itemView) {
            super(itemView);

            speakerName = (TextView) itemView.findViewById(R.id.speaker_name);
            subject = (TextView) itemView.findViewById(R.id.subject);
            thumbnailSubject = (ImageView) itemView.findViewById(R.id.thumbnail);
        }
    }
}
