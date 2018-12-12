package com.wyl.glide4;

import android.support.annotation.DrawableRes;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

/**
 * 时间：2018/12/12 0012 22:59
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 * @author WangYoule
 * @qq 270628297
 */
public class ImageLoader {
    private static final ImageLoader ourInstance = new ImageLoader();

    public static ImageLoader getInstance() {
        return ourInstance;
    }

    private ImageLoader() {
    }

    public void loadImage(ImageView imageView, String url, @DrawableRes int placeholder, @DrawableRes int error) {
        if (imageView == null) {
            return;
        }

        RequestOptions options = new RequestOptions()
                .placeholder(placeholder)
                .error(error)
                .circleCrop()
                .diskCacheStrategy(DiskCacheStrategy.NONE);

        Glide.with(imageView.getContext())
                .load(url)
                .apply(options)
                .into(imageView);


    }
}
