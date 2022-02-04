/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikiliarama;

import java.util.Arrays;

/**
 *
 * @author Halil
 */
class Sirala {
    public void DiziSiralama(int[]dizi,int aranan)
    {
        int yenideger=0;
        for(int i=1;i<dizi.length;i++)
        {
            for(int j=1;j<dizi.length;j++)
            {
                if(dizi[j-1]>dizi[j])
                {
                    
                    yenideger=dizi[j];
                    dizi[j]=dizi[j-1];
                    dizi[j-1]=yenideger;
                }
            }
        }
        System.out.println("Dizi Sıralandı..");
        System.out.println(Arrays.toString(dizi));
        int sondeger=dizi.length;
        int ilkdeger=0;
        
        for(int k=0;k<dizi.length;k++)
        {
            int ortadeger=(ilkdeger+sondeger)/2;
            
            if(aranan==dizi[ortadeger])
            {
                System.out.println("Değer"+ortadeger);
                break;
            }
            else if(aranan<dizi[ortadeger])
            {
                sondeger=ortadeger;
            }
            else if (aranan>dizi[ortadeger])
            {
                ilkdeger=ortadeger;
            }
        }
    }
}
