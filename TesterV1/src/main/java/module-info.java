module com.mycompany.testerv1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.testerv1 to javafx.fxml;
    exports com.mycompany.testerv1;
}
