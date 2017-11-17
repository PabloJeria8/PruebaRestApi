package com.example.pablojeria.pruebarestapi.background;

import android.os.AsyncTask;

import com.example.pablojeria.pruebarestapi.models.Restaurant;
import com.example.pablojeria.pruebarestapi.models.RestaurantContainer;
import com.example.pablojeria.pruebarestapi.models.RestaurantsWrapper;
import com.example.pablojeria.pruebarestapi.network.GetRestaurant;
import com.example.pablojeria.pruebarestapi.network.RestaurantInterceptor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by pablojeria on 15-11-17.
 */

public class GetDataRestaurant extends AsyncTask<Void, Void, List<Restaurant>> {


    @Override
    protected List<Restaurant> doInBackground(Void... voids) {

        GetRestaurant request =  new RestaurantInterceptor().get();
        Call<RestaurantsWrapper> call = request.get(10);

        List<Restaurant> restaurants = new ArrayList<>();

        try {
            Response<RestaurantsWrapper> response = call.execute();
            if (200 == response.code() && response.isSuccessful()) {
                RestaurantsWrapper wrapper = response.body();
                    if (wrapper != null) {
                        RestaurantContainer[] container = wrapper.getCollections();
                        if (container != null && container.length > 0) {
                            for (RestaurantContainer contain : container) {
                                restaurants.add(contain.getCollection());
                            }
                        }
                    }
                }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return restaurants;
    }



}
