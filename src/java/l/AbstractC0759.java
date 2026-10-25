package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: 98I4 */
/* renamed from: l.֨֡֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC0759 implements InterfaceC0053 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C18399 f2815;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f2816;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f2817;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18399 f2818;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C18399 f2819;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f2820;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C18399 f2821;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public void mo2902() {
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract C18399 mo2903(C18399 c18399);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void mo2904() {
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void mo2905() {
    }

    public AbstractC0759() {
        ByteBuffer byteBuffer = InterfaceC0053.f930;
        this.f2816 = byteBuffer;
        this.f2817 = byteBuffer;
        C18399 c18399 = C18399.f57130;
        this.f2821 = c18399;
        this.f2815 = c18399;
        this.f2818 = c18399;
        this.f2819 = c18399;
    }

    @Override // l.InterfaceC0053
    /* renamed from: ֫ */
    public final C18399 mo961(C18399 c18399) {
        this.f2821 = c18399;
        this.f2815 = mo2903(c18399);
        return mo964() ? this.f2815 : C18399.f57130;
    }

    @Override // l.InterfaceC0053
    /* renamed from: ܽ */
    public boolean mo964() {
        return this.f2815 != C18399.f57130;
    }

    @Override // l.InterfaceC0053
    /* renamed from: ܿ */
    public final void mo965() {
        this.f2820 = true;
        mo2905();
    }

    @Override // l.InterfaceC0053
    /* renamed from: ᩳ */
    public ByteBuffer mo966() {
        ByteBuffer byteBuffer = this.f2817;
        this.f2817 = InterfaceC0053.f930;
        return byteBuffer;
    }

    @Override // l.InterfaceC0053
    /* renamed from: ۧ */
    public boolean mo963() {
        return this.f2820 && this.f2817 == InterfaceC0053.f930;
    }

    @Override // l.InterfaceC0053
    public final void flush() {
        this.f2817 = InterfaceC0053.f930;
        this.f2820 = false;
        this.f2818 = this.f2821;
        this.f2819 = this.f2815;
        mo2904();
    }

    @Override // l.InterfaceC0053
    public final void reset() {
        ByteBuffer byteBuffer = InterfaceC0053.f930;
        this.f2817 = byteBuffer;
        this.f2820 = false;
        this.f2816 = byteBuffer;
        C18399 c18399 = C18399.f57130;
        this.f2821 = c18399;
        this.f2815 = c18399;
        this.f2818 = c18399;
        this.f2819 = c18399;
        mo2902();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m2900(int i) {
        if (this.f2816.capacity() < i) {
            this.f2816 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f2816.clear();
        }
        ByteBuffer byteBuffer = this.f2816;
        this.f2817 = byteBuffer;
        return byteBuffer;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m2901() {
        return this.f2817.hasRemaining();
    }
}
