package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: GAHN */
/* renamed from: l.֡ܿ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0566 extends AbstractC1661 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C16609 f2247;

    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        ((C5259) c2450.m7922()).m15173();
        return true;
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        c2450.m7907(b.k);
        C16609 c16609 = new C16609(c2450.m7917());
        this.f2247 = c16609;
        c16609.f51028.setText(R.string.MT_Protector_res_0x7f1205ca);
        this.f2247.f51021.setText(AbstractC1661.m5601(c2450));
        C19258 buildDialog = c2450.m7917().buildDialog();
        buildDialog.m44421(this.f2247.f51029);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ܺܿ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C0566.this.mo2321(c2450);
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 m44438 = buildDialog.m44438();
        final LinkedList linkedList = new LinkedList();
        for (InterfaceC17889 interfaceC17889 : c2450.m7909()) {
            if (interfaceC17889.isDirectory()) {
                this.f2247.f51026++;
                if (!interfaceC17889.mo36978()) {
                    linkedList.add(interfaceC17889.getPath());
                }
            } else {
                this.f2247.f51027++;
                if (!interfaceC17889.mo36978()) {
                    C16609 c166092 = this.f2247;
                    c166092.f51023 = interfaceC17889.getSize() + c166092.f51023;
                }
            }
        }
        C16609 c166093 = this.f2247;
        c166093.getClass();
        C4925.m14315(new RunnableC3861(3, c166093));
        if (linkedList.isEmpty()) {
            this.f2247.f51031.setVisibility(8);
        } else {
            C1802.f6208.execute(new Runnable() { // from class: l.ۖܿ᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C0566.m2320(C0566.this, c2450, linkedList, m44438);
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2320(C0566 c0566, C2450 c2450, LinkedList linkedList, DialogInterfaceC0206 dialogInterfaceC0206) {
        AbstractC3163 abstractC3163 = (AbstractC3163) c2450.m7922().mo6020();
        while (!linkedList.isEmpty() && dialogInterfaceC0206.m1442()) {
            try {
                Iterator it = abstractC3163.mo7637((String) linkedList.removeFirst(), true).iterator();
                while (it.hasNext()) {
                    InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
                    if (interfaceC17889.isDirectory()) {
                        c0566.f2247.f51026++;
                        if (!interfaceC17889.mo36978()) {
                            linkedList.addLast(interfaceC17889.getPath());
                        }
                    } else {
                        c0566.f2247.f51027++;
                        if (!interfaceC17889.mo36978()) {
                            C16609 c16609 = c0566.f2247;
                            c16609.f51023 = interfaceC17889.getSize() + c16609.f51023;
                        }
                    }
                }
                C16609 c166092 = c0566.f2247;
                c166092.getClass();
                C4925.m14315(new RunnableC3861(3, c166092));
            } catch (IOException e) {
                c2450.m7917().m10223(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
    }

    @Override // l.AbstractC1661
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo2321(C2450 c2450) {
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C19618.class);
        c0994.m3478(c2450.m7909());
        c0994.m3486(c2450);
        c0994.m3481(c2450.m7922());
        c0994.m3474("deleteFrom", c2450.m7910());
        C16609 c16609 = this.f2247;
        c0994.m3470(c16609.f51027 + c16609.f51026, "minTotal");
        c0994.m3469();
    }
}
