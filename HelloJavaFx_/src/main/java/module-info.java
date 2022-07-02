module com.example.hellojavafx_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellojavafx_ to javafx.fxml;
    exports com.example.hellojavafx_;
}