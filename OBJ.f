/*
 * obj.java
 *
 * � <your company here>, 2003-2007
 * Confidential and proprietary.
 */

package com.synthdreams.BBTest1;

import net.rim.device.api.system.Bitmap;

public class OBJ 
{
    int posX, posY, velX, velY;
    Bitmap bitmap;
    
    OBJ(int passX, int passY) 
    {
        posX = passX;
        posY = passY;
        velX = 0;
        velY = 0;
    }
    
    public int getX() { return posX; }
    public int getY() { return posY; }
    public void setX(int passX) { posX = passX; }
    public void setY(int passY) { posY = passY; }
    public Bitmap getBitmap() { return bitmap; }
    
    public void process()
    {
        // No default actions for an object
    }
    
}

public class EnemyDrone extends OBJ
{
   
   EnemyDrone(int passX, int passY)
   {
      super(passX, passY);
      bitmap = Bitmap.getBitmapResource("spaceship.png");    
      velY = 1;
   }    
   
   public void process()
   {
      posX += velX;
      posY += velY;       
      
      if (posX < 10)
         velX = 1;
         
      if (posX > 100)
         velX = -1;
         
      if (posY < 10)
         velY = 1;
         
      if (posY > 100)
         velY = -1;
            
   }
    
}
