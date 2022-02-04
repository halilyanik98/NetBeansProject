/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogrusalarama;

/**
 *
 * @author Halil
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class DogrusalArama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Aranan Değer Kaç..?");
        Scanner aranan=new Scanner(System.in);
        int ArananDeger=aranan.nextInt();
        
        Random rnd=new Random(10);
        int[]dizi=new int[10];
        for(int i=0;i<10;i++)
        {
            dizi[i]=rnd.nextInt(10);
        }
        System.out.println("Dizi Yazdırılıyor....");
        System.out.println(Arrays.toString(dizi));
        Yaz abc=new Yaz();
        
    }
    
}
