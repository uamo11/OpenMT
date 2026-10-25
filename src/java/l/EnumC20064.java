package l;

import org.simpleframework.xml.strategy.Name;

/* compiled from: D445 */
/* renamed from: l.᩶ۡ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum EnumC20064 {
    NONE,
    CLASS,
    UNSET;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC20064 m46247(String str) {
        if (str == null) {
            return UNSET;
        }
        if (str.equals("none")) {
            return NONE;
        }
        if (str.equals(Name.LABEL)) {
            return CLASS;
        }
        return UNSET;
    }
}
