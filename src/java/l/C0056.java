package l;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* compiled from: O1HV */
/* renamed from: l.֡֡ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0056 implements Cloneable {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC4291 f939;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC2880 f933 = EnumC2880.base;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Charset f938 = C17696.f54158;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f937 = new ThreadLocal();

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f935 = true;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f932 = 1;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f936 = 30;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC19108 f934 = EnumC19108.html;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC2880 m981() {
        return this.f933;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m976(EnumC2880 enumC2880) {
        this.f933 = enumC2880;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CharsetEncoder m980() {
        CharsetEncoder newEncoder = this.f938.newEncoder();
        this.f937.set(newEncoder);
        this.f939 = EnumC4291.m12872(newEncoder.charset().name());
        return newEncoder;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharsetEncoder m975() {
        CharsetEncoder charsetEncoder = (CharsetEncoder) this.f937.get();
        return charsetEncoder != null ? charsetEncoder : m980();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC19108 m984() {
        return this.f934;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m977(EnumC19108 enumC19108) {
        this.f934 = enumC19108;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m979() {
        return this.f935;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m978() {
        this.f935 = false;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m983() {
        return this.f932;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m982() {
        return this.f936;
    }

    public final C0056 clone() {
        try {
            C0056 c0056 = (C0056) super.clone();
            String name = this.f938.name();
            c0056.getClass();
            c0056.f938 = Charset.forName(name);
            c0056.f933 = EnumC2880.valueOf(this.f933.name());
            return c0056;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
