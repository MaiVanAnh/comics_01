package com.sun_asterisk.comics_01.data.source.remote.fetchjson;

import android.os.AsyncTask;
import com.sun_asterisk.comics_01.data.model.Comic;
import com.sun_asterisk.comics_01.data.source.remote.OnFetchDataJsonListener;

public class GetJsonFromUrl extends AsyncTask<String, Void, String> {
    private OnFetchDataJsonListener<Comic> mListener;

    public GetJsonFromUrl(OnFetchDataJsonListener<Comic> listener) {
        mListener = listener;
    }

    @Override
    protected String doInBackground(String... strings) {
        String data = "";

        try {
            ParseDataWithJson parseDataWithJson = new ParseDataWithJson();
            data = parseDataWithJson.getJsonFromUrl(strings[0]);
        } catch (Exception e) {
            mListener.onError(e);
        }

        return data;
    }

    @Override
    protected void onPostExecute(String data) {
        super.onPostExecute(data);
        if (data != null) {
            mListener.onSuccess(
                    new ParseDataWithJson().parseJsonStringOriginToDataObjectList(data));
        }
    }
}
