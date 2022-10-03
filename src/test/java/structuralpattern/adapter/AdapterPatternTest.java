package structuralpattern.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AdapterPatternTest {

    @Test
    void should_take_a_photo_with_sd_card() {

        //GIVEN
        var card = new SDCard();
        var cardIO = new CameraIOImpl(card);
        var camera = new Camera(cardIO);

        //WHEN
        assertDoesNotThrow(camera::takeAPhoto);

        //THEN
        //DoNothing

    }

    @Test
    void should_show_photo_with_sd_card() {

        //GIVEN
        var card = new SDCard();
        var cardIO = new CameraIOImpl(card);
        var camera = new Camera(cardIO);

        //WHEN
        assertDoesNotThrow(camera::showPhoto);

        //THEN
        //DoNothing

    }

    @Test
    void should_take_a_photo_with_micro_sd_card() {

        //GIVEN
        var microSdCard = new MicroSdCard();
        var card = new MicroSdCardAdapter(microSdCard);
        var cardIO = new CameraIOImpl(card);
        var camera = new Camera(cardIO);

        //WHEN
        assertDoesNotThrow(camera::takeAPhoto);

        //THEN
        //DoNothing

    }

    @Test
    void should_show_photo_with_micro_sd_card() {

        //GIVEN
        var microSdCard = new MicroSdCard();
        var card = new MicroSdCardAdapter(microSdCard);
        var cardIO = new CameraIOImpl(card);
        var camera = new Camera(cardIO);

        //WHEN
        assertDoesNotThrow(camera::showPhoto);

        //THEN
        //DoNothing

    }


}
