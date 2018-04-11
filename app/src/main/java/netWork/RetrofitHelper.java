package netWork;

import android.content.Context;
import android.util.Log;

import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;


import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2018/4/10 0010.
 */

public class RetrofitHelper {
    private static Context context;

    private static RetrofitHelper mHelper = null;

    private OkHttpClient mOkHttpClient;

    public RetrofitHelper(Context context) {
        this.context=context;



    }

    public Retrofit createRetrofit(String baseUrl) {
        HttpLoggingInterceptor.Level mLevel = HttpLoggingInterceptor.Level.BODY;
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {

            @Override
            public void log(String message) {
                Log.i("HttpManager", message);
            }
        });
        loggingInterceptor.setLevel(mLevel);
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .readTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(9, TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor);
        mOkHttpClient = builder.build();
        return new Retrofit.Builder().baseUrl(baseUrl)
                .client(mOkHttpClient)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }




    public static synchronized RetrofitHelper getInstances(Context context) {
        if (mHelper == null) {
            mHelper = new RetrofitHelper(context);
        }

        return mHelper;
    }


}
