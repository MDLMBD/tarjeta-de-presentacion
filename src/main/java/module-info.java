module mx.edu.utez.pres.tarjeta {
    requires javafx.controls;
    requires javafx.fxml;


    opens mx.edu.utez.pres.tarjeta to javafx.fxml;
    exports mx.edu.utez.pres.tarjeta;
}