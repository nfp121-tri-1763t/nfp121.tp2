package question1;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        
         int fahrenheit = 0;
         float celsius = 0.0F;
        // pour tous les paramètres de la ligne de commande
        for (int i = 0; i < args.length; i++)
    {
          //System.out.println("Your "+i+ " argument is: "+args[i]);
          fahrenheit = parseInt(args[i]);
          celsius = fahrenheitEnCelsius(fahrenheit);
          System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                                                                                    // format
                                                                                    // imposés
       
    }
         
     
       
                                                                                
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        
        float celsius  = ((f- 32)*5)/9.0F;
        float r =(float) ((int)(celsius*10))/10.0F;
  
        return r; // ? compl?ter en rempla?ant ce return 0.F par la fonction
                    // de conversion
    }

}
