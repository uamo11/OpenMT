package l;

/* compiled from: H7RN */
/* renamed from: l.᩷ܺ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public enum C20975 extends EnumC0121 {
    public /* synthetic */ C20975(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("HELP", 43, "--help -help -?", "opt.help", enumC18467, enumC3650);
    }

    public C20975(String str, int i, String str2, String str3, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* renamed from: ֫ */
    public void mo1178(AbstractC0827 abstractC0827, String str) {
        C22364 mo3075 = abstractC0827.mo3075();
        String mo3080 = abstractC0827.mo3080();
        EnumC21659 enumC21659 = EnumC21659.STDOUT;
        C22364.m50100(mo3075.m50107(enumC21659), mo3075.m50109(EnumC15307.JAVAC, "msg.usage.header", mo3080));
        EnumC0121.m1171(mo3075, EnumC18467.STANDARD);
        mo3075.m50107(enumC21659).println();
        super.mo1178(abstractC0827, str);
    }
}
