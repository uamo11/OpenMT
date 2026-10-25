package l;

import android.widget.SeekBar;
import android.widget.TextView;

/* compiled from: K5ZN */
/* renamed from: l.᩺᩹ۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23278 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f74752;

    public C23278(TextView textView) {
        this.f74752 = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        String m48031;
        m48031 = C21100.m48031(C21100.m48011(i * 50));
        this.f74752.setText(m48031);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        C6988 c6988;
        C6988 c69882;
        c6988 = C21100.f68050;
        if (c6988 != null) {
            c69882 = C21100.f68050;
            c69882.f21574 = true;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        String m48031;
        C6988 c6988;
        C6988 c69882;
        int progress = seekBar.getProgress() * 50;
        m48031 = C21100.m48031(C21100.m48011(progress));
        this.f74752.setText(m48031);
        c6988 = C21100.f68050;
        if (c6988 != null) {
            c69882 = C21100.f68050;
            c69882.m18911(progress);
        }
    }
}
