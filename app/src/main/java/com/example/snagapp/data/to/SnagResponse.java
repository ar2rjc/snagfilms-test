package com.example.snagapp.data.to;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SnagResponse implements Parcelable {

    @SerializedName("films")
    @Expose
    private Films films;
    public final static Parcelable.Creator<SnagResponse> CREATOR = new Creator<SnagResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SnagResponse createFromParcel(Parcel in) {
            return new SnagResponse(in);
        }

        public SnagResponse[] newArray(int size) {
            return (new SnagResponse[size]);
        }

    }
    ;

    protected SnagResponse(Parcel in) {
        this.films = ((Films) in.readValue((Films.class.getClassLoader())));
    }

    public SnagResponse() {
    }

    public Films getFilms() {
        return films;
    }

    public void setFilms(Films films) {
        this.films = films;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(films);
    }

    public int describeContents() {
        return  0;
    }

}
