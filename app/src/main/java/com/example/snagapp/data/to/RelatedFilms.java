package com.example.snagapp.data.to;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RelatedFilms implements Parcelable {

    @SerializedName("relatedFilm")
    @Expose
    private List<RelatedFilm> relatedFilm = null;
    public final static Parcelable.Creator<RelatedFilms> CREATOR = new Creator<RelatedFilms>() {


        @SuppressWarnings({
            "unchecked"
        })
        public RelatedFilms createFromParcel(Parcel in) {
            return new RelatedFilms(in);
        }

        public RelatedFilms[] newArray(int size) {
            return (new RelatedFilms[size]);
        }

    }
    ;

    protected RelatedFilms(Parcel in) {
        in.readList(this.relatedFilm, (RelatedFilm.class.getClassLoader()));
    }

    public RelatedFilms() {
    }

    public List<RelatedFilm> getRelatedFilm() {
        return relatedFilm;
    }

    public void setRelatedFilm(List<RelatedFilm> relatedFilm) {
        this.relatedFilm = relatedFilm;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(relatedFilm);
    }

    public int describeContents() {
        return  0;
    }

}
