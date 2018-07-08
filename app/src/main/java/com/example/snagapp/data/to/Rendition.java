package com.example.snagapp.data.to;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rendition implements Parcelable {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("bitrate")
    @Expose
    private Object bitrate;
    @SerializedName("key")
    @Expose
    private Object key;
    @SerializedName("resolution")
    @Expose
    private Object resolution;
    public final static Parcelable.Creator<Rendition> CREATOR = new Creator<Rendition>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Rendition createFromParcel(Parcel in) {
            return new Rendition(in);
        }

        public Rendition[] newArray(int size) {
            return (new Rendition[size]);
        }

    }
    ;

    protected Rendition(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.bitrate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.key = ((Object) in.readValue((Object.class.getClassLoader())));
        this.resolution = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Rendition() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getBitrate() {
        return bitrate;
    }

    public void setBitrate(Object bitrate) {
        this.bitrate = bitrate;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getResolution() {
        return resolution;
    }

    public void setResolution(Object resolution) {
        this.resolution = resolution;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(url);
        dest.writeValue(bitrate);
        dest.writeValue(key);
        dest.writeValue(resolution);
    }

    public int describeContents() {
        return  0;
    }

}
