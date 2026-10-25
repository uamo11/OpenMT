package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.io.FileNotFoundException;
import java.util.concurrent.ExecutionException;

/* compiled from: LAXL */
/* renamed from: l.ܿ۠ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17222 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C17222 f52832 = new C17222(0);

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C17222 f52833 = new C17222(2);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f52834;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f52835;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f52836;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f52837;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f52838;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f52839;

    public C17222(int i) {
        this.f52836 = i;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C17222 m40520() {
        return f52832;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C17222 m40521() {
        return f52833;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17222 m40518(String str) {
        C17222 c17222 = new C17222(1);
        c17222.f52835 = str;
        return c17222;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17222 m40517(Exception exc) {
        Throwable th;
        C17222 c17222 = new C17222(1);
        if (!(exc instanceof ExecutionException) || (th = exc.getCause()) == null) {
            th = exc;
        }
        if (th instanceof C14501) {
            c17222.f52835 = th.getMessage();
            c17222.f52838 = true;
            return c17222;
        }
        String message = th.getMessage() != null ? th.getMessage() : th.toString();
        if ((th instanceof FileNotFoundException) && !message.contains("EISDIR")) {
            message = "File not found: ".concat(message);
        }
        c17222.f52835 = C6554.m18061(500, message);
        String message2 = th.getMessage();
        if (message2 != null) {
            if (!C23196.m51460() && (message2.contains(C4925.m14327(R.string.MT_Protector_res_0x7f120757)) || message2.contains(C4925.m14327(R.string.MT_Protector_res_0x7f120756)))) {
                c17222.f52837 = true;
                return c17222;
            }
            if (!C23196.m51454() && message2.contains(C4925.m14327(R.string.MT_Protector_res_0x7f120415))) {
                c17222.f52839 = true;
                return c17222;
            }
        }
        if (!(th instanceof C1637) && !(th instanceof C19401)) {
            if (th instanceof C12598) {
                c17222.f52834 = C19445.m44784((C12598) th);
                return c17222;
            }
            c17222.f52834 = C18494.m42989(exc);
        }
        return c17222;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m40526() {
        return this.f52836 == 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m40525() {
        return this.f52836 == 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m40524() {
        return this.f52836 == 2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m40522() {
        return this.f52835;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40523(AbstractActivityC3346 abstractActivityC3346) {
        if (m40525()) {
            if (TextUtils.isEmpty(this.f52835)) {
                return;
            }
            if (this.f52838) {
                C21374.m48459((CharSequence) this.f52835);
                return;
            }
            String str = this.f52834;
            if (str != null && str.startsWith("AndroidDataFileUnreadableException///")) {
                C19445.m44785(abstractActivityC3346, this.f52834);
                return;
            }
            C19258 buildDialog = abstractActivityC3346.buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f12030c);
            buildDialog.m44424(this.f52835);
            buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
            buildDialog.m44440(R.string.MT_Protector_res_0x7f120309, (DialogInterface.OnClickListener) null);
            DialogInterfaceC0206 m44438 = buildDialog.m44438();
            C8960.m23098(m44438);
            if (this.f52837) {
                m44438.m1448().setText(R.string.MT_Protector_res_0x7f120afa);
                C7261.f22281.m1668(m44438, new C1700(m44438, 0));
                m44438.m1448().setOnClickListener(new ViewOnClickListenerC10873(abstractActivityC3346, 0));
                return;
            } else if (this.f52839) {
                m44438.m1448().setText(R.string.MT_Protector_res_0x7f120b19);
                m44438.m1448().setOnClickListener(new ViewOnClickListenerC16516(abstractActivityC3346, 0));
                return;
            } else if (this.f52834 != null) {
                m44438.m1448().setOnClickListener(new ViewOnClickListenerC17928(0, this, abstractActivityC3346));
                return;
            } else {
                m44438.m1448().setVisibility(8);
                return;
            }
        }
        throw new RuntimeException("Not a failure result");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40519(C17222 c17222, AbstractActivityC3346 abstractActivityC3346) {
        ActivityC14946.m35399(abstractActivityC3346, c17222.f52834, C4925.m14327(R.string.MT_Protector_res_0x7f120309), null, null);
    }
}
