package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Author my
 * Created by Administrator on 2019-12-3
 */
public class Forecast {

    public String date;
    @SerializedName("tmp")
    public TemPerature temPerature;
    @SerializedName("cond")
    public More more;

    public class TemPerature{

        public String max;
        public String min;

    }

    public class More{

        @SerializedName("txt_d")
        public String info;

    }

}
