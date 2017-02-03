package com.islavstan.myrxdaggerapp.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

//генерирует типы Java из JSON-схемы (или, например, JSON) и может аннотировать эти типы для связывания данных
public class CityListResponse {

    //http://ru.stackoverflow.com/questions/482311/retrofit-%D0%B2%D1%81%D0%B5-%D0%B2%D1%80%D0%B5%D0%BC%D1%8F-failure
  /*  Expose это аннотация из библиотеки GSon. Данной аннотацией обозначаются поля,
    которые должны быть сериализованы/десериализованны. Однако это работает если объект Gson был создан с помощью билдера*/


    @SerializedName("data")

    private List<CityListData> data = new ArrayList<CityListData>();
    @SerializedName("message")

    private String message;
    @SerializedName("status")

    private int status;


    public List<CityListData> getData() {
        return data;
    }


    public void setData(List<CityListData> data) {
        this.data = data;
    }


    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public int getStatus() {
        return status;
    }


    public void setStatus(int status) {
        this.status = status;
    }

}