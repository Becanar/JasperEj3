module com.benat.cano.jasperej3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.benat.cano.jasperej3 to javafx.fxml;
    exports com.benat.cano.jasperej3;
}