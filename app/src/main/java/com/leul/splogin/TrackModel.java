package com.leul.splogin;

public class TrackModel {
    private int id;
    private String name;
    private boolean isplaying;

    public TrackModel(int id, String name, boolean isplaying){
     this.id=id;
     this.name=name;
     this.isplaying=isplaying;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isplaying() {
        return isplaying;
    }


    public void setIsplaying(boolean isplaying) {
        this.isplaying = isplaying;
    }
}
