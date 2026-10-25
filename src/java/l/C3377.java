package l;

import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.util.List;
import java.util.Set;

/* compiled from: X44P */
/* renamed from: l.ۗܿ۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3377 implements InterfaceC4788 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f10673;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11844 f10674;

    @Override // l.InterfaceC4788
    public final void close() {
    }

    @Override // l.InterfaceC4788
    /* renamed from: ۧ */
    public final boolean mo4118() {
        return false;
    }

    public C3377(C11844 c11844, InterfaceC20758 interfaceC20758) {
        this.f10674 = c11844;
        this.f10673 = interfaceC20758;
    }

    @Override // l.InterfaceC4788
    /* renamed from: ֫ */
    public final void mo4117(InterfaceC20758 interfaceC20758, C10349 c10349, Set set, boolean z, C18837 c18837) {
        InterfaceC20758 interfaceC207582 = this.f10673;
        try {
            InterfaceC20758 m28786 = c10349.m28786(interfaceC20758);
            if (!C17229.exists(m28786, new EnumC14406[0])) {
                return;
            }
            C11844 c11844 = this.f10674;
            if (!C11844.m28925(c11844, m28786, c10349)) {
                return;
            }
            InterfaceC17664 list = C17229.list(m28786);
            try {
                EnumC6199 enumC6199 = c11844.f35341;
                List<InterfaceC20758> list2 = (enumC6199 == null ? list : list.sorted(enumC6199)).toList();
                if (list != null) {
                    list.close();
                }
                for (InterfaceC20758 interfaceC207583 : list2) {
                    String interfaceC207584 = interfaceC207583.getFileName().toString();
                    if (interfaceC207584.endsWith("/")) {
                        interfaceC207584 = C15472.m36561(1, 0, interfaceC207584);
                    }
                    if (C17229.isDirectory(interfaceC207583, new EnumC14406[0])) {
                        if (z && EnumC3503.m10687(interfaceC207584)) {
                            mo4117(interfaceC20758, new C10349(C9045.m23341(new StringBuilder(), c10349.f35100, interfaceC207584)), set, z, c18837);
                        }
                    } else if (set.contains(AbstractC21017.m47830(interfaceC207584))) {
                        try {
                            C6115 c6115 = new C6115(c10349, interfaceC207584);
                            InterfaceC20758 m287862 = c6115.m28786(interfaceC207582);
                            int i = AbstractC12465.f37474;
                            c18837.m43511(new C4704(c11844, m287862, interfaceC20758, c6115, 0));
                        } catch (InvalidPathException e) {
                            throw new IOException("error accessing directory " + interfaceC207582 + e);
                        }
                    }
                }
            } finally {
            }
        } catch (IOException | InvalidPathException unused) {
        }
    }

    @Override // l.InterfaceC4788
    /* renamed from: ֫ */
    public final InterfaceC18278 mo4116(InterfaceC20758 interfaceC20758, C6115 c6115) {
        C2672 c2672;
        try {
            InterfaceC20758 m28786 = c6115.m28786(interfaceC20758);
            if (!C17229.exists(m28786, new EnumC14406[0])) {
                return null;
            }
            C11844 c11844 = this.f10674;
            c2672 = c11844.f35340;
            InterfaceC20758 mo8367 = c2672.mo8367(m28786);
            int i = AbstractC12465.f37474;
            return new C13170(c11844, mo8367, m28786, 0);
        } catch (InvalidPathException unused) {
            return null;
        }
    }

    @Override // l.InterfaceC4788
    /* renamed from: ֫ */
    public final Iterable mo4115() {
        return C2609.m8239();
    }
}
