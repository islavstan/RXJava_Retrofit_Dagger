package com.islavstan.myrxdaggerapp.networking;

import com.islavstan.myrxdaggerapp.models.CityListResponse;

import retrofit2.http.GET;
import rx.Observable;


public interface NetworkService {

    @GET("v1/city")
    Observable<CityListResponse> getCityList();

}
