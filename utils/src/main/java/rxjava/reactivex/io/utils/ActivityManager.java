package rxjava.reactivex.io.utils;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

public class ActivityManager {

    public static List<Activity> list = new ArrayList<Activity>();

    public static void addActivity(Activity activity){
        list.add(activity);
    }

    public static void removeActivity(Activity activity){
        list.remove(activity);
    }

    public static void finish(){

        for (Activity activity : list) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }

    }

}