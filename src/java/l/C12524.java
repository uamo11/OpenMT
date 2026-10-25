package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: 688Y */
/* renamed from: l.۫ܽۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12524 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f37631;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f37632;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f37633;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f37634;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f37635;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20328 f37636;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21697 f37637;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f37638;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f37639;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13955 f37640;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C21697 f37630 = C21697.f69584;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC8291 f37629 = EnumC8291.f25474;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final EnumC0571 f37628 = EnumC0571.f2252;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC0571 f37627 = EnumC0571.f2251;

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m30726(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.Class<com.amazonaws.mobileconnectors.s3.transferutility.TransferUtilityOptions> r0 = com.amazonaws.mobileconnectors.s3.transferutility.TransferUtilityOptions.class
            l.ܽۜۖ r0 = l.C16469.m38775(r0)
            r1 = 0
            if (r11 != 0) goto La
            return r1
        La:
            java.io.StringReader r2 = new java.io.StringReader
            r2.<init>(r11)
            l.ܿۜۖ r11 = new l.ܿۜۖ
            r11.<init>(r2)
            l.ܺᩳۖ r2 = l.EnumC16093.LEGACY_STRICT
            r11.m40392(r2)
            java.lang.String r3 = "AssertionError (GSON 2.13.2): "
            java.lang.String r4 = "Type adapter '"
            l.ܺᩳۖ r5 = r11.m40395()
            l.ܺᩳۖ r6 = r11.m40395()
            if (r6 != r2) goto L2c
            l.ܺᩳۖ r2 = l.EnumC16093.LENIENT
            r11.m40392(r2)
        L2c:
            r11.m40398()     // Catch: java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f java.io.EOFException -> La6
            r2 = 0
            l.۠ᩳۖ r6 = r10.m30728(r0)     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            java.lang.Object r7 = r6.mo2844(r11)     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            java.lang.Class r8 = r0.m38778()     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            java.lang.Class r8 = l.C3395.m10353(r8)     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            if (r7 == 0) goto L78
            boolean r8 = r8.isInstance(r7)     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            if (r8 == 0) goto L49
            goto L78
        L49:
            java.lang.ClassCastException r8 = new java.lang.ClassCastException     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            r9.<init>(r4)     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            r9.append(r6)     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            java.lang.String r4 = "' returned wrong type; requested "
            r9.append(r4)     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            java.lang.Class r0 = r0.m38778()     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            r9.append(r0)     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            java.lang.String r0 = " but got instance of "
            r9.append(r0)     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            java.lang.Class r0 = r7.getClass()     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            r9.append(r0)     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            java.lang.String r0 = "\nVerify that the adapter was registered for the correct type."
            r9.append(r0)     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            java.lang.String r0 = r9.toString()     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            r8.<init>(r0)     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
            throw r8     // Catch: java.io.EOFException -> L7d java.lang.Throwable -> L7f java.lang.AssertionError -> L81 java.io.IOException -> L98 java.lang.IllegalStateException -> L9f
        L78:
            r11.m40392(r5)
            r1 = r7
            goto Lad
        L7d:
            r0 = move-exception
            goto La8
        L7f:
            r0 = move-exception
            goto Ld5
        L81:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L7f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L7f
            r2.append(r3)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7f
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L7f
            throw r1     // Catch: java.lang.Throwable -> L7f
        L98:
            r0 = move-exception
            l.ܳᩳۖ r1 = new l.ܳᩳۖ     // Catch: java.lang.Throwable -> L7f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7f
            throw r1     // Catch: java.lang.Throwable -> L7f
        L9f:
            r0 = move-exception
            l.ܳᩳۖ r1 = new l.ܳᩳۖ     // Catch: java.lang.Throwable -> L7f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7f
            throw r1     // Catch: java.lang.Throwable -> L7f
        La6:
            r0 = move-exception
            r2 = 1
        La8:
            if (r2 == 0) goto Lcf
            r11.m40392(r5)
        Lad:
            if (r1 == 0) goto Lce
            l.ܳۜۖ r11 = r11.m40398()     // Catch: java.io.IOException -> Lc0 l.C6592 -> Lc7
            l.ܳۜۖ r0 = l.EnumC14352.END_DOCUMENT     // Catch: java.io.IOException -> Lc0 l.C6592 -> Lc7
            if (r11 != r0) goto Lb8
            goto Lce
        Lb8:
            l.ܳᩳۖ r11 = new l.ܳᩳۖ     // Catch: java.io.IOException -> Lc0 l.C6592 -> Lc7
            java.lang.String r0 = "JSON document was not fully consumed."
            r11.<init>(r0)     // Catch: java.io.IOException -> Lc0 l.C6592 -> Lc7
            throw r11     // Catch: java.io.IOException -> Lc0 l.C6592 -> Lc7
        Lc0:
            r11 = move-exception
            l.ܰܽۖ r0 = new l.ܰܽۖ
            r0.<init>(r11)
            throw r0
        Lc7:
            r11 = move-exception
            l.ܳᩳۖ r0 = new l.ܳᩳۖ
            r0.<init>(r11)
            throw r0
        Lce:
            return r1
        Lcf:
            l.ܳᩳۖ r1 = new l.ܳᩳۖ     // Catch: java.lang.Throwable -> L7f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7f
            throw r1     // Catch: java.lang.Throwable -> L7f
        Ld5:
            r11.m40392(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12524.m30726(java.lang.String):java.lang.Object");
    }

    public C12524() {
        C3394 c3394 = C3394.f10748;
        Map map = Collections.EMPTY_MAP;
        EnumC21034 enumC21034 = EnumC21034.f67876;
        List list = Collections.EMPTY_LIST;
        this.f37639 = new ThreadLocal();
        this.f37633 = new ConcurrentMapC10942();
        C20328 c20328 = new C20328();
        this.f37636 = c20328;
        this.f37635 = true;
        this.f37637 = f37630;
        this.f37631 = list;
        this.f37634 = list;
        this.f37632 = list;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C21906.f70129);
        arrayList.add(C9640.m24576(f37628));
        arrayList.add(c3394);
        arrayList.addAll(list);
        arrayList.add(C21906.f70128);
        arrayList.add(C21906.f70144);
        arrayList.add(C21906.f70130);
        arrayList.add(C21906.f70146);
        arrayList.add(C21906.f70147);
        AbstractC8333 abstractC8333 = C21906.f70138;
        arrayList.add(C21906.m49305(Long.TYPE, Long.class, abstractC8333));
        arrayList.add(C21906.m49305(Double.TYPE, Double.class, new C22402()));
        arrayList.add(C21906.m49305(Float.TYPE, Float.class, new C20286()));
        arrayList.add(C23750.m52398(f37627));
        arrayList.add(C21906.f70140);
        arrayList.add(C21906.f70124);
        arrayList.add(C21906.m49306(AtomicLong.class, new C4763(abstractC8333).m21935()));
        arrayList.add(C21906.m49306(AtomicLongArray.class, new C3352(abstractC8333).m21935()));
        arrayList.add(C21906.f70134);
        arrayList.add(C21906.f70132);
        arrayList.add(C21906.f70145);
        arrayList.add(C21906.f70148);
        arrayList.add(C21906.m49306(BigDecimal.class, C21906.f70142));
        arrayList.add(C21906.m49306(BigInteger.class, C21906.f70141));
        arrayList.add(C21906.m49306(C13976.class, C21906.f70123));
        arrayList.add(C21906.f70136);
        arrayList.add(C21906.f70126);
        arrayList.add(C21906.f70135);
        arrayList.add(C21906.f70125);
        arrayList.add(C21906.f70131);
        arrayList.add(C21906.f70143);
        arrayList.add(C21906.f70137);
        arrayList.add(C10429.f31334);
        arrayList.add(C21906.f70133);
        if (C10826.f32567) {
            arrayList.add(C10826.f32569);
            arrayList.add(C10826.f32566);
            arrayList.add(C10826.f32568);
        }
        arrayList.add(C22423.f72655);
        arrayList.add(C21906.f70139);
        arrayList.add(new C4784(c20328));
        arrayList.add(new C18106(c20328));
        C13955 c13955 = new C13955(c20328);
        this.f37640 = c13955;
        arrayList.add(c13955);
        arrayList.add(C21906.f70127);
        arrayList.add(new C5406(c20328, f37629, c3394, c13955));
        this.f37638 = C20195.unmodifiableList(arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30725(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r4.m32095(r6);
        r2.put(r9, r6);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC8333 m30728(l.C16469 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "type must not be null"
            l.C11003.requireNonNull(r9, r0)
            l.ۧۤᩴ r0 = r8.f37633
            java.lang.Object r1 = r0.get(r9)
            l.۠ᩳۖ r1 = (l.AbstractC8333) r1
            if (r1 == 0) goto L10
            return r1
        L10:
            java.lang.ThreadLocal r1 = r8.f37639
            java.lang.Object r2 = r1.get()
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L24
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.set(r2)
            r3 = 1
            goto L2e
        L24:
            java.lang.Object r3 = r2.get(r9)
            l.۠ᩳۖ r3 = (l.AbstractC8333) r3
            if (r3 == 0) goto L2d
            return r3
        L2d:
            r3 = 0
        L2e:
            l.۬ܽۖ r4 = new l.۬ܽۖ     // Catch: java.lang.Throwable -> L76
            r4.<init>()     // Catch: java.lang.Throwable -> L76
            r2.put(r9, r4)     // Catch: java.lang.Throwable -> L76
            java.util.List r5 = r8.f37638     // Catch: java.lang.Throwable -> L76
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L76
            r6 = 0
        L3d:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L55
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L76
            l.ܶᩳۖ r6 = (l.InterfaceC15387) r6     // Catch: java.lang.Throwable -> L76
            l.۠ᩳۖ r6 = r6.mo8743(r8, r9)     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L3d
            r4.m32095(r6)     // Catch: java.lang.Throwable -> L76
            r2.put(r9, r6)     // Catch: java.lang.Throwable -> L76
        L55:
            if (r3 == 0) goto L5a
            r1.remove()
        L5a:
            if (r6 == 0) goto L62
            if (r3 == 0) goto L61
            r0.putAll(r2)
        L61:
            return r6
        L62:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "GSON (2.13.2) cannot handle "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L76:
            r9 = move-exception
            if (r3 == 0) goto L7c
            r1.remove()
        L7c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12524.m30728(l.ܽۜۖ):l.۠ᩳۖ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8333 m30727(InterfaceC15387 interfaceC15387, C16469 c16469) {
        C11003.requireNonNull(interfaceC15387, "skipPast must not be null");
        C11003.requireNonNull(c16469, "type must not be null");
        C13955 c13955 = this.f37640;
        if (c13955.m33404(interfaceC15387, c16469)) {
            interfaceC15387 = c13955;
        }
        boolean z = false;
        for (InterfaceC15387 interfaceC153872 : this.f37638) {
            if (z) {
                AbstractC8333 mo8743 = interfaceC153872.mo8743(this, c16469);
                if (mo8743 != null) {
                    return mo8743;
                }
            } else if (interfaceC153872 == interfaceC15387) {
                z = true;
            }
        }
        if (z) {
            throw new IllegalArgumentException("GSON cannot serialize or deserialize " + c16469);
        }
        return m30728(c16469);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30730(Object obj, Class cls, C23525 c23525) {
        AbstractC8333 m30728 = m30728(C16469.m38776((Type) cls));
        EnumC16093 m51982 = c23525.m51982();
        if (c23525.m51982() == EnumC16093.LEGACY_STRICT) {
            c23525.m51977(EnumC16093.LENIENT);
        }
        boolean m51980 = c23525.m51980();
        boolean m51990 = c23525.m51990();
        c23525.m51979(this.f37635);
        c23525.m51985(false);
        try {
            try {
                m30728.mo2845(c23525, obj);
            } catch (IOException e) {
                throw new C13934(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } finally {
            c23525.m51977(m51982);
            c23525.m51979(m51980);
            c23525.m51985(m51990);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30731(AbstractC23107 abstractC23107, C23525 c23525) {
        EnumC16093 m51982 = c23525.m51982();
        boolean m51980 = c23525.m51980();
        boolean m51990 = c23525.m51990();
        c23525.m51979(this.f37635);
        c23525.m51985(false);
        if (c23525.m51982() == EnumC16093.LEGACY_STRICT) {
            c23525.m51977(EnumC16093.LENIENT);
        }
        try {
            try {
                try {
                    C21906.f70122.mo2845(c23525, abstractC23107);
                } catch (IOException e) {
                    throw new C13934(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } finally {
            c23525.m51977(m51982);
            c23525.m51979(m51980);
            c23525.m51985(m51990);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23525 m30729(Writer writer) {
        C23525 c23525 = new C23525(writer);
        c23525.m51978(this.f37637);
        c23525.m51979(this.f37635);
        c23525.m51977(EnumC16093.LEGACY_STRICT);
        c23525.m51985(false);
        return c23525;
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f37638 + ",instanceCreators:" + this.f37636 + l.d;
    }
}
