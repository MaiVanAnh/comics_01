package com.sun_asterisk.comics_01.data.datasource;

import com.sun_asterisk.comics_01.data.model.Comic;
import com.sun_asterisk.comics_01.data.source.remote.OnFetchDataJsonListener;

public interface ComicDataSource {

    interface LocalDataSource {
    }

    interface RemoteDataSource {
        void getData(OnFetchDataJsonListener<Comic> listener);
    }
}
