package com.mudr1k.gui.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.mudr1k.gui.guice.annotations.MacOs;
import com.mudr1k.gui.guice.annotations.Windows;
import com.mudr1k.gui.guice.app.GuiceApp;
import com.mudr1k.gui.guice.module.GUIModule;

public class GuiceMain
{
  public static void main( String[] args ) throws Exception
  {
    Injector injector = Guice.createInjector( new GUIModule() );

    String osName = System.getProperty( "os.name" ).toLowerCase();

    if( osName.contains( "mac" ) )
      injector.getInstance( Key.get( GuiceApp.class, MacOs.class ) ).paint();
    else if( osName.contains( "win" ) )
      injector.getInstance( Key.get( GuiceApp.class, Windows.class ) ).paint();
    else
      throw new Exception( "Error! Unknown operating system" );
  }
}
