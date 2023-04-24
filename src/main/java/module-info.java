module com.loginjfx.loginjfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.loginjfx.loginjfx to javafx.fxml;
    exports com.loginjfx.loginjfx;
}