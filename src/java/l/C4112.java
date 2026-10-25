package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.security.MessageDigest;
import java.util.ArrayList;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* compiled from: Q1VP */
/* renamed from: l.ۘᩳᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4112 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MessageDigest f13065 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f13066;

    public C4112(byte[] bArr) {
        this.f13066 = bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m12344(InterfaceC0562 interfaceC0562, InterfaceC0562 interfaceC05622, InterfaceC0562 interfaceC05623, InterfaceC17066 interfaceC17066) {
        long j;
        InterfaceC0562 m15637;
        if (interfaceC0562.size() % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF != 0) {
            throw new IllegalStateException("APK Signing Block size not a multiple of 4096: " + interfaceC0562.size());
        }
        C16084 m15638 = C5502.m15638(interfaceC0562, interfaceC05622, interfaceC05623);
        MessageDigest messageDigest = this.f13065;
        int digestLength = messageDigest.getDigestLength();
        long size = m15638.size();
        ArrayList arrayList = new ArrayList();
        do {
            j = digestLength;
            size = ((size + 4095) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) * j;
            arrayList.add(Long.valueOf(((size + 4095) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) * ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF));
        } while (size > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
        int size2 = arrayList.size();
        int[] iArr = new int[size2 + 1];
        iArr[0] = 0;
        int i = 0;
        while (i < arrayList.size()) {
            int i2 = i + 1;
            int i3 = iArr[i];
            long longValue = ((Long) arrayList.get((arrayList.size() - i) - 1)).longValue();
            int i4 = (int) longValue;
            if (i4 != longValue) {
                throw new ArithmeticException("integer overflow");
            }
            iArr[i2] = i3 + i4;
            i = i2;
        }
        byte[] bArr = new byte[iArr[size2]];
        int i5 = size2 - 1;
        int i6 = i5;
        while (true) {
            byte[] bArr2 = this.f13066;
            if (i6 < 0) {
                messageDigest.reset();
                messageDigest.update(bArr2);
                messageDigest.update(bArr, 0, 4096);
                return messageDigest.digest();
            }
            int i7 = i6 + 1;
            C9736 m8400 = C2680.m8400(iArr[i6], iArr[i7], bArr);
            if (i6 == i5) {
                m15637 = m15638;
            } else {
                int i8 = iArr[i7];
                m15637 = C5502.m15637(i8, iArr[i6 + 2] - i8, bArr);
            }
            InterfaceC0562 mo2317 = m15637.mo2317();
            long size3 = mo2317.size();
            long j2 = 0;
            while (true) {
                j2 += ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                if (j2 > size3) {
                    break;
                }
                messageDigest.reset();
                messageDigest.update(bArr2);
                mo2317.mo2315(messageDigest, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
                byte[] digest = messageDigest.digest();
                m8400.m24726(digest.length, digest);
            }
            int i9 = (int) (size3 % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
            if (i9 > 0) {
                throw new IllegalStateException(C19370.m44628(i9, "Remaining: "));
            }
            int size4 = (int) ((((m15637.size() + 4095) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) * j) % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
            if (size4 > 0) {
                int i10 = 4096 - size4;
                m8400.m24726(i10, new byte[i10]);
            }
            if (interfaceC17066.mo1526()) {
                return null;
            }
            i6--;
        }
    }
}
