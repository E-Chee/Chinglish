package com.example.evan.languageapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by per6 on 5/17/18.
 */

public class Gamecard implements Parcelable {

    private String primary;
    private String translation;


    public Gamecard(){
        super();
    }

    public Gamecard(Parcel parcel){
        this.primary = parcel.readString();
        this.translation = parcel.readString();
    }


    public Gamecard(String primary, String translation) {
        this.primary = primary;
        this.translation = translation;
    }


    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }



    //Parcelable Stuff
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.primary);
        parcel.writeString(this.translation);
    }

    public static final Parcelable.Creator<Gamecard> CREATOR = new Parcelable.Creator<Gamecard>() {
        @Override
        public Gamecard createFromParcel(Parcel parcel) {
            return new Gamecard(parcel);
        }

        @Override
        public Gamecard[] newArray(int i) {
            return new Gamecard[i];
        }
    };


}
