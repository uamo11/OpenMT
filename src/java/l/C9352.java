package l;

import android.media.MediaFormat;

/* compiled from: M8TF */
/* renamed from: l.ۢۙ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9352 implements InterfaceC22618, InterfaceC20711, InterfaceC5783 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC22618 f28398;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC22618 f28399;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC20711 f28400;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC20711 f28401;

    @Override // l.InterfaceC5783
    /* renamed from: ֫ */
    public final void mo13450(int i, Object obj) {
        if (i == 7) {
            this.f28398 = (InterfaceC22618) obj;
            return;
        }
        if (i == 8) {
            this.f28400 = (InterfaceC20711) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        C20005 c20005 = (C20005) obj;
        if (c20005 == null) {
            this.f28399 = null;
            this.f28401 = null;
        } else {
            this.f28399 = c20005.m46142();
            this.f28401 = c20005.m46140();
        }
    }

    @Override // l.InterfaceC22618
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo24148(long j, long j2, C8353 c8353, MediaFormat mediaFormat) {
        InterfaceC22618 interfaceC22618 = this.f28399;
        if (interfaceC22618 != null) {
            interfaceC22618.mo24148(j, j2, c8353, mediaFormat);
        }
        InterfaceC22618 interfaceC226182 = this.f28398;
        if (interfaceC226182 != null) {
            interfaceC226182.mo24148(j, j2, c8353, mediaFormat);
        }
    }

    @Override // l.InterfaceC20711
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo24149(long j, float[] fArr) {
        InterfaceC20711 interfaceC20711 = this.f28401;
        if (interfaceC20711 != null) {
            interfaceC20711.mo24149(j, fArr);
        }
        InterfaceC20711 interfaceC207112 = this.f28400;
        if (interfaceC207112 != null) {
            interfaceC207112.mo24149(j, fArr);
        }
    }

    @Override // l.InterfaceC20711
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo24150() {
        InterfaceC20711 interfaceC20711 = this.f28401;
        if (interfaceC20711 != null) {
            interfaceC20711.mo24150();
        }
        InterfaceC20711 interfaceC207112 = this.f28400;
        if (interfaceC207112 != null) {
            interfaceC207112.mo24150();
        }
    }
}
