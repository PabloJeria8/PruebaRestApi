package com.example.pablojeria.pruebarestapi.background;

import android.os.AsyncTask;
import android.util.Log;

import com.example.pablojeria.pruebarestapi.models.Restaurant;
import com.example.pablojeria.pruebarestapi.network.GetRestaurant;
import com.example.pablojeria.pruebarestapi.network.RestaurantInterceptor;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by pablojeria on 15-11-17.
 */

public class GetDataRestaurant extends AsyncTask<Void, Void, Restaurant> {


    @Override
    protected Restaurant doInBackground(Void... voids) {

        GetRestaurant request =  new RestaurantInterceptor().get();
        Call<Restaurant> call = request.get(10);

        Restaurant list = new Restaurant();

        try {
            Response<Restaurant> response = call.execute();

            if (200 == response.code() && response.isSuccessful()) {

                    list = response.body();

                    Log.d("PJMLIST", String.valueOf(list.getCollections()));

                }

        } catch (IOException e) {
            e.printStackTrace();
        }


        Log.d("PJMLIST2", String.valueOf(list));
        return list;
    }



}
