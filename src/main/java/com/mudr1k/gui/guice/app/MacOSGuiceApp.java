package com.mudr1k.gui.guice.app;

import com.google.inject.Inject;
import com.mudr1k.gui.buttons.Button;
import com.mudr1k.gui.checkboxes.Checkbox;
import com.mudr1k.gui.guice.annotations.MacOs;

public class MacOSGuiceApp implements GuiceApp
{
  private Button button;
  private Checkbox checkbox;

  @Inject
  public MacOSGuiceApp(
          @MacOs
                  Button button,
          @MacOs
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
