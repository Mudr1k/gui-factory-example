package com.mudr1k.gui.app;

import com.mudr1k.gui.buttons.Button;
import com.mudr1k.gui.checkboxes.Checkbox;
import com.mudr1k.gui.factories.GUIFactory;

public class Application
{
  private Button button;
  private Checkbox checkbox;

  public Application( GUIFactory factory )
  {
    button = factory.createButton();
    checkbox = factory.createCheckbox();
  }

  public void paint()
  {
    button.paint();
    checkbox.paint();
  }
}
