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
  /** La sortie en degré Celsius. */
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
   * méthode déclenchée lorsque le bouton de conversion est appuyé. 
   * remarquer que le champs de droite (les degrés Celsius) n'est pas éditable.
   * @param ae l'événement transmis
   */
  public void actionPerformed( ActionEvent ae ){
    try{
      FahrenheitCelsius objet= new FahrenheitCelsius();
      int fahrenheit =Integer.parseInt(entree.getText()); // valeur est une String et doit être convertie en entier, voir java.lang.Integer méthode parseInt (--> try/catch)
      float celsius = 0F; // à compléter, en appelant la méthode ad'hoc de la question2 
      // un test ici pour le zéro absolu (-273.1)
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
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
      public static float fahrenheitEnCelsius(int f) {
        
        float celsius  = ((f- 32)*5)/9;
        float r = (float) (((int)celsius*10)/10.0) ;
  
        return r; // ? compl?ter en rempla?ant ce return 0.F par la fonction
                    // de conversion
    }
}
