package hust.soict.dsai.test.screen.customer.store;

import hust.soict.dsai.aims.Store.Store;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.screen.customer.controller.ViewStoreController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class TestViewStoreScreen extends Application {
    private static Store store;
    private static Cart cart;
    @Override
    public void start(Stage primaryStage) throws Exception {
        final String STORE_FXML_FILE_PATH = "/hust/soict/dsai/aims/screen/customer/view/Store.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
        ViewStoreController viewStoreController = new ViewStoreController(store, cart);

        fxmlLoader.setController(viewStoreController);
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("Store");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Harry Potter and the Philosopher's Stone (2001)",
                "Animation", "Roger Allers", 87, 3.0f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Harry Potter and the Chamber of Secrets (2002)",
                "Science Fiction", "Geogre Lucas", 87, 3.5f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Harry Potter and the Prisoner of Azkaban (2004)",
                "Animation", 5.0f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter and the Goblet of Fire (2005)",
                "Animaton", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Fetch the Bolt Cutters",
                "Science Fiction", "Geogre Lucas", 87, 24.95f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Future Nostalgia",
                "Animation", -18.99f);
        Book book7 = new Book("The Hunger Games",
                "Animation", 19.95f);
        Book book8 = new Book("Catching Fire",
                "Science Fiction", 24.95f);
        Book book9 = new Book("Mockingjay",
                "Animation", 18.99f);
        store.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, book7, book8, book9);
        cart = new Cart();
        launch(args);
    }
}
