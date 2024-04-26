package edu.rafael.primeirasemana.SmartTV;

public class SmartTv {
    boolean estado = false;
    int canal = 1;
    int volume = 20;

    public void ligaDesliga() {
        estado = !(estado);
        System.out.println("A telivisão está " + (estado ? "Ligada" : "Desligada"));
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
        System.out.println("Voulume aumentado para: " + volume);
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
        System.out.println("Voulume diminuido para: " + volume);
    }

    public void mudarCanalCima() {
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    public void mudarCanalBaixo() {
        if (canal > 1) {
            canal--;
        }
        System.out.println("Canal atual: " + canal);
    }

}
