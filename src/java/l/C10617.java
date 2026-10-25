package l;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: E87U */
/* renamed from: l.ۤ᩻ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10617 extends AbstractC8333 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15387 f31887 = new C12733();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f31888;

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            c23525.m51981();
            return;
        }
        synchronized (this) {
            format = this.f31888.format((java.util.Date) date);
        }
        c23525.m51984(format);
    }

    public /* synthetic */ C10617(int i) {
        this();
    }

    public C10617() {
        this.f31888 = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        Date date;
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        String m40399 = c17175.m40399();
        synchronized (this) {
            TimeZone timeZone = this.f31888.getTimeZone();
            try {
                try {
                    date = new Date(this.f31888.parse(m40399).getTime());
                } catch (ParseException e) {
                    throw new C14682("Failed parsing '" + m40399 + "' as SQL Date; at path " + c17175.m40393(), e);
                }
            } finally {
                this.f31888.setTimeZone(timeZone);
            }
        }
        return date;
    }
}
