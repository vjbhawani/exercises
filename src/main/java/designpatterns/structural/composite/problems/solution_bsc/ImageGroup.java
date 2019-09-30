package designpatterns.structural.composite.problems.solution_bsc;

import designpatterns.structural.composite.pattern.Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ImageGroup extends ImageComponent implements Composite {
    private List<ImageComponent> images = new ArrayList<>();

    @Override
    public String getName() {
        StringJoiner stringJoiner = new StringJoiner(",");
        this.images.forEach(n -> {
            stringJoiner.add(n.getName());
        });
        return stringJoiner.toString();
    }

    @Override
    public void add(ImageComponent imageComponent) {
        this.images.add(imageComponent);
    }

    @Override
    public ImageComponent get(int i) {
        return this.images.get(i);
    }
}
