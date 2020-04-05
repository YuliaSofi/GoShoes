package com.example.goshoes.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Detail implements Parcelable {
    private static String gambarSepatu;
    private String namaSepatu;
    private String ukuranSepatu;
    private String hargaSepatu;
    private String bahanSepatu;

    public String namaSepatu() {
        return namaSepatu;
    }

    public void setNamaSepatu(String namaSepatu) {
        this.namaSepatu = namaSepatu;
    }

    public String getUkuranSepatu() {
        return ukuranSepatu;
    }

    public void setUkuranSepatu(String ukuranSepatu) {
        this.ukuranSepatu = ukuranSepatu;
    }

    public String getHargaSepatu() {
        return hargaSepatu;
    }

    public void setHargaSepatu(String hargaSepatu) {
        this.hargaSepatu = hargaSepatu;
    }

    public String getBahanSepatu() {
        return bahanSepatu;
    }

    public void setBahanSepatu(String bahanSepatu) {
        this.bahanSepatu = bahanSepatu;
    }

    public static String getGambarSepatu() { return gambarSepatu;}

    public void setGambarSepatu(String gambarSepatu) {
        this.gambarSepatu = gambarSepatu;
    }

    public Detail() {
    }

    protected Detail(Parcel in) {
        namaSepatu = in.readString();
        ukuranSepatu = in.readString();
        hargaSepatu = in.readString();
        bahanSepatu = in.readString();
        gambarSepatu = in.readString();
    }

    public static final Creator<Detail> CREATOR = new Creator<Detail>() {
        @Override
        public Detail createFromParcel(Parcel in) {
            return new Detail(in);
        }

        @Override
        public Detail[] newArray(int size) {
            return new Detail[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
       parcel.writeString(namaSepatu);
       parcel.writeString(ukuranSepatu);
       parcel.writeString(hargaSepatu);
       parcel.writeString(bahanSepatu);
       parcel.writeString(gambarSepatu);
    }
}
