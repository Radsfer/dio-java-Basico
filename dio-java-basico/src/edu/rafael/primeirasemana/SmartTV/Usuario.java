package edu.rafael.primeirasemana.SmartTV;

public class Usuario {
    public static void main(String[] args) {
        SmartTv televisao = new SmartTv();

        System.out.println("A telivisão está " + ((televisao.estado) ? "Ligada" : "Desligada"));
        System.out.println("Canal atual: " + televisao.canal);
        System.out.println("Volume atual: " + televisao.volume);

        televisao.ligaDesliga();
        televisao.aumentarVolume();
        televisao.aumentarVolume();
        televisao.aumentarVolume();
        for (int i = 0; i < 25; i++) {
            televisao.diminuirVolume();
        }
        televisao.mudarCanal(13);
        televisao.mudarCanal(0);
        televisao.ligaDesliga();

    }
}
