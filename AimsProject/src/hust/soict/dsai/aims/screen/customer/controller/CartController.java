package hust.soict.dsai.aims.screen.customer.controller;

import hust.soict.dsai.aims.Store.Store;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


import java.io.IOException;

public class CartController {
    private Cart cart;
    private Store store;
    public CartController( Store store, Cart cart){
        this.cart = cart;
        this.store = store;
    }
    @FXML
    private Button btnPlay;
    @FXML
    private Button btnRemove;
    @FXML
    private RadioButton radioBtnFilterId;

    @FXML
    private TextField tfFilter;

    @FXML
    private RadioButton radioBtnFilterTitle;

    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private TableColumn<Media, Integer> colMediaID;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private TableView<Media> tblMedia;

    @FXML
    void btnRemovePressed(ActionEvent event){
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
        System.out.println(cart.toString());
    }

    @FXML
    void btnPlayPressed(ActionEvent event) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
        System.out.println(cart.toString());
    }

    @FXML
    void btnViewStorePressed(javafx.event.ActionEvent event) {

            final String STORE_FXML_FILE_PATH = "/hust/soict/dsai/aims/screen/customer/view/Store.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
            fxmlLoader.setController(new ViewStoreController(store, cart));
        try {
            Parent root = fxmlLoader.load();
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Store");
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void initialize(){
        colMediaID.setCellValueFactory(
                new PropertyValueFactory<Media, Integer>("id"));
        colMediaTitle.setCellValueFactory(
                new PropertyValueFactory<Media, String>("title"));
        colMediaCategory.setCellValueFactory(
                new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(
                new PropertyValueFactory<Media, Float>("cost"));
        if (cart.getItemOrdered() != null){
            tblMedia.setItems(cart.getItemOrdered());
        }
        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {
            @Override
            public void changed(ObservableValue<? extends Media> observableValue, Media oldValue, Media newValue) {
                updateButtonBar(newValue);
            }
            public void updateButtonBar(Media media){
                if (media == null) {
                    btnPlay.setVisible(false);
                    btnRemove.setVisible(false);
                } else {
                    btnRemove.setVisible(true);
                    if (media instanceof Playable){
                        btnPlay.setVisible(true);
                    } else {
                        btnPlay.setVisible(false);
                    }
                }
            }
        });
        tfFilter.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                showFilteredMedia(newValue);
            }
            public void showFilteredMedia(String newValue){
                ObservableList<Media> FilteredList =  FXCollections.observableArrayList();

            }
            });
    }
}
