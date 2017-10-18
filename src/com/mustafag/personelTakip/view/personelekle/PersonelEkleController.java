package com.mustafag.personelTakip.view.personelekle;

import com.mustafag.personelTakip.view.DAO.PersonelDAO;
import com.mustafag.personelTakip.view.entitiy.KullaniciEntity;
import com.mustafag.personelTakip.view.entitiy.PersonelEntity;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TextField;

import java.util.UUID;

public class PersonelEkleController {
    public TextField tfTelefon;
    public TextField tfYaş;
    public TextField tfSoyadı;
    public TextField tfAdı;
    public TextField tfTC;
    public TextField tfKulAdı;
    public TextField tfSifre;

    public void kaydet(ActionEvent actionEvent) {
        PersonelEntity personelEntity=new PersonelEntity();
        personelEntity.setTC(tfTC.getText());
        personelEntity.setIsim(tfAdı.getText());
        personelEntity.setSoyadı(tfSoyadı.getText());
        personelEntity.setYas(tfYaş.getText());
        personelEntity.setTelefon(tfTelefon.getText());

        KullaniciEntity kullaniciEntity= new KullaniciEntity();
        kullaniciEntity.setPersonelTc(personelEntity.getTC());
        kullaniciEntity.setId(UUID.randomUUID().toString());
        kullaniciEntity.setKullaniciAdi(tfKulAdı.getText());
        kullaniciEntity.setSifre(tfSifre.getText());

        PersonelDAO dao =new PersonelDAO();
        dao.savePersonel(personelEntity,kullaniciEntity);
        ((Node)actionEvent.getSource()).getScene().getWindow().hide();
    }
}
