package l;

import java.util.List;

/* compiled from: 66XX */
/* renamed from: l.ۤ᩵ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC10503 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f31505;

    /* renamed from: ֫ */
    public abstract EnumC4858 mo8669(EnumC13324 enumC13324);

    public AbstractC10503(AbstractC15440 abstractC15440) {
        this.f31505 = abstractC15440;
    }

    /* renamed from: ۜ */
    public C12619 mo8672() {
        throw m26404(EnumC13324.STAT, null);
    }

    /* renamed from: ܳ */
    public List mo8674() {
        throw m26404(EnumC13324.LIST, null);
    }

    /* renamed from: ᩻ */
    public List mo8678() {
        return mo8674();
    }

    /* renamed from: ֫ */
    public List mo8668(C12619 c12619) {
        return mo8678();
    }

    /* renamed from: ܽ */
    public void mo8675() {
        throw m26404(EnumC13324.CREATE_FILE_EXCLUSIVE, null);
    }

    /* renamed from: ֫ */
    public boolean mo8671() {
        C12619 mo8672 = mo8672();
        if (mo8672.m30885() == EnumC3447.MISSING) {
            return true;
        }
        if (mo8672.m30885() != EnumC3447.REGULAR || mo8669(EnumC13324.DELETE_FILE_OR_LINK) == EnumC4858.UNSUPPORTED) {
            return false;
        }
        mo8676();
        return true;
    }

    /* renamed from: ۧ */
    public void mo8673() {
        throw m26404(EnumC13324.CREATE_DIRECTORY_SINGLE, null);
    }

    /* renamed from: ܿ */
    public void mo8676() {
        throw m26404(EnumC13324.DELETE_FILE_OR_LINK, null);
    }

    /* renamed from: ᩳ */
    public void mo8677() {
        throw m26404(EnumC13324.DELETE_EMPTY_DIRECTORY, null);
    }

    /* renamed from: ֫ */
    public void mo8670(AbstractC15440 abstractC15440) {
        throw m26404(EnumC13324.RENAME_NO_REPLACE, abstractC15440.mo23554());
    }

    /* renamed from: ۧ */
    public void mo10993(AbstractC15440 abstractC15440) {
        throw m26404(EnumC13324.REPLACE, abstractC15440.mo23554());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22497 m26404(EnumC13324 enumC13324, String str) {
        return C22497.m50455(enumC13324, this.f31505.mo23554(), str);
    }
}
