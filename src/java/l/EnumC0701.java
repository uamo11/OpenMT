package l;

/* compiled from: 53ZI */
/* renamed from: l.֡᩹۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum EnumC0701 {
    BOOLEAN,
    BYTE,
    SHORT,
    INT,
    LONG,
    CHAR,
    FLOAT,
    DOUBLE,
    VOID,
    NONE,
    NULL,
    ARRAY,
    DECLARED,
    ERROR,
    TYPEVAR,
    WILDCARD,
    PACKAGE,
    EXECUTABLE,
    OTHER,
    UNION,
    INTERSECTION,
    MODULE;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m2787() {
        switch (this) {
            case BOOLEAN:
            case BYTE:
            case SHORT:
            case INT:
            case LONG:
            case CHAR:
            case FLOAT:
            case DOUBLE:
                return true;
            default:
                return false;
        }
    }
}
