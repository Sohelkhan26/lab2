module com.example.interface{
        requires javafx.controls;
        requires javafx.fxml;


        opens com.example.interface to javafx.fxml;
        exports com.example.interface;
        }