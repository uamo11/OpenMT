package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: 38SD */
/* renamed from: l.ۘۚۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3736 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f11804;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f11805;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f11806;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f11807;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m11352() {
        int i = this.f11804;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public C3736(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f11807 = str;
        this.f11804 = i2;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = C20195.unmodifiableList(arrayList);
        }
        this.f11806 = unmodifiableList;
        this.f11805 = bArr;
    }
}
