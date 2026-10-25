package bin.mt.plugin.api.ui;

import bin.mt.plugin.api.ui.PluginButton;

/* loaded from: classes2.dex */
public interface PluginCompoundButton extends PluginButton {

    /* loaded from: classes.dex */
    public interface OnCheckedChangeListener {
        void onCheckedChanged(PluginCompoundButton pluginCompoundButton, boolean z);
    }

    @Override // bin.mt.plugin.api.ui.PluginButton
    @Deprecated
    PluginButton.Style getStyle();

    boolean isChecked();

    void setChecked(boolean z);

    void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener);
}
