package com.example.tugasakhir;

import java.util.List;

public class Banyumas {

    private String namausaha,foto;

    public List<Banyumas> banyumas;

    public List<Banyumas> getBanyumas() {
        return banyumas;
    }

    public Banyumas(String namausaha, String foto) {
        this.namausaha = namausaha;
        this.foto = foto;

    }





    public String getNamausaha() {
        return namausaha;
    }

    public String getFoto() {
        return foto;
    }

    public void setNamausaha(String namausaha) {
        this.namausaha = namausaha;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }


    @Override
    public String toString() {
        return "Banyumas{" +
                "namausaha='" + namausaha + '\'' +
                ", foto='" + foto + '\'' +
                ", banyumas=" + banyumas +
                '}';
    }
}
