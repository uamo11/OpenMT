package l;

import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: U8G3 */
/* renamed from: l.ۛᩳۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6222 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f19066;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f19067;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f19068;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f19069;

    public C6222(String str) {
        boolean z;
        String substring;
        String str2;
        this.f19069 = str;
        z = false;
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        this.f19066 = i;
        substring = str.substring(i);
        substring.getClass();
        switch (substring) {
            case "B":
                str2 = ClassTransform.BYTE;
                z = true;
                break;
            case "C":
                str2 = ClassTransform.CHARACTER;
                z = true;
                break;
            case "D":
                str2 = ClassTransform.DOUBLE;
                z = true;
                break;
            case "F":
                str2 = ClassTransform.FLOAT;
                z = true;
                break;
            case "I":
                str2 = ClassTransform.INTEGER;
                z = true;
                break;
            case "J":
                str2 = ClassTransform.LONG;
                z = true;
                break;
            case "S":
                str2 = ClassTransform.SHORT;
                z = true;
                break;
            case "V":
                str2 = ClassTransform.VOID;
                z = true;
                break;
            case "Z":
                str2 = ClassTransform.BOOLEAN;
                z = true;
                break;
            default:
                str2 = C11867.m28976(substring);
                try {
                    ClassLoader.getSystemClassLoader().loadClass(str2);
                    z = true;
                    break;
                } catch (Exception unused) {
                    break;
                }
        }
        this.f19067 = str2;
        this.f19068 = z;
    }
}
