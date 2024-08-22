import java.util.Stack;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command[] dimCommands;
    private Stack<Command> commandHistory;

    public RemoteControl(int numSlots) {
        onCommands = new Command[numSlots];
        offCommands = new Command[numSlots];
        dimCommands = new Command[numSlots];
        commandHistory = new Stack<>();

        // No-op command that does nothing
        Command noCommand = new Command() {
            @Override
            public void execute() {}
            @Override
            public void undo() {}
        };

        for (int i = 0; i < numSlots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
            dimCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void setDimCommand(int slot, Command dimCommand) {
        dimCommands[slot] = dimCommand;
    }

    public void pressOn(int slot) {
        onCommands[slot].execute();
        commandHistory.push(onCommands[slot]);
    }

    public void pressOff(int slot) {
        offCommands[slot].execute();
        commandHistory.push(offCommands[slot]);
    }

    public void pressDim(int slot) {
        dimCommands[slot].execute();
        commandHistory.push(dimCommands[slot]);
    }

    public void pressUndo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        } else {
            System.out.println("No command to undo.");
        }
    }
}
