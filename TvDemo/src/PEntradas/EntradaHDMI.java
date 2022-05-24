package PEntradas;

import PMain.Tv;

/**
 * Class EntradaHDMI
 * Luis Gerardo Garcia Obispo 
 * Implementación de la clase EntradaHDMI del paquete entradas
 */
public class EntradaHDMI extends Entrada {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement public EntradaHDMI () { };
    public EntradaHDMI (Tv tv) { 
        super(tv);
    };
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //
  //Erik Isaias Ortiz Duarte
   @Override
  /**
  * Luis Gerardo Garcia Obispo
  * Implementación del método entradas con extención a la superclase TVDEMO
  * Manda a llamar el método setEntrada en la clase TVDEMO
  */
  // Erik Isaias Ortiz Duarte
   public void execute() {
        setEntradab();
    }
  /**
  * Luis Gerardo Garcia Obispo
  * Implementación del método setEntrada 
  * Llamando hdmi de la referencia Tv al que pertenece a EntradaHDMI
  */
   //Erik Isaias Ortiz Duarte
   private void setEntradab() {
        this.tv.hdmi();
        
    }

}
