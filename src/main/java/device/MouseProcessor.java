import device.model.Mouse;

import java.util.Map;

public class MouseProcessor implements ActionProcessor {

  Map<Integer, Mouse> mouses = Map.of(1, new Mouse(1L, 2));

  @Override
  public Mouse changeColor(int newColorNumber) {
    return mouses.get(1).toBuilder().color(newColorNumber).build();
  }
}
