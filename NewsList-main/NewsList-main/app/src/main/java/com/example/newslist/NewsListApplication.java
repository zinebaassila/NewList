package com.example.newslist;

import android.app.Application;
    public class NewsListApplication extends Application {
        private String membre;
        @Override
        public void onCreate() {
            super.onCreate();
            this.membre = null;
        }

        public String getMembre() {
            return membre;
        }

        public void setMembre(String membre) {
            this.membre = membre;
        }

    }

