package com.mudr1k.gui.factories;

import com.mudr1k.gui.buttons.Button;
import com.mudr1k.gui.buttons.MacOSButton;
import com.mudr1k.gui.checkboxes.Checkbox;
import com.mudr1k.gui.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory
{
  @Override
  public Button createButton()
  {
    return new MacOSButton();
  }

  @Override
  public Checkbox createCheckbox()
  {
    return new MacOSCheckbox();
  }
}
