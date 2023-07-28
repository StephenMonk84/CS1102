public class CS1102_wk7{
    
    public static void main(String[] args){
        int a = 0;
        Character ch = 's';
        char cha;
        //Autoboxing Implicit
        Integer b = a;

        //Unboxing Implicit
        cha = ch;

        //Autboxing Explict
        Interger c = Integer.valueOf(a);

        System.out.println(b + " "+ cha + " " + c);

    }
}
