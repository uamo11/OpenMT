package l;

import java.util.List;

/* compiled from: J1L9 */
/* renamed from: l.᩶ܳۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum EnumC20224 {
    LEFT(0),
    RIGHT(1);


    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ boolean f65421 = false;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f65423;

    EnumC20224(int i) {
        this.f65423 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC20224 m46459(int i) {
        if (i == 0) {
            return LEFT;
        }
        if (i == 1) {
            return RIGHT;
        }
        throw new IndexOutOfBoundsException(C19370.m44628(i, "index: "));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC20224 m46461(boolean z) {
        return z ? LEFT : RIGHT;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static EnumC20224 m46462(boolean z) {
        return z ? RIGHT : LEFT;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC20224 m46460(List list, Object obj) {
        int indexOf = list.indexOf(obj);
        if (indexOf != -1) {
            return m46459(indexOf);
        }
        return null;
    }

    public int getIndex() {
        return this.f65423;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m46472() {
        return this.f65423 == 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC20224 m46481() {
        return m46472() ? RIGHT : LEFT;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC20224 m46471(boolean z) {
        return z ? m46481() : this;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m46474(int i, int i2) {
        return m46472() ? i : i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object m46467(Object obj, Object obj2) {
        return m46472() ? obj : obj2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object m46477(Object obj, Object obj2) {
        return m46472() ? obj : obj2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m46473(boolean[] zArr) {
        return zArr[this.f65423];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m46466(int[] iArr) {
        return iArr[this.f65423];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object m46470(Object[] objArr) {
        return objArr[this.f65423];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object m46480(Object[] objArr) {
        return objArr[this.f65423];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object m46468(List list) {
        return list.get(this.f65423);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object m46478(List list) {
        return list.get(this.f65423);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object m46469(C3290 c3290) {
        return m46472() ? c3290.f39374 : c3290.f39375;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object m46479(C3290 c3290) {
        return m46472() ? c3290.f39374 : c3290.f39375;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m46476(InterfaceC18813 interfaceC18813) {
        return m46472() ? interfaceC18813.mo15487() : interfaceC18813.mo15485();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m46465(InterfaceC18813 interfaceC18813) {
        return m46472() ? interfaceC18813.mo15477() : interfaceC18813.mo15489();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m46475(InterfaceC0467 interfaceC0467) {
        return m46472() ? interfaceC0467.mo2065() : interfaceC0467.mo2068();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m46464(InterfaceC0467 interfaceC0467) {
        return m46472() ? interfaceC0467.mo2063() : interfaceC0467.mo2072();
    }
}
