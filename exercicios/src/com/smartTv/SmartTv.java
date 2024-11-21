package com.smartTv;
public class SmartTv {
    boolean ligada = false;
    int canal = 1, volume = 25;

    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public void aumentarVolume(){
        this.volume++;
    }

    public void diminuirVolume(){
        this.volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        this.canal--;
    }

    public void mudarCanal(int numero){
        this.canal = numero;
    }

}
