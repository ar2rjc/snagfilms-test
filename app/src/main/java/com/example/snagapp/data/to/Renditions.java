
package com.example.snagapp.data.to;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Renditions implements Parcelable
{

    @SerializedName("rendition")
    @Expose
    private List<Rendition> rendition = null;
    public final static Parcelable.Creator<Renditions> CREATOR = new Creator<Renditions>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Renditions createFromParcel(Parcel in) {
            return new Renditions(in);
        }

        public Renditions[] newArray(int size) {
            return (new Renditions[size]);
        }

    }
    ;

    protected Renditions(Parcel in) {
        in.readList(this.rendition, (Rendition.class.getClassLoader()));
    }

    public Renditions() {
    }

    public List<Rendition> getRendition() {
        return rendition;
    }

    public void setRendition(List<Rendition> rendition) {
        this.rendition = rendition;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(rendition);
    }

    public int describeContents() {
        return  0;
    }

}
