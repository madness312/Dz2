module com.example.dz2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dz2 to javafx.fxml;
    exports com.example.dz2.zadanie1;
}