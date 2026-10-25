package l;

import android.os.Handler;
import android.os.Trace;

/* compiled from: 98FL */
/* renamed from: l.۫᩸֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12670 extends AbstractC15289 {
    @Override // l.InterfaceC1837, l.InterfaceC18065
    public final String getName() {
        return "ExperimentalFfmpegVideoRenderer";
    }

    @Override // l.AbstractC15289
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1381 mo30948(C8353 c8353) {
        Trace.beginSection("createFfmpegVideoDecoder");
        Trace.endSection();
        return null;
    }

    public C12670(long j, Handler handler, InterfaceC16476 interfaceC16476, int i) {
        super(j, handler, interfaceC16476, i);
    }

    @Override // l.AbstractC15289
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13396 mo30947(String str, C8353 c8353, C8353 c83532) {
        boolean equals = C11003.equals(c8353.f25614, c83532.f25614);
        return new C13396(str, c8353, c83532, equals ? 3 : 0, equals ? 0 : 8);
    }

    @Override // l.InterfaceC18065
    /* renamed from: ֫ */
    public final int mo16568(C8353 c8353) {
        return C11010.m27348(0, 0, 0, 0);
    }
}
