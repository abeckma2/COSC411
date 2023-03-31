package com.example.cosc411project;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class RealmDb extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);

        RealmConfiguration config =
                new RealmConfiguration.Builder()

                        .allowWritesOnUiThread(true)
                        .deleteRealmIfMigrationNeeded()
                        .build();
        Realm.setDefaultConfiguration(config);
    }
}