module com.raquel.miprimermongo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.raquel.miprimermongo to javafx.fxml;
    exports com.raquel.miprimermongo;
}