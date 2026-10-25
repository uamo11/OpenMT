package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: 698T */
/* renamed from: l.ܰ֡ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C13468 extends AbstractC6138 {

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public String f40207;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f40208;

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76965;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a2d, m11517("saveAsPath"), m11556("title"));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        mo11546(m11556("title"));
        m11555(R.string.MT_Protector_res_0x7f1207a7);
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        AbstractC15440 m11515 = m11515("inputPath1");
        AbstractC15440 m115152 = m11515("inputPath2");
        C19277 c19277 = new C19277(m115152.mo23127() + m11515.mo23127());
        c19277.m44459(new C4236(5, this));
        InterfaceC15334[] interfaceC15334Arr = {C8280.m21880(), C8280.m21881(), C8280.m21882(), C8280.m21879()};
        C5458 c5458 = new C5458(interfaceC15334Arr);
        try {
            InputStream mo27926 = m11515.mo27926();
            try {
                c5458.m15562(mo27926, c19277);
                if (mo27926 != null) {
                    mo27926.close();
                }
                c5458.close();
                InterfaceC15334[] interfaceC15334Arr2 = {C8280.m21880(), C8280.m21881(), C8280.m21882(), C8280.m21879()};
                c5458 = new C5458(interfaceC15334Arr2);
                try {
                    mo27926 = m115152.mo27926();
                    try {
                        c5458.m15562(mo27926, c19277);
                        if (mo27926 != null) {
                            mo27926.close();
                        }
                        c5458.close();
                        byte[][] bArr = {interfaceC15334Arr[0].mo4062(), interfaceC15334Arr[1].mo4062(), interfaceC15334Arr[2].mo4062(), interfaceC15334Arr[3].mo4062()};
                        byte[][] bArr2 = {interfaceC15334Arr2[0].mo4062(), interfaceC15334Arr2[1].mo4062(), interfaceC15334Arr2[2].mo4062(), interfaceC15334Arr2[3].mo4062()};
                        boolean deepEquals = Arrays.deepEquals(bArr, bArr2);
                        this.f40208 = !deepEquals;
                        if (!deepEquals) {
                            this.f40207 = m11515.mo23554() + "\n" + m115152.mo23554() + "\n\n" + m32484(bArr[0], "[MD5]", bArr2[0]) + "\n\n" + m32484(bArr[1], "[SHA1]", bArr2[1]) + "\n\n" + m32484(bArr[2], "[SHA256]", bArr2[2]) + "\n\n" + m32484(bArr[3], "[CRC32]", bArr2[3]);
                        }
                        return m11545();
                    } finally {
                    }
                } finally {
                }
            } finally {
                if (mo27926 != null) {
                    try {
                        mo27926.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32484(byte[] bArr, String str, byte[] bArr2) {
        String m34531 = C14460.m34531(bArr);
        String m345312 = C14460.m34531(bArr2);
        if (m34531.equals(m345312)) {
            return str + "\n✔ " + m34531 + "\n✔ " + m345312;
        }
        return str + "\n✘ " + m34531 + "\n✘ " + m345312;
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526()) {
            if (!this.f40208) {
                C21374.m48457(R.string.MT_Protector_res_0x7f1206ed);
            } else {
                ActivityC14946.m35399(main, this.f40207, m11556("title"), m11556("saveAsPath"), null);
            }
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
