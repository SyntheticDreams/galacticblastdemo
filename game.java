/*
 * AnimationScreen.java
 *
 * © <your company here>, 2003-2007
 * Confidential and proprietary.
 */

package com.synthdreams.BBTest1;

import net.rim.device.api.ui.container.FullScreen;
import net.rim.device.api.ui.Graphics;

public class GamePlay extends FullScreen
{
    GFX gfx;
    
    public GamePlay()
    {
        gfx = new GFX();        
    }
   
    protected void paint(Graphics graphics)
    { 
       gfx.process(passGraphics);    
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

        return true;
    }
    
}
