package com.ejmplosPOO;

public class Coche {
    private int ruedas;
    private int largo;
    private int motor;
    private int ancho;
    private String color;
    private int pesoTotal;
    private int pesoPlataforma=500;
    private boolean asiento_cuero,climatizador;


    public Coche(){
        ruedas=4;
        largo=1000;
        ancho=300;
        motor=1600;
    }

    public String dime_largo(){
        return "El largo del coche es "+largo;
    }

    public void establece_color(String color_coche){ //Setter
        color=color_coche;

    }

    public String dime_color(){//Getter
        return "El color del coche es "+ color;
    }

    public void configura_asientos(String asiento_cuero ){//setter que proporciona asientos
        if (asiento_cuero.equalsIgnoreCase("si")){
            this.asiento_cuero=true;
        }else{
            this.asiento_cuero=false;
        }
    }


    public String dime_asientos(){//getter
        if(asiento_cuero==true){
            return "El coche tiene asientos de cuero";
        }else{
            return "el coche tiene asientos de serie";
        }
    }


    public void configura_climatizador(String climatizador){//setter
        if (climatizador.equalsIgnoreCase("si")){
            this.climatizador=true;
        }else {
            this.climatizador=false;
        }
    }

    public String dime_climatizador(){//getter
        if(climatizador==true){
            return "El coche incorpora climatizador";
        }else{
            return "el coche lleva aire acondicionado";
        }
    }


    public String dime_peso_coche(){//setter+getter
        int peso_carroceria=500;
        pesoTotal=pesoPlataforma+peso_carroceria;
        if (asiento_cuero==true){
            pesoTotal+=50;
        }
        if (climatizador==true){
            pesoTotal+=20;
        }
        return "el peso del coche es:"+pesoTotal;
    }

    public int precio_coche(){//getter
        int precio_final=10000;
        if (asiento_cuero==true){
            precio_final+=2000;
        }
        if (climatizador==true){
            precio_final+=1500;
        }
        return precio_final;
    }






}

