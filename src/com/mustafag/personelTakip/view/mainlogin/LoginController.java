package com.mustafag.personelTakip.view.mainlogin;

import com.mustafag.personelTakip.view.DAO.PersonelDAO;
import com.mustafag.personelTakip.view.entitiy.KullaniciEntity;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    public TextField tfKulAdı;
    @FXML
    public TextField tfSifre;
    public Label lblerror;

    public void giris(ActionEvent actionEvent) {
        PersonelDAO dao = new PersonelDAO();
        KullaniciEntity kullaniciEntity = dao.getKullanici(tfKulAdı.getText(), tfSifre.getText());
        if (kullaniciEntity.getKullaniciAdi().equals("admin") && kullaniciEntity.getSifre().equals("admin")) {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("../choose/admin.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();

            stage.setTitle("Sayın " + tfKulAdı.getText().toUpperCase() + " P.Takip sisteme hoşgeldiniz");
            stage.setScene(new Scene(root));
            stage.show();
        }if (kullaniciEntity.getKullaniciAdi().equals("user") && kullaniciEntity.getId() !=null){

            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("../choose/choose.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();

            stage.setTitle("Sayın " + tfKulAdı.getText().toUpperCase() + " P.Takip sisteme hoşgeldiniz");
            stage.setScene(new Scene(root));
            stage.show();
        }
            else {
            lblerror.setText("Kullanıcı adı veya Şifre yanlış!!!");
        }
    }
}
