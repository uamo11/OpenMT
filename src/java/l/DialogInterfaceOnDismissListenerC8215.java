package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Z26I */
/* renamed from: l.۠ܰܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class DialogInterfaceOnDismissListenerC8215 extends AbstractC1661 implements DialogInterface.OnDismissListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f25309;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f25310;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f25311;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f25312;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C1793 f25313;

    public DialogInterfaceOnDismissListenerC8215() {
        super(R.string.MT_Protector_res_0x7f1205f2, R.drawable.MT_Protector_res_0x7f080227);
        this.f25310 = 0L;
        this.f25312 = 0;
        this.f25311 = 0;
        this.f25309 = false;
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        c2450.m7907("local");
        final List m7909 = c2450.m7909();
        this.f25313 = new C1793(c2450.m7921(), m7909);
        if (m7909.size() == 1) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) m7909.get(0);
            if (interfaceC17889.isDirectory()) {
                this.f25313.m5977(this);
                this.f25313.m5980(interfaceC17889);
                C1802.f6208.execute(new RunnableC3982(0, this, interfaceC17889));
                return;
            }
            this.f25313.m5979(interfaceC17889);
            return;
        }
        this.f25313.m5977(this);
        this.f25313.m5978(c2450.m7925());
        C1802.f6208.execute(new Runnable() { // from class: l.ᩴܰܳ
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC8215.m21752(DialogInterfaceOnDismissListenerC8215.this, m7909);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21753(final DialogInterfaceOnDismissListenerC8215 dialogInterfaceOnDismissListenerC8215, InterfaceC17889 interfaceC17889) {
        dialogInterfaceOnDismissListenerC8215.m21750(Collections.singleton(interfaceC17889.mo24433()));
        C4925.m14315(new Runnable() { // from class: l.ۚܰܳ
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC8215.m21755(DialogInterfaceOnDismissListenerC8215.this);
            }
        });
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21755(DialogInterfaceOnDismissListenerC8215 dialogInterfaceOnDismissListenerC8215) {
        dialogInterfaceOnDismissListenerC8215.f25313.m5976(dialogInterfaceOnDismissListenerC8215.f25312, dialogInterfaceOnDismissListenerC8215.f25311, dialogInterfaceOnDismissListenerC8215.f25310);
        dialogInterfaceOnDismissListenerC8215.f25313.m5975();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21752(final DialogInterfaceOnDismissListenerC8215 dialogInterfaceOnDismissListenerC8215, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC17889.isDirectory()) {
                dialogInterfaceOnDismissListenerC8215.f25311++;
                if (!interfaceC17889.mo36978()) {
                    arrayList.add(interfaceC17889.mo24433());
                }
            } else {
                dialogInterfaceOnDismissListenerC8215.f25312++;
                if (!interfaceC17889.mo36978()) {
                    dialogInterfaceOnDismissListenerC8215.f25310 = interfaceC17889.getSize() + dialogInterfaceOnDismissListenerC8215.f25310;
                }
            }
        }
        C4925.m14315(new Runnable() { // from class: l.᩵ܰܳ
            @Override // java.lang.Runnable
            public final void run() {
                r0.f25313.m5976(r0.f25312, r0.f25311, DialogInterfaceOnDismissListenerC8215.this.f25310);
            }
        });
        dialogInterfaceOnDismissListenerC8215.m21750(arrayList);
        C4925.m14315(new Runnable() { // from class: l.֡ܰܳ
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC8215.m21756(DialogInterfaceOnDismissListenerC8215.this);
            }
        });
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21756(DialogInterfaceOnDismissListenerC8215 dialogInterfaceOnDismissListenerC8215) {
        dialogInterfaceOnDismissListenerC8215.f25313.m5976(dialogInterfaceOnDismissListenerC8215.f25312, dialogInterfaceOnDismissListenerC8215.f25311, dialogInterfaceOnDismissListenerC8215.f25310);
        dialogInterfaceOnDismissListenerC8215.f25313.m5975();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21750(Collection collection) {
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty() && !this.f25309) {
            for (AbstractC15440 abstractC15440 : ((AbstractC15440) linkedList.removeFirst()).mo23549(true)) {
                if (abstractC15440.mo23113()) {
                    this.f25311++;
                    if (!abstractC15440.m36533()) {
                        linkedList.addLast(abstractC15440);
                    }
                } else {
                    this.f25312++;
                    if (!abstractC15440.m36533()) {
                        this.f25310 = abstractC15440.mo23127() + this.f25310;
                    }
                }
            }
            C4925.m14315(new Runnable() { // from class: l.֨ܰܳ
                @Override // java.lang.Runnable
                public final void run() {
                    r0.f25313.m5976(r0.f25312, r0.f25311, DialogInterfaceOnDismissListenerC8215.this.f25310);
                }
            });
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f25309 = true;
    }
}
