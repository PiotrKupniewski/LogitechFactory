import color.ColorTranslator;

public class Simulation {

  public static void main(String[] args) {
    var requestedColor = "red";
    var newDpi = 2300.0;
    var desktopApp = startDesktopApp();
    int newVolume = 10;

    desktopApp.processColorChange(1L, requestedColor);
    desktopApp.processColorChange(2L, requestedColor);
    desktopApp.mouseSensitive(1L, newDpi);

    desktopApp.processColorChange(3L, requestedColor);
    desktopApp.mouseSensitive(3L, newDpi);

    desktopApp.volumeUp(4L, newVolume);
    desktopApp.mouseSensitive(4L, 123);
    desktopApp.processColorChange(4L, "black");
  }

  private static LogitechApplication startDesktopApp() {
    var colorTranslator = new ColorTranslator();
    var devices = new Devices();
    return new LogitechApplication(colorTranslator, devices);
  }
}

// kompilacja i poprawa mapy
// działanie z klawiaturą i myszką
// 1. dodac usecase , dodac czułość myszki
// -> dodać keyboard ma ledy, ale nie ma czułości myszki

// TODO. obsługa zdarzenia odłączenia urządzenia
// TODO pododawać device i pomieszane zachowania
