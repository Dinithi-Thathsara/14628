public class Main {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl(2);
        Light kitchenLight =  new KitchenRoomLight();
        Light livingRoomLight =  new LivingRoomLight();

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff= new LightOffCommand(kitchenLight);
        LightDimCommand kitchenLightDim = new LightDimCommand(kitchenLight, 50);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomLightDim = new LightDimCommand(livingRoomLight, 30);

        remoteControl.setCommand(0,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommand(1,livingRoomLightOn,livingRoomLightOff);

        remoteControl.pressOn(0);
        remoteControl.pressOff(0);
        remoteControl.pressUndo();

        remoteControl.pressOn(1);
        remoteControl.pressOff(1);
        remoteControl.pressUndo();

        kitchenLightDim.execute();
        kitchenLightDim.undo();

        livingRoomLightDim.execute();
        livingRoomLightDim.undo();


    }
}