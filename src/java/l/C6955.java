package l;

/* compiled from: P6SA */
/* renamed from: l.ۜᩴᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6955 implements InterfaceC8017 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21445;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21446;

    public /* synthetic */ C6955(int i, Object obj) {
        this.f21445 = i;
        this.f21446 = obj;
    }

    @Override // l.InterfaceC8017
    /* renamed from: ۧ */
    public final void mo4663(Object obj, Throwable th) {
        switch (this.f21445) {
            case 0:
                r0.f63464.post(new Runnable() { // from class: l.᩷ᩴᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19656.m45180(C19656.this, th);
                    }
                });
                break;
            default:
                ((C4028) this.f21446).m12126();
                break;
        }
    }
}
