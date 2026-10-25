package l;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: H8ZV */
/* renamed from: l.ۢۨۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9561 extends AbstractC14498 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5327 f29011;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f29012;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f29013;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Handler f29014;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f29015;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f29016;

    public C9561(C23671 c23671) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f29015 = new HashMap(2);
        this.f29012 = c23671.f76681;
        this.f29013 = c23671.f76683;
        this.f29016 = c23671.f76684;
        this.f29011 = c23671.f76680;
        this.f29014 = handler;
    }

    @Override // l.AbstractC14498
    /* renamed from: ۧ */
    public final void mo22881(C17321 c17321) {
        HashMap hashMap = this.f29015;
        if (((Future) hashMap.get(c17321)) == null) {
            hashMap.put(c17321, this.f29012.submit(new RunnableC20850(this, c17321)));
        }
    }

    @Override // l.AbstractC14498
    /* renamed from: ֫ */
    public final void mo22880(C17321 c17321) {
        Future future = (Future) this.f29015.remove(c17321);
        if (future != null) {
            future.cancel(true);
        }
        this.f29014.removeCallbacksAndMessages(c17321);
    }
}
