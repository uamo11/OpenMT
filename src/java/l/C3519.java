package l;

import java.util.Locale;

/* compiled from: 98JC */
/* renamed from: l.ۗ᩹֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3519 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f11171;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f11172;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f11173;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f11174;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f11175;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f11176;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f11177;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f11178;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f11179;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f11180;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f11181;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f11182;

    public final String toString() {
        int i = this.f11171;
        int i2 = this.f11175;
        int i3 = this.f11182;
        int i4 = this.f11181;
        int i5 = this.f11172;
        int i6 = this.f11174;
        int i7 = this.f11178;
        int i8 = this.f11180;
        int i9 = this.f11176;
        int i10 = this.f11179;
        long j = this.f11173;
        int i11 = this.f11177;
        String str = C3603.f11424;
        Locale locale = Locale.US;
        StringBuilder m46682 = C20361.m46682("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", "\n queuedInputBuffers=", i2);
        C5834.m16344(m46682, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        C5834.m16344(m46682, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        C5834.m16344(m46682, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        C5834.m16344(m46682, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        m46682.append(j);
        m46682.append("\n videoFrameProcessingOffsetCount=");
        m46682.append(i11);
        m46682.append("\n}");
        return m46682.toString();
    }
}
