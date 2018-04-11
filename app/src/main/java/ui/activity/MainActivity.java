package ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.networktest.R;
import com.hannesdorfmann.mosby.mvp.MvpActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import server.entity.Book;
import server.presenter.BookPresenter;
import server.view.BookView;

public class MainActivity extends MvpActivity<BookView, BookPresenter> implements BookView, View.OnClickListener {
    @BindView(R.id.text)
    TextView mText;
    @BindView(R.id.button)
    Button mButton;
    private BookPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mButton.setOnClickListener(this);
    }

    @NonNull
    @Override
    public BookPresenter createPresenter() {
        mPresenter = new BookPresenter(MainActivity.this);
        return mPresenter;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button:
                mPresenter.getSearchBooks("金瓶梅",null,0,1);

                break;
            default:
                break;
        }
    }


    @Override
    public void onSuccess(Book book) {
        mText.setText(book.getBooks().toString());
    }

    @Override
    public void onErrod(String result) {

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.destroySubscription();
    }
}
