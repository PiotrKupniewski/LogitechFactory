import request.DesktopManager;

import java.util.Scanner;

public class Simulation {

  public static void main(String[] args) {
    var requestDesktopManager = new DesktopManager();

    Scanner sc = new Scanner(System.in);
    String color = sc.nextLine();
    String deviceId = sc.nextLine();

    requestDesktopManager.switchLedColor(deviceId, color);
  }
}
