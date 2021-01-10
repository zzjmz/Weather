package com.weather.android.logic.network;

import com.weather.android.WeatherApplication;
import com.weather.android.logic.model.PlaceResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PlaceService {
    @GET("v2/place?token="+ WeatherApplication.TOKEN+"&lang=zh_CN")
    Call<PlaceResponse> searchPlaces(@Query("query") String query);
}
