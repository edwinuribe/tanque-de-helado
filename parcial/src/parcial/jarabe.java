

package parcial;


public class jarabe  extends gas {
    public int resul_jarabe;
     public int tanque_jarabe=2000;
    

 public void imprimir_jarabe(){//metodo jarabe
             if (this.vaso==1){
            this.resul_jarabe=(this.tanque_jarabe-200);
            System.out.println("Al Recipiente De Jarabe Le Quedan: "+" "+ this.resul_jarabe+" "+"mililitos");
        }else{
               
            System.out.println("El Tanque De Jarabe Nececita Una Recarga");     
             }
   
   }
}