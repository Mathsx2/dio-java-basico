public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    // ligar a SmarTv
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    // mudar o volume da SmarTv
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        // ou volume = volume - 1;
        System.out.println("Diminuindo volume para: " + volume);
    }

    // mudar o canal
    public void passarCanal() {
        canal++;
    }

    public void voltarCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

}
