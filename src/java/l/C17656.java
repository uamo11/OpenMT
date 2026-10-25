package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

/* compiled from: UAO5 */
/* renamed from: l.ܿ᩺ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17656 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f54023;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f54025 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f54024 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18362 m41383(String str) {
        HashMap hashMap = this.f54024;
        C18362 c18362 = (C18362) hashMap.get(str);
        if (c18362 != null) {
            return c18362;
        }
        C18362 c183622 = new C18362(str, -1);
        hashMap.put(str, c183622);
        return c183622;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18362 m41382(int i, String str) {
        if (i == 0) {
            return m41383(str);
        }
        String str2 = i + "-" + str;
        HashMap hashMap = this.f54025;
        C18362 c18362 = (C18362) hashMap.get(str2);
        if (c18362 != null) {
            return c18362;
        }
        C18362 c183622 = new C18362(str, i);
        hashMap.put(str2, c183622);
        return c183622;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13260 m41381(boolean z) {
        String str;
        final ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f54025;
        final C15859 c15859 = new C15859(hashMap.size());
        C5378.stream(hashMap.values()).sorted().forEach(new Consumer() { // from class: l.ۧ᩺ۡ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void n(Object obj) {
                int i;
                C18362 c18362 = (C18362) obj;
                arrayList.add(c18362);
                i = c18362.f57055;
                c15859.add(i);
            }
        });
        this.f54023 = c15859.mo3586();
        C5378.stream(this.f54024.values()).sorted().forEach(new Consumer() { // from class: l.ܽ᩺ۡ
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void n(Object obj) {
                arrayList.add((C18362) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }
        });
        C13260 c13260 = new C13260();
        c13260.m32181(z);
        for (int i = 0; i < arrayList.size(); i++) {
            C18362 c18362 = (C18362) arrayList.get(i);
            c18362.f57056 = i;
            str = c18362.f57054;
            c13260.m32182(str);
        }
        return c13260;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] m41384() {
        int[] iArr = this.f54023;
        if (iArr != null) {
            return iArr;
        }
        throw new IllegalStateException();
    }
}
