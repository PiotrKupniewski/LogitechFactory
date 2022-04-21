package desktop;

class DesktopColorTranslator {
  Integer fromString(String newColor) {
    return newColor.equalsIgnoreCase("red") ? 1 : 0;
  }
}
