package ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;

import com.example.administrator.networktest.R;
import com.hannesdorfmann.mosby.mvp.MvpActivity;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import server.entity.Book;
import server.entity.NewsBean;
import server.entity.RequestBean;
import server.presenter.BookPresenter;
import server.view.BookView;

public class MainActivity extends MvpActivity<BookView, BookPresenter> implements BookView {


    @BindView(R.id.Get_button)
    Button mGetButton;
    @BindView(R.id.Post_button)
    Button mPostButton;
    @BindView(R.id.button)
    Button mButton;
    private BookPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mGetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.getSearchBooks("金瓶梅", null, 0, 1);
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
        mPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.getNews("shehui", "9398ab53c96408b94f9def1a4a1cc5e6");
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.getNewData("shehui","9398ab53c96408b94f9def1a4a1cc5e6");
                startActivity(new Intent(MainActivity.this, SecondActivity.class));

            }
        });
    }

    @NonNull
    @Override
    public BookPresenter createPresenter() {
        mPresenter = new BookPresenter(MainActivity.this);
        return mPresenter;
    }


    @Override
    public void onSuccess(Book book) {
        EventBus.getDefault().post(book);
    }


    @Override
    public void onErrod(String result) {

    }

    @Override
    public void onSuccess(NewsBean bean) {
        EventBus.getDefault().post(bean);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        mPresenter.destroySubscription();
    }
}
