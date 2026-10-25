package l;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: 052E */
/* renamed from: l.᩵۠ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19342 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public SimpleDateFormat f60832;

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        String m31260 = m31260();
        if (m31260.trim().isEmpty()) {
            m31262();
            return;
        }
        try {
            new SimpleDateFormat(m31260, Locale.ENGLISH);
            ApplicationC20075.f65008.edit().putString("rdtp", m31260).apply();
            m31262();
        } catch (Exception unused) {
        }
    }
}
