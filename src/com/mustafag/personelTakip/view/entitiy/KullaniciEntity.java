package com.mustafag.personelTakip.view.entitiy;

public class KullaniciEntity {

    String id;

    String kullaniciAdi;

    String sifre;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getPersonelTc() {
        return personelTc;
    }

    public void setPersonelTc(String personelTc) {
        this.personelTc = personelTc;
    }

    public PersonelEntity getPersonelEntity() {
        return personelEntity;
    }

    public void setPersonelEntity(PersonelEntity personelEntity) {
        this.personelEntity = personelEntity;
    }

    String personelTc;

    PersonelEntity personelEntity;

}
