module eu.athenasbinary.fxpacker {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens eu.athenasbinary.fxpacker to javafx.fxml;
    exports eu.athenasbinary.fxpacker;
}