package net.dkr.freelancing;

import net.dkr.freelancing.auth.AllURL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestSingleTon {
    private static Retrofit retrofit;

    private RestSingleTon() {

    }

    public static synchronized Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(AllURL.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
