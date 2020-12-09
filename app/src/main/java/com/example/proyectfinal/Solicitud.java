package com.example.proyectfinal;

public class Solicitud {

    String address;
    String idUser;
    String nameUser;
    String hours;
    int pay;

    public Solicitud(String address, String idUser, String nameUser, String hours, int pay) {
        this.address = address;
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.hours = hours;
        this.pay = pay;
    }

    public Solicitud() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }
}
