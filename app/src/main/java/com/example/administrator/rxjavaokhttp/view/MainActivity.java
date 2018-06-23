package com.example.administrator.rxjavaokhttp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.rxjavaokhttp.R;
import com.example.administrator.rxjavaokhttp.contract.EntityContract;
import com.example.administrator.rxjavaokhttp.presenter.EntityPresenter;

public class MainActivity extends AppCompatActivity implements EntityContract.View {

    private TextView textView;
    private EntityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        presenter = new EntityPresenter(this);
        presenter.getUser();
    }

    @Override
    public void showData() {


    }
}
