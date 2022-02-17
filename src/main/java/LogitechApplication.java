import communicator.DeviceCommunicator;
import device.DeviceProcessor;
import presenter.ApplicationPresenter;

public class LogitechApplication {

  ApplicationPresenter presenter;
  DeviceProcessor processor;
  DeviceCommunicator communicator;

  public LogitechApplication(
      ApplicationPresenter presenter, DeviceProcessor processor, DeviceCommunicator communicator) {
    this.presenter = presenter;
    this.processor = processor;
    this.communicator = communicator;
  }

  public Integer swapColorNameWithId(String requestedColor) {
    return presenter.swapColorNameWithId(requestedColor);
  }

  public void processColorChange(Integer newColorId) {
    var mouse = processor.changeColor(newColorId);
    communicator.sendChangeColorAction(mouse);
  }
}
