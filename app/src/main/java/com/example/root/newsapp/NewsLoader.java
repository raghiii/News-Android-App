package com.example.root.newsapp;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    private String url;

    NewsLoader(Context context, String u) {
        super(context);
        url = u;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        return QueryUtils.fetchNewsData(url);
    }
}
