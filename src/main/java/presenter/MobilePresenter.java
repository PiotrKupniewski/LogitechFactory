package presenter;

public class MobilePresenter implements ApplicationPresenter {
    @Override
    public Integer swapColorNameWithId(String newColor) {
        return newColor.equalsIgnoreCase("red") ? 1 : 2;
    }
}
