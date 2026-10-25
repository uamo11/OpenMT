package l;

import android.widget.RadioButton;
import bin.mt.plus.Main;
import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: J1YX */
/* renamed from: l.᩻᩶᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23934 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916("zip") && !c2450.m7923();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r0.mo27924() != false) goto L15;
     */
    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1455(l.C2450 r18) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23934.mo1455(l.ۖۢܳ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52715(final C23934 c23934, RadioButton[] radioButtonArr, int i, String str, String str2, List list, boolean z, Main main, String str3, final AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849, final C2450 c2450, final AbstractC15440 abstractC15440) {
        String str4;
        int i2 = 0;
        while (true) {
            if (i2 >= radioButtonArr.length) {
                i2 = 0;
                break;
            } else if (radioButtonArr[i2].isChecked()) {
                break;
            } else {
                i2++;
            }
        }
        if (i != i2) {
            ApplicationC20075.f65008.edit().mo25852((byte) i2, "rcoz").apply();
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (i2 == 0) {
            arrayList.add(new C18290(str, str2, false, false));
            arrayList.add(new C18290(str2, str, false, true));
        } else if (i2 == 1) {
            arrayList2.add(str);
            arrayList.add(new C18290(str2, str, false, true));
        } else if (i2 == 2) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(((C3545) it.next()).getName());
            }
            String concat = str.concat(".bak");
            if (hashSet.contains(concat)) {
                int i3 = 1;
                while (true) {
                    str4 = str + " (" + i3 + ").bak";
                    if (!hashSet.contains(str4)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                concat = str4;
            }
            arrayList.add(new C18290(str, concat, false, false));
            arrayList.add(new C18290(str2, str, false, true));
        }
        if (z) {
            C10025.m25197(new InterfaceC12846() { // from class: l.᩺᩹᩻
                @Override // l.InterfaceC12846
                public final /* synthetic */ void onCanceled() {
                }

                @Override // l.InterfaceC12846
                /* renamed from: ֫ */
                public final void mo3776(C11667 c11667, boolean z2) {
                    C23934.m52714(C23934.this, abstractDialogInterfaceOnClickListenerC12849, c2450, abstractC15440, arrayList, arrayList2, c11667, z2);
                }

                @Override // l.InterfaceC12846
                /* renamed from: ֫ */
                public final /* synthetic */ boolean mo3777(Exception exc) {
                    return false;
                }
            }, main, str3);
        } else {
            abstractDialogInterfaceOnClickListenerC12849.m31262();
            m52712(c2450, abstractC15440, "", arrayList, arrayList2, null, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52714(C23934 c23934, AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849, C2450 c2450, AbstractC15440 abstractC15440, ArrayList arrayList, ArrayList arrayList2, C11667 c11667, boolean z) {
        abstractDialogInterfaceOnClickListenerC12849.m31262();
        m52712(c2450, abstractC15440, "", arrayList, arrayList2, c11667, z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52712(C2450 c2450, AbstractC15440 abstractC15440, String str, List list, List list2, C11667 c11667, boolean z) {
        String str2;
        String str3;
        boolean z2;
        boolean z3;
        C10130 c10130 = new C10130();
        c10130.m25439(str);
        c10130.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18290 c18290 = (C18290) it.next();
            str2 = c18290.f56867;
            c10130.m25439(str2);
            str3 = c18290.f56866;
            c10130.m25439(str3);
            z2 = c18290.f56864;
            byte b = z2 ? (byte) 1 : (byte) 0;
            z3 = c18290.f56865;
            if (z3) {
                b = (byte) (b | 2);
            }
            c10130.writeByte(b);
        }
        c10130.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c10130.m25439((String) it2.next());
        }
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C14761.class);
        c0994.m3474("zipPath", abstractC15440.mo23554());
        c0994.m3476(e.m, c10130.m25427());
        c0994.m3486(c2450);
        c0994.m3472(c2450.m7917(), c11667);
        c0994.m3475("keepApkSigBlock", z);
        c0994.m3469();
    }
}
