package org.example;

//criando classe caixa de lapis
public class caixaDeLapis {
    //declarando variaveis privadas
    private int quantidadeDeLapis;
    private String cores;

    //metodo getcores para retornar as cores existentes na caixa de lapis
    public String getCores() {
        return cores;
    }
    // metodo setcores para adiconar as cores na caixa de lapis
    public void setCores(String cores) {
        this.cores = cores;
    }
    //metodo getQuantidadeDeLapis para retornar a quantidade de lapis
    public int getQuantidadeDeLapis() {
        return quantidadeDeLapis;
    }
    //metodo setQuantidadeDeLapis para adicionar a quantidade de lapis
    public void setQuantidadeDeLapis(int quantidadeDeLapis) {
        this.quantidadeDeLapis = quantidadeDeLapis;
    }





}