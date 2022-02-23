package presenter;

public class DesktopPresenter implements ApplicationPresenter {

  @Override
  public Integer swapColorNameWithId(String newColor) {
    int colorNumber = newColor.equalsIgnoreCase("red") ? 1 : 0;
    return colorNumber;
  }
}
