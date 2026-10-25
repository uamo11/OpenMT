package l;

/* compiled from: K99P */
/* renamed from: l.ۖۘᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum EnumC2288 {
    ALWAYS_KEEP,
    ALWAYS_REMOVE,
    QUERY_PREFER_KEEP,
    QUERY_PREFER_REMOVE;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC2288 m7536() {
        char c;
        String string = ApplicationC20075.f65010.getString("keep_in_editor_options", "1");
        string.getClass();
        c = 2;
        switch (string) {
            case "0":
                c = 0;
                break;
            case "2":
                break;
            case "3":
                c = 3;
                break;
            default:
                c = 1;
                break;
        }
        return values()[c];
    }
}
