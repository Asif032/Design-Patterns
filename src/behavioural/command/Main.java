package behavioural.command;

public class Main {
  public static void main(String[] args) {
    Light livingRoomLight = new Light("Living room");
    Light kitchenLight = new Light("Kitchen");

    Command livingRoomLightTurnOnCommand = new LightOnCommand(livingRoomLight);
    Command livingRoomLightTurnOffCommand = new LightOffCommand(livingRoomLight);
    Command kitchenLightTurnOnCommand = new LightOnCommand(kitchenLight);
    Command kitchenLightTurnOffCommand = new LightOffCommand(kitchenLight);

    RemoteControl remoteControl = new RemoteControl();
    remoteControl.setCommand(livingRoomLightTurnOnCommand);
    remoteControl.pressButton();
    remoteControl.setCommand(livingRoomLightTurnOffCommand);
    remoteControl.pressButton();

    remoteControl.setCommand(kitchenLightTurnOnCommand);
    remoteControl.pressButton();
    remoteControl.setCommand(kitchenLightTurnOffCommand);
    remoteControl.pressButton();
  }
}
