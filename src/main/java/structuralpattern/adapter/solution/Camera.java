package structuralpattern.adapter.solution;

public class Camera {

    private final CameraIO cameraIO;

    public Camera(CameraIO cameraIO) {
        this.cameraIO = cameraIO;

    }

    public void takeAPhoto() {
        try {
            System.out.println("Camera --> Process started..");
            Thread.sleep(2000);
            cameraIO.write();
            System.out.println("Camera --> Process finished..");
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("An error occurred when take a photo..");

        }

    }

    public void showPhoto() {
        try {
            System.out.println("Camera --> Process started..");
            Thread.sleep(2000);
            cameraIO.read();
            System.out.println("Camera --> Process finished..");
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("An error occurred when show a photo..");

        }

    }


}
