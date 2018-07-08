
package com.example.snagapp.data.to;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image implements Parcelable
{

    @SerializedName("height")
    @Expose
    private Object height;
    @SerializedName("src")
    @Expose
    private String src;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("width")
    @Expose
    private Object width;
    @SerializedName("rokuSrc")
    @Expose
    private Object rokuSrc;
    public final static Parcelable.Creator<Image> CREATOR = new Creator<Image>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Image createFromParcel(Parcel in) {
            return new Image(in);
        }

        public Image[] newArray(int size) {
            return (new Image[size]);
        }

    }
    ;

    protected Image(Parcel in) {
        this.height = ((Object) in.readValue((Object.class.getClassLoader())));
        this.src = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.width = ((Object) in.readValue((Object.class.getClassLoader())));
        this.rokuSrc = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Image() {
    }

    public Object getHeight() {
        return height;
    }

    public void setHeight(Object height) {
        this.height = height;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getWidth() {
        return width;
    }

    public void setWidth(Object width) {
        this.width = width;
    }

    public Object getRokuSrc() {
        return rokuSrc;
    }

    public void setRokuSrc(Object rokuSrc) {
        this.rokuSrc = rokuSrc;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(height);
        dest.writeValue(src);
        dest.writeValue(type);
        dest.writeValue(width);
        dest.writeValue(rokuSrc);
    }

    public int describeContents() {
        return  0;
    }

}
