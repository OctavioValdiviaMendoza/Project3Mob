package edu.sjsu.android.project1.project1.project3octaviovaldivia;

public class Myitem {
    private final int imageId;
    private final int nameId;
    private final int desId;

    public Myitem(int imageId, int nameId, int desId) {
        this.imageId = imageId;
        this.nameId = nameId;
        this.desId = desId;
    }

    public int getImageId() {
        return imageId;
    }

    public int getNameId() {
        return nameId;
    }

    public int getDesId() {
        return desId;
    }
}
