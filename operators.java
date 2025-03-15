public class operators {
    public static void main(String[] args) {
        System.err.println(8 + 7);
        System.err.println(9 - 7);
        System.err.println(9 * 7);
        System.err.println(9.0 / 7); // duitai int rakhle 4 int e output petam tai 9.0 kore diyechi

        System.out.println(5%2);

        int num = 34; //assignment operator
        num += 5;
        System.out.println(num);

        //relational operator
        // < > >= <= == !=
        //true false answer
        System.out.println(5 < 2);
        

        //logical operator
        // && -> AND
        // || -> OR
        // ! -> NOT

        System.out.println(5 > 2 && 6 < 10);
        System.out.println(5 > 2 || 6 > 10);

        //unary operator
        //prefix
        int a = 5;
        int b = ++ a; // a er value age 5 + 1 = 6 hoyeche then b te bose geche

        System.out.println(a);
        System.out.println(b);


        a = 5;
        b = -- a; // a er value age 5 - 1 = 4 hoyeche then b te bose geche
        
        System.out.println(a);
        System.out.println(b);
        //postfix
        //age bose jay tar por bare

        a = 5;
        b = a++;

                
        System.out.println(a);
        System.out.println(b);
    }
    
}
