/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearserach;

/**
 *
 * @author Halil
 */
public class LinearSerach {

    int linearSearch(int dizi[],int x,int aranan)
    {
        if (aranan==dizi[x])
        {
            return x;
        }
        else 
        {
            return linearSearch(dizi, x+1, aranan);
        }
    }
    public static void main(String[] args) 
    {
        LinearSerach abc = new LinearSerach();
        int dizi[] = {3,5,7,9,12,14,17,18,19,22,26,35};
        int x =0;
        int aranan =12;
        int fonksiyon = abc.linearSearch(dizi,x ,aranan);
        if (fonksiyon==-1)
        {
            System.out.println("Değer dizide yok");
        }
        else
        {
            System.out.println("Değer şu indexte bulundu => "+fonksiyon);
        }
    }
    
}
