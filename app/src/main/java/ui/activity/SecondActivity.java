package ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.networktest.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import server.entity.Book;
import server.entity.NewsBean;

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.secondText)
    TextView mSecondText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        EventBus.getDefault().register(this);

    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void show(NewsBean newsBean){
        mSecondText.setText(newsBean.getResult().getData().get(1).toString());
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void show(Book book){
        mSecondText.setText(book.getBooks().toString());
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
