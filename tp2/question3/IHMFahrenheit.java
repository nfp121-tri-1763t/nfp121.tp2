package question3;

import question2.*;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
import static java.lang.Integer.parseInt;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degr� Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * m�thode d�clench�e lorsque le bouton de conversion est appuy�. 
   * remarquer que le champs de droite (les degr�s Celsius) n'est pas �ditable.
   * @param ae l'�v�nement transmis
   */
  public void actionPerformed( ActionEvent ae ){
    try{
      FahrenheitCelsius objet= new FahrenheitCelsius();
      int fahrenheit =Integer.parseInt(entree.getText()); // valeur est une String et doit �tre convertie en entier, voir java.lang.Integer m�thode parseInt (--> try/catch)
      float celsius = 0F; // � compl�ter, en appelant la m�thode ad'hoc de la question2 
      // un test ici pour le z�ro absolu (-273.1)
      float test =objet.fahrenheitEnCelsius(fahrenheit);
      
      if(test< -273.1F){
          celsius = -273.1F;
      }
sortie.setText( Float.toString(celsius));
    }catch(NumberFormatException nfe){
      sortie.setText("error ! ");
    }
  }
  
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
    
    /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
      public static float fahrenheitEnCelsius(int f) {
        
        float celsius  = ((f- 32)*5)/9;
        float r = (float) (((int)celsius*10)/10.0) ;
  
        return r; // ? compl?ter en rempla?ant ce return 0.F par la fonction
                    // de conversion
    }
}
