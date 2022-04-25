module com.dilanur.dilanurkindergarten {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens com.dilanur.dilanurkindergarten to javafx.fxml;
    exports com.dilanur.dilanurkindergarten;
}