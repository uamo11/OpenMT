package l;

import java.io.IOException;
import java.nio.file.ProviderNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: K7QT */
/* renamed from: l.֨ܳ۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1176 extends LinkedHashSet {
    public static final long serialVersionUID = 0;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f4224;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f4225 = false;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final transient HashSet f4226 = new HashSet();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient InterfaceC20758 f4227 = null;

    public C1176(C22343 c22343) {
        this.f4224 = c22343;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m3985() {
        this.f4225 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3982(InterfaceC20758 interfaceC20758) {
        this.f4227 = interfaceC20758;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3981(String str, boolean z) {
        boolean z2 = this.f4225;
        this.f4225 = true;
        if (str != null) {
            try {
                Iterator it = C22343.m50075(this.f4224, str).iterator();
                while (it.hasNext()) {
                    m3978((InterfaceC20758) it.next(), z);
                }
            } finally {
                this.f4225 = z2;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m3978(InterfaceC20758 interfaceC20758, final boolean z) {
        C22364 c22364;
        boolean isDirectory = C17229.isDirectory(interfaceC20758, new EnumC14406[0]);
        final C22343 c22343 = this.f4224;
        if (isDirectory) {
            try {
                InterfaceC17664 list = C17229.list(interfaceC20758);
                try {
                    list.filter(new Predicate() { // from class: l.֡ܳ۠
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C19285.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public /* synthetic */ Predicate mo4928negate() {
                            return C19285.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C19285.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return C22343.m50080(C22343.this, (InterfaceC20758) obj);
                        }
                    }).forEach(new Consumer() { // from class: l.ۚܳ۠
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void n(Object obj) {
                            boolean z2 = z;
                            C1176.this.m3983((InterfaceC20758) obj, z2);
                        }
                    });
                    list.close();
                    return;
                } finally {
                }
            } catch (IOException unused) {
                return;
            }
        }
        if (z) {
            c22364 = c22343.f72411;
            EnumC20347 enumC20347 = EnumC20347.PATH;
            C11076 c11076 = C14001.f42334;
            c22364.m7282(enumC20347, new C11076("compiler", "dir.path.element.not.found", interfaceC20758));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3984(String str, boolean z) {
        C18837 m50074;
        if (str != null) {
            m50074 = this.f4224.m50074(str, this.f4227);
            m3979(m50074, z);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3980(String str) {
        boolean z;
        z = this.f4224.f72410;
        m3984(str, z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3979(Iterable iterable, boolean z) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m3983((InterfaceC20758) it.next(), z);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3983(InterfaceC20758 interfaceC20758, boolean z) {
        C2672 c2672;
        C2672 c26722;
        C2672 c26723;
        C2672 c26724;
        C22364 c22364;
        C2672 c26725;
        C2672 c26726;
        C22364 c223642;
        C22364 c223643;
        C22364 c223644;
        C22364 c223645;
        if (contains(interfaceC20758)) {
            return;
        }
        C22343 c22343 = this.f4224;
        c2672 = c22343.f72409;
        if (!c2672.mo8366(interfaceC20758)) {
            if (z) {
                c223645 = c22343.f72411;
                EnumC20347 enumC20347 = EnumC20347.PATH;
                C11076 c11076 = C14001.f42334;
                c223645.m7282(enumC20347, new C11076("compiler", "path.element.not.found", interfaceC20758));
            }
            add(interfaceC20758);
            return;
        }
        c26722 = c22343.f72409;
        InterfaceC20758 mo8367 = c26722.mo8367(interfaceC20758);
        HashSet hashSet = this.f4226;
        if (hashSet.contains(mo8367)) {
            return;
        }
        c26723 = c22343.f72409;
        if (c26723.mo8369(interfaceC20758) && !interfaceC20758.getFileName().toString().endsWith(".jmod") && !interfaceC20758.endsWith("modules")) {
            if (!C22343.m50080(c22343, interfaceC20758)) {
                try {
                    C1707.newFileSystem(interfaceC20758, (ClassLoader) null).close();
                    if (z) {
                        c223644 = c22343.f72411;
                        EnumC20347 enumC203472 = EnumC20347.PATH;
                        C11076 c110762 = C14001.f42334;
                        c223644.m7282(enumC203472, new C11076("compiler", "unexpected.archive.file", interfaceC20758));
                    }
                } catch (IOException | ProviderNotFoundException unused) {
                    if (z) {
                        c223643 = c22343.f72411;
                        EnumC20347 enumC203473 = EnumC20347.PATH;
                        C11076 c110763 = C14001.f42334;
                        c223643.m7282(enumC203473, new C11076("compiler", "invalid.archive.file", interfaceC20758));
                        return;
                    }
                    return;
                }
            } else {
                c26726 = c22343.f72409;
                if (c26726.m8365() == null) {
                    c223642 = c22343.f72411;
                    C12281 c12281 = C6241.f19132;
                    c223642.m7276(new C12281("compiler", "no.zipfs.for.archive", interfaceC20758));
                    return;
                }
            }
        }
        add(interfaceC20758);
        hashSet.add(mo8367);
        if (this.f4225) {
            c26724 = c22343.f72409;
            if (!c26724.mo8369(interfaceC20758) || interfaceC20758.endsWith("modules")) {
                return;
            }
            try {
                c26725 = c22343.f72409;
                Iterator it = c26725.mo8368(interfaceC20758).iterator();
                while (it.hasNext()) {
                    m3983((InterfaceC20758) it.next(), z);
                }
            } catch (IOException e) {
                c22364 = c22343.f72411;
                int i = C11844.f35338;
                String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage == null && (localizedMessage = e.getMessage()) == null) {
                    localizedMessage = e.toString();
                }
                C12281 c122812 = C6241.f19132;
                c22364.m7276(new C12281("compiler", "error.reading.file", interfaceC20758, localizedMessage));
            }
        }
    }
}
