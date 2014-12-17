
/**
 * Write a description of class bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bebedor
{
   private int alcoholEnSangre;
   private int limiteDeAlcohol;
   private String nombre;
   
   public bebedor(int limiteDeAlcohol, String nombre)
   {
       this.limiteDeAlcohol = limiteDeAlcohol; 
       this.nombre = nombre;
       alcoholEnSangre = 0;
   }
   
   public void beber(Cubata copa)   
   {       
       if(alcoholEnSangre < limiteDeAlcohol)
       {
           int alcohol = copa.getCantidadDeAlcohol();
           alcoholEnSangre = alcoholEnSangre + alcohol;
       }
       
       else 
       {
           System.out.println("no,gracias, ya voy bastante mal, no voy a beber mas por hoy");
       }
   }
   
   public int getAlcoholEnSangre()
   {
       return alcoholEnSangre;
   }
   
   public String getRespuesta(String pregunta)
   {
       String respuesta = null;
       if((alcoholEnSangre <= limiteDeAlcohol) && (!pregunta.contains(nombre)))
        {
            int numeroDeCaracteres = pregunta.length();           
            if((numeroDeCaracteres % 2) == 0)
            {
                 respuesta = "si";
            }
        
            else
            {
                respuesta = "no";
            }
        }
        else
        {
            respuesta = pregunta.toUpperCase();
        }
   
        return respuesta;
    }
    
    /**
     * este metodo simula dormir, con esto se consigue que el nivel de alcohol sea 0 pero su limite de alcohol se vera reducido en un porcentaje que el usuario 
     * introducira, debido a la resaca  
     */
    public void sleep(int porcentaje)
    {
        alcoholEnSangre = 0;
        limiteDeAlcohol = limiteDeAlcohol - ((limiteDeAlcohol * porcentaje) / 100);
    }
    
   
    /**
     * simula conducir, en caso de que supere la tasa de alcohol, ira a la carcel x tiempo en funcion de en cuanto lo superes 
     */
    public void conducir()
    {
        if ((alcoholEnSangre > 25) && (alcoholEnSangre < 50))
        {
            System.out.println("has superado la tasa de alcohol, estas arrestado durante 2 días");
        }
        else if (alcoholEnSangre < 50)
        {
            System.out.println("HAS DOBLADO LA TASA DE ALCOHOL PERMITIDDA!! estaras 5 días arrestado");
        }
        else if (alcoholEnSangre == 0)
        {
            System.out.println("así me gusta, no has bebido, puedes continuar");
        }
        else
        {
            System.out.println("aun no has llegado al limite, puedes contunuar, pero deja de beber");
        }
    }
}
