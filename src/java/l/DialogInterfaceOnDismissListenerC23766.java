package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: QAI5 */
/* renamed from: l.᩻ܳ᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC23766 extends AbstractC1661 implements DialogInterface.OnDismissListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f76930;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f76931;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f76932;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC3163 f76933;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f76934;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C0671 f76935;

    public DialogInterfaceOnDismissListenerC23766() {
        super(R.string.MT_Protector_res_0x7f1205f2, R.drawable.MT_Protector_res_0x7f080227);
        this.f76931 = 0L;
        this.f76934 = 0;
        this.f76932 = 0;
        this.f76930 = false;
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        c2450.m7907(b.k);
        this.f76933 = (AbstractC3163) c2450.m7922().mo6020();
        final List m7909 = c2450.m7909();
        this.f76935 = new C0671(c2450.m7921(), m7909);
        if (m7909.size() == 1) {
            final InterfaceC17889 interfaceC17889 = (InterfaceC17889) m7909.get(0);
            if (interfaceC17889.isDirectory()) {
                this.f76935.m2735(this);
                this.f76935.m2739(interfaceC17889);
                C1802.f6208.execute(new Runnable() { // from class: l.ۧܳ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogInterfaceOnDismissListenerC23766.m52431(DialogInterfaceOnDismissListenerC23766.this, interfaceC17889);
                    }
                });
                return;
            }
            this.f76935.m2737(interfaceC17889);
            return;
        }
        this.f76935.m2735(this);
        this.f76935.m2736(c2450.m7925());
        C1802.f6208.execute(new Runnable() { // from class: l.ܽܳ᩻
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC23766.m52430(DialogInterfaceOnDismissListenerC23766.this, m7909);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52431(final DialogInterfaceOnDismissListenerC23766 dialogInterfaceOnDismissListenerC23766, InterfaceC17889 interfaceC17889) {
        dialogInterfaceOnDismissListenerC23766.m52428(interfaceC17889.getPath());
        C4925.m14315(new Runnable() { // from class: l.ᩳܳ᩻
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC23766.m52432(DialogInterfaceOnDismissListenerC23766.this);
            }
        });
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52432(DialogInterfaceOnDismissListenerC23766 dialogInterfaceOnDismissListenerC23766) {
        dialogInterfaceOnDismissListenerC23766.f76935.m2734(dialogInterfaceOnDismissListenerC23766.f76934, dialogInterfaceOnDismissListenerC23766.f76932, dialogInterfaceOnDismissListenerC23766.f76931);
        dialogInterfaceOnDismissListenerC23766.f76935.m2733();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52430(final DialogInterfaceOnDismissListenerC23766 dialogInterfaceOnDismissListenerC23766, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC17889.isDirectory()) {
                dialogInterfaceOnDismissListenerC23766.f76932++;
                if (!interfaceC17889.mo36978()) {
                    dialogInterfaceOnDismissListenerC23766.m52428(interfaceC17889.getPath());
                }
            } else {
                dialogInterfaceOnDismissListenerC23766.f76934++;
                if (!interfaceC17889.mo36978()) {
                    dialogInterfaceOnDismissListenerC23766.f76931 = interfaceC17889.getSize() + dialogInterfaceOnDismissListenerC23766.f76931;
                }
            }
        }
        C4925.m14315(new Runnable() { // from class: l.ܿܳ᩻
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC23766.m52433(DialogInterfaceOnDismissListenerC23766.this);
            }
        });
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52433(DialogInterfaceOnDismissListenerC23766 dialogInterfaceOnDismissListenerC23766) {
        dialogInterfaceOnDismissListenerC23766.f76935.m2734(dialogInterfaceOnDismissListenerC23766.f76934, dialogInterfaceOnDismissListenerC23766.f76932, dialogInterfaceOnDismissListenerC23766.f76931);
        dialogInterfaceOnDismissListenerC23766.f76935.m2733();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52428(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty() && !this.f76930) {
            try {
                Iterator it = this.f76933.mo7637((String) linkedList.removeFirst(), true).iterator();
                while (it.hasNext()) {
                    InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
                    if (interfaceC17889.isDirectory()) {
                        this.f76932++;
                        if (!interfaceC17889.mo36978()) {
                            linkedList.addLast(interfaceC17889.getPath());
                        }
                    } else {
                        this.f76934++;
                        if (!interfaceC17889.mo36978()) {
                            this.f76931 = interfaceC17889.getSize() + this.f76931;
                        }
                    }
                }
                C4925.m14315(new Runnable() { // from class: l.ܳܳ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.f76935.m2734(r0.f76934, r0.f76932, DialogInterfaceOnDismissListenerC23766.this.f76931);
                    }
                });
            } catch (IOException unused) {
                return;
            }
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f76930 = true;
    }
}
