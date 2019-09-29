//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package me.jessyan.autosize.utils;

import android.content.Context;
import android.util.TypedValue;

public class AutoSizeUtils {
    private AutoSizeUtils() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    public static int dp2px(Context context, float value) {
        return (int)(TypedValue.applyDimension(1, value, context.getResources().getDisplayMetrics()) + 0.5F);
    }

    public static int sp2px(Context context, float value) {
        return (int)(TypedValue.applyDimension(2, value, context.getResources().getDisplayMetrics()) + 0.5F);
    }

    public static int pt2px(Context context, float value) {
        return (int)(TypedValue.applyDimension(3, value, context.getResources().getDisplayMetrics()) + 0.5F);
    }

    public static int in2px(Context context, float value) {
        return (int)(TypedValue.applyDimension(4, value, context.getResources().getDisplayMetrics()) + 0.5F);
    }

    public static int mm2px(Context context, float value) {
        return (int)(TypedValue.applyDimension(5, value, context.getResources().getDisplayMetrics()) + 0.5F);
    }
}
