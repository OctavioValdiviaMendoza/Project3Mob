package edu.sjsu.android.project1.project1.project3octaviovaldivia;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Myitem implements Parcelable {
    private final int imageId;
    private final int nameId;
    private final int desId;

    public Myitem(int imageId, int nameId, int desId) {
        this.imageId = imageId;
        this.nameId = nameId;
        this.desId = desId;
    }

    protected Myitem(Parcel in) {
        imageId = in.readInt();
        nameId = in.readInt();
        desId = in.readInt();
    }

    public static final Creator<Myitem> CREATOR = new Creator<Myitem>() {
        @Override
        public Myitem createFromParcel(Parcel in) {
            return new Myitem(in);
        }

        @Override
        public Myitem[] newArray(int size) {
            return new Myitem[size];
        }
    };

    public int getImageId() {
        return imageId;
    }

    public int getNameId() {
        return nameId;
    }

    public int getDesId() {
        return desId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(imageId);
        dest.writeInt(nameId);
        dest.writeInt(desId);
    }
}
