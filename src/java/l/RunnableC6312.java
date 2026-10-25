package l;

import android.os.SystemClock;
import android.widget.ImageView;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: 61L9 */
/* renamed from: l.ۛ᩷ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6312 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19555;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19556;

    public /* synthetic */ RunnableC6312(int i, Object obj) {
        this.f19555 = i;
        this.f19556 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f19555;
        Object obj = this.f19556;
        switch (i) {
            case 0:
                ((C7473) obj).m20087();
                break;
            case 1:
                ((C7844) obj).m20967();
                break;
            case 2:
                ((C4342) obj).close();
                break;
            case 3:
                DialogInterfaceOnClickListenerC10816.m27036(R.string.MT_Protector_res_0x7f120235, (AbstractActivityC3346) obj, "def_sign_key_warn");
                break;
            case 4:
                int i2 = ActivityC16012.f49390;
                ((AtomicBoolean) obj).set(true);
                break;
            case 5:
                String str = (String) obj;
                int[] iArr = {500, 500, 500, 500, 1000, 1000, 1000, 1000, 1000, 2000, 2000};
                for (int i3 = 0; i3 < 11; i3++) {
                    SystemClock.sleep(iArr[i3]);
                    C18237 m42480 = C18237.m42480(4208);
                    m42480.m42491(str);
                    C23881 m42496 = m42480.m42496();
                    C11233.m27803(m42496, "requestNeedLogin(...)");
                    if (m42496.m52607()) {
                        C13651.m32801();
                        C7094.f21798.mo1664(new Object());
                        break;
                    } else if (m42496.m52611()) {
                        break;
                    }
                }
                break;
            default:
                ((ImageView) obj).setVisibility(8);
                break;
        }
    }
}
