package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: I6LR */
/* renamed from: l.᩹֨֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21946 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashSet f70307;

    public C21946() {
        int i = 0;
        Object[] objArr = {a.s, b.a, "mailto", e.m};
        ArrayList arrayList = new ArrayList(4);
        while (i < 4) {
            Object obj = objArr[i];
            i = C8954.m23073(obj, arrayList, obj, i, 1);
        }
        this.f70307 = new HashSet(C20195.unmodifiableList(arrayList));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m49435(String str) {
        char charAt;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ')) {
            length--;
        }
        int i = 0;
        while (i < length) {
            char charAt2 = str.charAt(i);
            if (charAt2 != '\t' && charAt2 != '\n' && charAt2 != '\f' && charAt2 != '\r' && charAt2 != ' ') {
                break;
            }
            i++;
        }
        if (i != 0 || length != str.length()) {
            str = str.substring(i, length);
        }
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt3 = str.charAt(i2);
            if (charAt3 == '#' || charAt3 == '/') {
                return str;
            }
            if (charAt3 == ':') {
                return !this.f70307.contains(str.substring(0, i2).toLowerCase()) ? "" : str;
            }
            if (charAt3 == '?') {
                return str;
            }
        }
        return str;
    }
}
