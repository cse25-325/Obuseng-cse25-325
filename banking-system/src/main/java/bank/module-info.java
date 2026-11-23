

module banking.system {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens bank.view to javafx.fxml;
    exports bank;
}


