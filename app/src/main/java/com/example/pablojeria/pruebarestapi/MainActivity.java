package com.example.pablojeria.pruebarestapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.pablojeria.pruebarestapi.background.GetDataRestaurant;
import com.example.pablojeria.pruebarestapi.models.Restaurant;
import com.example.pablojeria.pruebarestapi.models.RestaurantsWrapper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<RestaurantsWrapper> example = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        new GetRestaurants().execute();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class GetRestaurants extends GetDataRestaurant {

        @Override
        protected void onPostExecute(List<Restaurant> restaurants) {
            //TODO this loop if for demostration only, deleted and then put the data wherever you want to
            for (Restaurant restaurant : restaurants) {
                Log.d("RESTAURANT", "title: " + restaurant.getTitle());
            }
        }
    }
}
