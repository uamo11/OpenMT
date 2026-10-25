package l;

/* compiled from: 55UE */
/* renamed from: l.ᩳܶۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18127 extends AbstractC15452 {
    public C18127(AbstractC15452 abstractC15452) {
        super(589824, abstractC15452);
    }

    @Override // l.AbstractC15452
    /* renamed from: ֫ */
    public final void mo26971(Object obj) {
        if (obj == null) {
            mo28279(1);
            return;
        }
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= -1 && intValue <= 5) {
                mo28279(intValue + 3);
                return;
            }
            if (intValue <= 127 && intValue >= -128) {
                mo28290(16, intValue);
                return;
            } else if (intValue <= 32767 && intValue >= -32768) {
                mo28290(17, intValue);
                return;
            } else {
                super.mo26971(obj);
                return;
            }
        }
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            if (longValue == 0 || longValue == 1) {
                mo28279(((int) longValue) + 9);
                return;
            } else {
                super.mo26971(obj);
                return;
            }
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (floatValue == 0.0f) {
                mo28279(11);
                return;
            }
            if (floatValue == 1.0f) {
                mo28279(12);
                return;
            } else if (floatValue == 2.0f) {
                mo28279(13);
                return;
            } else {
                super.mo26971(obj);
                return;
            }
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue == 0.0d) {
                mo28279(14);
                return;
            } else if (doubleValue == 1.0d) {
                mo28279(15);
                return;
            } else {
                super.mo26971(obj);
                return;
            }
        }
        if (obj instanceof C11926) {
            switch (((C11926) obj).m29102()) {
                case 1:
                    mo26972("java/lang/Boolean", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 2:
                    mo26972("java/lang/Character", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 3:
                    mo26972("java/lang/Byte", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 4:
                    mo26972("java/lang/Short", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 5:
                    mo26972("java/lang/Integer", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 6:
                    mo26972("java/lang/Float", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 7:
                    mo26972("java/lang/Long", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 8:
                    mo26972("java/lang/Double", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                default:
                    super.mo26971(obj);
                    break;
            }
            return;
        }
        super.mo26971(obj);
    }
}
