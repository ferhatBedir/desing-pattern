package structuralpattern.adapter;

public record CameraIOImpl(Card card) implements CameraIO {


    @Override
    public void read() {
        card.read();

    }

    @Override
    public void write() {
        card.write();

    }


}
