package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by BenWhite on 2017/1/23.
 */

public class Now {

    @SerializedName("tmp")
    public String temprature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
