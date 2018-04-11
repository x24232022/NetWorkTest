package netWork;



import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import server.entity.Book;


/**
 * Created by Administrator on 2018/4/10 0010.
 */

public interface RetrofitApi {
    @GET("book/search")
    Observable<Book> getSearchBooks(@Query("q") String name,
                                    @Query("tag") String tag,
                                    @Query("start") int start,
                                    @Query("count") int count);

}
