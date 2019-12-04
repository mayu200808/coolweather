package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Author my
 * Created by Administrator on 2019-12-3
 */
public class Basic {

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }

}
