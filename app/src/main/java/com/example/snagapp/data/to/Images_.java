package com.example.snagapp.data.to;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images_ implements Parcelable {

    @SerializedName("image")
    @Expose
    private List<Image_> image = null;
    public final static Parcelable.Creator<Images_> CREATOR = new Creator<Images_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Images_ createFromParcel(Parcel in) {
            return new Images_(in);
        }

        public Images_[] newArray(int size) {
            return (new Images_[size]);
        }

    }
    ;

    protected Images_(Parcel in) {
        in.readList(this.image, (Image_.class.getClassLoader()));
    }

    public Images_() {
    }

    public List<Image_> getImage() {
        return image;
    }

    public void setImage(List<Image_> image) {
        this.image = image;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(image);
    }

    public int describeContents() {
        return  0;
    }

}
