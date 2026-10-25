package l;

/* compiled from: U9Q8 */
/* renamed from: l.֫֨ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1487 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5148(InterfaceC7256 interfaceC7256) {
        StringBuilder sb = new StringBuilder(interfaceC7256.size());
        for (int i = 0; i < interfaceC7256.size(); i++) {
            byte mo19423 = interfaceC7256.mo19423(i);
            if (mo19423 == 34) {
                sb.append("\\\"");
            } else if (mo19423 == 39) {
                sb.append("\\'");
            } else if (mo19423 != 92) {
                switch (mo19423) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (mo19423 >= 32 && mo19423 <= 126) {
                            sb.append((char) mo19423);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((mo19423 >>> 6) & 3) + 48));
                            sb.append((char) (((mo19423 >>> 3) & 7) + 48));
                            sb.append((char) ((mo19423 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5147(AbstractC5886 abstractC5886) {
        return m5148(new C22778(abstractC5886));
    }
}
