package l;

import java.io.InputStream;
import java.util.ArrayList;

/* compiled from: D9TI */
/* renamed from: l.ܽۜ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16485 implements InterfaceC11098 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17897 f50677;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f50678;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17889 f50679;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f50680;

    @Override // l.InterfaceC11098
    /* renamed from: ֫ */
    public final /* synthetic */ InputStream mo10616() {
        return C1925.m6337(this);
    }

    public C16485(C17897 c17897, ArrayList arrayList, InterfaceC17889 interfaceC17889, AbstractC15440 abstractC15440) {
        this.f50677 = c17897;
        this.f50680 = arrayList;
        this.f50679 = interfaceC17889;
        this.f50678 = abstractC15440;
    }

    @Override // l.InterfaceC11098
    public final InputStream getInputStream() {
        C8102 c8102;
        ArrayList arrayList = this.f50680;
        boolean isEmpty = arrayList.isEmpty();
        AbstractC15440 abstractC15440 = this.f50678;
        if (isEmpty) {
            c8102 = this.f50677.f54658;
            c8102.m21536(this.f50679, abstractC15440, false, (InterfaceC5627) new C10842());
        }
        InputStream mo27926 = abstractC15440.mo27926();
        arrayList.add(mo27926);
        return mo27926;
    }

    @Override // l.InterfaceC11098
    public final long length() {
        return this.f50679.getSize();
    }
}
