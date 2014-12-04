
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
   private Cubata copa;
   private String pregunta;
   
   public bebedor(int limiteDeAlcohol, Cubata copa, String pregunta)
   {
       this.limiteDeAlcohol = limiteDeAlcohol; 
       this.copa = copa;
       this.pregunta = pregunta;
       alcoholEnSangre = 0;
   }
   
   public void beber()   
   {
       int alcohol = copa.getCantidadDeAlcohol();
       if(alcoholEnSangre < limiteDeAlcohol)
       {
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
   
   public String getRespuesta()
   {
       String respuesta = null;
       if(alcoholEnSangre <= limiteDeAlcohol)
        {
            int numeroDeCaracteres = pregunta.length();           
            if(numeroDeCaracteres % 2 == 0)
            {
                 respuesta = "no";
            }
        
            else
            {
                respuesta = "si";
            }
        }
        else
        {
            respuesta = pregunta + "!!!!!";
        }
   
        return respuesta;
    }
   
    
    
}
