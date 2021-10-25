
package tv;
import java.util.Scanner;
public class TV {

   
    public static void main(String[] args) {
       tv1 t = new tv1();
       System.out.println("the case of TV is " + t.on);
       t.turrnOn();
       System.out.println("the case of TV is " + t.on);
       System.out.println("the channel number is " + t.channel);
       t.setChannel(15);
       System.out.println("the channel number is " + t.channel);
       System.out.println("the volumelevel is " + t.volumelvel);
       t.volumeUp();
       System.out.println("the volumelevel is " + t.volumelvel);
    }
    
}
