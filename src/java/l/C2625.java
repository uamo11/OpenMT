package l;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: W1GC */
/* renamed from: l.ۖܺ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2625 extends C20264 implements InterfaceC15323 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Application f8256;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Bundle f8257;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8269 f8258;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15228 f8259;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC7379 f8260;

    public C2625(Application application, InterfaceC22285 interfaceC22285, Bundle bundle) {
        C8269 c8269;
        C8269 c82692;
        this.f8259 = interfaceC22285.getSavedStateRegistry();
        this.f8260 = interfaceC22285.getLifecycle();
        this.f8257 = bundle;
        this.f8256 = application;
        if (application == null) {
            c8269 = new C8269();
        } else {
            c82692 = C8269.f25429;
            if (c82692 == null) {
                C8269.f25429 = new C8269(application);
            }
            c8269 = C8269.f25429;
            C11233.m27799(c8269);
        }
        this.f8258 = c8269;
    }

    @Override // l.InterfaceC15323
    /* renamed from: ֫ */
    public final AbstractC5447 mo5214(Class cls, C16344 c16344) {
        List list;
        Constructor m12130;
        List list2;
        int i = C22380.f72526;
        String str = (String) c16344.m20277().get(C21675.f69527);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (c16344.m20277().get(C20970.f67747) == null || c16344.m20277().get(C20970.f67748) == null) {
            if (this.f8260 != null) {
                return m8256(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        InterfaceC13912 interfaceC13912 = C8269.f25430;
        Application application = (Application) c16344.m20277().get(C1213.f4363);
        boolean isAssignableFrom = C18669.class.isAssignableFrom(cls);
        if (!isAssignableFrom || application == null) {
            list = C4036.f12805;
            m12130 = C4036.m12130(cls, list);
        } else {
            list2 = C4036.f12804;
            m12130 = C4036.m12130(cls, list2);
        }
        return m12130 == null ? this.f8258.mo5214(cls, c16344) : (!isAssignableFrom || application == null) ? C4036.m12132(cls, m12130, C20970.m47786(c16344)) : C4036.m12132(cls, m12130, application, C20970.m47786(c16344));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5447 m8256(Class cls, String str) {
        List list;
        Constructor m12130;
        C22380 c22380;
        C22380 c223802;
        List list2;
        AbstractC7379 abstractC7379 = this.f8260;
        if (abstractC7379 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = C18669.class.isAssignableFrom(cls);
        Application application = this.f8256;
        if (!isAssignableFrom || application == null) {
            list = C4036.f12805;
            m12130 = C4036.m12130(cls, list);
        } else {
            list2 = C4036.f12804;
            m12130 = C4036.m12130(cls, list2);
        }
        if (m12130 != null) {
            C15228 c15228 = this.f8259;
            C11233.m27799(c15228);
            C18147 m29874 = C12318.m29874(c15228, abstractC7379, str, this.f8257);
            AbstractC5447 m12132 = (!isAssignableFrom || application == null) ? C4036.m12132(cls, m12130, m29874.m42254()) : C4036.m12132(cls, m12130, application, m29874.m42254());
            m12132.m15545(m29874);
            return m12132;
        }
        if (application != null) {
            return this.f8258.mo5213(cls);
        }
        c22380 = C22380.f72527;
        if (c22380 == null) {
            C22380.f72527 = new C22380();
        }
        c223802 = C22380.f72527;
        C11233.m27799(c223802);
        return c223802.mo5213(cls);
    }

    @Override // l.InterfaceC15323
    /* renamed from: ֫ */
    public final AbstractC5447 mo5213(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return m8256(cls, canonicalName);
    }

    @Override // l.C20264
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8257(AbstractC5447 abstractC5447) {
        AbstractC7379 abstractC7379 = this.f8260;
        if (abstractC7379 != null) {
            C15228 c15228 = this.f8259;
            C11233.m27799(c15228);
            C12318.m29875(abstractC5447, c15228, abstractC7379);
        }
    }
}
