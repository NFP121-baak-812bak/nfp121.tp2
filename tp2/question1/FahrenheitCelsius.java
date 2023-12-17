package question1;

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
        // pour tous les paramètres de la ligne de commande
        for(String arg:args)
        {
        int fahrenheit = Integer.parseInt(arg);
        float c = fahrenheitEnCelsius(fahrenheit);
        System.out.println(fahrenheit + "\u00B0F -> " + c ); // ligne,
        }                                                                        // format
                                                                                // imposés                                                                       
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float num = 5/9*(f-32);
        return num; // à compléter en remplaçant ce return 0.F par la fonction
                    // de conversion
    }

}
