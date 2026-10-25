package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;

/* compiled from: 640U */
/* renamed from: l.᩵ᩴ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19648 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f63396 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC21848 f63397;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f63398;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f63399;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f63400;

    public C19648(InterfaceC21848 interfaceC21848, C22364 c22364, EnumC16280 enumC16280, C2002 c2002, boolean z, InterfaceC15496 interfaceC15496, boolean z2) {
        this.f63397 = interfaceC21848;
        InterfaceC7213 m6533 = c2002.m6533(c2002.f6699);
        try {
            interfaceC21848.mo22122(interfaceC15496);
            EnumC3503 mo22124 = interfaceC21848.mo22124();
            if (mo22124.compareTo(EnumC16280.m38299(enumC16280)) < 0) {
                String name = interfaceC21848.getClass().getName();
                String str = enumC16280.f50071;
                C11076 c11076 = C14001.f42334;
                c22364.m7275(new C11076("compiler", "proc.processor.incompatible.source.version", mo22124, name, str));
            }
            this.f63400 = new LinkedHashSet();
            this.f63398 = new LinkedHashSet();
            for (String str2 : interfaceC21848.mo22123()) {
                boolean add = this.f63400.add(str2);
                this.f63398.add(C1302.m4493(z, str2, this.f63397, c22364, z2));
                if (z2 && !add) {
                    String name2 = interfaceC21848.getClass().getName();
                    C11076 c110762 = C14001.f42334;
                    c22364.m7275(new C11076("compiler", "proc.duplicate.supported.annotation", str2, name2));
                }
            }
            if (z2 && this.f63398.contains(C3314.m10126("*")) && this.f63398.size() > 1) {
                String name3 = interfaceC21848.getClass().getName();
                C11076 c110763 = C14001.f42334;
                c22364.m7275(new C11076("compiler", "proc.redundant.types.with.wildcard", name3));
            }
            this.f63399 = new LinkedHashSet();
            for (String str3 : this.f63397.mo22121()) {
                if (m45162(str3, c22364)) {
                    boolean add2 = this.f63399.add(str3);
                    if (z2 && !add2) {
                        String name4 = interfaceC21848.getClass().getName();
                        C11076 c110764 = C14001.f42334;
                        c22364.m7275(new C11076("compiler", "proc.duplicate.option.name", str3, name4));
                    }
                }
            }
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m45162(String str, C22364 c22364) {
        boolean z;
        Pattern pattern = C1302.f4634;
        String[] split = str.split("\\.", -1);
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (!EnumC3503.m10687(split[i])) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            String name = this.f63397.getClass().getName();
            C12281 c12281 = C6241.f19132;
            c22364.m7276(new C12281("compiler", "proc.processor.bad.option.name", str, name));
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45164(String str) {
        Iterator it = this.f63398.iterator();
        while (it.hasNext()) {
            if (((Pattern) it.next()).matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45163(HashSet hashSet) {
        hashSet.removeAll(this.f63399);
    }
}
