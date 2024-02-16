public class TypeCasting {
    public static void main(String[] args) {
        int a = 10;
        byte b;
        b = (byte) a ;   // to convert data type Syntax is { (target-type) value }
        System.out.println(b);
        // All byte , short ,char promoted to int (type promotion) while alu performing)
        byte d = 40;
        byte e = 50;
        int f = (e*d);   // explicitly convert/use variable into compatible data-type
        System.out.println(f);    

        d = (byte)(d*2);   // explicitly cast result into desired data-type
        System.out.println(b);

        double m=10000;
        double n=10000;
        double o = m*n;
        System.out.println(o);

    
    }
}
