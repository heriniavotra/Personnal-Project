public class Division implements Operation {
    
    @Override
    public double effectuer(double a, double b){
        if(b!=0){
            return a/b;
        }
        return -1;
    }  
}
