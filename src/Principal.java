import javax.swing.*;

//Agregar conversion a libras, yen y wong + a peso argentino


public class Principal {
  public static void main(String[]args) {
	  
	 Funcion moneda = new Funcion();
	 
	 String opciones=(JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE,null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();  
	 switch(opciones) {
	 case "Conversor de Moneda" : {
		 String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
		 double valorRecibido = Double.parseDouble(input);
		 moneda.ConvertirMoneda(valorRecibido);
		 }
	 
	     int seleccion = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra consversión?");
	     if(JOptionPane.YES_OPTION==seleccion) {
	    	 System.out.println("Selecciona opción afirmativa");
	     }else {
	    	 JOptionPane.showMessageDialog(null, "Programa terminado");
	    	 
	     }
	     
	 }

  }
}
