package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Dailybonus/*bonus*/ {
    public AnchorPane hraci;
    public AnchorPane pane;
    public void witchcraft(ActionEvent actionEvent) throws IOException {
        AnchorPane p = FXMLLoader.load(getClass().getResource("witchcraft.fxml"));
        pane.getChildren().setAll(p);
    }

    public void armory(ActionEvent actionEvent) throws IOException {
        AnchorPane p = FXMLLoader.load(getClass().getResource("armory.fxml"));
        pane.getChildren().setAll(p);
    }

    public void training(ActionEvent actionEvent) throws IOException {
        AnchorPane p = FXMLLoader.load(getClass().getResource("sample1.fxml"));
        pane.getChildren().setAll(p);
    }

    public void patrol(ActionEvent actionEvent) throws IOException {
        AnchorPane p = FXMLLoader.load(getClass().getResource("patrol.fxml"));
        pane.getChildren().setAll(p);
    }

    public void mail(ActionEvent actionEvent) throws IOException {
        AnchorPane p = FXMLLoader.load(getClass().getResource("mail.fxml"));
        pane.getChildren().setAll(p);
    }

    public void scouting(ActionEvent actionEvent) throws IOException {
        AnchorPane p = FXMLLoader.load(getClass().getResource("scouting.fxml"));
        pane.getChildren().setAll(p);
    }

    public void stables(ActionEvent actionEvent) throws IOException {
        AnchorPane p = FXMLLoader.load(getClass().getResource("stables.fxml"));
        pane.getChildren().setAll(p);
    }

    public void logbook(ActionEvent actionEvent) throws IOException {
        AnchorPane p = FXMLLoader.load(getClass().getResource("logbook.fxml"));
        pane.getChildren().setAll(p);
    }

    public void bonus(ActionEvent actionEvent) throws IOException {
        AnchorPane p = FXMLLoader.load(getClass().getResource("dailybonus.fxml"));
        pane.getChildren().setAll(p);
    }
}
