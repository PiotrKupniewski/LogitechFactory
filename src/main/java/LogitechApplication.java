import device.DeviceCommunicator;

public class ApplicationManager {

  ApplicationPresenter presenter;
  ActionProcessor processor;
  DeviceCommunicator communicator;

  public ApplicationManager(
      ApplicationPresenter presenter, ActionProcessor processor, DeviceCommunicator communicator) {
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
