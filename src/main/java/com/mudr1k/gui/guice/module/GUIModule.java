package com.mudr1k.gui.guice.module;

import com.google.inject.AbstractModule;
import com.mudr1k.gui.buttons.Button;
import com.mudr1k.gui.buttons.MacOSButton;
import com.mudr1k.gui.buttons.WindowsButton;
import com.mudr1k.gui.checkboxes.Checkbox;
import com.mudr1k.gui.checkboxes.MacOSCheckbox;
import com.mudr1k.gui.checkboxes.WindowsCheckbox;
import com.mudr1k.gui.guice.app.GuiceApp;
import com.mudr1k.gui.guice.app.MacOSGuiceApp;
import com.mudr1k.gui.guice.app.WindowsGuiceApp;
import com.mudr1k.gui.guice.annotations.MacOs;
import com.mudr1k.gui.guice.annotations.Windows;

public class GUIModule extends AbstractModule
{
  @Override
  protected void configure()
  {
    bind( Button.class ).annotatedWith( MacOs.class ).to( MacOSButton.class );
    bind( Button.class ).annotatedWith( Windows.class ).to( WindowsButton.class );

    bind( Checkbox.class ).annotatedWith( MacOs.class ).to( MacOSCheckbox.class );
    bind( Checkbox.class ).annotatedWith( Windows.class ).to( WindowsCheckbox.class );

    bind( GuiceApp.class ).annotatedWith( MacOs.class ).to( MacOSGuiceApp.class );
    bind( GuiceApp.class ).annotatedWith( Windows.class ).to( WindowsGuiceApp.class );
  }
}
