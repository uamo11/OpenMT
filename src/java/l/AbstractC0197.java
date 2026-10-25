package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: E1HX */
/* renamed from: l.֡ۚ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC0197 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC0197 f1440 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC0197 f1435 = null;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC0197 f1436 = null;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC0197 f1439 = null;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC0197 f1438 = null;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f1437 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo1345(InterfaceC10076 interfaceC10076);

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String mo1356() {
        return "";
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC0197 m1352() {
        return this.f1438;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC0197 m1354() {
        return this.f1439;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC0197 m1341() {
        return this.f1435;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC0197 m1349() {
        return this.f1436;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC0197 mo1355() {
        return this.f1440;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo1353(AbstractC0197 abstractC0197) {
        this.f1440 = abstractC0197;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m1343(AbstractC0197 abstractC0197) {
        abstractC0197.m1348();
        abstractC0197.mo1353(this);
        AbstractC0197 abstractC01972 = this.f1436;
        if (abstractC01972 != null) {
            abstractC01972.f1438 = abstractC0197;
            abstractC0197.f1439 = abstractC01972;
        } else {
            this.f1435 = abstractC0197;
        }
        this.f1436 = abstractC0197;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1346(C13994 c13994) {
        c13994.m1348();
        c13994.f1440 = this;
        AbstractC0197 abstractC0197 = this.f1435;
        if (abstractC0197 != null) {
            abstractC0197.f1439 = c13994;
            c13994.f1438 = abstractC0197;
            this.f1435 = c13994;
        } else {
            this.f1435 = c13994;
            this.f1436 = c13994;
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m1348() {
        AbstractC0197 abstractC0197 = this.f1439;
        if (abstractC0197 != null) {
            abstractC0197.f1438 = this.f1438;
        } else {
            AbstractC0197 abstractC01972 = this.f1440;
            if (abstractC01972 != null) {
                abstractC01972.f1435 = this.f1438;
            }
        }
        AbstractC0197 abstractC01973 = this.f1438;
        if (abstractC01973 != null) {
            abstractC01973.f1439 = abstractC0197;
        } else {
            AbstractC0197 abstractC01974 = this.f1440;
            if (abstractC01974 != null) {
                abstractC01974.f1436 = abstractC0197;
            }
        }
        this.f1440 = null;
        this.f1438 = null;
        this.f1439 = null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m1350(AbstractC0197 abstractC0197) {
        abstractC0197.m1348();
        AbstractC0197 abstractC01972 = this.f1438;
        abstractC0197.f1438 = abstractC01972;
        if (abstractC01972 != null) {
            abstractC01972.f1439 = abstractC0197;
        }
        abstractC0197.f1439 = this;
        this.f1438 = abstractC0197;
        AbstractC0197 abstractC01973 = this.f1440;
        abstractC0197.f1440 = abstractC01973;
        if (abstractC0197.f1438 == null) {
            abstractC01973.f1436 = abstractC0197;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1344(C3726 c3726) {
        c3726.m1348();
        AbstractC0197 abstractC0197 = this.f1439;
        c3726.f1439 = abstractC0197;
        if (abstractC0197 != null) {
            abstractC0197.f1438 = c3726;
        }
        c3726.f1438 = this;
        this.f1439 = c3726;
        AbstractC0197 abstractC01972 = this.f1440;
        c3726.f1440 = abstractC01972;
        if (c3726.f1439 == null) {
            abstractC01972.f1435 = c3726;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m1351() {
        ArrayList arrayList = this.f1437;
        return arrayList != null ? C20195.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1342(List list) {
        if (list.isEmpty()) {
            this.f1437 = null;
        } else {
            this.f1437 = new ArrayList(list);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1347(C19954 c19954) {
        if (this.f1437 == null) {
            this.f1437 = new ArrayList();
        }
        this.f1437.add(c19954);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        return C9045.m23341(sb, mo1356(), l.d);
    }
}
