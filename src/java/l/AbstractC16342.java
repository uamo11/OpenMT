package l;

import java.util.Calendar;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: F4MZ */
/* renamed from: l.ܽۖ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC16342 extends AbstractC11795 implements InterfaceC1211 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Matcher f50311;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Pattern f50312;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public MatchResult f50313;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17048 f50314;

    /* renamed from: ֫ */
    public abstract C3328 mo11133();

    public AbstractC16342() {
        m38491(32, "(\\S+)\\s+(\\S+)\\s+(?:(<DIR>)|([0-9]+))\\s+(\\S.*)");
        this.f50314 = new C17048();
    }

    public AbstractC16342(String str) {
        m38491(0, str);
        this.f50314 = new C17048();
    }

    @Override // l.InterfaceC1211
    /* renamed from: ֫ */
    public final void mo4051(C3328 c3328) {
        C17048 c17048 = this.f50314;
        if (c17048 != null) {
            C3328 mo11133 = mo11133();
            if (c3328 != null) {
                if (c3328.m10180() == null) {
                    c3328.m10181(mo11133.m10180());
                }
                if (c3328.m10182() == null) {
                    c3328.m10183(mo11133.m10182());
                }
                c17048.mo4051(c3328);
                return;
            }
            c17048.mo4051(mo11133);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38491(int i, String str) {
        try {
            this.f50312 = Pattern.compile(str, i);
        } catch (PatternSyntaxException unused) {
            throw new IllegalArgumentException("Unparseable regex supplied: ".concat(str));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Calendar m38494(String str) {
        return this.f50314.m40018(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m38492(int i) {
        MatchResult matchResult = this.f50313;
        if (matchResult == null) {
            return null;
        }
        return matchResult.group(i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m38493(String str) {
        this.f50313 = null;
        Matcher matcher = this.f50312.matcher(str);
        this.f50311 = matcher;
        if (matcher.matches()) {
            this.f50313 = this.f50311.toMatchResult();
        }
        return this.f50313 != null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m38495(String str) {
        m38491(0, str);
    }
}
