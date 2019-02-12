package com.example.week6day1;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    String name;
    String favBook;
    String favMovie;

    public User(String name, String favBook, String favMovie) {
        this.name = name;
        this.favBook = favBook;
        this.favMovie = favMovie;
    }

    public User() {
    }

    protected User(Parcel in) {
        name = in.readString();
        favBook = in.readString();
        favMovie = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavBook() {
        return favBook;
    }

    public void setFavBook(String favBook) {
        this.favBook = favBook;
    }

    public String getFavMovie() {
        return favMovie;
    }

    public void setFavMovie(String favMovie) {
        this.favMovie = favMovie;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(favBook);
        dest.writeString(favMovie);
    }
}
