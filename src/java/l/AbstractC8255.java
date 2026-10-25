package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;

/* compiled from: CAJ1 */
/* renamed from: l.۠ܶۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC8255 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25403 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile AtomicBoolean f25405;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile DialogInterfaceC0206 f25406;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile EnumC1199 f25407 = EnumC1199.RETRY;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f25408;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final ConcurrentLinkedQueue f25404 = new ConcurrentLinkedQueue();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C5242 f25402 = new C5242(new Object());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public synchronized void m21842(EnumC1199 enumC1199) {
        if (this.f25408) {
            this.f25407 = enumC1199;
            this.f25408 = false;
            this.f25405 = null;
            this.f25406 = null;
            notify();
        }
        f25402.mo1664(new Object());
    }

    /* renamed from: ֫ */
    public abstract View mo8845(Main main);

    /* renamed from: ֫ */
    public void mo10817(DialogInterfaceC0206 dialogInterfaceC0206) {
    }

    /* renamed from: ֫ */
    public void mo8846(C19258 c19258) {
    }

    /* renamed from: ֫ */
    public abstract boolean mo8847(View view);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m21850(BooleanSupplier booleanSupplier) {
        C10975.m27286();
        while (true) {
            if (C15104.m35787()) {
                if (booleanSupplier.getAsBoolean()) {
                    return false;
                }
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            } else {
                if (booleanSupplier.getAsBoolean()) {
                    return false;
                }
                f25404.offer(this);
                f25402.mo1664(new Object());
                while (true) {
                    if (!this.f25408 && this.f25407 != EnumC1199.RETRY) {
                        return this.f25407 == EnumC1199.SUCCESS;
                    }
                    if (booleanSupplier.getAsBoolean()) {
                        m21841();
                        return false;
                    }
                    try {
                        wait(100L);
                    } catch (InterruptedException unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m21848(final Main main) {
        f25402.m1668(main, new InterfaceC1008() { // from class: l.ۖܶۢ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                AbstractC8255.m21846(Main.this);
            }
        });
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m21846(Main main) {
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f25404;
            final AbstractC8255 abstractC8255 = (AbstractC8255) concurrentLinkedQueue.peek();
            if (abstractC8255 == null || abstractC8255.f25408) {
                return;
            }
            EnumC1199 enumC1199 = abstractC8255.f25407;
            EnumC1199 enumC11992 = EnumC1199.RETRY;
            if (enumC1199 == enumC11992) {
                synchronized (abstractC8255) {
                    if (abstractC8255.f25407 != enumC11992) {
                        return;
                    }
                    abstractC8255.f25408 = true;
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    final View mo8845 = abstractC8255.mo8845(main);
                    if (mo8845 != null) {
                        mo8845.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC5433(abstractC8255, atomicBoolean));
                    }
                    C19258 buildDialog = main.buildDialog();
                    buildDialog.m44428(false);
                    buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
                    buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterfaceOnClickListenerC4022(0, abstractC8255, atomicBoolean));
                    buildDialog.m44419(new DialogInterfaceOnCancelListenerC18839(0, abstractC8255, atomicBoolean));
                    buildDialog.m44420(new DialogInterface.OnDismissListener() { // from class: l.᩵ܶۢ
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            AbstractC8255.m21849(AbstractC8255.this, atomicBoolean);
                        }
                    });
                    if (mo8845 != null) {
                        buildDialog.m44421(mo8845);
                    }
                    abstractC8255.mo8846(buildDialog);
                    final DialogInterfaceC0206 m44438 = buildDialog.m44438();
                    abstractC8255.f25405 = atomicBoolean;
                    abstractC8255.f25406 = m44438;
                    m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.֡ܶۢ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AbstractC8255.m21844(AbstractC8255.this, atomicBoolean, mo8845, m44438);
                        }
                    });
                    abstractC8255.mo10817(m44438);
                    return;
                }
            }
            concurrentLinkedQueue.remove();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21843(AbstractC8255 abstractC8255, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.compareAndSet(true, false)) {
            abstractC8255.m21842(EnumC1199.CANCEL);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21847(AbstractC8255 abstractC8255, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.compareAndSet(true, false)) {
            abstractC8255.m21842(EnumC1199.CANCEL);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21849(AbstractC8255 abstractC8255, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.compareAndSet(true, false)) {
            abstractC8255.m21842(EnumC1199.RETRY);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21844(AbstractC8255 abstractC8255, AtomicBoolean atomicBoolean, View view, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (atomicBoolean.compareAndSet(true, false)) {
            if (abstractC8255.mo8847(view)) {
                abstractC8255.m21842(EnumC1199.SUCCESS);
                dialogInterfaceC0206.dismiss();
            } else {
                atomicBoolean.set(true);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21841() {
        AtomicBoolean atomicBoolean = this.f25405;
        if (atomicBoolean != null) {
            atomicBoolean.compareAndSet(true, false);
        }
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f25406;
        this.f25405 = null;
        this.f25406 = null;
        this.f25407 = EnumC1199.CANCEL;
        this.f25408 = false;
        f25404.remove(this);
        notify();
        if (dialogInterfaceC0206 != null) {
            C4925.m14315(new RunnableC20760(3, dialogInterfaceC0206));
        }
        f25402.mo1664(new Object());
    }
}
