import javax.swing.JOptionPane;

/*
 * Classe JOptionPane (javax.swing)
 * Métodos Estáticos:
 * .showMessageDialog(null,"mensagem");
 * .showInputDialog("mensagem");
 */
public class IMC
{ 
   public static void main(String[] args) 
   {
      
      float peso, altura;
      float imc;
      String classifica;
 
     
      peso = Float.parseFloat(JOptionPane.showInputDialog("Peso (kg):"));
      altura = Float.parseFloat(JOptionPane.showInputDialog("Altura (cm):") );
      
      altura=altura/100;
      
      imc = (float) (peso/Math.pow(altura, 2));
      
 
      if (imc < 17)
        classifica = "Muito Abaixo do Peso";
      else
        if (imc <= 18.49)
           classifica = "Abaixo do Peso";
      else
        if (imc <= 24.99)
           classifica = "Peso Normal";
      else
        if (imc <= 29.99)
           classifica = "Acima do Peso";
      else
        if (imc <= 34.99)
           classifica = "Obesidade I";
      else
        if (imc <= 39.99)
           classifica = "Obesidade II (Severa)";
      else
        classifica = "Obesidade III (Mórbida)";
 
      JOptionPane.showMessageDialog(null, "IMC da Pessoa = "+imc+" - "+classifica);
    }
}