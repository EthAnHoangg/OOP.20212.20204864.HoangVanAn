module com.example.guiproject_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guiproject_ to javafx.fxml;
    exports com.example.guiproject_;
}