package l;

import android.widget.SeekBar;

/* compiled from: 99K3 */
/* renamed from: l.֫֫᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1523 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10696 f5394;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public C1523(C10696 c10696) {
        this.f5394 = c10696;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f5394.m26824(i / 100.0f);
        }
    }
}
