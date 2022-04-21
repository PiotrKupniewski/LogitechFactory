package mobile;

public class MobileColorTranslator {
  public Integer fromLong(Long newColor) {
    int colorNumber = newColor == 1L ? 1 : 0;
    return colorNumber;
  }
}
