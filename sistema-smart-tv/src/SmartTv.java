public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;      
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminurVolume(){
        volume--;
    }

    public void mudarVolume(int novoVolume){
        volume = novoVolume;
    }

    public void amentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }

}
