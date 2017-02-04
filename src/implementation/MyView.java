package implementation;

import engine.command.InputCommand;
import engine.view.View;
import engine.view.gui.DebugView;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.security.Key;

/**
 * Created by thomas on 4-2-17.
 */
public class MyView extends DebugView {
    public MyView(String s) {
        super(s);

        mapKey('z', new InputCommand(InputCommand.Type.CONFIRM));
        mapKey('x', new InputCommand(InputCommand.Type.CANCEL));
        mapKey((char) KeyEvent.VK_ENTER, new InputCommand(InputCommand.Type.START));
    }

    public static void main(String[] args) {
        View view = new MyView("MyApp");
    }
}
