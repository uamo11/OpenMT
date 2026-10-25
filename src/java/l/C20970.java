package l;

import android.os.Bundle;

/* compiled from: MANZ */
/* renamed from: l.᩷ܺ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20970 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C14618 f67747 = new C14618();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C23791 f67748 = new C23791();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C17441 f67746 = new C17441();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C16029 m47787(InterfaceC13207 interfaceC13207) {
        AbstractC7563 abstractC7563;
        C10701 c10701 = new C10701();
        c10701.m26826(C6999.m18935(C16029.class), C6858.f21207);
        C1528 m26825 = c10701.m26825();
        C3330 viewModelStore = interfaceC13207.getViewModelStore();
        if (interfaceC13207 instanceof InterfaceC4557) {
            abstractC7563 = ((InterfaceC4557) interfaceC13207).getDefaultViewModelCreationExtras();
        } else {
            abstractC7563 = C23085.f74234;
        }
        return (C16029) new C4741(viewModelStore, m26825, abstractC7563).m13886(C16029.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m47788(InterfaceC22285 interfaceC22285) {
        EnumC13728 mo19832 = interfaceC22285.getLifecycle().mo19832();
        if (mo19832 != EnumC13728.INITIALIZED && mo19832 != EnumC13728.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC22285.getSavedStateRegistry().m36037() == null) {
            C8975 c8975 = new C8975(interfaceC22285.getSavedStateRegistry(), (InterfaceC13207) interfaceC22285);
            interfaceC22285.getSavedStateRegistry().m36039("androidx.lifecycle.internal.SavedStateHandlesProvider", c8975);
            interfaceC22285.getLifecycle().mo19833(new C16735(c8975));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C11092 m47786(C16344 c16344) {
        InterfaceC22285 interfaceC22285 = (InterfaceC22285) c16344.m20277().get(f67747);
        if (interfaceC22285 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC13207 interfaceC13207 = (InterfaceC13207) c16344.m20277().get(f67748);
        if (interfaceC13207 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) c16344.m20277().get(f67746);
        int i = C22380.f72526;
        String str = (String) c16344.m20277().get(C21675.f69527);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC8174 m36037 = interfaceC22285.getSavedStateRegistry().m36037();
        C8975 c8975 = m36037 instanceof C8975 ? (C8975) m36037 : null;
        if (c8975 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        C16029 m47787 = m47787(interfaceC13207);
        C11092 c11092 = (C11092) m47787.m37895().get(str);
        if (c11092 != null) {
            return c11092;
        }
        int i2 = C11092.f33284;
        C11092 m6334 = C1919.m6334(c8975.m23185(str), bundle);
        m47787.m37895().put(str, m6334);
        return m6334;
    }
}
