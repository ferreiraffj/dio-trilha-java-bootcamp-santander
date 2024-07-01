package exercicios;

public class App {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        tv.estadoAtual(false);
        tv.canal(5);
        tv.volume(10);
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.mudarCanal(20);
        tv.aumentarCanal();
    }
}
