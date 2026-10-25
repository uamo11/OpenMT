package l;

import java.io.InputStream;
import java.util.concurrent.Callable;

/* compiled from: D18B */
/* renamed from: l.ܰ᩵ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class CallableC14029 implements Callable {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42422;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42423;

    public /* synthetic */ CallableC14029(int i, Object obj) {
        this.f42422 = i;
        this.f42423 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f42422) {
            case 0:
                try {
                    InputStream mo27926 = ((C12993) this.f42423).mo27926();
                    try {
                        Boolean bool = Boolean.TRUE;
                        mo27926.close();
                        return bool;
                    } finally {
                    }
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            case 1:
                return Byte.valueOf(C19697.m45298((C19697) this.f42423));
            default:
                C18390.m42817((InterfaceC13883) this.f42423);
                return null;
        }
    }
}
