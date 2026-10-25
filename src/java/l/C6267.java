package l;

import com.alipay.sdk.m.p.a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: UB7S */
/* renamed from: l.ۛ᩵ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6267 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC19674 f19407;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f19409;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f19406 = null;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f19408 = null;

    public C6267(EnumC19674 enumC19674, String str) {
        this.f19407 = null;
        this.f19409 = null;
        this.f19407 = enumC19674 == null ? EnumC19674.DESCENDANT : enumC19674;
        this.f19409 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17277(String str, EnumC2740 enumC2740, String str2) {
        if (this.f19406 == null) {
            this.f19406 = new ArrayList();
        }
        this.f19406.add(new C16144(str, enumC2740, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        EnumC19674 enumC19674 = EnumC19674.CHILD;
        EnumC19674 enumC196742 = this.f19407;
        if (enumC196742 == enumC19674) {
            sb.append("> ");
        } else if (enumC196742 == EnumC19674.FOLLOWS) {
            sb.append("+ ");
        }
        String str = this.f19409;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList arrayList = this.f19406;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C16144 c16144 = (C16144) it.next();
                sb.append('[');
                String str2 = c16144.f49738;
                String str3 = c16144.f49740;
                sb.append(str2);
                int ordinal = c16144.f49739.ordinal();
                if (ordinal == 1) {
                    sb.append(a.h);
                    sb.append(str3);
                } else if (ordinal == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (ordinal == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList arrayList2 = this.f19408;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                InterfaceC5562 interfaceC5562 = (InterfaceC5562) it2.next();
                sb.append(':');
                sb.append(interfaceC5562);
            }
        }
        return sb.toString();
    }
}
