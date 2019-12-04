package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Author my
 * Created by Administrator on 2019-12-3
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;

    }

    public class CarWash{

        @SerializedName("txt")
        public String info;

    }

    public class Sport{

        @SerializedName("txt")
        public String info;

    }

}
