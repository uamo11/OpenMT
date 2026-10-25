package l;

import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '᩹' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: 067E */
/* renamed from: l.᩻ۤܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class EnumC23637 implements InterfaceC16724 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC23637 f76583;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC23637[] f76584 = m52134();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final EnumC23637 f76585;

    public abstract /* synthetic */ Object apply(Object obj);

    public EnumC23637(String str, int i) {
    }

    public /* synthetic */ EnumC23637(String str, int i, C1765 c1765) {
        this(str, i);
    }

    public static EnumC23637 valueOf(String str) {
        return (EnumC23637) Enum.valueOf(EnumC23637.class, str);
    }

    public static EnumC23637[] values() {
        return (EnumC23637[]) f76584.clone();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC23637[] m52134() {
        return new EnumC23637[]{f76585, f76583};
    }

    static {
        final String str = "KEY";
        final int i = 0;
        f76585 = new EnumC23637(str, i) { // from class: l.ܿۤܺ
            {
                C1765 c1765 = null;
            }

            @Override // l.EnumC23637, l.InterfaceC16724
            /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        };
        final String str2 = "VALUE";
        final int i2 = 1;
        f76583 = new EnumC23637(str2, i2) { // from class: l.ܳۤܺ
            {
                C1765 c1765 = null;
            }

            @Override // l.EnumC23637, l.InterfaceC16724
            /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        };
    }
}
