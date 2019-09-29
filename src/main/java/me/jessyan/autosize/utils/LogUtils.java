//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package me.jessyan.autosize.utils;

import android.util.Log;

public class LogUtils {
    private static final String TAG = "AndroidAutoSize";
    private static boolean debug;

    private LogUtils() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    public static boolean isDebug() {
        return debug;
    }

    public static void setDebug(boolean debug) {
        LogUtils.debug = debug;
    }

    public static void d(String message) {
        if (debug) {
            Log.d("AndroidAutoSize", message);
        }

    }

    public static void w(String message) {
        if (debug) {
            Log.w("AndroidAutoSize", message);
        }

    }

    public static void e(String message) {
        if (debug) {
            Log.e("AndroidAutoSize", message);
        }

    }
}
