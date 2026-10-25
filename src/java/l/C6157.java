package l;

import java.nio.file.InvalidPathException;

/* compiled from: H7RN */
/* renamed from: l.ۛܺ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C6157 extends EnumC0121 {
    public /* synthetic */ C6157(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("SOURCEFILE", 79, "sourcefile", null, enumC18467, enumC3650);
    }

    public C6157(String str, int i, String str2, String str3, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* renamed from: ֫ */
    public boolean mo1183(String str) {
        if (str.endsWith(".java")) {
            return true;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return EnumC3503.m10693(str.substring(0, indexOf)) && EnumC3503.m10693(str.substring(indexOf + 1));
        }
        return EnumC3503.m10693(str);
    }

    @Override // l.EnumC0121
    /* renamed from: ֫ */
    public void mo1178(AbstractC0827 abstractC0827, String str) {
        if (str.endsWith(".java")) {
            try {
                InterfaceC20758 interfaceC20758 = C8763.get(str, new String[0]);
                if (!C17229.exists(interfaceC20758, new EnumC14406[0])) {
                    String interfaceC207582 = interfaceC20758.toString();
                    C12281 c12281 = C6241.f19132;
                    throw abstractC0827.m3074(new C12281("compiler", "file.not.found", interfaceC207582));
                }
                if (!C17229.isRegularFile(interfaceC20758, new EnumC14406[0])) {
                    C12281 c122812 = C6241.f19132;
                    throw abstractC0827.m3074(new C12281("compiler", "file.not.file", interfaceC20758));
                }
                abstractC0827.mo3078(interfaceC20758);
                return;
            } catch (InvalidPathException unused) {
                C12281 c122813 = C6241.f19132;
                throw abstractC0827.m3074(new C12281("compiler", "invalid.path", str));
            }
        }
        abstractC0827.mo3076(str);
    }
}
