package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class AlquimistaExperto implements EstrategiaDeMejora{

    @Override
    public void mejorar(Artefacto artefacto) {
        if(artefacto.getTipo().equals("Poción")){
            if (artefacto.getPoder() <= 80){
                artefacto.setPoder(artefacto.getPoder()+20);
            }else {
                artefacto.setPoder(100);
            }
        }

    }
}
