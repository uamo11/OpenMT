package l;

import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import bin.mt.plus.Features3;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* compiled from: R6YJ */
/* renamed from: l.ۘ֡ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3594 extends AbstractC10503 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15587 f11410;

    public C3594(C15587 c15587) {
        super(c15587);
        this.f11410 = c15587;
    }

    @Override // l.AbstractC10503
    /* renamed from: ֫ */
    public final EnumC4858 mo8669(EnumC13324 enumC13324) {
        switch (C2183.f7184[enumC13324.ordinal()]) {
            case 1:
            case 2:
                return EnumC4858.SUPPORTED;
            case 3:
            case 4:
            case 5:
                return EnumC4858.ATOMIC;
            case 6:
            case 7:
            case 8:
                return EnumC4858.BEST_EFFORT;
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    @Override // l.AbstractC10503
    /* renamed from: ܽ */
    public final void mo8675() {
        AbstractC15440 abstractC15440 = this.f31505;
        try {
            if (this.f11410.f48020.createNewFile()) {
            } else {
                throw C22497.m50454(EnumC13324.CREATE_FILE_EXCLUSIVE, EnumC21792.ALREADY_EXISTS, abstractC15440.mo23554(), (String) null);
            }
        } catch (SecurityException e) {
            throw m10990(EnumC13324.CREATE_FILE_EXCLUSIVE, (String) null, e);
        } catch (C22497 e2) {
            throw e2;
        } catch (IOException e3) {
            throw C22497.m50453(EnumC13324.CREATE_FILE_EXCLUSIVE, abstractC15440.mo23554(), (String) null, e3);
        }
    }

    @Override // l.AbstractC10503
    /* renamed from: ۜ */
    public final C12619 mo8672() {
        C15587 c15587 = this.f11410;
        return m10989(c15587, c15587.f48020);
    }

    @Override // l.AbstractC10503
    /* renamed from: ܳ */
    public final List mo8674() {
        AbstractC15440 abstractC15440 = this.f31505;
        C12619 mo8672 = mo8672();
        EnumC3447 enumC3447 = EnumC3447.DIRECTORY;
        EnumC13324 enumC13324 = EnumC13324.LIST;
        m10991(mo8672, enumC3447, enumC13324);
        try {
            File[] listFiles = this.f11410.f48020.listFiles();
            if (listFiles == null) {
                throw C22497.m50454(enumC13324, EnumC21792.IO_ERROR, abstractC15440.mo23554(), (String) null);
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                C12619 m10989 = m10989(C16999.m39864(file), file);
                if (m10989.m30885() != EnumC3447.MISSING) {
                    arrayList.add(m10989);
                }
            }
            return arrayList;
        } catch (SecurityException e) {
            throw new C22497(EnumC13324.LIST, EnumC21792.PERMISSION_DENIED, abstractC15440.mo23554(), null, C4153.m12552(abstractC15440, new StringBuilder("Checked file operation LIST failed for ")), e);
        }
    }

    @Override // l.AbstractC10503
    /* renamed from: ۧ */
    public final void mo8673() {
        try {
            Os.mkdir(this.f11410.f48020.getPath(), SecP521R1Field.P16);
        } catch (ErrnoException e) {
            throw C22497.m50452(EnumC13324.CREATE_DIRECTORY_SINGLE, this.f31505.mo23554(), (String) null, e);
        } catch (SecurityException e2) {
            throw m10990(EnumC13324.CREATE_DIRECTORY_SINGLE, (String) null, e2);
        }
    }

    @Override // l.AbstractC10503
    /* renamed from: ܿ */
    public final void mo8676() {
        C12619 mo8672 = mo8672();
        EnumC3447 m30885 = mo8672.m30885();
        EnumC3447 enumC3447 = EnumC3447.MISSING;
        AbstractC15440 abstractC15440 = this.f31505;
        if (m30885 == enumC3447) {
            throw C22497.m50454(EnumC13324.DELETE_FILE_OR_LINK, EnumC21792.NOT_FOUND, abstractC15440.mo23554(), (String) null);
        }
        if (mo8672.m30885() != EnumC3447.REGULAR) {
            throw C22497.m50454(EnumC13324.DELETE_FILE_OR_LINK, EnumC21792.NOT_REGULAR_FILE, abstractC15440.mo23554(), (String) null);
        }
        try {
            Os.remove(this.f11410.f48020.getPath());
        } catch (ErrnoException e) {
            throw C22497.m50452(EnumC13324.DELETE_FILE_OR_LINK, abstractC15440.mo23554(), (String) null, e);
        } catch (SecurityException e2) {
            throw m10990(EnumC13324.DELETE_FILE_OR_LINK, (String) null, e2);
        }
    }

    @Override // l.AbstractC10503
    /* renamed from: ᩳ */
    public final void mo8677() {
        m10991(mo8672(), EnumC3447.DIRECTORY, EnumC13324.DELETE_EMPTY_DIRECTORY);
        try {
            Os.remove(this.f11410.f48020.getPath());
        } catch (ErrnoException e) {
            throw C22497.m50452(EnumC13324.DELETE_EMPTY_DIRECTORY, this.f31505.mo23554(), (String) null, e);
        } catch (SecurityException e2) {
            throw m10990(EnumC13324.DELETE_EMPTY_DIRECTORY, (String) null, e2);
        }
    }

    @Override // l.AbstractC10503
    /* renamed from: ֫ */
    public final void mo8670(AbstractC15440 abstractC15440) {
        EnumC13324 enumC13324 = EnumC13324.RENAME_NO_REPLACE;
        boolean mo36530 = abstractC15440.mo36530();
        AbstractC15440 abstractC154402 = this.f31505;
        if (!mo36530) {
            throw C22497.m50454(enumC13324, EnumC21792.CROSS_BACKEND, abstractC154402.mo23554(), abstractC15440.mo23554());
        }
        C15587 mo36531 = abstractC15440.mo36531();
        String mo23554 = abstractC15440.mo23554();
        EnumC3447 m30885 = mo8672().m30885();
        EnumC3447 enumC3447 = EnumC3447.MISSING;
        if (m30885 != enumC3447) {
            mo36531.getClass();
            if (new C3594(mo36531).mo8672().m30885() != enumC3447) {
                throw C22497.m50454(enumC13324, EnumC21792.ALREADY_EXISTS, abstractC154402.mo23554(), abstractC15440.mo23554());
            }
            m10992(mo36531, enumC13324);
            return;
        }
        throw C22497.m50454(enumC13324, EnumC21792.NOT_FOUND, abstractC154402.mo23554(), mo23554);
    }

    @Override // l.AbstractC10503
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo10993(AbstractC15440 abstractC15440) {
        EnumC13324 enumC13324 = EnumC13324.REPLACE;
        boolean mo36530 = abstractC15440.mo36530();
        AbstractC15440 abstractC154402 = this.f31505;
        if (!mo36530) {
            throw C22497.m50454(enumC13324, EnumC21792.CROSS_BACKEND, abstractC154402.mo23554(), abstractC15440.mo23554());
        }
        C15587 mo36531 = abstractC15440.mo36531();
        String mo23554 = abstractC15440.mo23554();
        if (mo8672().m30885() != EnumC3447.MISSING) {
            m10992(mo36531, enumC13324);
            return;
        }
        throw C22497.m50454(enumC13324, EnumC21792.NOT_FOUND, abstractC154402.mo23554(), mo23554);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10992(C15587 c15587, EnumC13324 enumC13324) {
        C15587 c155872 = this.f11410;
        long m36754 = c155872.m36754(c15587);
        try {
            Os.rename(c155872.f48020.getPath(), c15587.f48020.getPath());
            File file = c15587.f48020;
            if (m36754 < 0) {
                return;
            }
            try {
                if (file.setLastModified(m36754)) {
                    return;
                }
                file.toString();
            } catch (RuntimeException unused) {
                C11003.toString(file);
            }
        } catch (ErrnoException e) {
            throw C22497.m50452(enumC13324, this.f31505.mo23554(), c15587.mo23554(), e);
        } catch (SecurityException e2) {
            throw m10990(enumC13324, c15587.mo23554(), e2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12619 m10989(AbstractC15440 abstractC15440, File file) {
        try {
            long[] m59 = Features3.m59(file.getPath());
            int i = OsConstants.S_IFMT & ((int) m59[0]);
            EnumC3447 enumC3447 = i == OsConstants.S_IFREG ? EnumC3447.REGULAR : i == OsConstants.S_IFDIR ? EnumC3447.DIRECTORY : EnumC3447.OTHER;
            return new C12619(abstractC15440, enumC3447, enumC3447 == EnumC3447.DIRECTORY ? -1L : m59[1], m59[2], null);
        } catch (ErrnoException e) {
            if (e.errno == OsConstants.ENOENT) {
                return C12619.m30881(abstractC15440);
            }
            throw C22497.m50452(EnumC13324.STAT, abstractC15440.mo23554(), (String) null, e);
        } catch (SecurityException e2) {
            throw new C22497(EnumC13324.STAT, EnumC21792.PERMISSION_DENIED, abstractC15440.mo23554(), null, C4153.m12552(abstractC15440, new StringBuilder("Checked file operation STAT failed for ")), e2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10991(C12619 c12619, EnumC3447 enumC3447, EnumC13324 enumC13324) {
        EnumC21792 enumC21792;
        EnumC3447 m30885 = c12619.m30885();
        EnumC3447 enumC34472 = EnumC3447.MISSING;
        AbstractC15440 abstractC15440 = this.f31505;
        if (m30885 == enumC34472) {
            throw C22497.m50454(enumC13324, EnumC21792.NOT_FOUND, abstractC15440.mo23554(), (String) null);
        }
        if (c12619.m30885() != enumC3447) {
            if (enumC3447 == EnumC3447.DIRECTORY) {
                enumC21792 = EnumC21792.NOT_DIRECTORY;
            } else {
                enumC21792 = EnumC21792.NOT_REGULAR_FILE;
            }
            throw C22497.m50454(enumC13324, enumC21792, abstractC15440.mo23554(), (String) null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C22497 m10990(EnumC13324 enumC13324, String str, SecurityException securityException) {
        EnumC21792 enumC21792 = EnumC21792.PERMISSION_DENIED;
        AbstractC15440 abstractC15440 = this.f31505;
        String mo23554 = abstractC15440.mo23554();
        StringBuilder sb = new StringBuilder("Checked file operation ");
        sb.append(enumC13324);
        sb.append(" failed for ");
        return new C22497(enumC13324, enumC21792, mo23554, str, C4153.m12552(abstractC15440, sb), securityException);
    }
}
