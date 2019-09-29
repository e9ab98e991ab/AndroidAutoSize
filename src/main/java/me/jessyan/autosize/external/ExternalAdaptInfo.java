//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package me.jessyan.autosize.external;

import android.os.Parcel;
import android.os.Parcelable;

public class ExternalAdaptInfo implements Parcelable {
    private boolean isBaseOnWidth;
    private float sizeInDp;
    public static final Creator<ExternalAdaptInfo> CREATOR = new Creator<ExternalAdaptInfo>() {
        public ExternalAdaptInfo createFromParcel(Parcel source) {
            return new ExternalAdaptInfo(source);
        }

        public ExternalAdaptInfo[] newArray(int size) {
            return new ExternalAdaptInfo[size];
        }
    };

    public ExternalAdaptInfo(boolean isBaseOnWidth) {
        this.isBaseOnWidth = isBaseOnWidth;
    }

    public ExternalAdaptInfo(boolean isBaseOnWidth, float sizeInDp) {
        this.isBaseOnWidth = isBaseOnWidth;
        this.sizeInDp = sizeInDp;
    }

    public boolean isBaseOnWidth() {
        return this.isBaseOnWidth;
    }

    public void setBaseOnWidth(boolean baseOnWidth) {
        this.isBaseOnWidth = baseOnWidth;
    }

    public float getSizeInDp() {
        return this.sizeInDp;
    }

    public void setSizeInDp(float sizeInDp) {
        this.sizeInDp = sizeInDp;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte)(this.isBaseOnWidth ? 1 : 0));
        dest.writeFloat(this.sizeInDp);
    }

    protected ExternalAdaptInfo(Parcel in) {
        this.isBaseOnWidth = in.readByte() != 0;
        this.sizeInDp = in.readFloat();
    }

    public String toString() {
        return "ExternalAdaptInfo{isBaseOnWidth=" + this.isBaseOnWidth + ", sizeInDp=" + this.sizeInDp + '}';
    }
}
