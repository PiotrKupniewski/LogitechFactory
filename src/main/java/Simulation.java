import communicator.KeyboardCommunicator;
import communicator.MouseCommunicator;
import device.KeyboardProcessor;
import device.MouseProcessor;
import presenter.DesktopPresenter;
import presenter.MobilePresenter;

public class Simulation {

  public static void main(String[] args) {
    var requestedColor = "red";
    var desktopApp = startDesktopApp();
    var mobileApp = startMobileApp();

    var mobileColorId = mobileApp.swapColorNameWithId(requestedColor);
    mobileApp.processColorChange(mobileColorId);

    var newColorId = desktopApp.swapColorNameWithId(requestedColor);
    desktopApp.processColorChange(newColorId);
  }

  private static LogitechApplication startMobileApp() {
    var mobilePresenter = new MobilePresenter();
    var keyboardProcessor = new KeyboardProcessor();
    var communicator = new KeyboardCommunicator();
    return new LogitechApplication(mobilePresenter, keyboardProcessor, communicator);
  }

  private static LogitechApplication startDesktopApp() {
    var desktopPresenter = new DesktopPresenter();
    var mouseProcessor = new MouseProcessor();
    var communicator = new MouseCommunicator();
    return new LogitechApplication(desktopPresenter, mouseProcessor, communicator);
  }
}
