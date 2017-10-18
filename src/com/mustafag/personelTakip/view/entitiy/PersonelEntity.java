package com.mustafag.personelTakip.view.entitiy;

public class PersonelEntity{

        private String TC;
        private String İsim;
        private String Yas;
        private String Soyadı;


    public String getSoyadı() {
        return Soyadı;
    }

    public void setSoyadı(String soyadı) {
        Soyadı = soyadı;
    }

    private String Telefon;

        public String getTC() {
            return TC;

        }

        public void setTC(String TC) {
            this.TC = TC;
        }

        public String getIsim() {
            return İsim;
        }

        public void setIsim(String isim) {
            İsim = isim;
        }

        public String getYas() {
            return Yas;
        }

        public void setYas(String yas) {
            Yas = yas;
        }

        public String getTelefon() {
            return Telefon;
        }

        public void setTelefon(String telefon) {
            Telefon = telefon;
        }
}
