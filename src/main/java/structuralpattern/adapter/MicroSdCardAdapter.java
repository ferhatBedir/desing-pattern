package structuralpattern.adapter;

public class MicroSdCardAdapter implements Card {

    private final MicroSdCard microSdCard;

    public MicroSdCardAdapter(MicroSdCard microSdCard) {
        this.microSdCard = microSdCard;

    }

    @Override
    public void read() {
        microSdCard.read();

    }

    @Override
    public void write() {
        microSdCard.write();

    }


}
