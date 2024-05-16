module com.empresa.actividad_017 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.empresa.actividad_017 to javafx.fxml;
    exports com.empresa.actividad_017;
}