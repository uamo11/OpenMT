package l;

/* compiled from: UA1Q */
/* renamed from: l.ۚۢ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5278 extends AbstractC18684 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m15205(String str, EnumC0338 enumC0338) {
        int ordinal = enumC0338.ordinal();
        int i = 1;
        if (ordinal == 0) {
            StringBuilder sb = new StringBuilder(str.length() + 5);
            int indexOf = str.indexOf(".local.");
            int lastIndexOf = str.lastIndexOf(45);
            if (lastIndexOf < 0) {
                sb.append(str.substring(0, indexOf));
            } else {
                try {
                    int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1, indexOf)) + 1;
                    sb.append(str.substring(0, lastIndexOf));
                    i = parseInt;
                } catch (Exception unused) {
                    sb.append(str.substring(0, indexOf));
                }
            }
            sb.append('-');
            sb.append(i);
            sb.append(".local.");
            return sb.toString();
        }
        if (ordinal != 1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 5);
        int lastIndexOf2 = str.lastIndexOf(40);
        int lastIndexOf3 = str.lastIndexOf(41);
        if (lastIndexOf2 >= 0 && lastIndexOf2 < lastIndexOf3) {
            try {
                sb2.append(str.substring(0, lastIndexOf2));
                sb2.append('(');
                sb2.append(Integer.parseInt(str.substring(lastIndexOf2 + 1, lastIndexOf3)) + 1);
                sb2.append(')');
            } catch (NumberFormatException unused2) {
                sb2.setLength(0);
                sb2.append(str);
                sb2.append(" (2)");
            }
        } else {
            sb2.append(str);
            sb2.append(" (2)");
        }
        return sb2.toString();
    }
}
