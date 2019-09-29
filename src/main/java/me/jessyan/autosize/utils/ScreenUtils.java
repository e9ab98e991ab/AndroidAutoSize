//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package me.jessyan.autosize.utils;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class ScreenUtils {
    public ScreenUtils() {
    }

    public static int getStatusBarHeight() {
        int result = 0;

        try {
            int resourceId = Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android");
            if (resourceId > 0) {
                result = Resources.getSystem().getDimensionPixelSize(resourceId);
            }
        } catch (NotFoundException var2) {
            var2.printStackTrace();
        }

        return result;
    }

    public static int[] getScreenSize(Context context) {
        int[] size = new int[2];
        WindowManager w = (WindowManager)context.getSystemService("window");
        Display d = w.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        d.getMetrics(metrics);
        int widthPixels = metrics.widthPixels;
        int heightPixels = metrics.heightPixels;
        if (VERSION.SDK_INT >= 14 && VERSION.SDK_INT < 17) {
            try {
                widthPixels = (Integer)Display.class.getMethod("getRawWidth").invoke(d);
                heightPixels = (Integer)Display.class.getMethod("getRawHeight").invoke(d);
            } catch (Exception var9) {
            }
        }

        if (VERSION.SDK_INT >= 17) {
            try {
                Point realSize = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(d, realSize);
                widthPixels = realSize.x;
                heightPixels = realSize.y;
            } catch (Exception var8) {
            }
        }

        size[0] = widthPixels;
        size[1] = heightPixels;
        return size;
    }

    public static int getHeightOfNavigationBar(Context context) {
        Display d = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        int realHeight = getScreenSize(context)[1];
        DisplayMetrics displayMetrics = new DisplayMetrics();
        d.getMetrics(displayMetrics);
        int displayHeight = displayMetrics.heightPixels;
        return realHeight - displayHeight;
    }
}
