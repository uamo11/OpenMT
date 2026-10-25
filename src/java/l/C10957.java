package l;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: I8NB */
/* renamed from: l.ۧۧۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10957 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f32990 = new AtomicLong();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f32991;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m27273() {
        return f32990.getAndIncrement();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10957(C3104 c3104) {
        this(0L, Collections.EMPTY_MAP);
        Uri uri = c3104.f9711;
    }

    public C10957(long j, Map map) {
        this.f32991 = j;
    }
}
