package com.mudr1k.gui.factories;

import com.mudr1k.gui.buttons.Button;
import com.mudr1k.gui.buttons.WindowsButton;
import com.mudr1k.gui.checkboxes.Checkbox;
import com.mudr1k.gui.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory
{
  @Override
  public Button createButton()
  {
    return new WindowsButton();
  }

  @Override
  public Checkbox createCheckbox()
  {
    return new WindowsCheckbox();
  }
}
