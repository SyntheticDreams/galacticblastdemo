/*
 * menu.java
 *
 * © <your company here>, 2003-2007
 * Confidential and proprietary.
 */

package com.synthdreams.BBTest1;;

import net.rim.device.api.ui.*;
import net.rim.device.api.ui.component.*;
import net.rim.device.api.ui.container.*;

/**
 * 
 */

class Menu extends MainScreen
{
    private ButtonField startButton = new ButtonField("Start Game!", ButtonField.FIELD_HCENTER)
    {

       protected boolean trackwheelClick(int status, int time)
       {
          
         // UiApplication.getUiApplication.pushScreen(new GamePlay());        
          return true;
       }    
    };   
    
    public Menu()
    {
        super();
        
        LabelField title = new LabelField("Galactic Blast", LabelField.USE_ALL_WIDTH);
        setTitle(title);
        
        //StartButton startButton = new StartButton();
        add(startButton);
        
    }
        
} 
