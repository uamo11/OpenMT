package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* compiled from: K9RZ */
/* renamed from: l.۟۟ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ActivityC7327 extends AbstractActivityC12266 {

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public C7870 f22516;

    @Override // l.AbstractActivityC12266
    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final String mo19679() {
        return "INTERNAL:ArscTranslationEditor";
    }

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public String mo121() {
        return "ArscConfigTranslationMode";
    }

    @Override // l.AbstractActivityC12266
    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo19680() {
        return true;
    }

    @Override // l.AbstractActivityC12266
    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo19683() {
        return true;
    }

    @Override // l.AbstractActivityC12266
    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final boolean mo19687() {
        return true;
    }

    @Override // l.AbstractActivityC12266
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo19678(boolean z) {
        int i = C16999.f52136;
        this.f22516 = new C7870(C16999.m39862(getIntent()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractActivityC12266
    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public void mo19681() {
        ArrayList arrayList = new ArrayList(this.f22516.size());
        int size = this.f22516.size();
        for (int i = 0; i < size; i++) {
            C14925 c14925 = (C14925) this.f22516.get(i);
            C8739 c8739 = new C8739(c14925.f45502, i, c14925.f45503, false);
            c8739.f26611 = c14925.f45505;
            arrayList.add(c8739);
        }
        m29791(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractActivityC12266
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo19677(RunnableC18617 runnableC18617) {
        ArrayList m29794 = m29794();
        if (m29794.size() != this.f22516.size()) {
            throw new IllegalStateException();
        }
        int size = m29794.size();
        for (int i = 0; i < size; i++) {
            C8739 c8739 = (C8739) m29794.get(i);
            ((C14925) this.f22516.get(i)).f45505 = c8739.f26611;
        }
        try {
            this.f22516.m21158();
            runnableC18617.run();
        } catch (IOException e) {
            m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractActivityC12266
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo19682(String str) {
        if (str != null && (str.contains("<") || str.contains(a.p))) {
            try {
                C7184 c7184 = new C7184();
                c7184.m19219(new StringReader(str));
                do {
                } while (c7184.m19220() != 1);
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractActivityC12266
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CharSequence mo19685(String str) {
        if (str == null) {
            return null;
        }
        int min = Math.min(str.length(), 200);
        for (int i = 0; i < min; i++) {
            char charAt = str.charAt(i);
            if (charAt == '<' || charAt == '&') {
                return C3698.m11268(str);
            }
        }
        return str;
    }

    @Override // l.AbstractActivityC12266
    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final void mo19684() {
        C19258 buildDialog = buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f12042f);
        buildDialog.m44416(R.string.MT_Protector_res_0x7f1200f9);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        buildDialog.m44438();
    }

    @Override // l.AbstractActivityC12266
    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String mo19686() {
        String trim = getString(R.string.MT_Protector_res_0x7f12016b).trim();
        String string = getString(R.string.MT_Protector_res_0x7f120168);
        if (trim.endsWith(".")) {
            return trim.substring(0, trim.length() - 1) + ", " + string;
        }
        if (!trim.endsWith("。")) {
            return C22870.m50967(trim, ", ", string);
        }
        return trim.substring(0, trim.length() - 1) + "，" + string;
    }
}
