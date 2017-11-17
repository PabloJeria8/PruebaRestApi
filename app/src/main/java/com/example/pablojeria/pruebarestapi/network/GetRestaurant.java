package com.example.pablojeria.pruebarestapi.network;

import com.example.pablojeria.pruebarestapi.models.RestaurantsWrapper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by pablojeria on 15-11-17.
 */

public interface GetRestaurant {

    @GET("collections?city_id=83&lat=-33.440914&lon=-70.653654&count=10")
    Call<RestaurantsWrapper> get(@Query("count") int count);

}
