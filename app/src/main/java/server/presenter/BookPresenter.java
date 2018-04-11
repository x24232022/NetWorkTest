package server.presenter;

import android.content.Context;


import com.google.gson.Gson;
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;


import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import netWork.RetrofitApi;
import netWork.RetrofitHelper;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import retrofit2.Retrofit;

import server.entity.Book;
import server.entity.NewsBean;
import server.entity.RequestBean;
import server.view.BookView;

/**
 * Created by Administrator on 2018/4/9 0009.
 */

public class BookPresenter extends MvpBasePresenter<BookView> {

    CompositeDisposable mCompositeDisposable;
    private Context mContext;
    private Book mBook;
    private NewsBean mNewsBean;


    public BookPresenter(Context context) {
        mContext = context;
        mCompositeDisposable =new CompositeDisposable();//存放Rxjava中的订阅关系的容器
    }
    public void getSearchBooks(String name,String tag,int start,int count){
        Retrofit retrofit= RetrofitHelper.getInstances(mContext).createRetrofit("https://api.douban.com/v2/");//传入url
        RetrofitApi api=retrofit.create(RetrofitApi.class);//传入Api
        Observable<Book> observable=api.getSearchBooks(name,tag,start,count);//传入参数
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Book>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        mCompositeDisposable.add(d);//将订阅关系存放到容器
                    }

                    @Override
                    public void onNext(Book book) {
                        mBook=book;//将获取的book类挂在到view上
                    }

                    @Override
                    public void onError(Throwable e) {
                        getView().onErrod("请求失败");
                    }

                    @Override
                    public void onComplete() {
                        getView().onSuccess(mBook);
                    }
                });


    }

    public void getNews(String type,String key){
        Retrofit retrofit =RetrofitHelper.getInstances(mContext).createRetrofit("http://v.juhe.cn/toutiao/");
        RetrofitApi api=retrofit.create(RetrofitApi.class);
        Observable<NewsBean> observable=api.getNews(type,key);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<NewsBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        mCompositeDisposable.add(d);
                    }

                    @Override
                    public void onNext(NewsBean newsBean) {
                        mNewsBean=newsBean;
                    }


                    @Override
                    public void onError(Throwable e) {
                        getView().onErrod("请求失败");
                    }

                    @Override
                    public void onComplete() {
                        getView().onSuccess(mNewsBean);
                    }
                });

    }

        //传递Json数据
//    public void getNewData(RequestBean bean){
//
//        Retrofit retrofit =RetrofitHelper.getInstances(mContext).createRetrofit("http://v.juhe.cn/toutiao/");
//        RetrofitApi api=retrofit.create(RetrofitApi.class);
//        Gson  gson=new Gson();
//        String requstBody=gson.toJson(bean);
//
//        RequestBody body=RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"),requstBody);
//        Observable<NewsBean> observable=api.getNewsData(body);
//        observable.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<NewsBean>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        mCompositeDisposable.add(d);
//                    }
//
//                    @Override
//                    public void onNext(NewsBean newsBean) {
//                        mNewsBean=newsBean;
//                    }
//
//
//                    @Override
//                    public void onError(Throwable e) {
//                        getView().onErrod("请求失败");
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        getView().onSuccess(mNewsBean);
//                    }
//                });
//
//
//
//    }


    public void getNewData(String type,String key){

        Retrofit retrofit =RetrofitHelper.getInstances(mContext).createRetrofit("http://v.juhe.cn/toutiao/");
        RetrofitApi api=retrofit.create(RetrofitApi.class);
        RequestBody body= new FormBody.Builder()
                .add("type",type)
                .add("key",key)
                .build();


        Observable<NewsBean> observable=api.getNewsData(body);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<NewsBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        mCompositeDisposable.add(d);
                    }

                    @Override
                    public void onNext(NewsBean newsBean) {
                        mNewsBean=newsBean;
                    }


                    @Override
                    public void onError(Throwable e) {
                        getView().onErrod("请求失败");
                    }

                    @Override
                    public void onComplete() {
                        getView().onSuccess(mNewsBean);
                    }
                });




    }



    //销毁Rxjava的订阅关系
    public void destroySubscription(){
        if (mCompositeDisposable!=null){
            mCompositeDisposable.clear();
        }
    }
}
