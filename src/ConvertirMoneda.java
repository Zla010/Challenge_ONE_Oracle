import javax.swing.JOptionPane;

public class ConvertirMoneda {
    public  void ConvertirPesosColombianosADolar (double ValorRecibido) {
    	double monedaDolar = ValorRecibido / 4801.53;
    	monedaDolar = (double)Math.round(monedaDolar*1000)/100;
    	JOptionPane.showMessageDialog(null, "Tenes $ " + monedaDolar + "dolares");
    }
    
    
    public  void ConvertirPesosColombianosAEuro (double ValorRecibido) {
    	double monedaDolarAEuro = ValorRecibido / 5068.89;
    	monedaDolarAEuro = (double)Math.round(monedaDolarAEuro*1000)/100;
    	JOptionPane.showMessageDialog(null, "Tenes $ " + monedaDolarAEuro + "euros");
    }

}
