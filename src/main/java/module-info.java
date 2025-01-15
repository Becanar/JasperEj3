module com.benat.cano.jasperej3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.benat.cano.jasperej3 to javafx.fxml;
    exports com.benat.cano.jasperej3;
    exports com.benat.cano.jasperej3.controller;
    opens com.benat.cano.jasperej3.controller to javafx.fxml;
    exports com.benat.cano.jasperej3.app;
    opens com.benat.cano.jasperej3.app to javafx.fxml;
}