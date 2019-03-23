package question2;
import static java.lang.Integer.parseInt;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
          int fahrenheit = 0;
          float celsius = 0.0F;
          
          for (int i = 0; i < args.length; i++){
           try{   
            // pour tous les param�tres de la ligne de command
            
              //System.out.println("Your "+ i+ " argument is: "+args[i]);
              fahrenheit = parseInt(args[i]);
              celsius = fahrenheitEnCelsius(fahrenheit);
              System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
            
           }catch(NumberFormatException nfe){
               System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
           }
           
         }
         
    }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
      public static float fahrenheitEnCelsius(int f) {
        
        float celsius  = ((f- 32)*5)/9.0F;
        float r =(float) ((int)(celsius*10))/10.0F;
  
        return r; // ? compl?ter en rempla?ant ce return 0.F par la fonction
                    // de conversion
    }

}
