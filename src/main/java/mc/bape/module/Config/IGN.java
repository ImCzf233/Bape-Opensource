package mc.bape.module.Config;

import mc.bape.module.ModuleType;
import mc.bape.module.Module;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

import static org.lwjgl.input.Keyboard.KEY_NONE;

public class IGN extends Module {
    public IGN() {
        super("CopyName", KEY_NONE, ModuleType.Global,"copy your name for party");
        Chinese="复制名字";
        NoToggle=true;
    }

    public void enable() {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(mc.thePlayer.getName()), null);
        state=false;
    }
}
