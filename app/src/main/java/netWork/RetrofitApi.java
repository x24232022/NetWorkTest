package netWork;





import io.reactivex.Observable;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Field;

import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import server.entity.Book;
import server.entity.NewsBean;
import server.entity.RequestBean;


/**
 * Created by Administrator on 2018/4/10 0010.
 */

public interface RetrofitApi {
    @GET("book/search")
    Observable<Book> getSearchBooks(@Query("q") String name,
                                    @Query("tag") String tag,
                                    @Query("start") int start,
                                    @Query("count") int count);

    //多参数post提交的两种方式

    @FormUrlEncoded
    @POST("index")
    Observable<NewsBean> getNews(@Field("type") String type,
                                 @Field("key") String key);

    @POST("index")
    Observable<NewsBean> getNewsData(@Body RequestBody body);
    //用于传递Json数据
//    @Headers({"Content-Type: application/json","Accept: application/json"})
//    @POST("index")
//    Observable<NewsBean> getNewsData(@Body RequestBody body);



}
