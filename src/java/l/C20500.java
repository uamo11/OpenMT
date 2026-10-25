package l;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.alipay.sdk.m.n.b;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: A924 */
/* renamed from: l.᩶᩻ۡ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C20500 extends AbstractC23919 implements InterfaceC21206 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C11044 f66073;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C17209 f66074;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f66075;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f66076;

    public C20500(boolean z) {
        this.f66076 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m46968() {
        return Arrays.asList(new C7901(), C5367.m15331(new C16265()), C10019.m25189(new C20177()), C3210.m9847(new C2861()), C9211.m23652(this), C24003.m52841(new C14956(LinkMovementMethod.getInstance())), this);
    }

    static {
        C7787 c7787 = new C7787(new File(C4925.m14332(), "markwon"));
        C17915 m40470 = C4925.m14323().m40470();
        m40470.m41900(c7787);
        f66074 = m40470.m41894();
        C1871 c1871 = new C1871();
        TimeUnit timeUnit = TimeUnit.DAYS;
        c1871.m6198();
        c1871.m6199();
        f66073 = c1871.m6197();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC16157 m46962(Context context, boolean z) {
        InterfaceC9103 m38086 = AbstractC16157.m38086(context);
        m38086.mo8505(new C20500(z).m46968());
        return m38086.build();
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* renamed from: ֫ */
    public void mo15841(C3004 c3004) {
        c3004.m9168(C11266.m27878(5.0f));
        c3004.m9165();
        c3004.m9164(C21943.f70283);
        boolean z = this.f66076;
        c3004.m9170(!z ? 1 : 0);
        c3004.m9161(C21943.f70283);
        c3004.m9169(1);
        c3004.m9160(!z ? new float[]{1.8f, 1.5f, 1.25f, 1.1f, 1.0f, 0.9f} : new float[]{1.5f, 1.35f, 1.2f, 1.1f, 1.0f, 0.9f});
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* renamed from: ۧ */
    public final void mo15843(TextView textView) {
        this.f66075 = textView == null ? 0 : textView.getLineHeight() - textView.getPaint().getFontMetricsInt(null);
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* renamed from: ֫ */
    public final void mo9849(final TextView textView, SpannableStringBuilder spannableStringBuilder) {
        final MovementMethod movementMethod = textView.getMovementMethod();
        textView.setOnTouchListener(new View.OnTouchListener() { // from class: l.᩵᩻ۡ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    return false;
                }
                TextView textView2 = textView;
                MovementMethod movementMethod2 = textView2.getMovementMethod();
                MovementMethod movementMethod3 = movementMethod;
                if (movementMethod2 == movementMethod3) {
                    return false;
                }
                textView2.setMovementMethod(movementMethod3);
                return false;
            }
        });
    }

    /* renamed from: ֫ */
    public float mo19821(AbstractC0197 abstractC0197) {
        if (!(abstractC0197 instanceof C6548)) {
            return 0.4f;
        }
        int m18054 = ((C6548) abstractC0197).m18054();
        if (m18054 == 1) {
            return 2.0f;
        }
        if (m18054 != 2) {
            return m18054 != 3 ? 0.4f : 0.75f;
        }
        return 1.0f;
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* renamed from: ֫ */
    public final void mo15335(InterfaceC20392 interfaceC20392) {
        interfaceC20392.mo26418(new C0743(this));
        interfaceC20392.mo26417(C14308.class, new InterfaceC4869() { // from class: l.ۘ᩻ۡ
            @Override // l.InterfaceC4869
            /* renamed from: ֫ */
            public final void mo1321(InterfaceC3458 interfaceC3458, AbstractC0197 abstractC0197) {
                C20500.this.m46963(interfaceC3458, r3.m34142(), r3.m34141(), (C14308) abstractC0197);
            }
        });
        interfaceC20392.mo26417(C15719.class, new InterfaceC4869() { // from class: l.ᩴ᩻ۡ
            @Override // l.InterfaceC4869
            /* renamed from: ֫ */
            public final void mo1321(InterfaceC3458 interfaceC3458, AbstractC0197 abstractC0197) {
                C20500.this.m46963(interfaceC3458, null, r3.m37093(), (C15719) abstractC0197);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m46963(InterfaceC3458 interfaceC3458, String str, String str2, AbstractC11342 abstractC11342) {
        interfaceC3458.mo10592(abstractC11342);
        C17820 builder = interfaceC3458.builder();
        int length = interfaceC3458.length();
        int m31323 = interfaceC3458.mo10587().m43814().m31323();
        builder.append('\n');
        builder.setSpan(new AbsoluteSizeSpan(Math.max(m31323 - this.f66075, 0)), builder.length() - 1, builder.length(), 33);
        interfaceC3458.mo10587().m43810().getClass();
        builder.append((CharSequence) str2);
        builder.append('\n');
        builder.setSpan(new AbsoluteSizeSpan(Math.max(m31323 - (this.f66075 * 2), 0)), builder.length() - 1, builder.length(), 33);
        AbstractC4415.f14119.m29086(interfaceC3458.mo10583(), str);
        interfaceC3458.mo10585(abstractC11342, length);
        interfaceC3458.mo10590(abstractC11342);
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* renamed from: ֫ */
    public final void mo9851(C4164 c4164) {
        c4164.m12596(new C5683(4));
    }

    /* renamed from: ֫ */
    public boolean mo9386(View view, String str) {
        if (str.startsWith("open://")) {
            Activity m15313 = C5350.m15313(view.getContext());
            if (m15313 instanceof AbstractActivityC3346) {
                new C15559((AbstractActivityC3346) m15313, C20087.m46305(4, str, new StringBuilder(b.a))).m20274();
            }
            return true;
        }
        if (str.startsWith("copy://")) {
            C4925.m14314((CharSequence) str.substring(7));
            return true;
        }
        if (str.startsWith("toast://")) {
            C21374.m48459((CharSequence) str.substring(8));
            return true;
        }
        if (!str.startsWith("toastl://")) {
            return false;
        }
        C21374.m48464(str.substring(9));
        return true;
    }
}
