package l;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: V898 */
/* renamed from: l.ۨ᩻ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12028 extends AbstractC8333 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15387 f35981 = new C6383();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f35982;

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            c23525.m51981();
            return;
        }
        synchronized (this) {
            format = this.f35982.format((Date) time);
        }
        c23525.m51984(format);
    }

    public /* synthetic */ C12028(int i) {
        this();
    }

    public C12028() {
        this.f35982 = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        Time time;
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        String m40399 = c17175.m40399();
        synchronized (this) {
            TimeZone timeZone = this.f35982.getTimeZone();
            try {
                try {
                    time = new Time(this.f35982.parse(m40399).getTime());
                } catch (ParseException e) {
                    throw new C14682("Failed parsing '" + m40399 + "' as SQL Time; at path " + c17175.m40393(), e);
                }
            } finally {
                this.f35982.setTimeZone(timeZone);
            }
        }
        return time;
    }
}
