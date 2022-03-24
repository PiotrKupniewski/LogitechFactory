package color;

public class ColorTranslator {
  public Integer fromString(String newColor) {
    int colorNumber = newColor.equalsIgnoreCase("red") ? 1 : 0;
    return colorNumber;
  }
}
