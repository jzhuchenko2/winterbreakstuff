public class Zhuchenko_8_1a {
    private int num;
    private int denom;
    public Zhuchenko_8_1a() {
        num = 0;
        denom = 1;
    }
    public Zhuchenko_8_1a(int numerator, int denominator) {
    this.num = numerator;
    this.denom = denominator;
        simplify();
    }//greatest common demoninator
    private void simplify(){
        while (true){
            int gcd = getGCD(num,denom);
            if(gcd == 1)
                return;
            num = num/gcd;
            denom = denom/gcd;
        }
        }
    private static int getGCD(int a,int b){
        if(a == 0)
            return b;
        if(b == 0)
            return a;
        if(a>b){
            return getGCD(a-b,b);
        }
        return getGCD(a,b-a);
    }
    public double getValue(){
        return (double) num/denom;
    }
    @Override
    public String toString() {
        return num + "/" + denom;
    }
}