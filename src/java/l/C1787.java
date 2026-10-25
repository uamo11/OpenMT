package l;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.alipay.sdk.m.u0.b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import net.engio.mbassy.listener.MessageHandler;

/* compiled from: TAN9 */
/* renamed from: l.֫ۧܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1787 implements Consumer {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Activity f6171;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C17473 f6172;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f6170 = new ReentrantLock();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f6169 = new LinkedHashSet();

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5943(InterfaceC13041 interfaceC13041) {
        C11233.m27805(interfaceC13041, MessageHandler.Properties.Listener);
        ReentrantLock reentrantLock = this.f6170;
        reentrantLock.lock();
        try {
            this.f6169.remove(interfaceC13041);
        } finally {
            reentrantLock.unlock();
        }
    }

    public C1787(Activity activity) {
        this.f6171 = activity;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        C11233.m27805(windowLayoutInfo, b.d);
        ReentrantLock reentrantLock = this.f6170;
        reentrantLock.lock();
        try {
            this.f6172 = C16603.m39101(this.f6171, windowLayoutInfo);
            Iterator it = this.f6169.iterator();
            while (it.hasNext()) {
                ((InterfaceC13041) it.next()).accept(this.f6172);
            }
            C8058 c8058 = C8058.f24861;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5942(C11124 c11124) {
        ReentrantLock reentrantLock = this.f6170;
        reentrantLock.lock();
        try {
            C17473 c17473 = this.f6172;
            if (c17473 != null) {
                c11124.accept(c17473);
            }
            this.f6169.add(c11124);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5944() {
        return this.f6169.isEmpty();
    }
}
