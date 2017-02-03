package com.islavstan.myrxdaggerapp.home;

import com.islavstan.myrxdaggerapp.models.CityListResponse;


public interface HomeView {
    void showWait();

    void removeWait();

    void onFailure(String appErrorMessage);

    void getityListSuccess(CityListResponse cityListResponse);

}
