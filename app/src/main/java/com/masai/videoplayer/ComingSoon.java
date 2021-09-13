package com.masai.videoplayer;




import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


    public class ComingSoon implements Serializable
    {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("year")
        @Expose
        private String year;
        @SerializedName("contentRating")
        @Expose
        private String contentRating;
        @SerializedName("duration")
        @Expose
        private String duration;
        @SerializedName("releaseDate")
        @Expose
        private String releaseDate;
        @SerializedName("averageRating")
        @Expose
        private Integer averageRating;
        @SerializedName("originalTitle")
        @Expose
        private String originalTitle;
        @SerializedName("storyline")
        @Expose
        private String storyline;
        @SerializedName("imdbRating")
        @Expose
        private String imdbRating;
        @SerializedName("posterurl")
        @Expose
        private String posterurl;
        @SerializedName("video_url")
        @Expose
        private String videoUrl;
        private final static long serialVersionUID = 9137873612017644598L;

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

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getContentRating() {
            return contentRating;
        }

        public void setContentRating(String contentRating) {
            this.contentRating = contentRating;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public Integer getAverageRating() {
            return averageRating;
        }

        public void setAverageRating(Integer averageRating) {
            this.averageRating = averageRating;
        }

        public String getOriginalTitle() {
            return originalTitle;
        }

        public void setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
        }

        public String getStoryline() {
            return storyline;
        }

        public void setStoryline(String storyline) {
            this.storyline = storyline;
        }

        public String getImdbRating() {
            return imdbRating;
        }

        public void setImdbRating(String imdbRating) {
            this.imdbRating = imdbRating;
        }

        public String getPosterurl() {
            return posterurl;
        }

        public void setPosterurl(String posterurl) {
            this.posterurl = posterurl;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

    }

