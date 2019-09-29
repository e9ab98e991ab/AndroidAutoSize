//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package me.jessyan.autosize.external;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.jessyan.autosize.utils.Preconditions;

public class ExternalAdaptManager {
    private List<String> mCancelAdaptList;
    private Map<String, ExternalAdaptInfo> mExternalAdaptInfos;
    private boolean isRun;

    public ExternalAdaptManager() {
    }

    public synchronized ExternalAdaptManager addCancelAdaptOfActivity(Class<?> activityClass) {
        Preconditions.checkNotNull(activityClass, "activityClass == null");
        if (!this.isRun) {
            this.isRun = true;
        }

        if (this.mCancelAdaptList == null) {
            this.mCancelAdaptList = new ArrayList();
        }

        this.mCancelAdaptList.add(activityClass.getCanonicalName());
        return this;
    }

    public synchronized ExternalAdaptManager addExternalAdaptInfoOfActivity(Class<?> activityClass, ExternalAdaptInfo info) {
        Preconditions.checkNotNull(activityClass, "activityClass == null");
        if (!this.isRun) {
            this.isRun = true;
        }

        if (this.mExternalAdaptInfos == null) {
            this.mExternalAdaptInfos = new HashMap(16);
        }

        this.mExternalAdaptInfos.put(activityClass.getCanonicalName(), info);
        return this;
    }

    public synchronized boolean isCancelAdapt(Class<?> activityClass) {
        Preconditions.checkNotNull(activityClass, "activityClass == null");
        return this.mCancelAdaptList == null ? false : this.mCancelAdaptList.contains(activityClass.getCanonicalName());
    }

    public synchronized ExternalAdaptInfo getExternalAdaptInfoOfActivity(Class<?> activityClass) {
        Preconditions.checkNotNull(activityClass, "activityClass == null");
        return this.mExternalAdaptInfos == null ? null : (ExternalAdaptInfo)this.mExternalAdaptInfos.get(activityClass.getCanonicalName());
    }

    public boolean isRun() {
        return this.isRun;
    }

    public void setRun(boolean run) {
        this.isRun = run;
    }
}
