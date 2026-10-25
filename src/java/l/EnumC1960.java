package l;

import java.util.EnumSet;
import java.util.function.Consumer;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v21 l.֫ܿ֨, still in use, count: 1, list:
  (r0v21 l.֫ܿ֨) from 0x0160: INVOKE (r0v21 l.֫ܿ֨) STATIC call: java.util.EnumSet.of(java.lang.Enum):java.util.EnumSet A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>):java.util.EnumSet<E extends java.lang.Enum<E>> (c), WRAPPED] (LINE:113)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: Q3ZI */
/* renamed from: l.֫ܿ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class EnumC1960 {
    NONE("No options"),
    CONSTANT_POOL("Constant Pool"),
    PRINT_BCI("Program Counter - for all instructions"),
    LABELS("Labels (as identifiers)"),
    CP_INDEX("CP index along with arguments"),
    LINE_NUMBER_TABLE_Numbers("Line Numbers in comments"),
    LINE_NUMBER_TABLE_Lines("Java Source Lines in comments"),
    LINE_NUMBER_TABLE_Table("LineNumberTable attribute as table"),
    LINE_NUMBER_TABLE_All("Line Numbers, Source Lines, attribute as Table", new C13974()),
    LOCAL_VARIABLE_Vars("Print LocalVariableTable attribute"),
    LOCAL_VARIABLE_Types("Print LocalVariableTypeTable attribute"),
    LOCAL_VARIABLE_All("Print both LocalVariableTable and LocalVariableTypeTable attributes", new C14855(2)),
    HEX("Numbers as hexadecimals"),
    TRACE("Print internal traces, debug information"),
    SYSINFO("system information"),
    NO_COMMENTS("No comments, suppress printing comments"),
    VERBOSE("Verbose information"),
    TABLE("Attributes as table"),
    DROP_Source("Discard SourceFile attribute"),
    DROP_Signatures("Discard Signature attribute"),
    DROP_Classes("Discard this_class and super_class pair"),
    DROP_CharacterRange("Discard CharacterRangeTable attribute"),
    DROP_All("Discard SourceFile, CharacterRangeTable attributes, this_class and super_class pair", new C7625()),
    DETAILED_Output("Detailed output"),
    EXTRA_DETAILED_Output("Detailed output, this_class and super_class pair"),
    BEST_EFFORT("Print as much as possible despite errors");


    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final EnumSet f6532 = EnumSet.of(new EnumC1960("Discard CharacterRangeTable attribute"));

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Consumer f6560;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f6561;

    public static EnumC1960 valueOf(String str) {
        return (EnumC1960) Enum.valueOf(EnumC1960.class, str);
    }

    public static EnumC1960[] values() {
        return (EnumC1960[]) f6556.clone();
    }

    static {
    }

    public EnumC1960(String str) {
        this.f6561 = str;
        this.f6560 = null;
    }

    public EnumC1960(String str, Consumer consumer) {
        this.f6561 = str;
        this.f6560 = consumer;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m6452() {
        Consumer consumer = this.f6560;
        if (consumer != null) {
            consumer.accept(this);
        } else {
            C11133.m27615(this);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC1960 m6444(String str, String str2) {
        int lastIndexOf;
        for (EnumC1960 enumC1960 : values()) {
            String name = enumC1960.name();
            if (name.startsWith(str) && (lastIndexOf = enumC1960.name().lastIndexOf(95)) > 0 && name.substring(lastIndexOf + 1).equalsIgnoreCase(str2)) {
                return enumC1960;
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m6453() {
        return !f6532.contains(this);
    }
}
