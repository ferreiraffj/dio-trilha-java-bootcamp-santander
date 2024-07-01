package exercicios;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    void estadoAtual(boolean ligada) {
        if (ligada) {
            System.out.println("TV Ligada");
        } else {
            System.out.println("TV Desligada");
        };
    }

    void canal(int canal) {
        System.out.println("Canal Atual: "+canal);
    }

    void volume(int volume) {
        System.out.println("Volume Atual: "+volume);
    }

    void aumentarVolume() {
        volume++;
        System.out.println("Volume Atual: "+volume);
    }

    void diminuirVolume() {
        volume--;
        System.out.println("Volume Atual: "+volume);
    }

    void aumentarCanal() {
        canal++;
        System.out.println("Canal Atual: "+canal);
    }

    void diminuirCanal() {
        canal--;
        System.out.println("Canal Atual: "+canal);
    }

    void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("Canal Atual: "+canal);
    }
}
