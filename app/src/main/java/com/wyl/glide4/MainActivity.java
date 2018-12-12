package com.wyl.glide4;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.wyl.glide4.databinding.ActivityMainBinding;


/**
 * 时间：2018/12/12 0012 22:45
 * 描述：Glide4基本使用
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 * @author WangYoule
 * @qq 270628297
 */
public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    private ImageLoader imageLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        imageLoader = ImageLoader.getInstance();


    }


    public void loadImage(View view) {
        String url = "http://guolin.tech/book.png";
        imageLoader.loadImage(binding.imageView, url, R.drawable.ic_launcher, R.drawable.ic_launcher);
    }
}
