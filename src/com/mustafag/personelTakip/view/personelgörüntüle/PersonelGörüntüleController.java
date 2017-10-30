package com.mustafag.personelTakip.view.personelgörüntüle;

import com.mustafag.personelTakip.view.DAO.PersonelDAO;
import com.mustafag.personelTakip.view.entitiy.PersonelEntity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class PersonelGörüntüleController {
    public TableColumn tvTC;
    public TableColumn tvisim;
    public TableColumn tvTelefon;
    public TableView table;
    public TableColumn tvyas;

    ObservableList<PersonelEntity> list = FXCollections.observableArrayList();
    public PersonelGörüntüleController(){
        PersonelDAO dao = new PersonelDAO();
        list = dao.getKullaniciList();

}
@FXML
private void initialize(){
tvTC.setCellValueFactory(new PropertyValueFactory<>("TC"));
tvisim.setCellValueFactory(new PropertyValueFactory<>("isim"));
tvTelefon.setCellValueFactory(new PropertyValueFactory<>("telefon"));
tvyas.setCellValueFactory(new PropertyValueFactory<>("yas"));
table.setItems(list);
}
}