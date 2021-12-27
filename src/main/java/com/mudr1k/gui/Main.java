package com.mudr1k.gui;

import com.mudr1k.gui.app.Application;
import com.mudr1k.gui.factories.GUIFactory;
import com.mudr1k.gui.factories.MacOSFactory;
import com.mudr1k.gui.factories.WindowsFactory;

public class Main
{
  private static Application configureApplication() throws Exception
  {
    Application app;
    GUIFactory factory;
    String osName = System.getProperty( "os.name" ).toLowerCase();

    if( osName.contains( "mac" ) )
      factory = new MacOSFactory();
    else if( osName.contains( "win" ) )
      factory = new WindowsFactory();
    else
      throw new Exception( "Error! Unknown operating system" );

    app = new Application( factory );
    return app;
  }

  public static void main( String[] args ) throws Exception
  {
    Application app = configureApplication();
    app.paint();
  }
}
