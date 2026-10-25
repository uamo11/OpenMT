package l;

import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* compiled from: N673 */
/* renamed from: l.ᩴ᩸ᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C19035 implements WatchKey {
    public final /* synthetic */ InterfaceC0295 a;

    public /* synthetic */ C19035(InterfaceC0295 interfaceC0295) {
        this.a = interfaceC0295;
    }

    public static /* synthetic */ WatchKey a(InterfaceC0295 interfaceC0295) {
        if (interfaceC0295 == null) {
            return null;
        }
        return interfaceC0295 instanceof C2807 ? ((C2807) interfaceC0295).a : new C19035(interfaceC0295);
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ void cancel() {
        this.a.cancel();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0295 interfaceC0295 = this.a;
        if (obj instanceof C19035) {
            obj = ((C19035) obj).a;
        }
        return interfaceC0295.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean isValid() {
        return this.a.isValid();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ List pollEvents() {
        return AbstractC22791.w(this.a.pollEvents());
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean reset() {
        return this.a.reset();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ Watchable watchable() {
        InterfaceC4923 watchable = this.a.watchable();
        if (watchable == null) {
            return null;
        }
        return watchable instanceof C15505 ? ((C15505) watchable).a : watchable instanceof InterfaceC20758 ? C7745.l((InterfaceC20758) watchable) : new C22562(watchable);
    }
}
