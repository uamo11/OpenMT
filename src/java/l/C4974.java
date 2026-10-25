package l;

/* compiled from: 72QW */
/* renamed from: l.ۙ᩻ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C4974 implements InterfaceC18380 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String mo14437(String str) {
        return str;
    }

    @Override // l.InterfaceC18380
    /* renamed from: ֫ */
    public final Object mo4329(Object obj) {
        String str = (String) obj;
        if (str.length() <= 0 || str.charAt(0) != '[') {
            return mo14437(str);
        }
        int lastIndexOf = str.lastIndexOf("[") + 1;
        return C16014.m37867(str.substring(0, lastIndexOf), mo14437(str.substring(lastIndexOf)));
    }
}
