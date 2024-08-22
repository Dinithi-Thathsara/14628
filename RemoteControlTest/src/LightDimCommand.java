public class LightDimCommand implements Command {
    private Light light;
    private int prevBrightness;
    private int newBrightness;

    public LightDimCommand(Light light, int brightness) {
        this.light = light;
        this.newBrightness = brightness;
    }

    @Override
    public void execute() {
        prevBrightness = light instanceof KitchenRoomLight
                ? ((KitchenRoomLight) light).getBrightness()
                : ((LivingRoomLight) light).getBrightness();
        light.dim(newBrightness);
    }

    @Override
    public void undo() {
        light.dim(prevBrightness);
    }
}