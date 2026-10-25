package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plus.R;
import java.util.concurrent.CancellationException;
import java.util.regex.PatternSyntaxException;

/* compiled from: G4ML */
/* renamed from: l.֡᩺ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0729 extends AbstractC7548 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14134 f2741;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12973 f2742;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f2743;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7785 f2744;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2745;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public StringBuilder f2746;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2747;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2748;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f2749;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15545 f2750;

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
    }

    public C0729(C15545 c15545, C14134 c14134, InterfaceC7785 interfaceC7785, int i, String str, int i2, String str2, C12973 c12973, int i3) {
        this.f2750 = c15545;
        this.f2741 = c14134;
        this.f2744 = interfaceC7785;
        this.f2748 = i;
        this.f2749 = str;
        this.f2747 = i2;
        this.f2743 = str2;
        this.f2742 = c12973;
        this.f2745 = i3;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        String str = this.f2743;
        String str2 = this.f2749;
        C14134 c14134 = this.f2741;
        c14134.m33742();
        C7744 mo26562 = this.f2744.mo26562();
        try {
            mo26562.m20766(new RunnableC19781(0, c14134));
            c14134.m33742();
            if (mo26562.m20767() != this.f2748) {
                throw new CancellationException();
            }
            if (str2.isEmpty()) {
                throw new C14501(R.string.MT_Protector_res_0x7f120a62);
            }
            C11459 m28259 = C11459.m28259(this.f2747, str2);
            C13574.m32628(m28259, str);
            C12164 matcher = m28259.matcher((CharSequence) mo26562);
            matcher.m29604();
            matcher.m29599(new RunnableC19781(0, c14134));
            C12973 c12973 = this.f2742;
            if (c12973 != null) {
                matcher.m29614region(c12973.f38879, c12973.f38878);
            }
            this.f2746 = new StringBuilder();
            boolean z = false;
            while (C12268.m29803(matcher)) {
                c14134.m33742();
                matcher.expandReplacementInto(this.f2746, str);
                z = true;
            }
            c14134.m33742();
            if (!z) {
                throw new C14501(R.string.MT_Protector_res_0x7f120a62);
            }
            mo26562.close();
        } catch (Throwable th) {
            try {
                mo26562.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        AbstractActivityC3346 abstractActivityC3346;
        C12392 c12392;
        C12392 c123922;
        AbstractActivityC3346 abstractActivityC33462;
        AbstractActivityC3346 abstractActivityC33463;
        AbstractActivityC3346 abstractActivityC33464;
        C12392 c123923;
        C15545 c15545 = this.f2750;
        int i = this.f2745;
        if (i == 3) {
            c123923 = c15545.f47931;
            if (c123923.m30441()) {
                return;
            }
        }
        if (this.f2741.m33737()) {
            if (i == 1) {
                abstractActivityC3346 = c15545.f47915;
                ActivityC14946.m35399(abstractActivityC3346, this.f2746.toString(), C4925.m14327(R.string.MT_Protector_res_0x7f12036e), null, null);
                return;
            }
            if (i == 2) {
                C4925.m14314(this.f2746);
                return;
            }
            if (i == 3) {
                InterfaceC7785 interfaceC7785 = this.f2744;
                interfaceC7785.replace(0, interfaceC7785.length(), this.f2746);
                c12392 = c15545.f47931;
                c123922 = c15545.f47931;
                c12392.mo25919(c123922.m30526());
                return;
            }
            if (i == 4) {
                abstractActivityC33462 = c15545.f47915;
                Intent intent = new Intent(abstractActivityC33462, (Class<?>) ActivityC16315.class);
                intent.setAction("bin.mt.edit2.ACTION_CREATE_WITH_TEXT");
                ActivityC16315.m38412(this.f2746);
                abstractActivityC33463 = c15545.f47915;
                if (abstractActivityC33463 instanceof ActivityC16315) {
                    ((ActivityC16315) abstractActivityC33463).m38458(intent);
                    return;
                } else {
                    abstractActivityC33464 = c15545.f47915;
                    abstractActivityC33464.startActivity(intent);
                    return;
                }
            }
            throw new RuntimeException();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC3346 abstractActivityC3346;
        C12392 c12392;
        if (this.f2741.m33738()) {
            boolean z = exc instanceof RuntimeException;
            C15545 c15545 = this.f2750;
            if (z) {
                c12392 = c15545.f47931;
                if (c12392.m30357(this.f2744, (RuntimeException) exc)) {
                    return;
                }
            }
            if (exc instanceof CancellationException) {
                return;
            }
            if (exc instanceof PatternSyntaxException) {
                C15545.m36651(c15545, (PatternSyntaxException) exc);
            } else {
                abstractActivityC3346 = c15545.f47915;
                abstractActivityC3346.m10223(exc, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C14134 c14134;
        this.f2746 = null;
        C14134 c141342 = this.f2741;
        c141342.m33741();
        C15545 c15545 = this.f2750;
        c14134 = c15545.f47926;
        if (c14134 == c141342) {
            c15545.f47926 = null;
        }
    }
}
