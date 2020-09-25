package atm;

import atm.config.ATMConfig;
import atm.config.ATMConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        DataSourceDB dataSourceDB = new DataSourceDB();
        DataSourceFile dataSourceFile = new DataSourceFile("customers.txt");
        Bank bank = new Bank("My Bank", dataSourceFile);
        ATM atm = new ATM(bank);
        AtmUI atmUI = new AtmUI(atm);
        atmUI.run();
    }
}