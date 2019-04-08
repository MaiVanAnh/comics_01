package com.sun_asterisk.comics_01.data.source.local;

import com.sun_asterisk.comics_01.data.datasource.ComicDataSource;

public class ComicLocalDatasource implements ComicDataSource.LocalDataSource {
    private static ComicLocalDatasource sInstance;

    public static ComicLocalDatasource getsInstance() {
        if (sInstance == null) {
            sInstance = new ComicLocalDatasource();
        }
        return sInstance;
    }
}
