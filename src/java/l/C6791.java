package l;

import android.content.Context;
import android.util.AttributeSet;
import bin.mt.plus.R;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: 49SX */
/* renamed from: l.ۜ۬᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C6791 extends AbstractC3723 {
    public C6791(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m6898((InterfaceC7550) new C22244(3, this));
    }

    public C6791(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6898((InterfaceC7550) new C22244(3, this));
    }

    public C6791(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6898((InterfaceC7550) new C22244(3, this));
    }

    public C6791(Context context) {
        super(context);
        m6898((InterfaceC7550) new C22244(3, this));
    }

    @Override // l.AbstractC3723
    /* renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        m18436(abstractActivityC3346, m6909(), m11313().getInt(m6911(), 10), new InterfaceC5982() { // from class: l.ܳ۬᩷
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                C6791.m18437(C6791.this, i);
            }

            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final /* bridge */ /* synthetic */ void n(Object obj) {
                mo16796((Integer) obj);
            }

            @Override // l.InterfaceC5982
            /* renamed from: ܽ */
            public final /* synthetic */ void mo16796(Integer num) {
                C10216.m25642((InterfaceC5982) this, num);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return C10216.m25641((InterfaceC5982) this, intConsumer);
            }

            public final Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18437(C6791 c6791, int i) {
        c6791.m11313().edit().putInt(c6791.m6911(), i).apply();
        c6791.mo6922();
        C3695.m11251();
        C17897.m41874();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18436(AbstractActivityC3346 abstractActivityC3346, CharSequence charSequence, int i, InterfaceC5982 interfaceC5982) {
        C15821 c15821 = new C15821(abstractActivityC3346, null);
        c15821.setMax(25);
        c15821.setPadding(c15821.getPaddingLeft(), C11266.m27878(20.0f) + c15821.getPaddingTop(), c15821.getPaddingRight(), c15821.getPaddingBottom());
        c15821.setProgress(i - 5);
        String str = ((Object) charSequence) + " (";
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        StringBuilder m15339 = C5368.m15339(str);
        m15339.append(c15821.getProgress() + 5);
        m15339.append("s)");
        buildDialog.m44436(m15339.toString());
        buildDialog.m44421(c15821);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        c15821.setOnSeekBarChangeListener(new C23724(buildDialog.m44438(), str, interfaceC5982));
    }
}
