package l;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: X44P */
/* renamed from: l.֡ܿ۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0554 implements Consumer {
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Collections.sort((List) obj);
    }
}
