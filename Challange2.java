public class Challange2{

     public static void main(String []args){
         int a=0,b=1,c;
        System.out.println(a+" "+b);
        for(int i=1; i<=20;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
     }
}
