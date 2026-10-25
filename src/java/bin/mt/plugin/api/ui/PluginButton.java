package bin.mt.plugin.api.ui;

/* loaded from: classes.dex */
public interface PluginButton extends PluginTextView {

    public enum Style {
        DEFAULT,
        FILLED,
        OUTLINED
    }

    Style getStyle();
}
