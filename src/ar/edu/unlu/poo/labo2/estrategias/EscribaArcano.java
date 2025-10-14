package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class EscribaArcano implements EstrategiaDeMejora{

    @Override
    public void mejorar(Artefacto artefacto) {
        if(artefacto.getTipo().equals("Pergamino")){
            if(artefacto.getPoder() < 30){
                artefacto.setPoder(artefacto.getPoder()+25);
            }else {
                artefacto.setPoder(artefacto.getPoder()-10);
            }
        }
    }
}
