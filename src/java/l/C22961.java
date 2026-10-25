package l;

import java.util.List;

/* compiled from: T65P */
/* renamed from: l.᩺ۨ֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22961 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f73948;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f73949;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f73950;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13788 f73951;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13083 f73952;

    public C22961(C13788 c13788, AbstractC3206 abstractC3206) {
        List m33105;
        this.f73951 = c13788;
        try {
            m33105 = c13788.m33105();
            this.f73952 = new C13083(c13788, (AbstractC3206) ((C5323) m33105).get(abstractC3206.mo9844()));
            int mo9846 = abstractC3206.mo9846();
            this.f73950 = mo9846;
            int mo9843 = abstractC3206.mo9843();
            this.f73949 = mo9843;
            int mo9845 = abstractC3206.mo9845() / mo9843;
            this.f73948 = mo9845;
            if ((mo9845 * mo9843) + mo9846 > c13788.length()) {
                throw new C8145("Symbol table extends past end of file");
            }
        } catch (IndexOutOfBoundsException unused) {
            throw new C8145("String table section index is invalid");
        }
    }
}
