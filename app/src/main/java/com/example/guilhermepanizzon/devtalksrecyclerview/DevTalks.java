package com.example.guilhermepanizzon.devtalksrecyclerview;

import android.graphics.drawable.Drawable;

/**
 * Created by guilhermepanizzon on 06/02/17.
 */

public class DevTalks {

    private String speakerName;
    private String subject;
    private int thumbnailSubject;

    public DevTalks(String speakerName, String subject, int thumbnailSubject ){
        this.setSpeakerName(speakerName);
        this.setSubject(subject);
        this.setThumbnailSubject(thumbnailSubject);
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getThumbnailSubject() {
        return thumbnailSubject;
    }

    public void setThumbnailSubject(int thumbnailSubject) {
        this.thumbnailSubject = thumbnailSubject;
    }
}
