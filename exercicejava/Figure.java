
public abstract class Figure{

   
            protected double  longueur;
         
            protected static String unite;  

  
       public Figure(){
      }
   
      public double getLongueur(){
          return this.longueur;
     }

     public void setLongueur(double longueur){
            this.longueur=longueur;
     }

  
      public static String getUnite(){
          return unite;
     }

     public static void setUnite(String unite){
            Figure.unite=unite;
     }
   
   
     public abstract double demiPerimetre() ;    
      
    public double perimetre() {
         return demiPerimetre()*2;
   }  

   public abstract double surface() ; 
   public abstract double diagonale();   

      

}