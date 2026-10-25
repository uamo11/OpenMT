package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: T57T */
/* renamed from: l.᩸᩷ܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21833 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f69944;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f69945;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f69946;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String[] f69947;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f69948;

    public C21833(C22538 c22538) {
        C8986 c8986;
        ArrayList arrayList;
        byte[] bArr;
        HashMap hashMap;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashMap hashMap2;
        byte[] bArr2 = new byte[0];
        this.f69945 = bArr2;
        c8986 = c22538.f72923;
        this.f69944 = c8986.m23221();
        this.f69948 = new int[0];
        this.f69946 = new int[0];
        arrayList = c22538.f72922;
        this.f69947 = new String[arrayList.size()];
        bArr = c22538.f72919;
        System.arraycopy(bArr, 0, bArr2, 0, 0);
        hashMap = c22538.f72921;
        for (C15481 c15481 : hashMap.values()) {
            int[] iArr = this.f69948;
            c15481.getClass();
            iArr[0] = 0;
            this.f69946[0] = 0;
        }
        arrayList2 = c22538.f72922;
        arrayList2.toArray(this.f69947);
        arrayList3 = c22538.f72920;
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            byte[] bArr3 = this.f69944;
            short s = (short) ((bArr3[intValue] & 255) | ((bArr3[intValue + 1] & 255) << 8));
            int intValue2 = num.intValue();
            hashMap2 = c22538.f72921;
            ((C15481) hashMap2.get(Short.valueOf(s))).getClass();
            byte[] bArr4 = this.f69944;
            byte b = (byte) 0;
            bArr4[intValue2] = b;
            bArr4[intValue2 + 1] = b;
            bArr4[intValue2 + 2] = b;
            bArr4[intValue2 + 3] = b;
        }
    }

    public C21833(byte[] bArr, byte[] bArr2, int[] iArr, int[] iArr2, String[] strArr) {
        this.f69945 = bArr;
        this.f69944 = bArr2;
        this.f69948 = iArr;
        this.f69946 = iArr2;
        this.f69947 = strArr;
    }
}
