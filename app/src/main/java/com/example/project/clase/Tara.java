package com.example.project.clase;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Tara implements Parcelable{
    private String denumire;
    private String continent;
    private Moneda monede;


    public Tara(String denumire, String continent, Moneda monede) {
        this.denumire = denumire;
        this.continent = continent;
        this.monede = monede;
    }



    protected Tara(Parcel in) {
        denumire = in.readString();
        continent = in.readString();
        monede = in.readParcelable(Moneda.class.getClassLoader());
    }

    public static final Creator<Tara> CREATOR = new Creator<Tara>() {
        @Override
        public Tara createFromParcel(Parcel in) {
            return new Tara(in);
        }

        @Override
        public Tara[] newArray(int size) {
            return new Tara[size];
        }
    };

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Moneda getMonede() {
        return monede;
    }

    public void setMonede(Moneda monede) {
        this.monede = monede;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(denumire);
        dest.writeString(continent);
        dest.writeParcelable(monede, flags);
    }




    @Override
    public String toString() {
        return "Tara{" +
                "denumire='" + denumire + '\'' +
                ", continent='" + continent + '\'' +
                ", monede=" + monede +
                '}';
    }
}

