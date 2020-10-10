package com.rvmarra17.piedrapapeltijeralagartospock.core;

public class jugador {
    public enum opciones {
        PIERDA(0, "PIEDRA"),
        PAPEL(1, "PAPEL"),
        TIJERAS(2, "TIJERAS"),
        LAGARTO (3,"LAGATO"),
        SPOCK(4,"SPOCK");
        int value;
        String label;
        opciones(int value, String label){
            this.value = value;
            this.label = label;
        }
        public int getValue() {
            return value;
        }
        public String getLabel() {
            return label;
        }
    }
    private int puntos;
    private opciones opcion;

    public jugador() {
        this.puntos = 0;
        this.opcion = null;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public opciones getOpcion() {
        return opcion;
    }

    public void setOpcion(opciones opcion) {
        this.opcion = opcion;
    }


    public opciones getRandom (){
        int x = (int) (Math.random() * 4);
        return opciones.values()[x];

    }
}
