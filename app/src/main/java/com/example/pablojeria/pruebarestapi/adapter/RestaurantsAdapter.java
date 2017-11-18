package com.example.pablojeria.pruebarestapi.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pablojeria.pruebarestapi.R;
import com.example.pablojeria.pruebarestapi.models.Restaurant;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pablojeria on 18-11-17.
 */

public class RestaurantsAdapter extends RecyclerView.Adapter<RestaurantsAdapter.ViewHolder>{

    private List<Restaurant> restaurantList = new ArrayList<>();

    public RestaurantsAdapter() {
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Restaurant restaurant = restaurantList.get(position);

        ImageView photo = holder.restaurantPhoto;

        Picasso.with(photo.getContext()).load(restaurant.getImage_url()).centerCrop().fit().into(photo);

        holder.titleTv.setText(restaurant.getTitle());

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_restaurant, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    public void update(List<Restaurant> restaurants) {
        restaurantList.addAll(restaurants);
        notifyDataSetChanged();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView restaurantPhoto;
        private TextView titleTv;
        private TextView urlTv;

        public ViewHolder(View itemView) {
            super(itemView);

            restaurantPhoto = (ImageView) itemView.findViewById(R.id.restaurantPhotoIv);
            titleTv = (TextView) itemView.findViewById(R.id.titleTv);
            urlTv = (TextView) itemView.findViewById(R.id.urlTv);

        }
    }
}