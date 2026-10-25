package l;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* compiled from: LAQJ */
/* renamed from: l.ܰۚܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13616 extends AbstractC21960 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public CountDownLatch f40615;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Intent f40616;

    @Override // l.AbstractC21960
    public final void send(Intent intent) {
        this.f40616 = intent;
        this.f40615.countDown();
    }
}
