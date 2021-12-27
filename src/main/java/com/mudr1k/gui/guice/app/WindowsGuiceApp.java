package com.mudr1k.gui.guice.app;

import com.google.inject.Inject;
import com.mudr1k.gui.buttons.Button;
import com.mudr1k.gui.checkboxes.Checkbox;
import com.mudr1k.gui.guice.annotations.Windows;

public class WindowsGuiceApp implements GuiceApp
{
  private Button button;
  private Checkbox checkbox;

  @Inject
  public WindowsGuiceApp(
          @Windows
                  Button button,
          @Windows
                  Checkbox checkbox )
  {
    this.button = button;
    this.checkbox = checkbox;
  }

  @Override
  public void paint()
  {
    button.paint();
    checkbox.paint();
  }
}
