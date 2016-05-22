package id.kido1611.googleanalytics;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by Ahmad on 5/21/2016.
 */
public class MainApplication extends Application {

    private Tracker mTracker;

    synchronized public Tracker getTracker(){
        if(mTracker==null){
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
            mTracker = analytics.newTracker(R.xml.global_tracker);
        }
        return mTracker;
    }
}
