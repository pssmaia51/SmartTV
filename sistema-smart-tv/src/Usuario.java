public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        //smartTv.diminurVolume();
        //smartTv.diminurVolume();
        //smartTv.diminurVolume();
        //smartTv.aumentarVolume();
        smartTv.mudarVolume(27);
        System.out.println("Volume Atual: " + smartTv.volume);

        //smartTv.amentarCanal();
        //smartTv.amentarCanal();
        //smartTv.amentarCanal();
        //smartTv.diminuirCanal();
        smartTv.mudarCanal( 13);
        System.out.println("Canal Atual: " + smartTv.canal);
        
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);



    }
}
