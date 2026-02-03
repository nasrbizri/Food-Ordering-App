package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Locale;

public class language {

    public static void changeLanguageAndNavigate(Activity activity, String languageCode, Class<?> destinationActivity) {
        setLocale(activity, languageCode);
        navigateToActivity(activity, destinationActivity);
    }

    private static void setLocale(Activity activity, String languageCode) {
        Locale locale = new Locale(languageCode);
        Locale.setDefault(locale);

        Configuration configuration = new Configuration();
        configuration.setLocale(locale);

        Resources resources = activity.getResources();
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    private static void navigateToActivity(Activity activity, Class<?> destinationActivity) {
        Intent intent = new Intent(activity, destinationActivity);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
        activity.finish();
    }
}
