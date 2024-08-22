public class LivingRoomLight implements Light {
    private int brightness;

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Living Room Light is ON at full brightness.");
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Living Room Light is OFF.");
    }

    @Override
    public void dim(int level) {
        if (level >= 0 && level <= 100) {
            brightness = level;
            System.out.println("Living Room Light dimmed to " + brightness + "% ");
        } else {
            System.out.println("Invalid brightness level.");
        }
    }

    public int getBrightness() {
        return brightness;
    }
}