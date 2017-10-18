package com.mustafag.personelTakip.view.choose;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminController {
    public void personelGörüntüle(ActionEvent actionEvent) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../personelgörüntüle/PersonelGörüntüle.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setTitle("Personel Görüntüle");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void personelekle(ActionEvent actionEvent) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../personelekle/PersonelEkle.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage=new Stage();
        stage.setTitle("Personel Ekle");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
