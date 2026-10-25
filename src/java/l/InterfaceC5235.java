package l;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* compiled from: N673 */
/* renamed from: l.ۚ۠ᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public interface InterfaceC5235 extends Closeable {
    InterfaceC0295 poll();

    InterfaceC0295 poll(long j, TimeUnit timeUnit);

    InterfaceC0295 take();
}
