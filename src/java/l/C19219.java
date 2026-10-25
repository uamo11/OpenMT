package l;

import java.util.BitSet;

/* compiled from: 9BH0 */
/* renamed from: l.᩵ۘܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public enum C19219 extends EnumC0873 {
    public /* synthetic */ C19219() {
        this("EVEN", 0);
    }

    public C19219(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC0873
    /* renamed from: ֫ */
    public int mo1286(BitSet bitSet, int i) {
        int nextClearBit = bitSet.nextClearBit(i);
        while (!C14984.m35484(nextClearBit)) {
            nextClearBit = bitSet.nextClearBit(nextClearBit + 1);
        }
        return nextClearBit;
    }
}
