package l;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* compiled from: P1QX */
/* renamed from: l.ᩴۘܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C18515 implements InterfaceC7961, InterfaceC7197 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m43029(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm(str, str2);
        return new StringBuilder(str3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10130 m43030(int i) {
        C10130 c10130 = new C10130();
        c10130.writeInt(i);
        return c10130;
    }

    @Override // l.InterfaceC7197
    /* renamed from: ֫ */
    public String mo19279(EnumC21309 enumC21309, String str, String str2) {
        String m28246;
        m28246 = EnumC11431.m28246(enumC21309, str, str2);
        return m28246;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43032(int i, int i2, CharSequence charSequence) {
        if (i != 0 && charSequence.charAt(i - 1) != '\n') {
            throw new RuntimeException();
        }
        if (i2 != charSequence.length() && charSequence.charAt(i2) != '\n') {
            throw new RuntimeException();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m43034(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m43033(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char charAt = charSequence.charAt(i2 - 1);
            if (charAt != ' ' && charAt != '\t') {
                break;
            }
            i2--;
        }
        return i2;
    }
}
