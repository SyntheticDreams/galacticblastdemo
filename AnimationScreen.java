/*
 * AnimationScreen.java
 *
 * © <your company here>, 2003-2007
 * Confidential and proprietary.
 */

package com.synthdreams.BBTest1;

import net.rim.device.api.ui.*;
import net.rim.device.api.ui.component.*;
import net.rim.device.api.ui.container.*;
import net.rim.device.api.system.*;
import net.rim.device.api.util.*;
import java.util.*;


public class AnimationScreen extends FullScreen
{
    int posX, posY, backPos;
    Bitmap shipBM;
    Bitmap backgroundBM;
    
    public AnimationScreen()
    {
        super();
        //invalidate();
        posX = 0;
        posY = 0;
        backPos = 0;
        
        shipBM = Bitmap.getBitmapResource("spaceship.png");
        backgroundBM = Bitmap.getBitmapResource("stars.png");
    }
    
    protected void paint(Graphics graphics)
    { 
         graphics.drawBitmap(0,0,backgroundBM.getWidth(), backgroundBM.getHeight(), backgroundBM, 0, backPos++);
         graphics.drawBitmap(posX, posY, shipBM.getWidth(), shipBM.getHeight(), shipBM, 0, 0);
    }
    
    public boolean keyChar(char key, int status, int time) 
    {
        
        boolean retVal = false;
        
        switch (key)
        {
            case Characters.ESCAPE:
                System.exit(0);
                retVal = true;
                break;
            
            default:
               break;
        }
                 
        return retVal;
    }
    
    protected boolean navigationMovement(int dx, int dy, int status, int time)
    {
        posX += (dx*10);
        posY += (dy*10);
        invalidate();
        return true;
    }
    
}
