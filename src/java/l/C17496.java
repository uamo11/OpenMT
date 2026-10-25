package l;

import java.nio.ByteBuffer;

/* compiled from: FB7W */
/* renamed from: l.ܿܿᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17496 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f53449;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f53450;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f53451;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f53452;

    public C17496(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2) {
        this.f53449 = byteBuffer;
        this.f53450 = byteBuffer2;
        this.f53451 = i;
        this.f53452 = i2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m40883() {
        return this.f53451;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m40882() {
        return this.f53452;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m40880() {
        return this.f53449.slice();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m40881() {
        return this.f53450.slice();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21025 m40879() {
        return new C21025(this.f53450.slice());
    }
}
