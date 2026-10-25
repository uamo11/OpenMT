package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.List;
import java.util.Map;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import sun.misc.Unsafe;

/* compiled from: 09OR */
/* renamed from: l.ܶ֡ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14871 implements InterfaceC9374 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int[] f45367 = new int[0];

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f45368 = C21244.m48242();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f45369;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object[] f45370;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f45371;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f45372;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f45373;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f45374;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f45375;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f45376;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21928 f45377;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8522 f45378;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f45379;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC17092 f45380;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC17009 f45381;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean f45382;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC10639 f45383;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC0613 f45384;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m35300(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long m35301(int i) {
        return i & 1048575;
    }

    public C14871(int[] iArr, Object[] objArr, int i, int i2, InterfaceC8522 interfaceC8522, int[] iArr2, int i3, int i4, InterfaceC21928 interfaceC21928, AbstractC0613 abstractC0613, AbstractC17009 abstractC17009, AbstractC17092 abstractC17092, InterfaceC10639 interfaceC10639) {
        this.f45369 = iArr;
        this.f45370 = objArr;
        this.f45373 = i;
        this.f45374 = i2;
        this.f45372 = interfaceC8522 instanceof AbstractC21760;
        this.f45379 = abstractC17092 != null && abstractC17092.mo40108(interfaceC8522);
        this.f45382 = true;
        this.f45376 = iArr2;
        this.f45375 = i3;
        this.f45371 = i4;
        this.f45377 = interfaceC21928;
        this.f45384 = abstractC0613;
        this.f45381 = abstractC17009;
        this.f45380 = abstractC17092;
        this.f45378 = interfaceC8522;
        this.f45383 = interfaceC10639;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C14871 m35277(l.InterfaceC6405 r24, l.InterfaceC21928 r25, l.AbstractC0613 r26, l.AbstractC17009 r27, l.AbstractC17092 r28, l.InterfaceC10639 r29) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14871.m35277(l.ۜ֡ۖ, l.᩹֡ۖ, l.֡᩵ۖ, l.ܿ֨ۖ, l.ܿۘۖ, l.ۧ֡ۖ):l.ܶ֡ۖ");
    }

    @Override // l.InterfaceC9374
    /* renamed from: ֫ */
    public final Object mo24197() {
        return this.f45377.mo12871(this.f45378);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (l.C8668.m22433(l.C21244.m48234(r7, r11), l.C21244.m48234(r7, r12)) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if (l.C21244.m48253(r7, r11) == l.C21244.m48253(r7, r12)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (l.C21244.m48233(r7, r11) == l.C21244.m48233(r7, r12)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        if (l.C21244.m48253(r7, r11) == l.C21244.m48253(r7, r12)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        if (l.C21244.m48233(r7, r11) == l.C21244.m48233(r7, r12)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        if (l.C21244.m48233(r7, r11) == l.C21244.m48233(r7, r12)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d9, code lost:
    
        if (l.C21244.m48233(r7, r11) == l.C21244.m48233(r7, r12)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ef, code lost:
    
        if (l.C8668.m22433(l.C21244.m48234(r7, r11), l.C21244.m48234(r7, r12)) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        if (l.C8668.m22433(l.C21244.m48234(r7, r11), l.C21244.m48234(r7, r12)) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011b, code lost:
    
        if (l.C8668.m22433(l.C21244.m48234(r7, r11), l.C21244.m48234(r7, r12)) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012d, code lost:
    
        if (l.C21244.m48248(r7, r11) == l.C21244.m48248(r7, r12)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013f, code lost:
    
        if (l.C21244.m48233(r7, r11) == l.C21244.m48233(r7, r12)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0153, code lost:
    
        if (l.C21244.m48253(r7, r11) == l.C21244.m48253(r7, r12)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if (l.C21244.m48233(r7, r11) == l.C21244.m48233(r7, r12)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
    
        if (l.C21244.m48253(r7, r11) == l.C21244.m48253(r7, r12)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        if (l.C21244.m48253(r7, r11) == l.C21244.m48253(r7, r12)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(l.C21244.m48254(r7, r11)) == java.lang.Float.floatToIntBits(l.C21244.m48254(r7, r12))) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        if (java.lang.Double.doubleToLongBits(l.C21244.m48241(r7, r11)) == java.lang.Double.doubleToLongBits(l.C21244.m48241(r7, r12))) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (l.C8668.m22433(l.C21244.m48234(r7, r11), l.C21244.m48234(r7, r12)) != false) goto L106;
     */
    @Override // l.InterfaceC9374
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo24202(l.AbstractC21760 r11, l.AbstractC21760 r12) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14871.mo24202(l.᩸ᩴۖ, l.᩸ᩴۖ):boolean");
    }

    @Override // l.InterfaceC9374
    /* renamed from: ֫ */
    public final int mo24196(AbstractC21760 abstractC21760) {
        int i;
        int m33480;
        int i2;
        int m48233;
        int[] iArr = this.f45369;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int m35294 = m35294(i4);
            int i5 = iArr[i4];
            long j = 1048575 & m35294;
            int i6 = 37;
            switch (m35300(m35294)) {
                case 0:
                    i = i3 * 53;
                    m33480 = C13997.m33480(Double.doubleToLongBits(C21244.m48241(j, abstractC21760)));
                    i3 = m33480 + i;
                    break;
                case 1:
                    i = i3 * 53;
                    m33480 = Float.floatToIntBits(C21244.m48254(j, abstractC21760));
                    i3 = m33480 + i;
                    break;
                case 2:
                    i = i3 * 53;
                    m33480 = C13997.m33480(C21244.m48253(j, abstractC21760));
                    i3 = m33480 + i;
                    break;
                case 3:
                    i = i3 * 53;
                    m33480 = C13997.m33480(C21244.m48253(j, abstractC21760));
                    i3 = m33480 + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    m48233 = C21244.m48233(j, abstractC21760);
                    i3 = i2 + m48233;
                    break;
                case 5:
                    i = i3 * 53;
                    m33480 = C13997.m33480(C21244.m48253(j, abstractC21760));
                    i3 = m33480 + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    m48233 = C21244.m48233(j, abstractC21760);
                    i3 = i2 + m48233;
                    break;
                case 7:
                    i = i3 * 53;
                    m33480 = C13997.m33481(C21244.m48248(j, abstractC21760));
                    i3 = m33480 + i;
                    break;
                case 8:
                    i = i3 * 53;
                    m33480 = ((String) C21244.m48234(j, abstractC21760)).hashCode();
                    i3 = m33480 + i;
                    break;
                case 9:
                    Object m48234 = C21244.m48234(j, abstractC21760);
                    if (m48234 != null) {
                        i6 = m48234.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i = i3 * 53;
                    m33480 = C21244.m48234(j, abstractC21760).hashCode();
                    i3 = m33480 + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    m48233 = C21244.m48233(j, abstractC21760);
                    i3 = i2 + m48233;
                    break;
                case 12:
                    i2 = i3 * 53;
                    m48233 = C21244.m48233(j, abstractC21760);
                    i3 = i2 + m48233;
                    break;
                case 13:
                    i2 = i3 * 53;
                    m48233 = C21244.m48233(j, abstractC21760);
                    i3 = i2 + m48233;
                    break;
                case 14:
                    i = i3 * 53;
                    m33480 = C13997.m33480(C21244.m48253(j, abstractC21760));
                    i3 = m33480 + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    m48233 = C21244.m48233(j, abstractC21760);
                    i3 = i2 + m48233;
                    break;
                case 16:
                    i = i3 * 53;
                    m33480 = C13997.m33480(C21244.m48253(j, abstractC21760));
                    i3 = m33480 + i;
                    break;
                case 17:
                    Object m482342 = C21244.m48234(j, abstractC21760);
                    if (m482342 != null) {
                        i6 = m482342.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    m33480 = C21244.m48234(j, abstractC21760).hashCode();
                    i3 = m33480 + i;
                    break;
                case 50:
                    i = i3 * 53;
                    m33480 = C21244.m48234(j, abstractC21760).hashCode();
                    i3 = m33480 + i;
                    break;
                case 51:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        m33480 = C13997.m33480(Double.doubleToLongBits(((Double) C21244.m48234(j, abstractC21760)).doubleValue()));
                        i3 = m33480 + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        m33480 = Float.floatToIntBits(((Float) C21244.m48234(j, abstractC21760)).floatValue());
                        i3 = m33480 + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        m33480 = C13997.m33480(m35288(j, abstractC21760));
                        i3 = m33480 + i;
                        break;
                    } else {
                        break;
                    }
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        m33480 = C13997.m33480(m35288(j, abstractC21760));
                        i3 = m33480 + i;
                        break;
                    } else {
                        break;
                    }
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (m35284(i5, i4, abstractC21760)) {
                        i2 = i3 * 53;
                        m48233 = m35275(j, abstractC21760);
                        i3 = i2 + m48233;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        m33480 = C13997.m33480(m35288(j, abstractC21760));
                        i3 = m33480 + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m35284(i5, i4, abstractC21760)) {
                        i2 = i3 * 53;
                        m48233 = m35275(j, abstractC21760);
                        i3 = i2 + m48233;
                        break;
                    } else {
                        break;
                    }
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        m33480 = C13997.m33481(((Boolean) C21244.m48234(j, abstractC21760)).booleanValue());
                        i3 = m33480 + i;
                        break;
                    } else {
                        break;
                    }
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        m33480 = ((String) C21244.m48234(j, abstractC21760)).hashCode();
                        i3 = m33480 + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        m33480 = C21244.m48234(j, abstractC21760).hashCode();
                        i3 = m33480 + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        m33480 = C21244.m48234(j, abstractC21760).hashCode();
                        i3 = m33480 + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m35284(i5, i4, abstractC21760)) {
                        i2 = i3 * 53;
                        m48233 = m35275(j, abstractC21760);
                        i3 = i2 + m48233;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m35284(i5, i4, abstractC21760)) {
                        i2 = i3 * 53;
                        m48233 = m35275(j, abstractC21760);
                        i3 = i2 + m48233;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m35284(i5, i4, abstractC21760)) {
                        i2 = i3 * 53;
                        m48233 = m35275(j, abstractC21760);
                        i3 = i2 + m48233;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        m33480 = C13997.m33480(m35288(j, abstractC21760));
                        i3 = m33480 + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m35284(i5, i4, abstractC21760)) {
                        i2 = i3 * 53;
                        m48233 = m35275(j, abstractC21760);
                        i3 = i2 + m48233;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        m33480 = C13997.m33480(m35288(j, abstractC21760));
                        i3 = m33480 + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        m33480 = C21244.m48234(j, abstractC21760).hashCode();
                        i3 = m33480 + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.f45381.mo7236(abstractC21760).hashCode() + (i3 * 53);
        return this.f45379 ? (hashCode * 53) + this.f45380.mo40104((Object) abstractC21760).hashCode() : hashCode;
    }

    @Override // l.InterfaceC9374
    /* renamed from: ֫ */
    public final void mo24199(Object obj, Object obj2) {
        m35299(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f45369;
            if (i >= iArr.length) {
                int i2 = C8668.f26436;
                AbstractC17009 abstractC17009 = this.f45381;
                abstractC17009.mo7242(obj, abstractC17009.mo7229(abstractC17009.mo7236(obj), abstractC17009.mo7236(obj2)));
                if (this.f45379) {
                    AbstractC17092 abstractC17092 = this.f45380;
                    C19210 mo40104 = abstractC17092.mo40104(obj2);
                    if (mo40104.m44324()) {
                        return;
                    }
                    abstractC17092.mo40109(obj).m44317(mo40104);
                    return;
                }
                return;
            }
            int m35294 = m35294(i);
            long j = 1048575 & m35294;
            int i3 = iArr[i];
            switch (m35300(m35294)) {
                case 0:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48227(obj, j, C21244.m48241(j, obj2));
                        m35297(i, obj);
                        break;
                    }
                case 1:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48228(obj, j, C21244.m48254(j, obj2));
                        m35297(i, obj);
                        break;
                    }
                case 2:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48229(obj, j, C21244.m48253(j, obj2));
                        m35297(i, obj);
                        break;
                    }
                case 3:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48229(obj, j, C21244.m48253(j, obj2));
                        m35297(i, obj);
                        break;
                    }
                case 4:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48223(C21244.m48233(j, obj2), j, obj);
                        m35297(i, obj);
                        break;
                    }
                case 5:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48229(obj, j, C21244.m48253(j, obj2));
                        m35297(i, obj);
                        break;
                    }
                case 6:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48223(C21244.m48233(j, obj2), j, obj);
                        m35297(i, obj);
                        break;
                    }
                case 7:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48245(obj, j, C21244.m48248(j, obj2));
                        m35297(i, obj);
                        break;
                    }
                case 8:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48224(j, obj, C21244.m48234(j, obj2));
                        m35297(i, obj);
                        break;
                    }
                case 9:
                    m35278(i, obj, obj2);
                    break;
                case 10:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48224(j, obj, C21244.m48234(j, obj2));
                        m35297(i, obj);
                        break;
                    }
                case 11:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48223(C21244.m48233(j, obj2), j, obj);
                        m35297(i, obj);
                        break;
                    }
                case 12:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48223(C21244.m48233(j, obj2), j, obj);
                        m35297(i, obj);
                        break;
                    }
                case 13:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48223(C21244.m48233(j, obj2), j, obj);
                        m35297(i, obj);
                        break;
                    }
                case 14:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48229(obj, j, C21244.m48253(j, obj2));
                        m35297(i, obj);
                        break;
                    }
                case 15:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48223(C21244.m48233(j, obj2), j, obj);
                        m35297(i, obj);
                        break;
                    }
                case 16:
                    if (!m35285(i, obj2)) {
                        break;
                    } else {
                        C21244.m48229(obj, j, C21244.m48253(j, obj2));
                        m35297(i, obj);
                        break;
                    }
                case 17:
                    m35278(i, obj, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f45384.mo2521(j, obj, obj2);
                    break;
                case 50:
                    int i4 = C8668.f26436;
                    C21244.m48224(j, obj, this.f45383.mo26689(C21244.m48234(j, obj), C21244.m48234(j, obj2)));
                    break;
                case 51:
                case 52:
                case 53:
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                case 56:
                case 57:
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (!m35284(i3, i, obj2)) {
                        break;
                    } else {
                        C21244.m48224(j, obj, C21244.m48234(j, obj2));
                        m35296(i3, i, obj);
                        break;
                    }
                case 60:
                    m35292(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m35284(i3, i, obj2)) {
                        break;
                    } else {
                        C21244.m48224(j, obj, C21244.m48234(j, obj2));
                        m35296(i3, i, obj);
                        break;
                    }
                case 68:
                    m35292(i, obj, obj2);
                    break;
            }
            i += 3;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35278(int i, Object obj, Object obj2) {
        if (m35285(i, obj2)) {
            long m35294 = m35294(i) & 1048575;
            Unsafe unsafe = f45368;
            Object object = unsafe.getObject(obj2, m35294);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f45369[i] + " is present but null: " + obj2);
            }
            InterfaceC9374 m35295 = m35295(i);
            if (!m35285(i, obj)) {
                if (!m35302(object)) {
                    unsafe.putObject(obj, m35294, object);
                } else {
                    Object mo24197 = m35295.mo24197();
                    m35295.mo24199(mo24197, object);
                    unsafe.putObject(obj, m35294, mo24197);
                }
                m35297(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, m35294);
            if (!m35302(object2)) {
                Object mo241972 = m35295.mo24197();
                m35295.mo24199(mo241972, object2);
                unsafe.putObject(obj, m35294, mo241972);
                object2 = mo241972;
            }
            m35295.mo24199(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l.InterfaceC9374
    /* renamed from: ֫ */
    public final int mo24195(AbstractC3770 abstractC3770) {
        int i;
        int i2;
        int i3;
        int i4;
        int m35073;
        int m350732;
        int m35075;
        int m350733;
        int m35078;
        int m350734;
        int serializedSize;
        int m35083;
        int m35069;
        InterfaceC8522 interfaceC8522;
        InterfaceC9374 m35295;
        int m22439;
        int m350735;
        int size;
        int m22454;
        int m350736;
        int m35080;
        int i5;
        int m350737;
        int m350832;
        int m350738;
        int m350739;
        Unsafe unsafe = f45368;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        C14871 c14871 = this;
        AbstractC3770 abstractC37702 = abstractC3770;
        while (true) {
            int[] iArr = c14871.f45369;
            if (i9 >= iArr.length) {
                AbstractC17009 abstractC17009 = c14871.f45381;
                int mo7241 = i10 + abstractC17009.mo7241(abstractC17009.mo7236(abstractC37702));
                return c14871.f45379 ? mo7241 + c14871.f45380.mo40104((Object) abstractC37702).m44325() : mo7241;
            }
            int m35294 = c14871.m35294(i9);
            int m35300 = m35300(m35294);
            int i11 = iArr[i9];
            int i12 = iArr[i9 + 2];
            int i13 = i12 & i6;
            if (m35300 <= 17) {
                if (i13 != i7) {
                    i8 = i13 == i6 ? 0 : unsafe.getInt(abstractC37702, i13);
                    i7 = i13;
                }
                i3 = 1 << (i12 >>> 20);
                i = i7;
                i2 = i8;
            } else {
                i = i7;
                i2 = i8;
                i3 = 0;
            }
            long j = i6 & m35294;
            if (m35300 < EnumC0864.f3356.m3182() || m35300 > EnumC0864.f3392.m3182()) {
                i13 = 0;
            }
            boolean z = c14871.f45382;
            switch (m35300) {
                case 0:
                    i4 = i;
                    if (c14871.m35286(abstractC37702, i9, i4, i2, i3)) {
                        m35073 = AbstractC14766.m35073(i11);
                        m35069 = m35073 + 8;
                        i10 += m35069;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i4 = i;
                    if (c14871.m35286(abstractC37702, i9, i4, i2, i3)) {
                        m350732 = AbstractC14766.m35073(i11);
                        m35078 = m350732 + 4;
                        i10 += m35078;
                    }
                    c14871 = this;
                    abstractC37702 = abstractC3770;
                    break;
                case 2:
                    i4 = i;
                    if (c14871.m35286(abstractC37702, i9, i4, i2, i3)) {
                        m35075 = AbstractC14766.m35075(i11, unsafe.getLong(abstractC37702, j));
                        i10 += m35075;
                    }
                    c14871 = this;
                    break;
                case 3:
                    i4 = i;
                    if (c14871.m35286(abstractC37702, i9, i4, i2, i3)) {
                        m35075 = AbstractC14766.m35081(i11, unsafe.getLong(abstractC37702, j));
                        i10 += m35075;
                    }
                    c14871 = this;
                    break;
                case 4:
                    i4 = i;
                    if (c14871.m35286(abstractC37702, i9, i4, i2, i3)) {
                        m35075 = AbstractC14766.m35074(i11, unsafe.getInt(abstractC37702, j));
                        i10 += m35075;
                    }
                    c14871 = this;
                    break;
                case 5:
                    i4 = i;
                    if (c14871.m35286(abstractC37702, i9, i4, i2, i3)) {
                        m350733 = AbstractC14766.m35073(i11);
                        m35078 = m350733 + 8;
                        i10 += m35078;
                    }
                    c14871 = this;
                    abstractC37702 = abstractC3770;
                    break;
                case 6:
                    i4 = i;
                    if (c14871.m35286(abstractC37702, i9, i4, i2, i3)) {
                        m35078 = AbstractC14766.m35078(i11);
                        i10 += m35078;
                    }
                    c14871 = this;
                    abstractC37702 = abstractC3770;
                    break;
                case 7:
                    i4 = i;
                    if (c14871.m35286(abstractC37702, i9, i4, i2, i3)) {
                        m35078 = AbstractC14766.m35080(i11);
                        i10 += m35078;
                    }
                    c14871 = this;
                    abstractC37702 = abstractC3770;
                    break;
                case 8:
                    i4 = i;
                    if (c14871.m35286(abstractC37702, i9, i4, i2, i3)) {
                        Object object = unsafe.getObject(abstractC37702, j);
                        i10 += object instanceof AbstractC5886 ? AbstractC14766.m35076(i11, (AbstractC5886) object) : AbstractC14766.m35070((String) object) + AbstractC14766.m35073(i11);
                    }
                    c14871 = this;
                    break;
                case 9:
                    i4 = i;
                    if (!c14871.m35286(abstractC37702, i9, i4, i2, i3)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(abstractC37702, j);
                        InterfaceC9374 m352952 = c14871.m35295(i9);
                        int i14 = C8668.f26436;
                        if (object2 instanceof C16135) {
                            m35069 = AbstractC14766.m35069(i11, (C16135) object2);
                            i10 += m35069;
                            break;
                        } else {
                            m350734 = AbstractC14766.m35073(i11);
                            serializedSize = ((AbstractC3770) ((InterfaceC8522) object2)).getSerializedSize(m352952);
                            m35083 = AbstractC14766.m35083(serializedSize);
                            m35069 = m35083 + serializedSize + m350734;
                            i10 += m35069;
                        }
                    }
                case 10:
                    i4 = i;
                    if (c14871.m35286(abstractC37702, i9, i4, i2, i3)) {
                        m35075 = AbstractC14766.m35076(i11, (AbstractC5886) unsafe.getObject(abstractC37702, j));
                        i10 += m35075;
                    }
                    c14871 = this;
                    break;
                case 11:
                    i4 = i;
                    if (c14871.m35286(abstractC37702, i9, i4, i2, i3)) {
                        m35075 = AbstractC14766.m35084(i11, unsafe.getInt(abstractC37702, j));
                        i10 += m35075;
                    }
                    c14871 = this;
                    break;
                case 12:
                    i4 = i;
                    if (c14871.m35286(abstractC37702, i9, i4, i2, i3)) {
                        m35075 = AbstractC14766.m35079(i11, unsafe.getInt(abstractC37702, j));
                        i10 += m35075;
                    }
                    c14871 = this;
                    break;
                case 13:
                    i4 = i;
                    if (c14871.m35286(abstractC37702, i9, i4, i2, i3)) {
                        m350732 = AbstractC14766.m35073(i11);
                        m35078 = m350732 + 4;
                        i10 += m35078;
                    }
                    c14871 = this;
                    abstractC37702 = abstractC3770;
                    break;
                case 14:
                    i4 = i;
                    if (c14871.m35286(abstractC37702, i9, i4, i2, i3)) {
                        m350733 = AbstractC14766.m35073(i11);
                        m35078 = m350733 + 8;
                        i10 += m35078;
                    }
                    c14871 = this;
                    abstractC37702 = abstractC3770;
                    break;
                case 15:
                    i4 = i;
                    if (c14871.m35286(abstractC37702, i9, i, i2, i3)) {
                        int i15 = unsafe.getInt(abstractC37702, j);
                        m35075 = AbstractC14766.m35083((i15 >> 31) ^ (i15 << 1)) + AbstractC14766.m35073(i11);
                        i10 += m35075;
                    }
                    c14871 = this;
                    break;
                case 16:
                    if (c14871.m35286(abstractC37702, i9, i, i2, i3)) {
                        long j2 = unsafe.getLong(abstractC37702, j);
                        i10 += AbstractC14766.m35077((j2 >> 63) ^ (j2 << 1)) + AbstractC14766.m35073(i11);
                    }
                    i4 = i;
                    c14871 = this;
                    break;
                case 17:
                    if (c14871.m35286(abstractC37702, i9, i, i2, i3)) {
                        interfaceC8522 = (InterfaceC8522) unsafe.getObject(abstractC37702, j);
                        m35295 = c14871.m35295(i9);
                        i5 = AbstractC14766.m35073(i11) * 2;
                        m22454 = ((AbstractC3770) interfaceC8522).getSerializedSize(m35295);
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                case 18:
                    m22439 = C8668.m22439(i11, (List) unsafe.getObject(abstractC37702, j));
                    m35069 = m22439;
                    i4 = i;
                    i10 += m35069;
                    break;
                case 19:
                    m22439 = C8668.m22425(i11, (List) unsafe.getObject(abstractC37702, j));
                    m35069 = m22439;
                    i4 = i;
                    i10 += m35069;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC37702, j);
                    int i16 = C8668.f26436;
                    if (list.size() != 0) {
                        m350735 = (AbstractC14766.m35073(i11) * list.size()) + C8668.m22447(list);
                        i10 += m350735;
                        i4 = i;
                        break;
                    }
                    m350735 = 0;
                    i10 += m350735;
                    i4 = i;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC37702, j);
                    int i17 = C8668.f26436;
                    size = list2.size();
                    if (size != 0) {
                        m22454 = C8668.m22454(list2);
                        m350736 = AbstractC14766.m35073(i11);
                        i5 = m350736 * size;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                        i4 = i;
                        break;
                    }
                    m350735 = 0;
                    i10 += m350735;
                    i4 = i;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC37702, j);
                    int i18 = C8668.f26436;
                    size = list3.size();
                    if (size != 0) {
                        m22454 = C8668.m22440(list3);
                        m350736 = AbstractC14766.m35073(i11);
                        i5 = m350736 * size;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                        i4 = i;
                        break;
                    }
                    m350735 = 0;
                    i10 += m350735;
                    i4 = i;
                case 23:
                    m22439 = C8668.m22439(i11, (List) unsafe.getObject(abstractC37702, j));
                    m35069 = m22439;
                    i4 = i;
                    i10 += m35069;
                    break;
                case 24:
                    m22439 = C8668.m22425(i11, (List) unsafe.getObject(abstractC37702, j));
                    m35069 = m22439;
                    i4 = i;
                    i10 += m35069;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC37702, j);
                    int i19 = C8668.f26436;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        m35080 = size2 * AbstractC14766.m35080(i11);
                        i10 += m35080;
                        i4 = i;
                        break;
                    }
                    m35080 = 0;
                    i10 += m35080;
                    i4 = i;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC37702, j);
                    int i20 = C8668.f26436;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        m350735 = AbstractC14766.m35073(i11) * size3;
                        if (list5 instanceof InterfaceC4142) {
                            InterfaceC4142 interfaceC4142 = (InterfaceC4142) list5;
                            for (int i21 = 0; i21 < size3; i21++) {
                                Object mo8472 = interfaceC4142.mo8472(i21);
                                if (mo8472 instanceof AbstractC5886) {
                                    int size4 = ((AbstractC5886) mo8472).size();
                                    m350735 = AbstractC14766.m35083(size4) + size4 + m350735;
                                } else {
                                    m350735 = AbstractC14766.m35070((String) mo8472) + m350735;
                                }
                            }
                        } else {
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object obj = list5.get(i22);
                                if (obj instanceof AbstractC5886) {
                                    int size5 = ((AbstractC5886) obj).size();
                                    m350735 = AbstractC14766.m35083(size5) + size5 + m350735;
                                } else {
                                    m350735 = AbstractC14766.m35070((String) obj) + m350735;
                                }
                            }
                        }
                        i10 += m350735;
                        i4 = i;
                        break;
                    }
                    m350735 = 0;
                    i10 += m350735;
                    i4 = i;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC37702, j);
                    InterfaceC9374 m352953 = c14871.m35295(i9);
                    int i23 = C8668.f26436;
                    int size6 = list6.size();
                    if (size6 != 0) {
                        int m3507310 = AbstractC14766.m35073(i11) * size6;
                        for (int i24 = 0; i24 < size6; i24++) {
                            Object obj2 = list6.get(i24);
                            int m38045 = obj2 instanceof C16135 ? ((C16135) obj2).m38045() : ((AbstractC3770) ((InterfaceC8522) obj2)).getSerializedSize(m352953);
                            m3507310 += AbstractC14766.m35083(m38045) + m38045;
                        }
                        m35080 = m3507310;
                        i10 += m35080;
                        i4 = i;
                        break;
                    }
                    m35080 = 0;
                    i10 += m35080;
                    i4 = i;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC37702, j);
                    int i25 = C8668.f26436;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        m350735 = AbstractC14766.m35073(i11) * size7;
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int size8 = ((AbstractC5886) list7.get(i26)).size();
                            m350735 += AbstractC14766.m35083(size8) + size8;
                        }
                        i10 += m350735;
                        i4 = i;
                        break;
                    }
                    m350735 = 0;
                    i10 += m350735;
                    i4 = i;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC37702, j);
                    int i27 = C8668.f26436;
                    size = list8.size();
                    if (size != 0) {
                        m22454 = C8668.m22444(list8);
                        m350736 = AbstractC14766.m35073(i11);
                        i5 = m350736 * size;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                        i4 = i;
                        break;
                    }
                    m350735 = 0;
                    i10 += m350735;
                    i4 = i;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC37702, j);
                    int i28 = C8668.f26436;
                    size = list9.size();
                    if (size != 0) {
                        m22454 = C8668.m22426(list9);
                        m350736 = AbstractC14766.m35073(i11);
                        i5 = m350736 * size;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                        i4 = i;
                        break;
                    }
                    m350735 = 0;
                    i10 += m350735;
                    i4 = i;
                case 31:
                    m22439 = C8668.m22425(i11, (List) unsafe.getObject(abstractC37702, j));
                    m35069 = m22439;
                    i4 = i;
                    i10 += m35069;
                    break;
                case 32:
                    m22439 = C8668.m22439(i11, (List) unsafe.getObject(abstractC37702, j));
                    m35069 = m22439;
                    i4 = i;
                    i10 += m35069;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC37702, j);
                    int i29 = C8668.f26436;
                    size = list10.size();
                    if (size != 0) {
                        m22454 = C8668.m22451(list10);
                        m350736 = AbstractC14766.m35073(i11);
                        i5 = m350736 * size;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                        i4 = i;
                        break;
                    }
                    m350735 = 0;
                    i10 += m350735;
                    i4 = i;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC37702, j);
                    int i30 = C8668.f26436;
                    size = list11.size();
                    if (size != 0) {
                        m22454 = C8668.m22449(list11);
                        m350736 = AbstractC14766.m35073(i11);
                        i5 = m350736 * size;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                        i4 = i;
                        break;
                    }
                    m350735 = 0;
                    i10 += m350735;
                    i4 = i;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC37702, j);
                    int i31 = C8668.f26436;
                    m22454 = list12.size() * 8;
                    if (m22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC37702, i13, m22454);
                        }
                        m350737 = AbstractC14766.m35073(i11);
                        m350832 = AbstractC14766.m35083(m22454);
                        i5 = m350832 + m350737;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC37702, j);
                    int i32 = C8668.f26436;
                    m22454 = list13.size() * 4;
                    if (m22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC37702, i13, m22454);
                        }
                        m350737 = AbstractC14766.m35073(i11);
                        m350832 = AbstractC14766.m35083(m22454);
                        i5 = m350832 + m350737;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                case 37:
                    m22454 = C8668.m22447((List) unsafe.getObject(abstractC37702, j));
                    if (m22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC37702, i13, m22454);
                        }
                        m350737 = AbstractC14766.m35073(i11);
                        m350832 = AbstractC14766.m35083(m22454);
                        i5 = m350832 + m350737;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                case 38:
                    m22454 = C8668.m22454((List) unsafe.getObject(abstractC37702, j));
                    if (m22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC37702, i13, m22454);
                        }
                        m350737 = AbstractC14766.m35073(i11);
                        m350832 = AbstractC14766.m35083(m22454);
                        i5 = m350832 + m350737;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                case 39:
                    m22454 = C8668.m22440((List) unsafe.getObject(abstractC37702, j));
                    if (m22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC37702, i13, m22454);
                        }
                        m350737 = AbstractC14766.m35073(i11);
                        m350832 = AbstractC14766.m35083(m22454);
                        i5 = m350832 + m350737;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC37702, j);
                    int i33 = C8668.f26436;
                    m22454 = list14.size() * 8;
                    if (m22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC37702, i13, m22454);
                        }
                        m350737 = AbstractC14766.m35073(i11);
                        m350832 = AbstractC14766.m35083(m22454);
                        i5 = m350832 + m350737;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC37702, j);
                    int i34 = C8668.f26436;
                    m22454 = list15.size() * 4;
                    if (m22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC37702, i13, m22454);
                        }
                        m350737 = AbstractC14766.m35073(i11);
                        m350832 = AbstractC14766.m35083(m22454);
                        i5 = m350832 + m350737;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC37702, j);
                    int i35 = C8668.f26436;
                    m22454 = list16.size();
                    if (m22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC37702, i13, m22454);
                        }
                        m350737 = AbstractC14766.m35073(i11);
                        m350832 = AbstractC14766.m35083(m22454);
                        i5 = m350832 + m350737;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                case 43:
                    m22454 = C8668.m22444((List) unsafe.getObject(abstractC37702, j));
                    if (m22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC37702, i13, m22454);
                        }
                        m350737 = AbstractC14766.m35073(i11);
                        m350832 = AbstractC14766.m35083(m22454);
                        i5 = m350832 + m350737;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                case 44:
                    m22454 = C8668.m22426((List) unsafe.getObject(abstractC37702, j));
                    if (m22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC37702, i13, m22454);
                        }
                        m350737 = AbstractC14766.m35073(i11);
                        m350832 = AbstractC14766.m35083(m22454);
                        i5 = m350832 + m350737;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC37702, j);
                    int i36 = C8668.f26436;
                    m22454 = list17.size() * 4;
                    if (m22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC37702, i13, m22454);
                        }
                        m350737 = AbstractC14766.m35073(i11);
                        m350832 = AbstractC14766.m35083(m22454);
                        i5 = m350832 + m350737;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC37702, j);
                    int i37 = C8668.f26436;
                    m22454 = list18.size() * 8;
                    if (m22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC37702, i13, m22454);
                        }
                        m350737 = AbstractC14766.m35073(i11);
                        m350832 = AbstractC14766.m35083(m22454);
                        i5 = m350832 + m350737;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                case 47:
                    m22454 = C8668.m22451((List) unsafe.getObject(abstractC37702, j));
                    if (m22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC37702, i13, m22454);
                        }
                        m350737 = AbstractC14766.m35073(i11);
                        m350832 = AbstractC14766.m35083(m22454);
                        i5 = m350832 + m350737;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                case 48:
                    m22454 = C8668.m22449((List) unsafe.getObject(abstractC37702, j));
                    if (m22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC37702, i13, m22454);
                        }
                        m350737 = AbstractC14766.m35073(i11);
                        m350832 = AbstractC14766.m35083(m22454);
                        i5 = m350832 + m350737;
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC37702, j);
                    InterfaceC9374 m352954 = c14871.m35295(i9);
                    int i38 = C8668.f26436;
                    int size9 = list19.size();
                    if (size9 != 0) {
                        int i39 = 0;
                        for (int i40 = 0; i40 < size9; i40++) {
                            i39 += (AbstractC14766.m35073(i11) * 2) + ((AbstractC3770) ((InterfaceC8522) list19.get(i40))).getSerializedSize(m352954);
                        }
                        m35080 = i39;
                        i10 += m35080;
                        i4 = i;
                        break;
                    }
                    m35080 = 0;
                    i10 += m35080;
                    i4 = i;
                case 50:
                    c14871.f45383.mo26690(i11, unsafe.getObject(abstractC37702, j), c14871.m35289(i9));
                    i4 = i;
                    break;
                case 51:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        m350738 = AbstractC14766.m35073(i11);
                        m35073 = m350738;
                        i4 = i;
                        m35069 = m35073 + 8;
                        i10 += m35069;
                        break;
                    }
                    i4 = i;
                    break;
                case 52:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        m350739 = AbstractC14766.m35073(i11);
                        m22439 = m350739 + 4;
                        m35069 = m22439;
                        i4 = i;
                        i10 += m35069;
                        break;
                    }
                    i4 = i;
                    break;
                case 53:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        m22439 = AbstractC14766.m35075(i11, m35288(j, abstractC37702));
                        m35069 = m22439;
                        i4 = i;
                        i10 += m35069;
                        break;
                    }
                    i4 = i;
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        m22439 = AbstractC14766.m35081(i11, m35288(j, abstractC37702));
                        m35069 = m22439;
                        i4 = i;
                        i10 += m35069;
                        break;
                    }
                    i4 = i;
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        m22439 = AbstractC14766.m35074(i11, m35275(j, abstractC37702));
                        m35069 = m22439;
                        i4 = i;
                        i10 += m35069;
                        break;
                    }
                    i4 = i;
                    break;
                case 56:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        m350738 = AbstractC14766.m35073(i11);
                        m35073 = m350738;
                        i4 = i;
                        m35069 = m35073 + 8;
                        i10 += m35069;
                        break;
                    }
                    i4 = i;
                    break;
                case 57:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        m22439 = AbstractC14766.m35078(i11);
                        m35069 = m22439;
                        i4 = i;
                        i10 += m35069;
                        break;
                    }
                    i4 = i;
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        m22439 = AbstractC14766.m35080(i11);
                        m35069 = m22439;
                        i4 = i;
                        i10 += m35069;
                        break;
                    }
                    i4 = i;
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        Object object3 = unsafe.getObject(abstractC37702, j);
                        i10 = (object3 instanceof AbstractC5886 ? AbstractC14766.m35076(i11, (AbstractC5886) object3) : AbstractC14766.m35070((String) object3) + AbstractC14766.m35073(i11)) + i10;
                    }
                    i4 = i;
                    break;
                case 60:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        Object object4 = unsafe.getObject(abstractC37702, j);
                        InterfaceC9374 m352955 = c14871.m35295(i9);
                        int i41 = C8668.f26436;
                        if (object4 instanceof C16135) {
                            m22439 = AbstractC14766.m35069(i11, (C16135) object4);
                            m35069 = m22439;
                            i4 = i;
                            i10 += m35069;
                            break;
                        } else {
                            int m3507311 = AbstractC14766.m35073(i11);
                            int serializedSize2 = ((AbstractC3770) ((InterfaceC8522) object4)).getSerializedSize(m352955);
                            m350734 = m3507311;
                            m35083 = AbstractC14766.m35083(serializedSize2);
                            serializedSize = serializedSize2;
                            i4 = i;
                            m35069 = m35083 + serializedSize + m350734;
                            i10 += m35069;
                        }
                    }
                    i4 = i;
                    break;
                case 61:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        m22439 = AbstractC14766.m35076(i11, (AbstractC5886) unsafe.getObject(abstractC37702, j));
                        m35069 = m22439;
                        i4 = i;
                        i10 += m35069;
                        break;
                    }
                    i4 = i;
                    break;
                case 62:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        m22439 = AbstractC14766.m35084(i11, m35275(j, abstractC37702));
                        m35069 = m22439;
                        i4 = i;
                        i10 += m35069;
                        break;
                    }
                    i4 = i;
                    break;
                case 63:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        m22439 = AbstractC14766.m35079(i11, m35275(j, abstractC37702));
                        m35069 = m22439;
                        i4 = i;
                        i10 += m35069;
                        break;
                    }
                    i4 = i;
                    break;
                case 64:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        m350739 = AbstractC14766.m35073(i11);
                        m22439 = m350739 + 4;
                        m35069 = m22439;
                        i4 = i;
                        i10 += m35069;
                        break;
                    }
                    i4 = i;
                    break;
                case 65:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        m350738 = AbstractC14766.m35073(i11);
                        m35073 = m350738;
                        i4 = i;
                        m35069 = m35073 + 8;
                        i10 += m35069;
                        break;
                    }
                    i4 = i;
                    break;
                case 66:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        int m35275 = m35275(j, abstractC37702);
                        m22439 = AbstractC14766.m35083((m35275 >> 31) ^ (m35275 << 1)) + AbstractC14766.m35073(i11);
                        m35069 = m22439;
                        i4 = i;
                        i10 += m35069;
                        break;
                    }
                    i4 = i;
                    break;
                case 67:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        long m35288 = m35288(j, abstractC37702);
                        m35080 = AbstractC14766.m35077((m35288 >> 63) ^ (m35288 << 1)) + AbstractC14766.m35073(i11);
                        i10 += m35080;
                    }
                    i4 = i;
                    break;
                case 68:
                    if (c14871.m35284(i11, i9, abstractC37702)) {
                        interfaceC8522 = (InterfaceC8522) unsafe.getObject(abstractC37702, j);
                        m35295 = c14871.m35295(i9);
                        i5 = AbstractC14766.m35073(i11) * 2;
                        m22454 = ((AbstractC3770) interfaceC8522).getSerializedSize(m35295);
                        m350735 = i5 + m22454;
                        i10 += m350735;
                    }
                    i4 = i;
                    break;
                default:
                    i4 = i;
                    break;
            }
            i9 += 3;
            i7 = i4;
            i8 = i2;
            i6 = 1048575;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0503 A[SYNTHETIC] */
    @Override // l.InterfaceC9374
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo24200(java.lang.Object r14, l.InterfaceC6633 r15) {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14871.mo24200(java.lang.Object, l.ۜ۠ۖ):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m35293(java.lang.Object r24, l.InterfaceC6633 r25) {
        /*
            Method dump skipped, instructions count: 1854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14871.m35293(java.lang.Object, l.ۜ۠ۖ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x00d5, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x00d6, code lost:
    
        if (r0 >= r3) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x00d8, code lost:
    
        r9 = r1;
        m35281(r18, r16[r0], r11, r9, r18);
        r0 = r0 + 1;
        r1 = r9;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x00ed, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x00ee, code lost:
    
        if (r11 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x00f0, code lost:
    
        r9.mo7238(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:227:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0668 A[LOOP:3: B:54:0x0666->B:55:0x0668, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0610 A[Catch: all -> 0x0657, TRY_LEAVE, TryCatch #12 {all -> 0x0657, blocks: (B:62:0x060a, B:64:0x0610), top: B:61:0x060a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x062b  */
    @Override // l.InterfaceC9374
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo24201(java.lang.Object r18, l.InterfaceC10785 r19, l.C17798 r20) {
        /*
            Method dump skipped, instructions count: 1804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14871.mo24201(java.lang.Object, l.ۧۚۖ, l.ᩳۘۖ):void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private InterfaceC9374 m35295(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f45370;
        InterfaceC9374 interfaceC9374 = (InterfaceC9374) objArr[i2];
        if (interfaceC9374 != null) {
            return interfaceC9374;
        }
        InterfaceC9374 m28054 = C11345.m28053().m28054((Class) objArr[i2 + 1]);
        objArr[i2] = m28054;
        return m28054;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Object m35289(int i) {
        return this.f45370[(i / 3) * 2];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC12587 m35276(int i) {
        return (InterfaceC12587) this.f45370[((i / 3) * 2) + 1];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Object m35291(int i, Object obj) {
        InterfaceC9374 m35295 = m35295(i);
        long m35294 = m35294(i) & 1048575;
        if (!m35285(i, obj)) {
            return m35295.mo24197();
        }
        Object object = f45368.getObject(obj, m35294);
        if (m35302(object)) {
            return object;
        }
        Object mo24197 = m35295.mo24197();
        if (object != null) {
            m35295.mo24199(mo24197, object);
        }
        return mo24197;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m35298(int i, Object obj, Object obj2) {
        f45368.putObject(obj, m35294(i) & 1048575, obj2);
        m35297(i, obj);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Object m35290(int i, int i2, Object obj) {
        InterfaceC9374 m35295 = m35295(i2);
        if (!m35284(i, i2, obj)) {
            return m35295.mo24197();
        }
        Object object = f45368.getObject(obj, m35294(i2) & 1048575);
        if (m35302(object)) {
            return object;
        }
        Object mo24197 = m35295.mo24197();
        if (object != null) {
            m35295.mo24199(mo24197, object);
        }
        return mo24197;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35280(Object obj, int i, int i2, Object obj2) {
        f45368.putObject(obj, m35294(i2) & 1048575, obj2);
        m35296(i, i2, obj);
    }

    @Override // l.InterfaceC9374
    /* renamed from: ֫ */
    public final void mo24198(Object obj) {
        if (m35302(obj)) {
            if (obj instanceof AbstractC21760) {
                AbstractC21760 abstractC21760 = (AbstractC21760) obj;
                abstractC21760.setMemoizedSerializedSize(Integer.MAX_VALUE);
                abstractC21760.memoizedHashCode = 0;
                abstractC21760.m49082();
            }
            int[] iArr = this.f45369;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int m35294 = m35294(i);
                long j = 1048575 & m35294;
                int m35300 = m35300(m35294);
                if (m35300 != 9) {
                    if (m35300 == 60 || m35300 == 68) {
                        if (m35284(iArr[i], i, obj)) {
                            m35295(i).mo24198(f45368.getObject(obj, j));
                        }
                    } else {
                        switch (m35300) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f45384.mo2520(j, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f45368;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    unsafe.putObject(obj, j, this.f45383.mo26695(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
                if (m35285(i, obj)) {
                    m35295(i).mo24198(f45368.getObject(obj, j));
                }
            }
            this.f45381.mo7243(obj);
            if (this.f45379) {
                this.f45380.mo40110(obj);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m35282(Object obj, int i, Object obj2, C17798 c17798, InterfaceC10785 interfaceC10785) {
        long m35294 = m35294(i) & 1048575;
        Object m48234 = C21244.m48234(m35294, obj);
        InterfaceC10639 interfaceC10639 = this.f45383;
        if (m48234 == null) {
            m48234 = interfaceC10639.mo26694(obj2);
            C21244.m48224(m35294, obj, m48234);
        } else if (interfaceC10639.mo26693(m48234)) {
            Object mo26694 = interfaceC10639.mo26694(obj2);
            interfaceC10639.mo26689(mo26694, m48234);
            C21244.m48224(m35294, obj, mo26694);
            m48234 = mo26694;
        }
        interfaceC10639.mo26692(m48234);
        interfaceC10639.mo26691(obj2);
        interfaceC10785.mo6794();
        throw null;
    }

    @Override // l.InterfaceC9374
    /* renamed from: ۧ */
    public final boolean mo24203(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            if (i5 < this.f45375) {
                int i6 = this.f45376[i5];
                int[] iArr = this.f45369;
                int i7 = iArr[i6];
                int m35294 = m35294(i6);
                int i8 = iArr[i6 + 2];
                int i9 = i8 & 1048575;
                int i10 = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    if (i9 != 1048575) {
                        i4 = f45368.getInt(obj, i9);
                    }
                    i2 = i4;
                    i = i9;
                } else {
                    i = i3;
                    i2 = i4;
                }
                if ((268435456 & m35294) != 0 && !m35286(obj, i6, i, i2, i10)) {
                    break;
                }
                int m35300 = m35300(m35294);
                if (m35300 == 9 || m35300 == 17) {
                    if (m35286(obj, i6, i, i2, i10) && !m35295(i6).mo24203(C21244.m48234(m35294 & 1048575, obj))) {
                        break;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (m35300 != 27) {
                        if (m35300 == 60 || m35300 == 68) {
                            if (m35284(i7, i6, obj) && !m35295(i6).mo24203(C21244.m48234(m35294 & 1048575, obj))) {
                                break;
                            }
                        } else if (m35300 != 49) {
                            if (m35300 != 50) {
                                continue;
                            } else {
                                Object m48234 = C21244.m48234(m35294 & 1048575, obj);
                                InterfaceC10639 interfaceC10639 = this.f45383;
                                if (!interfaceC10639.mo26696(m48234).isEmpty()) {
                                    interfaceC10639.mo26691(m35289(i6));
                                    throw null;
                                }
                            }
                        }
                        i5++;
                        i3 = i;
                        i4 = i2;
                    }
                    List list = (List) C21244.m48234(m35294 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC9374 m35295 = m35295(i6);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (!m35295.mo24203(list.get(i11))) {
                                break loop0;
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            } else if (!this.f45379 || this.f45380.mo40104(obj).m44327()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35279(int i, Object obj, InterfaceC6633 interfaceC6633) {
        if (obj instanceof String) {
            ((C23939) interfaceC6633).m52735(i, (String) obj);
        } else {
            ((C23939) interfaceC6633).m52738(i, (AbstractC5886) obj);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35283(Object obj, int i, InterfaceC10785 interfaceC10785) {
        if ((536870912 & i) != 0) {
            C21244.m48224(i & 1048575, obj, interfaceC10785.mo6765());
        } else if (this.f45372) {
            C21244.m48224(i & 1048575, obj, interfaceC10785.mo6772());
        } else {
            C21244.m48224(i & 1048575, obj, interfaceC10785.mo6777());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35281(Object obj, int i, Object obj2, AbstractC17009 abstractC17009, Object obj3) {
        InterfaceC12587 m35276;
        int i2 = this.f45369[i];
        Object m48234 = C21244.m48234(m35294(i) & 1048575, obj);
        if (m48234 == null || (m35276 = m35276(i)) == null) {
            return;
        }
        InterfaceC10639 interfaceC10639 = this.f45383;
        Map mo26692 = interfaceC10639.mo26692(m48234);
        interfaceC10639.mo26691(m35289(i));
        for (Map.Entry entry : mo26692.entrySet()) {
            if (!m35276.mo18942(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    abstractC17009.mo7228(obj3);
                }
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m35292(int i, Object obj, Object obj2) {
        int[] iArr = this.f45369;
        int i2 = iArr[i];
        if (m35284(i2, i, obj2)) {
            long m35294 = m35294(i) & 1048575;
            Unsafe unsafe = f45368;
            Object object = unsafe.getObject(obj2, m35294);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            InterfaceC9374 m35295 = m35295(i);
            if (!m35284(i2, i, obj)) {
                if (!m35302(object)) {
                    unsafe.putObject(obj, m35294, object);
                } else {
                    Object mo24197 = m35295.mo24197();
                    m35295.mo24199(mo24197, object);
                    unsafe.putObject(obj, m35294, mo24197);
                }
                m35296(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, m35294);
            if (!m35302(object2)) {
                Object mo241972 = m35295.mo24197();
                m35295.mo24199(mo241972, object2);
                unsafe.putObject(obj, m35294, mo241972);
                object2 = mo241972;
            }
            m35295.mo24199(object2, object);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m35294(int i) {
        return this.f45369[i + 1];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m35284(int i, int i2, Object obj) {
        return C21244.m48233((long) (this.f45369[i2 + 2] & 1048575), obj) == i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m35285(int i, Object obj) {
        boolean equals;
        int i2 = this.f45369[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int m35294 = m35294(i);
            long j2 = m35294 & 1048575;
            switch (m35300(m35294)) {
                case 0:
                    if (Double.doubleToRawLongBits(C21244.m48241(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(C21244.m48254(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (C21244.m48253(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (C21244.m48253(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (C21244.m48233(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (C21244.m48253(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (C21244.m48233(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return C21244.m48248(j2, obj);
                case 8:
                    Object m48234 = C21244.m48234(j2, obj);
                    if (m48234 instanceof String) {
                        equals = ((String) m48234).isEmpty();
                    } else if (m48234 instanceof AbstractC5886) {
                        equals = AbstractC5886.f18080.equals(m48234);
                    } else {
                        throw new IllegalArgumentException();
                    }
                    return !equals;
                case 9:
                    if (C21244.m48234(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    equals = AbstractC5886.f18080.equals(C21244.m48234(j2, obj));
                    return !equals;
                case 11:
                    if (C21244.m48233(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (C21244.m48233(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (C21244.m48233(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (C21244.m48253(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (C21244.m48233(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (C21244.m48253(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (C21244.m48234(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & C21244.m48233(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m35296(int i, int i2, Object obj) {
        C21244.m48223(i, this.f45369[i2 + 2] & 1048575, obj);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m35297(int i, Object obj) {
        int i2 = this.f45369[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        C21244.m48223((1 << (i2 >>> 20)) | C21244.m48233(j, obj), j, obj);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m35302(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC21760) {
            return ((AbstractC21760) obj).m49081();
        }
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m35299(Object obj) {
        if (!m35302(obj)) {
            throw new IllegalArgumentException(C5368.m15337(obj, "Mutating immutable message: "));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35275(long j, Object obj) {
        return ((Integer) C21244.m48234(j, obj)).intValue();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m35288(long j, Object obj) {
        return ((Long) C21244.m48234(j, obj)).longValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m35287(AbstractC21760 abstractC21760, AbstractC21760 abstractC217602, int i) {
        return m35285(i, (Object) abstractC21760) == m35285(i, (Object) abstractC217602);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m35286(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m35285(i, obj);
        }
        return (i3 & i4) != 0;
    }
}
