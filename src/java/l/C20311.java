package l;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipException;

/* compiled from: X44P */
/* renamed from: l.᩶ܿ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20311 implements InterfaceC4788 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f65579;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC7145 f65580;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f65581;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11844 f65582;

    @Override // l.InterfaceC4788
    /* renamed from: ۧ */
    public final boolean mo4118() {
        return true;
    }

    public C20311(C11844 c11844, InterfaceC20758 interfaceC20758) {
        C2672 c2672;
        Set set;
        C2672 c26722;
        this.f65582 = c11844;
        this.f65579 = interfaceC20758;
        if (c11844.f67853 != null && interfaceC20758.toString().endsWith(".jar")) {
            Map singletonMap = Collections.singletonMap("multi-release", c11844.f67853);
            c26722 = c11844.f35340;
            C1344 m8365 = c26722.m8365();
            if (m8365 == null) {
                C12171.m29640("should have been caught before!");
                throw null;
            }
            try {
                this.f65580 = m8365.newFileSystem(interfaceC20758, singletonMap);
            } catch (ZipException e) {
                throw new IOException("ZipException opening \"" + interfaceC20758.getFileName() + "\": " + e.getMessage(), e);
            }
        } else {
            c2672 = c11844.f35340;
            this.f65580 = c2672.m8365().newFileSystem(interfaceC20758, (Map) null);
        }
        this.f65581 = new HashMap();
        for (InterfaceC20758 interfaceC207582 : this.f65580.getRootDirectories()) {
            set = C11844.f35335;
            C17229.walkFileTree(interfaceC207582, set, Integer.MAX_VALUE, new C21722(this, interfaceC207582));
        }
    }

    @Override // l.InterfaceC4788
    /* renamed from: ֫ */
    public final void mo4117(InterfaceC20758 interfaceC20758, C10349 c10349, Set set, boolean z, C18837 c18837) {
        Set set2;
        InterfaceC20758 interfaceC207582 = (InterfaceC20758) this.f65581.get(c10349);
        if (interfaceC207582 == null) {
            return;
        }
        int i = z ? Integer.MAX_VALUE : 1;
        set2 = C11844.f35333;
        C17229.walkFileTree(interfaceC207582, set2, i, new C22427(this, set, c18837));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46553(C20311 c20311, InterfaceC20758 interfaceC20758) {
        if (interfaceC20758 == null) {
            return true;
        }
        String interfaceC207582 = interfaceC20758.toString();
        if (interfaceC207582.endsWith("/")) {
            interfaceC207582 = C15472.m36561(1, 0, interfaceC207582);
        }
        return EnumC3503.m10687(interfaceC207582);
    }

    @Override // l.InterfaceC4788
    /* renamed from: ֫ */
    public final InterfaceC18278 mo4116(InterfaceC20758 interfaceC20758, C6115 c6115) {
        InterfaceC20758 interfaceC207582 = (InterfaceC20758) this.f65581.get(c6115.m17028());
        if (interfaceC207582 == null) {
            return null;
        }
        String str = c6115.f35100;
        InterfaceC20758 resolve = interfaceC207582.resolve(str.substring(str.lastIndexOf(47) + 1));
        if (!C17229.exists(resolve, new EnumC14406[0])) {
            return null;
        }
        int i = AbstractC12465.f37474;
        return new C3293(this.f65582, resolve, interfaceC20758, 0);
    }

    @Override // l.InterfaceC4788
    public final void close() {
        this.f65580.close();
    }

    @Override // l.InterfaceC4788
    /* renamed from: ֫ */
    public final Iterable mo4115() {
        return this.f65581.keySet();
    }
}
