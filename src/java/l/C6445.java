package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R7DV */
/* renamed from: l.ۜ֫֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C6445 extends AbstractC11817 {

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19927 = 0;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final boolean f19928;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public String f19929;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public int f19930;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public String f19931;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f19932;

    public C6445(AbstractC11817 abstractC11817, boolean z) {
        super(abstractC11817);
        this.f19929 = "@+";
        this.f19931 = "@-";
        this.f19932 = new ArrayList();
        this.f19930 = 0;
        this.f19928 = z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo17803(DataInputStream dataInputStream) {
        this.f19930 = dataInputStream.readShort();
        short readShort = dataInputStream.readShort();
        for (int i = 0; i < readShort; i++) {
            C7856 c7856 = new C7856(this.f35257);
            c7856.f24357 = null;
            c7856.f24358 = dataInputStream.readShort();
            c7856.f24357 = C7856.m21046(dataInputStream, c7856.f35257, this.f19928);
            c7856.f35255.m45778("AnnotationElement: cpIndex#%d=%s value=%s", Integer.valueOf(c7856.f24358), c7856.f35264.m25965(c7856.f24358, new C22536(5)), c7856.f24357.toString());
            this.f19932.add(c7856);
        }
    }

    @Override // l.AbstractC9701, l.InterfaceC17482
    /* renamed from: ۧ */
    public final void mo3021() {
        String m14172;
        String m25965 = this.f35264.m25965(this.f19930, new C8264(4));
        if (this.f29326) {
            StringBuilder sb = new StringBuilder("#");
            sb.append(this.f19930);
            sb.append((m25965 == null || this.f29343) ? "" : C4860.m14172(" /* ", m25965, " */"));
            m14172 = sb.toString();
        } else if (m25965 == null) {
            m14172 = "#" + this.f19930;
        } else {
            m14172 = C4860.m14172("\"", m25965, "\"");
        }
        int i = C23378.f75117[m28902().ordinal()];
        boolean z = this.f19928;
        if (i == 1) {
            m24662(" default { ");
            m24658(z ? this.f19931 : this.f19929);
            m24654(m14172);
            this.f29349 = this.f29349;
        } else if (i == 2 || i == 3) {
            this.f29325.mo1968(z ? this.f19931 : this.f19929);
            m24654(m14172);
        } else {
            m24658(z ? this.f19931 : this.f19929);
            m24654(m14172);
        }
        mo17804();
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17802() {
        ArrayList arrayList = this.f19932;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C7856 c7856 = (C7856) it.next();
            c7856.f29349 = this.f29349;
            c7856.m24647(this);
            c7856.m24664(1);
            c7856.mo3021();
            int i2 = i + 1;
            m24662(i < arrayList.size() - 1 ? "," : "");
            i = i2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C20177.m46410(sb, this.f19928 ? this.f19931 : this.f19929, this.f35264.m25965(this.f19930, new C14205(0)), "{");
        return C9045.m23341(sb, (String) C5378.stream(this.f19932).map(new C21670(3)).collect(C22976.joining(",")), l.d);
    }

    public final boolean isEmpty() {
        return this.f19932.isEmpty();
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void mo17804() {
        ArrayList arrayList = this.f19932;
        if (arrayList.isEmpty()) {
            m24654(" { }");
            return;
        }
        int i = C23378.f75117[m28902().ordinal()];
        if (i != 1) {
            if (i != 3) {
                m24662(" {");
                m17802();
                m24658(l.d);
                return;
            } else {
                m24664(1);
                m24665("{");
                m17802();
                m24658(l.d);
                m24653(1);
                return;
            }
        }
        m24662(" {");
        int i2 = this.f29349;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7856 c7856 = (C7856) it.next();
            m24654(m24663(i2, ""));
            c7856.mo22276(EnumC6172.RIGHT_OPERAND);
            c7856.mo3021();
        }
        m24667();
        m24653(1);
        m24658(l.d);
    }
}
