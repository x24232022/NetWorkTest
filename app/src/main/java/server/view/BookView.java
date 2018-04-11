package server.view;


import com.hannesdorfmann.mosby.mvp.MvpView;

import server.entity.Book;
import server.entity.NewsBean;

/**
 * Created by Administrator on 2018/4/8 0008.
 */

public interface BookView extends MvpView {
    //请求成功返回实体类
    void onSuccess(Book book);
    //返回失败Toast信息
    void onErrod(String result);

    void onSuccess(NewsBean bean);
}
