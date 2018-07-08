package com.example.snagapp.data.to;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Film implements Parcelable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("author")
    @Expose
    private Object author;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private Object type;
    @SerializedName("logline")
    @Expose
    private Object logline;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("year")
    @Expose
    private Object year;
    @SerializedName("addedDate")
    @Expose
    private Object addedDate;
    @SerializedName("isLiveStream")
    @Expose
    private Boolean isLiveStream;
    @SerializedName("durationMinutes")
    @Expose
    private Integer durationMinutes;
    @SerializedName("durationSeconds")
    @Expose
    private Integer durationSeconds;
    @SerializedName("runtime")
    @Expose
    private Integer runtime;
    @SerializedName("primaryCategory")
    @Expose
    private Object primaryCategory;
    @SerializedName("secondaryCategories")
    @Expose
    private Object secondaryCategories;
    @SerializedName("tags")
    @Expose
    private Object tags;
    @SerializedName("channels")
    @Expose
    private Object channels;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("credits")
    @Expose
    private Object credits;
    @SerializedName("permaLink")
    @Expose
    private String permaLink;
    @SerializedName("permalink")
    @Expose
    private Object permalink;
    @SerializedName("imdbId")
    @Expose
    private Object imdbId;
    @SerializedName("parentalRating")
    @Expose
    private String parentalRating;
    @SerializedName("geoRestrictions")
    @Expose
    private String geoRestrictions;
    @SerializedName("relatedFilms")
    @Expose
    private RelatedFilms relatedFilms;
    @SerializedName("renditions")
    @Expose
    private Renditions renditions;
    @SerializedName("audioRenditions")
    @Expose
    private Object audioRenditions;
    @SerializedName("fbCommentsUrl")
    @Expose
    private String fbCommentsUrl;
    @SerializedName("starRatingAvg")
    @Expose
    private Object starRatingAvg;
    @SerializedName("starRatingCount")
    @Expose
    private Object starRatingCount;
    @SerializedName("publishTime")
    @Expose
    private Object publishTime;
    @SerializedName("isQueued")
    @Expose
    private Object isQueued;
    @SerializedName("isSmoothAsset")
    @Expose
    private Object isSmoothAsset;
    @SerializedName("isCompleted")
    @Expose
    private Object isCompleted;
    @SerializedName("playable")
    @Expose
    private Object playable;
    @SerializedName("errorMessage")
    @Expose
    private Object errorMessage;
    @SerializedName("ccFileUrl")
    @Expose
    private Object ccFileUrl;
    @SerializedName("ageRestricted")
    @Expose
    private Boolean ageRestricted;
    @SerializedName("hds")
    @Expose
    private Boolean hds;
    @SerializedName("ads")
    @Expose
    private Object ads;
    @SerializedName("manifest")
    @Expose
    private Object manifest;
    @SerializedName("mast")
    @Expose
    private Object mast;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("percentage")
    @Expose
    private Integer percentage;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("comments")
    @Expose
    private Integer comments;
    @SerializedName("shares")
    @Expose
    private Integer shares;
    @SerializedName("notes")
    @Expose
    private List<Object> notes = null;
    @SerializedName("status")
    @Expose
    private Object status;
    @SerializedName("syndicationPartner")
    @Expose
    private Object syndicationPartner;
    @SerializedName("bumperUrl")
    @Expose
    private Object bumperUrl;
    @SerializedName("embed")
    @Expose
    private Object embed;
    @SerializedName("huluId")
    @Expose
    private Object huluId;
    @SerializedName("seasons")
    @Expose
    private Object seasons;
    @SerializedName("episode")
    @Expose
    private Integer episode;
    @SerializedName("episodeNumber")
    @Expose
    private Integer episodeNumber;
    @SerializedName("seasonNumber")
    @Expose
    private Integer seasonNumber;
    @SerializedName("season")
    @Expose
    private Object season;
    @SerializedName("isFree")
    @Expose
    private Boolean isFree;
    @SerializedName("scheduling")
    @Expose
    private Object scheduling;
    @SerializedName("disable_live_player")
    @Expose
    private Boolean disableLivePlayer;
    @SerializedName("professors")
    @Expose
    private Object professors;
    @SerializedName("yTVideoId")
    @Expose
    private Object yTVideoId;
    @SerializedName("fBVideoId")
    @Expose
    private Object fBVideoId;
    @SerializedName("rating")
    @Expose
    private Object rating;
    @SerializedName("creditBlocks")
    @Expose
    private Object creditBlocks;
    @SerializedName("kisweEventId")
    @Expose
    private Object kisweEventId;
    @SerializedName("hd")
    @Expose
    private Boolean hd;
    @SerializedName("free")
    @Expose
    private Boolean free;
    @SerializedName("player_tags")
    @Expose
    private Object playerTags;
    @SerializedName("featured_tag")
    @Expose
    private Object featuredTag;
    @SerializedName("viewer_grade")
    @Expose
    private Object viewerGrade;
    @SerializedName("your_grade")
    @Expose
    private Object yourGrade;
    @SerializedName("film_type")
    @Expose
    private Object filmType;
    @SerializedName("trailer_url")
    @Expose
    private Object trailerUrl;
    @SerializedName("start_time")
    @Expose
    private Integer startTime;
    @SerializedName("end_time")
    @Expose
    private Integer endTime;
    @SerializedName("clip_url")
    @Expose
    private Object clipUrl;
    @SerializedName("mp4_url")
    @Expose
    private Object mp4Url;
    @SerializedName("hls_url")
    @Expose
    private Object hlsUrl;
    @SerializedName("dfp_tag")
    @Expose
    private Object dfpTag;
    @SerializedName("content_type")
    @Expose
    private Object contentType;
    @SerializedName("no_of_seasons")
    @Expose
    private Integer noOfSeasons;
    @SerializedName("closed_captions")
    @Expose
    private Object closedCaptions;
    @SerializedName("show_title")
    @Expose
    private Object showTitle;
    @SerializedName("show_id")
    @Expose
    private Object showId;
    @SerializedName("related_courses")
    @Expose
    private Object relatedCourses;
    @SerializedName("social_widgets")
    @Expose
    private Object socialWidgets;
    @SerializedName("external_link")
    @Expose
    private Object externalLink;
    @SerializedName("no_of_episodes")
    @Expose
    private Integer noOfEpisodes;
    public final static Parcelable.Creator<Film> CREATOR = new Creator<Film>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Film createFromParcel(Parcel in) {
            return new Film(in);
        }

        public Film[] newArray(int size) {
            return (new Film[size]);
        }

    }
    ;

    protected Film(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.author = ((Object) in.readValue((Object.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((Object) in.readValue((Object.class.getClassLoader())));
        this.logline = ((Object) in.readValue((Object.class.getClassLoader())));
        this.description = ((Object) in.readValue((Object.class.getClassLoader())));
        this.year = ((Object) in.readValue((Object.class.getClassLoader())));
        this.addedDate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isLiveStream = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.durationMinutes = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.durationSeconds = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.runtime = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.primaryCategory = ((Object) in.readValue((Object.class.getClassLoader())));
        this.secondaryCategories = ((Object) in.readValue((Object.class.getClassLoader())));
        this.tags = ((Object) in.readValue((Object.class.getClassLoader())));
        this.channels = ((Object) in.readValue((Object.class.getClassLoader())));
        this.images = ((Images) in.readValue((Images.class.getClassLoader())));
        this.credits = ((Object) in.readValue((Object.class.getClassLoader())));
        this.permaLink = ((String) in.readValue((String.class.getClassLoader())));
        this.permalink = ((Object) in.readValue((Object.class.getClassLoader())));
        this.imdbId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.parentalRating = ((String) in.readValue((String.class.getClassLoader())));
        this.geoRestrictions = ((String) in.readValue((String.class.getClassLoader())));
        this.relatedFilms = ((RelatedFilms) in.readValue((RelatedFilms.class.getClassLoader())));
        this.renditions = ((Renditions) in.readValue((Renditions.class.getClassLoader())));
        this.audioRenditions = ((Object) in.readValue((Object.class.getClassLoader())));
        this.fbCommentsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.starRatingAvg = ((Object) in.readValue((Object.class.getClassLoader())));
        this.starRatingCount = ((Object) in.readValue((Object.class.getClassLoader())));
        this.publishTime = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isQueued = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isSmoothAsset = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isCompleted = ((Object) in.readValue((Object.class.getClassLoader())));
        this.playable = ((Object) in.readValue((Object.class.getClassLoader())));
        this.errorMessage = ((Object) in.readValue((Object.class.getClassLoader())));
        this.ccFileUrl = ((Object) in.readValue((Object.class.getClassLoader())));
        this.ageRestricted = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.hds = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.ads = ((Object) in.readValue((Object.class.getClassLoader())));
        this.manifest = ((Object) in.readValue((Object.class.getClassLoader())));
        this.mast = ((Object) in.readValue((Object.class.getClassLoader())));
        this.time = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.percentage = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.views = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.comments = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.shares = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.notes, (java.lang.Object.class.getClassLoader()));
        this.status = ((Object) in.readValue((Object.class.getClassLoader())));
        this.syndicationPartner = ((Object) in.readValue((Object.class.getClassLoader())));
        this.bumperUrl = ((Object) in.readValue((Object.class.getClassLoader())));
        this.embed = ((Object) in.readValue((Object.class.getClassLoader())));
        this.huluId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.seasons = ((Object) in.readValue((Object.class.getClassLoader())));
        this.episode = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.episodeNumber = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.seasonNumber = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.season = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isFree = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.scheduling = ((Object) in.readValue((Object.class.getClassLoader())));
        this.disableLivePlayer = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.professors = ((Object) in.readValue((Object.class.getClassLoader())));
        this.yTVideoId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.fBVideoId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.rating = ((Object) in.readValue((Object.class.getClassLoader())));
        this.creditBlocks = ((Object) in.readValue((Object.class.getClassLoader())));
        this.kisweEventId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.hd = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.free = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.playerTags = ((Object) in.readValue((Object.class.getClassLoader())));
        this.featuredTag = ((Object) in.readValue((Object.class.getClassLoader())));
        this.viewerGrade = ((Object) in.readValue((Object.class.getClassLoader())));
        this.yourGrade = ((Object) in.readValue((Object.class.getClassLoader())));
        this.filmType = ((Object) in.readValue((Object.class.getClassLoader())));
        this.trailerUrl = ((Object) in.readValue((Object.class.getClassLoader())));
        this.startTime = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.endTime = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.clipUrl = ((Object) in.readValue((Object.class.getClassLoader())));
        this.mp4Url = ((Object) in.readValue((Object.class.getClassLoader())));
        this.hlsUrl = ((Object) in.readValue((Object.class.getClassLoader())));
        this.dfpTag = ((Object) in.readValue((Object.class.getClassLoader())));
        this.contentType = ((Object) in.readValue((Object.class.getClassLoader())));
        this.noOfSeasons = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.closedCaptions = ((Object) in.readValue((Object.class.getClassLoader())));
        this.showTitle = ((Object) in.readValue((Object.class.getClassLoader())));
        this.showId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.relatedCourses = ((Object) in.readValue((Object.class.getClassLoader())));
        this.socialWidgets = ((Object) in.readValue((Object.class.getClassLoader())));
        this.externalLink = ((Object) in.readValue((Object.class.getClassLoader())));
        this.noOfEpisodes = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Film() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getAuthor() {
        return author;
    }

    public void setAuthor(Object author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getLogline() {
        return logline;
    }

    public void setLogline(Object logline) {
        this.logline = logline;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
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

    public Boolean getIsLiveStream() {
        return isLiveStream;
    }

    public void setIsLiveStream(Boolean isLiveStream) {
        this.isLiveStream = isLiveStream;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public Object getPrimaryCategory() {
        return primaryCategory;
    }

    public void setPrimaryCategory(Object primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public Object getSecondaryCategories() {
        return secondaryCategories;
    }

    public void setSecondaryCategories(Object secondaryCategories) {
        this.secondaryCategories = secondaryCategories;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Object getChannels() {
        return channels;
    }

    public void setChannels(Object channels) {
        this.channels = channels;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Object getCredits() {
        return credits;
    }

    public void setCredits(Object credits) {
        this.credits = credits;
    }

    public String getPermaLink() {
        return permaLink;
    }

    public void setPermaLink(String permaLink) {
        this.permaLink = permaLink;
    }

    public Object getPermalink() {
        return permalink;
    }

    public void setPermalink(Object permalink) {
        this.permalink = permalink;
    }

    public Object getImdbId() {
        return imdbId;
    }

    public void setImdbId(Object imdbId) {
        this.imdbId = imdbId;
    }

    public String getParentalRating() {
        return parentalRating;
    }

    public void setParentalRating(String parentalRating) {
        this.parentalRating = parentalRating;
    }

    public String getGeoRestrictions() {
        return geoRestrictions;
    }

    public void setGeoRestrictions(String geoRestrictions) {
        this.geoRestrictions = geoRestrictions;
    }

    public RelatedFilms getRelatedFilms() {
        return relatedFilms;
    }

    public void setRelatedFilms(RelatedFilms relatedFilms) {
        this.relatedFilms = relatedFilms;
    }

    public Renditions getRenditions() {
        return renditions;
    }

    public void setRenditions(Renditions renditions) {
        this.renditions = renditions;
    }

    public Object getAudioRenditions() {
        return audioRenditions;
    }

    public void setAudioRenditions(Object audioRenditions) {
        this.audioRenditions = audioRenditions;
    }

    public String getFbCommentsUrl() {
        return fbCommentsUrl;
    }

    public void setFbCommentsUrl(String fbCommentsUrl) {
        this.fbCommentsUrl = fbCommentsUrl;
    }

    public Object getStarRatingAvg() {
        return starRatingAvg;
    }

    public void setStarRatingAvg(Object starRatingAvg) {
        this.starRatingAvg = starRatingAvg;
    }

    public Object getStarRatingCount() {
        return starRatingCount;
    }

    public void setStarRatingCount(Object starRatingCount) {
        this.starRatingCount = starRatingCount;
    }

    public Object getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Object publishTime) {
        this.publishTime = publishTime;
    }

    public Object getIsQueued() {
        return isQueued;
    }

    public void setIsQueued(Object isQueued) {
        this.isQueued = isQueued;
    }

    public Object getIsSmoothAsset() {
        return isSmoothAsset;
    }

    public void setIsSmoothAsset(Object isSmoothAsset) {
        this.isSmoothAsset = isSmoothAsset;
    }

    public Object getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Object isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Object getPlayable() {
        return playable;
    }

    public void setPlayable(Object playable) {
        this.playable = playable;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getCcFileUrl() {
        return ccFileUrl;
    }

    public void setCcFileUrl(Object ccFileUrl) {
        this.ccFileUrl = ccFileUrl;
    }

    public Boolean getAgeRestricted() {
        return ageRestricted;
    }

    public void setAgeRestricted(Boolean ageRestricted) {
        this.ageRestricted = ageRestricted;
    }

    public Boolean getHds() {
        return hds;
    }

    public void setHds(Boolean hds) {
        this.hds = hds;
    }

    public Object getAds() {
        return ads;
    }

    public void setAds(Object ads) {
        this.ads = ads;
    }

    public Object getManifest() {
        return manifest;
    }

    public void setManifest(Object manifest) {
        this.manifest = manifest;
    }

    public Object getMast() {
        return mast;
    }

    public void setMast(Object mast) {
        this.mast = mast;
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

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getShares() {
        return shares;
    }

    public void setShares(Integer shares) {
        this.shares = shares;
    }

    public List<Object> getNotes() {
        return notes;
    }

    public void setNotes(List<Object> notes) {
        this.notes = notes;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Object getSyndicationPartner() {
        return syndicationPartner;
    }

    public void setSyndicationPartner(Object syndicationPartner) {
        this.syndicationPartner = syndicationPartner;
    }

    public Object getBumperUrl() {
        return bumperUrl;
    }

    public void setBumperUrl(Object bumperUrl) {
        this.bumperUrl = bumperUrl;
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

    public Object getSeasons() {
        return seasons;
    }

    public void setSeasons(Object seasons) {
        this.seasons = seasons;
    }

    public Integer getEpisode() {
        return episode;
    }

    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    public Integer getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(Integer episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public Integer getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public Object getSeason() {
        return season;
    }

    public void setSeason(Object season) {
        this.season = season;
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public Object getScheduling() {
        return scheduling;
    }

    public void setScheduling(Object scheduling) {
        this.scheduling = scheduling;
    }

    public Boolean getDisableLivePlayer() {
        return disableLivePlayer;
    }

    public void setDisableLivePlayer(Boolean disableLivePlayer) {
        this.disableLivePlayer = disableLivePlayer;
    }

    public Object getProfessors() {
        return professors;
    }

    public void setProfessors(Object professors) {
        this.professors = professors;
    }

    public Object getYTVideoId() {
        return yTVideoId;
    }

    public void setYTVideoId(Object yTVideoId) {
        this.yTVideoId = yTVideoId;
    }

    public Object getFBVideoId() {
        return fBVideoId;
    }

    public void setFBVideoId(Object fBVideoId) {
        this.fBVideoId = fBVideoId;
    }

    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    public Object getCreditBlocks() {
        return creditBlocks;
    }

    public void setCreditBlocks(Object creditBlocks) {
        this.creditBlocks = creditBlocks;
    }

    public Object getKisweEventId() {
        return kisweEventId;
    }

    public void setKisweEventId(Object kisweEventId) {
        this.kisweEventId = kisweEventId;
    }

    public Boolean getHd() {
        return hd;
    }

    public void setHd(Boolean hd) {
        this.hd = hd;
    }

    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    public Object getPlayerTags() {
        return playerTags;
    }

    public void setPlayerTags(Object playerTags) {
        this.playerTags = playerTags;
    }

    public Object getFeaturedTag() {
        return featuredTag;
    }

    public void setFeaturedTag(Object featuredTag) {
        this.featuredTag = featuredTag;
    }

    public Object getViewerGrade() {
        return viewerGrade;
    }

    public void setViewerGrade(Object viewerGrade) {
        this.viewerGrade = viewerGrade;
    }

    public Object getYourGrade() {
        return yourGrade;
    }

    public void setYourGrade(Object yourGrade) {
        this.yourGrade = yourGrade;
    }

    public Object getFilmType() {
        return filmType;
    }

    public void setFilmType(Object filmType) {
        this.filmType = filmType;
    }

    public Object getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(Object trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Object getClipUrl() {
        return clipUrl;
    }

    public void setClipUrl(Object clipUrl) {
        this.clipUrl = clipUrl;
    }

    public Object getMp4Url() {
        return mp4Url;
    }

    public void setMp4Url(Object mp4Url) {
        this.mp4Url = mp4Url;
    }

    public Object getHlsUrl() {
        return hlsUrl;
    }

    public void setHlsUrl(Object hlsUrl) {
        this.hlsUrl = hlsUrl;
    }

    public Object getDfpTag() {
        return dfpTag;
    }

    public void setDfpTag(Object dfpTag) {
        this.dfpTag = dfpTag;
    }

    public Object getContentType() {
        return contentType;
    }

    public void setContentType(Object contentType) {
        this.contentType = contentType;
    }

    public Integer getNoOfSeasons() {
        return noOfSeasons;
    }

    public void setNoOfSeasons(Integer noOfSeasons) {
        this.noOfSeasons = noOfSeasons;
    }

    public Object getClosedCaptions() {
        return closedCaptions;
    }

    public void setClosedCaptions(Object closedCaptions) {
        this.closedCaptions = closedCaptions;
    }

    public Object getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(Object showTitle) {
        this.showTitle = showTitle;
    }

    public Object getShowId() {
        return showId;
    }

    public void setShowId(Object showId) {
        this.showId = showId;
    }

    public Object getRelatedCourses() {
        return relatedCourses;
    }

    public void setRelatedCourses(Object relatedCourses) {
        this.relatedCourses = relatedCourses;
    }

    public Object getSocialWidgets() {
        return socialWidgets;
    }

    public void setSocialWidgets(Object socialWidgets) {
        this.socialWidgets = socialWidgets;
    }

    public Object getExternalLink() {
        return externalLink;
    }

    public void setExternalLink(Object externalLink) {
        this.externalLink = externalLink;
    }

    public Integer getNoOfEpisodes() {
        return noOfEpisodes;
    }

    public void setNoOfEpisodes(Integer noOfEpisodes) {
        this.noOfEpisodes = noOfEpisodes;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(author);
        dest.writeValue(title);
        dest.writeValue(type);
        dest.writeValue(logline);
        dest.writeValue(description);
        dest.writeValue(year);
        dest.writeValue(addedDate);
        dest.writeValue(isLiveStream);
        dest.writeValue(durationMinutes);
        dest.writeValue(durationSeconds);
        dest.writeValue(runtime);
        dest.writeValue(primaryCategory);
        dest.writeValue(secondaryCategories);
        dest.writeValue(tags);
        dest.writeValue(channels);
        dest.writeValue(images);
        dest.writeValue(credits);
        dest.writeValue(permaLink);
        dest.writeValue(permalink);
        dest.writeValue(imdbId);
        dest.writeValue(parentalRating);
        dest.writeValue(geoRestrictions);
        dest.writeValue(relatedFilms);
        dest.writeValue(renditions);
        dest.writeValue(audioRenditions);
        dest.writeValue(fbCommentsUrl);
        dest.writeValue(starRatingAvg);
        dest.writeValue(starRatingCount);
        dest.writeValue(publishTime);
        dest.writeValue(isQueued);
        dest.writeValue(isSmoothAsset);
        dest.writeValue(isCompleted);
        dest.writeValue(playable);
        dest.writeValue(errorMessage);
        dest.writeValue(ccFileUrl);
        dest.writeValue(ageRestricted);
        dest.writeValue(hds);
        dest.writeValue(ads);
        dest.writeValue(manifest);
        dest.writeValue(mast);
        dest.writeValue(time);
        dest.writeValue(percentage);
        dest.writeValue(views);
        dest.writeValue(comments);
        dest.writeValue(shares);
        dest.writeList(notes);
        dest.writeValue(status);
        dest.writeValue(syndicationPartner);
        dest.writeValue(bumperUrl);
        dest.writeValue(embed);
        dest.writeValue(huluId);
        dest.writeValue(seasons);
        dest.writeValue(episode);
        dest.writeValue(episodeNumber);
        dest.writeValue(seasonNumber);
        dest.writeValue(season);
        dest.writeValue(isFree);
        dest.writeValue(scheduling);
        dest.writeValue(disableLivePlayer);
        dest.writeValue(professors);
        dest.writeValue(yTVideoId);
        dest.writeValue(fBVideoId);
        dest.writeValue(rating);
        dest.writeValue(creditBlocks);
        dest.writeValue(kisweEventId);
        dest.writeValue(hd);
        dest.writeValue(free);
        dest.writeValue(playerTags);
        dest.writeValue(featuredTag);
        dest.writeValue(viewerGrade);
        dest.writeValue(yourGrade);
        dest.writeValue(filmType);
        dest.writeValue(trailerUrl);
        dest.writeValue(startTime);
        dest.writeValue(endTime);
        dest.writeValue(clipUrl);
        dest.writeValue(mp4Url);
        dest.writeValue(hlsUrl);
        dest.writeValue(dfpTag);
        dest.writeValue(contentType);
        dest.writeValue(noOfSeasons);
        dest.writeValue(closedCaptions);
        dest.writeValue(showTitle);
        dest.writeValue(showId);
        dest.writeValue(relatedCourses);
        dest.writeValue(socialWidgets);
        dest.writeValue(externalLink);
        dest.writeValue(noOfEpisodes);
    }

    public int describeContents() {
        return  0;
    }

}
