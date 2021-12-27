package com.mudr1k.gui.factories;

import com.mudr1k.gui.buttons.Button;
import com.mudr1k.gui.checkboxes.Checkbox;

public interface GUIFactory
{
  Button createButton();

  Checkbox createCheckbox();
}
