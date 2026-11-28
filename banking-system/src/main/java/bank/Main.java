
package bank;

import bank.view.BankApp;
import javafx.application.Application;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {

        
        System.clearProperty("glass.platform");
        System.clearProperty("monocle.platform");

        // Launch the banking application
        Application.launch(BankApp.class, args);
    }
}
