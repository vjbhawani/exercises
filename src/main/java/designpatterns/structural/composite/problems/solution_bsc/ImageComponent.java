package designpatterns.structural.composite.problems.solution_bsc;

import designpatterns.structural.composite.pattern.Component;

public class ImageComponent implements Component {
    private int x;
    private int y;

    public void add(ImageComponent imageComponent) {

    }
    public ImageComponent get(int i) {
        throw new UnsupportedOperationException();
    }

    public void setName(String name) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public void position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getPositionX() {
        return this.x;
    }

    public int getPositionY() {
        return this.y;
    }
}
