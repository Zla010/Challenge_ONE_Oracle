import javax.swing.JOptionPane;

public class Funcion{
	ConvertirMoneda monedas=new ConvertirMoneda();
	
   public void ConvertirMoneda(double valorRecibido) {
	   String opcion=(JOptionPane.showInputDialog(null, 
      "Elegí la moneda que deseas convertir tu dinero", "Monedas",
      JOptionPane.PLAIN_MESSAGE,null, new Object[] 
     {"De peso a dolar", "De peso a Euro", "De peso a libras", "De peso a Yen", "De peso a Won Coreano"},
     "Seleccion")).toString(); 
	   
	   switch(opcion) {
	   case "De peso a dolar" : 
		   monedas.ConvertirPesosColombianosADolar(valorRecibido);
	       break;
	   case "De peso a Euro" :
		   monedas.ConvertirPesosColombianosAEuro(valorRecibido);
	       
	   }
   }
}
