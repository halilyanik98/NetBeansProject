/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikiliarama;

/**
 *
 * @author Halil
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class İkiliArama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []dizi=new int[100];
        Random rnd=new Random();
        for(int i=0;i<dizi.length;i++)
        {
            dizi[i]=rnd.nextInt(100);
        }
        Scanner klavye=new Scanner(System.in);
        System.out.println("Rastgele Dizi Oluşturuldu..");
        System.out.println(Arrays.toString(dizi));
        System.out.println("Aranacak Değeri Girin..");
        int aranan=klavye.nextInt();
        Sirala abc=new Sirala();
        abc.DiziSiralama(dizi,aranan);
    }
    
}
