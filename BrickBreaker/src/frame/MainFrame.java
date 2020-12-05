package frame;


public enum MainFrame {
    WIDTH(600),
    HEIGHT(700),
    BORDER_LEFT(10),
    BORDER_RIGHT(MainFrame.WIDTH.getSize());

    private final int size;

    MainFrame(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

