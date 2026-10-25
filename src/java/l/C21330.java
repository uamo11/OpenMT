package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.Closeable;
import java.util.ArrayDeque;

/* compiled from: S6V6 */
/* renamed from: l.᩸ۘۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21330 implements Closeable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f68734 = new ArrayDeque();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f68735;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C0161 f68736;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19563 f68737;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f68738;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11459 f68739;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f68740;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15683 f68741;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18507 f68742;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f68743;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f68744;

    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C21330(l.AbstractC15440 r8, l.C17095 r9, l.C15683 r10, l.C19563 r11, l.C11459 r12, l.C0867 r13) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21330.<init>(l.ܶ᩵ܿ, l.ܿۘۜ, l.ܺۘۜ, l.᩵ܺۜ, l.ۨۘܽ, l.֨ۘۜ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        r17 = r10;
        r15 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0267, code lost:
    
        r1.f45651 = "output_limit";
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C14978 m48356(long r28, long r30, l.C11440 r32) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21330.m48356(long, long, l.ۨۗᩳ):l.ܶۘۜ");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m48354() {
        C0161.m1279();
        C12164 matcher = this.f68739.matcher((CharSequence) this.f68742.m43010().substring(0, this.f68742.m43011()));
        this.f68743 = matcher.find();
        C0161.m1279();
        if (matcher.m29603() || matcher.m29613()) {
            this.f68738 = "resource_limit";
            this.f68744 = "match_resource_limit";
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48353(C18507 c18507) {
        C19563 c19563 = this.f68737;
        if (c19563.m44994() == 0) {
            return;
        }
        C18507 m43009 = c18507.m43009(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        ArrayDeque arrayDeque = this.f68734;
        arrayDeque.addLast(m43009);
        this.f68740 = m43009.m43010().length() + this.f68740;
        while (arrayDeque.size() > c19563.m44994()) {
            this.f68740 -= ((C18507) arrayDeque.removeFirst()).m43010().length();
        }
        while (this.f68740 > 131072 && !arrayDeque.isEmpty()) {
            C18507 c185072 = (C18507) arrayDeque.removeFirst();
            int length = this.f68740 - c185072.m43010().length();
            this.f68740 = length;
            int i = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT - length;
            if (i > 1) {
                C18507 m430092 = c185072.m43009(i);
                arrayDeque.addFirst(m430092);
                this.f68740 = m430092.m43010().length() + this.f68740;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m48355() {
        long length = (this.f68737.m44996().length() * 512) + 65536;
        int i = this.f68740;
        return ((i + (this.f68742 == null ? 0 : r3.m43010().length())) * 2) + length;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f68736.close();
    }
}
