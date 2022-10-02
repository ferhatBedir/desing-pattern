package structuralpattern.adapter.solution;

public class SDCard implements Card {

    public void read() {
        System.out.println("SDCard --> Read operation success..");

    }

    public void write() {
        System.out.println("SDCard --> Write operation success..");

    }


}
