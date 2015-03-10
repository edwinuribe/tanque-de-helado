

package parcial;


public class agua extends jarabe{
   public int resul_agua;
    public int tanque_agua=3000;
    
   
   public void imprimir_agua(){//metodo agua
            if (this.vaso==1) {
          this.resul_agua=(this.tanque_agua-300);
          System.out.println("Al Recipiente De  Le Quedan: "+" "+ this.resul_agua+" "+"mililitos");   
       }else{
           System.out.println("El Tanque De helado Necesita Una Recarga");     
            }
   
   }

   
      
   }
   
   
