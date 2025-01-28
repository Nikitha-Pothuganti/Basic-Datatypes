import java.util.*;
public class Datatypes {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);{
        System.out.println("Enter a Text:");
        String Text=src.nextLine();
        System.out.println("Enter your values:");
        int num=src.nextInt();
        double num1=src.nextDouble();
        float num2=src.nextFloat();
        long num3=src.nextLong();
        short num4=src.nextShort();
        byte num5=src.nextByte();
        boolean prasad=true;
        System.out.println("Enter a character: ");
        char character=src.next().charAt(0);
        System.out.println("Text: "+Text);
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(prasad);
        System.out.println("Character Value: "+(int)(character));
        src.close();
        }
    }
}

