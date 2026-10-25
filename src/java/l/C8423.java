package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: O1K3 */
/* renamed from: l.۠᩷ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8423 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22357 f25800;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6306 f25801;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1109 f25802;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1032 f25803;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23655 f25804;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8423(C6306 c6306, ActivityC17169 activityC17169, C1109 c1109, C1032 c1032, C22357 c22357, C23655 c23655) {
        super(activityC17169, -1);
        this.f25801 = c6306;
        this.f25802 = c1109;
        this.f25803 = c1032;
        this.f25800 = c22357;
        this.f25804 = c23655;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        int i;
        C12392 c12392;
        C12392 c123922;
        C12392 c123923;
        C12392 c123924;
        try {
            int parseInt = Integer.parseInt(m31260());
            if (parseInt <= 0) {
                throw new Exception();
            }
            m31262();
            C1109 c1109 = this.f25802;
            int mo3818 = c1109.mo3818();
            int i2 = parseInt + mo3818;
            EnumC15657 enumC15657 = EnumC15657.STATIC;
            C1032 c1032 = this.f25803;
            int i3 = !enumC15657.m36866(c1032.mo3567()) ? 1 : 0;
            Iterator<E> it = c1032.mo3565().iterator();
            while (it.hasNext()) {
                i3 = C11250.m27832(((C23589) it.next()).getType()) ? i3 + 2 : i3 + 1;
            }
            int i4 = mo3818 - i3;
            int i5 = i2 - i3;
            c1109.m3816(i2);
            ArrayList arrayList = new ArrayList();
            if (EnumC15657.STATIC.m36866(c1032.mo3567())) {
                i = 0;
            } else {
                if (i4 >= 16 || i5 >= 16) {
                    arrayList.add(new C5282(EnumC0841.f3295, i4, i5));
                } else {
                    arrayList.add(new C13808(EnumC0841.f3287, i4, i5));
                }
                i = 1;
            }
            Iterator<E> it2 = c1032.mo3565().iterator();
            while (it2.hasNext()) {
                C23589 c23589 = (C23589) it2.next();
                int i6 = i4 + i;
                int i7 = i5 + i;
                int i8 = i + 1;
                if (C11250.m27832(c23589.getType())) {
                    i += 2;
                    if (i6 >= 16 || i7 >= 16) {
                        arrayList.add(new C5282(EnumC0841.f3157, i6, i7));
                    } else {
                        arrayList.add(new C13808(EnumC0841.f3182, i6, i7));
                    }
                } else {
                    if (c23589.getType().length() == 1) {
                        if (i6 >= 16 || i7 >= 16) {
                            arrayList.add(new C5282(EnumC0841.f3051, i6, i7));
                        } else {
                            arrayList.add(new C13808(EnumC0841.f3099, i6, i7));
                        }
                    } else if (i6 >= 16 || i7 >= 16) {
                        arrayList.add(new C5282(EnumC0841.f3295, i6, i7));
                    } else {
                        arrayList.add(new C13808(EnumC0841.f3287, i6, i7));
                    }
                    i = i8;
                }
            }
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                c1109.m3807(i9, (AbstractC7479) arrayList.get(i9));
            }
            C11418 c11418 = new C11418();
            C3438 c3438 = new C3438(new C22706(c11418));
            C1190 c1190 = new C1190(this.f25800, c1032, c1109);
            try {
                c1190.m4015(c3438);
                c1190.m4018();
                c11418.m28185(c11418.length() - 1);
                C6306 c6306 = this.f25801;
                c12392 = c6306.f19506;
                InterfaceC7785 m30436 = c12392.m30436();
                C23655 c23655 = this.f25804;
                m30436.replace(c23655.m52184(), c23655.m52180(), c11418);
                int indexOf = TextUtils.indexOf((CharSequence) c11418, '\n', TextUtils.indexOf((CharSequence) c11418, '\n') + 1);
                c123922 = c6306.f19506;
                c123922.mo25919(c23655.m52184() + indexOf);
                c123923 = c6306.f19506;
                c123923.m30511();
                c123924 = c6306.f19506;
                c123924.m30345(false);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception unused) {
            m31263(R.string.MT_Protector_res_0x7f120b48);
        }
    }
}
