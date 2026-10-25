package l;

import android.widget.CheckBox;
import android.widget.RadioButton;
import java.util.HashMap;

/* compiled from: P4TK */
/* renamed from: l.֨۠ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0996 implements Runnable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f3708;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f3709;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC22163 f3710;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f3711;

    public /* synthetic */ RunnableC0996(DialogInterfaceOnClickListenerC22163 dialogInterfaceOnClickListenerC22163, boolean z, boolean z2, C16560 c16560) {
        this.f3710 = dialogInterfaceOnClickListenerC22163;
        this.f3711 = z;
        this.f3709 = z2;
        this.f3708 = c16560;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterfaceOnClickListenerC22163 dialogInterfaceOnClickListenerC22163 = this.f3710;
        AbstractC3577 abstractC3577 = dialogInterfaceOnClickListenerC22163.f71932;
        String str = dialogInterfaceOnClickListenerC22163.f71934;
        CheckBox checkBox = dialogInterfaceOnClickListenerC22163.f71931;
        RadioButton[] radioButtonArr = dialogInterfaceOnClickListenerC22163.f71929;
        CheckBox checkBox2 = dialogInterfaceOnClickListenerC22163.f71928;
        if (this.f3711) {
            checkBox2.setVisibility(0);
            Integer m20121 = C7489.m20121(dialogInterfaceOnClickListenerC22163.f71933);
            if (m20121 != null) {
                checkBox2.setChecked(true);
                radioButtonArr[C7489.m20112(m20121.intValue())].callOnClick();
                checkBox.setChecked(C7489.m20122(m20121.intValue()));
                return;
            }
            if (this.f3709) {
                HashMap hashMap = C19890.f64282;
                if (hashMap.containsKey(str)) {
                    checkBox2.setChecked(true);
                    Integer num = (Integer) hashMap.get(str);
                    C11003.requireNonNull(num);
                    int intValue = num.intValue();
                    radioButtonArr[C7489.m20112(intValue)].callOnClick();
                    checkBox.setChecked(C7489.m20122(intValue));
                    return;
                }
            }
            if (abstractC3577 != null) {
                HashMap hashMap2 = abstractC3577.f11355;
                if (hashMap2.containsKey(str)) {
                    checkBox2.setChecked(true);
                    Integer num2 = (Integer) hashMap2.get(str);
                    C11003.requireNonNull(num2);
                    int intValue2 = num2.intValue();
                    radioButtonArr[C7489.m20112(intValue2)].callOnClick();
                    checkBox.setChecked(C7489.m20122(intValue2));
                    return;
                }
            }
            checkBox2.setChecked(false);
        } else {
            checkBox2.setVisibility(8);
            checkBox2.setChecked(false);
        }
        C16560 c16560 = this.f3708;
        radioButtonArr[c16560.m39064() ? C19890.f64283 : C19890.f64285].callOnClick();
        checkBox.setChecked(c16560.m39064() ? C19890.f64284 : C19890.f64281);
    }
}
