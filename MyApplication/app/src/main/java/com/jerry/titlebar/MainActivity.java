package com.jerry.titlebar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.jerry.titlebar.view.TitleBar;

public class MainActivity extends AppCompatActivity implements TitleBar.IconOnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TitleBar titleBar = (TitleBar) findViewById(R.id.tb_main);
        titleBar.setIconOnClickListener(this);
    }

    @Override
    public void searchClick() {
        Toast.makeText(this, "搜索", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void backClick()
    {
        Toast.makeText(this, "返回", Toast.LENGTH_SHORT).show();
        finish();
    }

    @Override
    public void addClick()
    {
        Toast.makeText(this, "添加", Toast.LENGTH_SHORT).show();
    }
}
