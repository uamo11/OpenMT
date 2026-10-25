package l;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: G851 */
/* renamed from: l.ۤܿۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10429 extends AbstractC8333 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15387 f31334 = new C3373();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f31335;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC12545 f31336;

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            c23525.m51981();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f31335.get(0);
        synchronized (this.f31335) {
            format = dateFormat.format(date);
        }
        c23525.m51984(format);
    }

    public C10429(int i) {
        ArrayList arrayList = new ArrayList();
        this.f31335 = arrayList;
        this.f31336 = AbstractC12545.f37672;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C11861.m28970()) {
            arrayList.add(new SimpleDateFormat(C22870.m50967("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        Date m50596;
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        String m40399 = c17175.m40399();
        synchronized (this.f31335) {
            Iterator it = this.f31335.iterator();
            while (true) {
                if (!it.hasNext()) {
                    try {
                        m50596 = C22611.m50596(m40399, new ParsePosition(0));
                        break;
                    } catch (ParseException e) {
                        StringBuilder m9834 = C3200.m9834("Failed parsing '", m40399, "' as Date; at path ");
                        m9834.append(c17175.m40393());
                        throw new C14682(m9834.toString(), e);
                    }
                }
                DateFormat dateFormat = (DateFormat) it.next();
                TimeZone timeZone = dateFormat.getTimeZone();
                try {
                    m50596 = dateFormat.parse(m40399);
                    dateFormat.setTimeZone(timeZone);
                    break;
                } catch (ParseException unused) {
                    dateFormat.setTimeZone(timeZone);
                } catch (Throwable th) {
                    dateFormat.setTimeZone(timeZone);
                    throw th;
                }
            }
        }
        ((C13250) this.f31336).getClass();
        return m50596;
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f31335.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
