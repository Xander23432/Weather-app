package com.example.android.sunshine.sync;

import android.app.IntentService;
import android.content.Intent;

public class SunshineSyncIntentService extends IntentService {

    // Create a constructor that calls super and passes the name of this class
    public SunshineSyncIntentService() {
        super("SunshineSyncIntentService");
    }

    // Override onHandleIntent, and within it, call SunshineSyncTask.syncWeather
    @Override
    protected void onHandleIntent(Intent intent) {
        SunshineSyncTask.syncWeather(this);
    }
}

