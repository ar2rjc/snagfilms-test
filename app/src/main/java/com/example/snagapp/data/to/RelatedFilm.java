package com.example.snagapp.data.to;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RelatedFilm implements Parcelable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("images")
    @Expose
    private Images_ images;
    @SerializedName("duarionInMinutes")
    @Expose
    private Object duarionInMinutes;
    @SerializedName("durationInSeconds")
    @Expose
    private Object durationInSeconds;
    @SerializedName("durationMinutes")
    @Expose
    private Object durationMinutes;
    @SerializedName("durationSeconds")
    @Expose
    private Object durationSeconds;
    @SerializedName("runtime")
    @Expose
    private Integer runtime;
    @SerializedName("parentalRating")
    @Expose
    private Object parentalRating;
    @SerializedName("year")
    @Expose
    private Object year;
    @SerializedName("addedDate")
    @Expose
    private Object addedDate;
    @SerializedName("publishDate")
    @Expose
    private Object publishDate;
    @SerializedName("permalink")
    @Expose
    private Object permalink;
    @SerializedName("syndicationPartner")
    @Expose
    private Object syndicationPartner;
    @SerializedName("embed")
    @Expose
    private Object embed;
    @SerializedName("huluId")
    @Expose
    private Object huluId;
    @SerializedName("startTime")
    @Expose
    private Object startTime;
    @SerializedName("endTime")
    @Expose
    private Object endTime;
    @SerializedName("renditions")
    @Expose
    private Object renditions;
    @SerializedName("ads")
    @Expose
    private Object ads;
    @SerializedName("showTitle")
    @Expose
    private Object showTitle;
    @SerializedName("isFree")
    @Expose
    private Boolean isFree;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("percentage")
    @Expose
    private Integer percentage;
    @SerializedName("isQueued")
    @Expose
    private Object isQueued;
    @SerializedName("hlsUrl")
    @Expose
    private Object hlsUrl;
    @SerializedName("free")
    @Expose
    private Boolean free;
    @SerializedName("content_type")
    @Expose
    private Object contentType;
    @SerializedName("viewer_grade")
    @Expose
    private Object viewerGrade;
    public final static Parcelable.Creator<RelatedFilm> CREATOR = new Creator<RelatedFilm>() {

        @SuppressWarnings({
            "unchecked"
        })
        public RelatedFilm createFromParcel(Parcel in) {
            return new RelatedFilm(in);
        }

        public RelatedFilm[] newArray(int size) {
            return (new RelatedFilm[size]);
        }

    }
    ;

    protected RelatedFilm(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.images = ((Images_) in.readValue((Images_.class.getClassLoader())));
        this.duarionInMinutes = ((Object) in.readValue((Object.class.getClassLoader())));
        this.durationInSeconds = ((Object) in.readValue((Object.class.getClassLoader())));
        this.durationMinutes = ((Object) in.readValue((Object.class.getClassLoader())));
        this.durationSeconds = ((Object) in.readValue((Object.class.getClassLoader())));
        this.runtime = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.parentalRating = ((Object) in.readValue((Object.class.getClassLoader())));
        this.year = ((Object) in.readValue((Object.class.getClassLoader())));
        this.addedDate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.publishDate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.permalink = ((Object) in.readValue((Object.class.getClassLoader())));
        this.syndicationPartner = ((Object) in.readValue((Object.class.getClassLoader())));
        this.embed = ((Object) in.readValue((Object.class.getClassLoader())));
        this.huluId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.startTime = ((Object) in.readValue((Object.class.getClassLoader())));
        this.endTime = ((Object) in.readValue((Object.class.getClassLoader())));
        this.renditions = ((Object) in.readValue((Object.class.getClassLoader())));
        this.ads = ((Object) in.readValue((Object.class.getClassLoader())));
        this.showTitle = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isFree = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.description = ((Object) in.readValue((Object.class.getClassLoader())));
        this.time = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.percentage = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.isQueued = ((Object) in.readValue((Object.class.getClassLoader())));
        this.hlsUrl = ((Object) in.readValue((Object.class.getClassLoader())));
        this.free = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.contentType = ((Object) in.readValue((Object.class.getClassLoader())));
        this.viewerGrade = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public RelatedFilm() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Images_ getImages() {
        return images;
    }

    public void setImages(Images_ images) {
        this.images = images;
    }

    public Object getDuarionInMinutes() {
        return duarionInMinutes;
    }

    public void setDuarionInMinutes(Object duarionInMinutes) {
        this.duarionInMinutes = duarionInMinutes;
    }

    public Object getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(Object durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public Object getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Object durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public Object getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Object durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public Object getParentalRating() {
        return parentalRating;
    }

    public void setParentalRating(Object parentalRating) {
        this.parentalRating = parentalRating;
    }

    public Object getYear() {
        return year;
    }

    public void setYear(Object year) {
        this.year = year;
    }

    public Object getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Object addedDate) {
        this.addedDate = addedDate;
    }

    public Object getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Object publishDate) {
        this.publishDate = publishDate;
    }

    public Object getPermalink() {
        return permalink;
    }

    public void setPermalink(Object permalink) {
        this.permalink = permalink;
    }

    public Object getSyndicationPartner() {
        return syndicationPartner;
    }

    public void setSyndicationPartner(Object syndicationPartner) {
        this.syndicationPartner = syndicationPartner;
    }

    public Object getEmbed() {
        return embed;
    }

    public void setEmbed(Object embed) {
        this.embed = embed;
    }

    public Object getHuluId() {
        return huluId;
    }

    public void setHuluId(Object huluId) {
        this.huluId = huluId;
    }

    public Object getStartTime() {
        return startTime;
    }

    public void setStartTime(Object startTime) {
        this.startTime = startTime;
    }

    public Object getEndTime() {
        return endTime;
    }

    public void setEndTime(Object endTime) {
        this.endTime = endTime;
    }

    public Object getRenditions() {
        return renditions;
    }

    public void setRenditions(Object renditions) {
        this.renditions = renditions;
    }

    public Object getAds() {
        return ads;
    }

    public void setAds(Object ads) {
        this.ads = ads;
    }

    public Object getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(Object showTitle) {
        this.showTitle = showTitle;
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public Object getIsQueued() {
        return isQueued;
    }

    public void setIsQueued(Object isQueued) {
        this.isQueued = isQueued;
    }

    public Object getHlsUrl() {
        return hlsUrl;
    }

    public void setHlsUrl(Object hlsUrl) {
        this.hlsUrl = hlsUrl;
    }

    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    public Object getContentType() {
        return contentType;
    }

    public void setContentType(Object contentType) {
        this.contentType = contentType;
    }

    public Object getViewerGrade() {
        return viewerGrade;
    }

    public void setViewerGrade(Object viewerGrade) {
        this.viewerGrade = viewerGrade;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(title);
        dest.writeValue(images);
        dest.writeValue(duarionInMinutes);
        dest.writeValue(durationInSeconds);
        dest.writeValue(durationMinutes);
        dest.writeValue(durationSeconds);
        dest.writeValue(runtime);
        dest.writeValue(parentalRating);
        dest.writeValue(year);
        dest.writeValue(addedDate);
        dest.writeValue(publishDate);
        dest.writeValue(permalink);
        dest.writeValue(syndicationPartner);
        dest.writeValue(embed);
        dest.writeValue(huluId);
        dest.writeValue(startTime);
        dest.writeValue(endTime);
        dest.writeValue(renditions);
        dest.writeValue(ads);
        dest.writeValue(showTitle);
        dest.writeValue(isFree);
        dest.writeValue(description);
        dest.writeValue(time);
        dest.writeValue(percentage);
        dest.writeValue(isQueued);
        dest.writeValue(hlsUrl);
        dest.writeValue(free);
        dest.writeValue(contentType);
        dest.writeValue(viewerGrade);
    }

    public int describeContents() {
        return  0;
    }

}
