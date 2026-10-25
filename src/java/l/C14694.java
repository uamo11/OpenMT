package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: L19N */
/* renamed from: l.ܳᩳᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14694 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11126 f44887;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f44888 = new HashMap();

    public C14694(byte[] bArr) {
        C16769 c16769 = new C16769(bArr);
        this.f44887 = c16769.m39451();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C11126 m39451 = c16769.m39451();
            if (m39451 == null) {
                break;
            } else {
                arrayList.add(m39451);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C11126 c11126 = (C11126) it.next();
            this.f44888.put(c11126.m27608(), c11126);
        }
    }
}
