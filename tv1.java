/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;


public class tv1 {

   public int channel;
   public int volumelvel;
   boolean on;
   

    public tv1() {
        channel = 1;
        volumelvel = 1 ;
        on = false;
    }
    

   void turrnOn()
   {
   on = true;
   
   
   }
   
   
   void turrnOff()
   {
   
   on = false ;
   
   }

    public void setChannel(int channel) {
        
        if(channel < 1 || channel >120)
            System.out.println("Erorr ! Not Found .");
        else   
        this.channel = channel;
    }

    public void setVolumelvel(int volumelvel) {
         if(volumelvel < 1 || volumelvel > 7)
            System.out.println("Erorr ! It is not can .");
        else 
        this.volumelvel = volumelvel;
    }
    
    
   void channelUp()
    {
    if(channel < 120)
        channel++;
    else
        System.out.println("It is the maximum limit !");
    }
   
   void channelDown()
   {
    if(channel >1)
        channel--;
    else
        System.out.println("It is the manimum limit !");
   }
   
   void volumeUp()
   {
    if(volumelvel < 7)
        volumelvel++;
    else
        System.out.println("It is the maximum limit !");
   }
   

   void volumeDown()
   {
   if(volumelvel > 1)
        volumelvel--;
    else
        System.out.println("It is the manimum limit !");
   
   }
    
}
