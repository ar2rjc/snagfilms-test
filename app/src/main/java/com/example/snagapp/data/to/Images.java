package com.example.snagapp.data.to;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images implements Parcelable {

    @SerializedName("image")
    @Expose
    private List<Image> image = null;
    public final static Parcelable.Creator<Images> CREATOR = new Creator<Images>() {

        @SuppressWarnings({
            "unchecked"
        })
        public Images createFromParcel(Parcel in) {
            return new Images(in);
        }

        public Images[] newArray(int size) {
            return (new Images[size]);
        }

    }
    ;

    protected Images(Parcel in) {
        in.readList(this.image, (Image.class.getClassLoader()));
    }

    public Images() {
    }

    public List<Image> getImage() {
        return image;
    }

    public void setImage(List<Image> image) {
        this.image = image;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(image);
    }

    public int describeContents() {
        return  0;
    }

}
