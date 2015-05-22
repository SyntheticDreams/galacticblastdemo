/*
 * GalacticBlast.java
 *
 * © Synthetic Dreams, 2003-2008
 * Confidential and proprietary.
 */

package com.synthdreams.GalacticBlast;

import net.rim.device.api.ui.UiApplication;

/**
 * Initial main class that starts the ball rolling
 * UiApplication is extended to provide Blackberry
 * functionality, specifically the Event Dispatcher
 * and Screen pusher
 */
public class GalacticBlast extends UiApplication
{
  
    public static void main(String[] args)
    {
        GalacticBlast GalacticBlast = new GalacticBlast();
        
        // The Blackberry's message pump, handles key
        // presses and system events
        GalacticBlast.enterEventDispatcher();
    }
    
    public GalacticBlast()
    {
        // The first thing we do is show the menu screen, defined by the
        // 'Menu' class.  We accomplish this with a call to pushScreen,
        // which puts screens on the stack (Class specified must be a type
        // of screen, such as MainScreen).  The top most screen is the
        // one shown.  Our first one will be the menu, and later the game
        // itself will sit on top of this.  When the game quits, it will
        // pop that screen off the stack and return to the menu screen.
        pushScreen(new Menu());              
    }
} 
