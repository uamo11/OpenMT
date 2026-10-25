package l;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: N673 */
/* renamed from: l.ܿ۬ᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17372 extends AbstractC5650 {
    public static final /* synthetic */ int d = 0;
    public static final long serialVersionUID = 8386373296231747096L;
    public final String b;
    public final transient C15960 c;

    public static C17372 b0(String str, boolean z) {
        C15960 c15960;
        C11003.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i == 0) && ((charAt < '0' || charAt > '9' || i == 0) && ((charAt != '~' || i == 0) && ((charAt != '.' || i == 0) && ((charAt != '_' || i == 0) && ((charAt != '+' || i == 0) && (charAt != '-' || i == 0))))))))) {
                    throw new C16232("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                c15960 = C3967.a(str);
            } catch (C2556 e) {
                if (z) {
                    throw e;
                }
                c15960 = null;
            }
            return new C17372(str, c15960);
        }
        throw new C16232("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public C17372(String str, C15960 c15960) {
        this.b = str;
        this.c = c15960;
    }

    @Override // l.AbstractC5650
    public final String k() {
        return this.b;
    }

    @Override // l.AbstractC5650
    public final C15960 W() {
        C15960 c15960 = this.c;
        return c15960 != null ? c15960 : C3967.a(this.b);
    }

    private Object writeReplace() {
        return new C20613((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.AbstractC5650
    public final void a0(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.b);
    }
}
