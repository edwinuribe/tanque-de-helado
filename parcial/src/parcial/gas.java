

package parcial;


public class gas extends dispensador{
    public int resul_;
    public int tanque_=1500;
    
     public void imprimir_gas (){//metodo gas
            if (this.vaso==1){
            this.resul_=(this.tanque_-10);
               System.out.println("Al Recipiente De Gas Le Quedan: "+" "+ this.resul_+" "+"mililitos");

            }else{
             System.out.println("Al Recipiente De Gas Necesita Una Recarga");

            }
   }
}
   
