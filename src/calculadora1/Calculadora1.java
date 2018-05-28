package calculadora1;

/**
 *
 * @author Edwin
 */
public class Calculadora1 {

    private int ans;

    public Calculadora1() {
        ans = 0;
    }

    public int suma(int a, int b) {
        ans = a + b;
        return ans;
    }
     public int resta(int a, int b){
        ans=a-b;
        return ans;
    }
    public int add(int a){
        ans=ans+a;
       return ans;
      
    }
    public int divi(int a , int b){
        if(b==0){
            throw new ArithmeticException("no  se puede dividir por cero ");
        }else{
            
            ans=a/b;
        }
        return ans ;
    }
     
    public int sub(int a){
        ans=ans-a;
        return ans;
    }
    
    public int clear(){
        ans=0;
        return ans;
    }
    
    public void optima(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            
        }
    }
}