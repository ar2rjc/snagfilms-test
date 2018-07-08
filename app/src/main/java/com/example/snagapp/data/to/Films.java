
package com.example.snagapp.data.to;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Films implements Parcelable
{

    @SerializedName("categories")
    @Expose
    private Object categories;
    @SerializedName("film")
    @Expose
    private List<Film> film = null;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("previosOffset")
    @Expose
    private Object previosOffset;
    @SerializedName("nextOffset")
    @Expose
    private Integer nextOffset;
    @SerializedName("pageIndex")
    @Expose
    private Integer pageIndex;
    @SerializedName("pageTotal")
    @Expose
    private Integer pageTotal;
    @SerializedName("dynamicLead")
    @Expose
    private Object dynamicLead;
    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("versions")
    @Expose
    private Object versions;
    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("title")
    @Expose
    private Object title;
    @SerializedName("search_string")
    @Expose
    private Object searchString;
    public final static Parcelable.Creator<Films> CREATOR = new Creator<Films>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Films createFromParcel(Parcel in) {
            return new Films(in);
        }

        public Films[] newArray(int size) {
            return (new Films[size]);
        }

    }
    ;

    protected Films(Parcel in) {
        this.categories = ((Object) in.readValue((Object.class.getClassLoader())));
        in.readList(this.film, (Film.class.getClassLoader()));
        this.total = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.previosOffset = ((Object) in.readValue((Object.class.getClassLoader())));
        this.nextOffset = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.pageIndex = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.pageTotal = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.dynamicLead = ((Object) in.readValue((Object.class.getClassLoader())));
        this.version = ((Object) in.readValue((Object.class.getClassLoader())));
        this.versions = ((Object) in.readValue((Object.class.getClassLoader())));
        this.id = ((Object) in.readValue((Object.class.getClassLoader())));
        this.title = ((Object) in.readValue((Object.class.getClassLoader())));
        this.searchString = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Films() {
    }

    public Object getCategories() {
        return categories;
    }

    public void setCategories(Object categories) {
        this.categories = categories;
    }

    public List<Film> getFilm() {
        return film;
    }

    public void setFilm(List<Film> film) {
        this.film = film;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Object getPreviosOffset() {
        return previosOffset;
    }

    public void setPreviosOffset(Object previosOffset) {
        this.previosOffset = previosOffset;
    }

    public Integer getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Object getDynamicLead() {
        return dynamicLead;
    }

    public void setDynamicLead(Object dynamicLead) {
        this.dynamicLead = dynamicLead;
    }

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public Object getVersions() {
        return versions;
    }

    public void setVersions(Object versions) {
        this.versions = versions;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public Object getSearchString() {
        return searchString;
    }

    public void setSearchString(Object searchString) {
        this.searchString = searchString;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(categories);
        dest.writeList(film);
        dest.writeValue(total);
        dest.writeValue(previosOffset);
        dest.writeValue(nextOffset);
        dest.writeValue(pageIndex);
        dest.writeValue(pageTotal);
        dest.writeValue(dynamicLead);
        dest.writeValue(version);
        dest.writeValue(versions);
        dest.writeValue(id);
        dest.writeValue(title);
        dest.writeValue(searchString);
    }

    public int describeContents() {
        return  0;
    }

}
