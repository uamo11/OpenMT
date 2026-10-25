package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: H6OO */
/* renamed from: l.ܿۨۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17325 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18031[] f53061;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C19012 f53062;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final List f53063;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f53064;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f53065;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f53066;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f53067;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f53068;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean[] f53069;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f53070;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean[] f53071;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18031[] f53072;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40649(int i) {
        return i == 59 || i == 57 || i == 55;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m40651(CharSequence charSequence, boolean z, int i, C19012 c19012) {
        C1803.m5995(charSequence, z, i, c19012);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0284 A[LOOP:3: B:116:0x0282->B:117:0x0284, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03f5  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m40648(java.lang.CharSequence r18, boolean r19, int r20, l.C19012 r21) {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17325.m40648(java.lang.CharSequence, boolean, int, l.ᩴ᩷ܿ):void");
    }

    public C17325(CharSequence charSequence, ArrayList arrayList, boolean z, int i, C19012 c19012) {
        String str;
        char charAt;
        this.f53063 = arrayList;
        int max = Math.max(1, i);
        this.f53064 = max;
        this.f53070 = z ? "\t" : C9679.m24607(' ', max);
        int i2 = 0;
        while (true) {
            str = "\n";
            if (i2 >= charSequence.length() || (charAt = charSequence.charAt(i2)) == '\n') {
                break;
            }
            if (charAt == '\r') {
                int i3 = i2 + 1;
                str = (i3 >= charSequence.length() || charSequence.charAt(i3) != '\n') ? "\r" : "\r\n";
            } else {
                i2++;
            }
        }
        this.f53066 = str;
        this.f53062 = c19012;
        this.f53072 = new C18031[arrayList.size()];
        this.f53061 = new C18031[arrayList.size()];
        this.f53069 = new boolean[arrayList.size()];
        this.f53071 = new boolean[arrayList.size()];
        this.f53068 = new int[arrayList.size()];
        this.f53067 = new int[arrayList.size() + 1];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40650(int i, int i2) {
        return ((!this.f53069[i2] && !this.f53071[i2]) || i == 0 || i == 65 || m40649(i) || i == 54 || i == 61 || i == 62 || i == 63 || ((InterfaceC0463) this.f53063.get(i2)).getType() == 61) ? false : true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m40652(int i, int i2) {
        return (i == 0 || m40649(i) || i2 == 54 || i2 == 53 || i2 == 55 || i2 == 60 || i2 == 58 || i2 == 56) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40647() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
    }
}
