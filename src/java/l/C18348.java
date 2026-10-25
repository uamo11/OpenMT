package l;

import java.io.IOException;
import java.util.List;

/* compiled from: 86Y6 */
/* renamed from: l.ᩳ᩹ܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18348 extends AbstractC10503 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11293 f57020;

    public C18348(C11293 c11293) {
        super(c11293);
        this.f57020 = c11293;
    }

    @Override // l.AbstractC10503
    /* renamed from: ֫ */
    public final EnumC4858 mo8669(EnumC13324 enumC13324) {
        switch (C16936.f52007[enumC13324.ordinal()]) {
            case 1:
                return EnumC4858.SUPPORTED;
            case 2:
            case 3:
            case 4:
            case 5:
                return EnumC4858.BEST_EFFORT;
            case 6:
            case 7:
            case 8:
                return EnumC4858.BEST_EFFORT;
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    @Override // l.AbstractC10503
    /* renamed from: ܽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo8675() {
        /*
            r8 = this;
            l.۫᩵ܿ r0 = r8.mo8672()
            l.ۗ᩵ܿ r0 = r0.m30885()
            l.ۗ᩵ܿ r1 = l.EnumC3447.MISSING
            r2 = 0
            if (r0 != r1) goto L44
            r0 = 0
            l.ۧ᩹ܿ r3 = r8.f57020     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            l.᩵᩶ܿ r3 = r3.mo27937()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            l.ܶ᩵ܿ r4 = r8.f31505     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            java.lang.String r4 = r4.mo23554()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            r5 = 0
            java.io.OutputStream r4 = r3.m45380(r4, r5)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            r4.close()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            r3.f63634 = r0
            return
        L26:
            r2 = move-exception
            goto L3c
        L28:
            r4 = move-exception
            goto L2f
        L2a:
            r3 = move-exception
            goto L3f
        L2c:
            r3 = move-exception
            r4 = r3
            r3 = r2
        L2f:
            l.۬᩵ܿ r5 = l.EnumC13324.CREATE_FILE_EXCLUSIVE     // Catch: java.lang.Throwable -> L26
            l.ܶ᩵ܿ r6 = r8.f31505     // Catch: java.lang.Throwable -> L26
            java.lang.String r6 = r6.mo23554()     // Catch: java.lang.Throwable -> L26
            l.᩹᩵ܿ r2 = l.C22497.m50453(r5, r6, r2, r4)     // Catch: java.lang.Throwable -> L26
            throw r2     // Catch: java.lang.Throwable -> L26
        L3c:
            r7 = r3
            r3 = r2
            r2 = r7
        L3f:
            if (r2 == 0) goto L43
            r2.f63634 = r0
        L43:
            throw r3
        L44:
            l.۬᩵ܿ r0 = l.EnumC13324.CREATE_FILE_EXCLUSIVE
            l.᩸᩵ܿ r1 = l.EnumC21792.ALREADY_EXISTS
            l.ܶ᩵ܿ r3 = r8.f31505
            java.lang.String r3 = r3.mo23554()
            l.᩹᩵ܿ r0 = l.C22497.m50454(r0, r1, r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18348.mo8675():void");
    }

    @Override // l.AbstractC10503
    /* renamed from: ۜ */
    public final C12619 mo8672() {
        AbstractC15440 abstractC15440 = this.f31505;
        try {
            return m42769(abstractC15440, this.f57020.m27932());
        } catch (IOException e) {
            C22497 m50453 = C22497.m50453(EnumC13324.STAT, abstractC15440.mo23554(), (String) null, e);
            if (m50453.m50458() == EnumC21792.NOT_FOUND) {
                return C12619.m30881(abstractC15440);
            }
            throw m50453;
        }
    }

    @Override // l.AbstractC10503
    /* renamed from: ܳ */
    public final List mo8674() {
        return m42768(false);
    }

    @Override // l.AbstractC10503
    /* renamed from: ᩻ */
    public final List mo8678() {
        return m42768(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.ArrayList m42768(boolean r8) {
        /*
            r7 = this;
            l.۫᩵ܿ r0 = r7.mo8672()
            l.۬᩵ܿ r1 = l.EnumC13324.LIST
            r7.m42770(r0, r1)
            r0 = 0
            r2 = 0
            l.ۧ᩹ܿ r3 = r7.f57020     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            l.᩵᩶ܿ r3 = r3.mo27937()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            if (r8 == 0) goto L1f
            l.ܶ᩵ܿ r8 = r7.f31505     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
            java.lang.String r8 = r8.mo23554()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
            java.util.List r8 = r3.m45387(r8)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
            goto L2a
        L1f:
            l.ܶ᩵ܿ r8 = r7.f31505     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
            java.lang.String r8 = r8.mo23554()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
            r4 = 1
            java.util.List r8 = r3.m45350(r8, r4)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
        L2a:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
            int r5 = r8.size()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
            r4.<init>(r5)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
            java.util.Iterator r8 = r8.iterator()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
        L37:
            boolean r5 = r8.hasNext()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
            if (r5 == 0) goto L51
            java.lang.Object r5 = r8.next()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
            l.ܿ᩹ܿ r5 = (l.C17642) r5     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
            l.ۧ᩹ܿ r6 = r7.f57020     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
            l.ܶ᩵ܿ r6 = r6.mo27914(r5)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
            l.۫᩵ܿ r5 = m42769(r6, r5)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
            r4.add(r5)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L69
            goto L37
        L51:
            if (r3 == 0) goto L55
            r3.f63634 = r0
        L55:
            return r4
        L56:
            r8 = move-exception
            goto L5c
        L58:
            r8 = move-exception
            goto L6b
        L5a:
            r8 = move-exception
            r3 = r2
        L5c:
            l.۬᩵ܿ r4 = l.EnumC13324.LIST     // Catch: java.lang.Throwable -> L69
            l.ܶ᩵ܿ r5 = r7.f31505     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = r5.mo23554()     // Catch: java.lang.Throwable -> L69
            l.᩹᩵ܿ r8 = l.C22497.m50453(r4, r5, r2, r8)     // Catch: java.lang.Throwable -> L69
            throw r8     // Catch: java.lang.Throwable -> L69
        L69:
            r8 = move-exception
            r2 = r3
        L6b:
            if (r2 == 0) goto L6f
            r2.f63634 = r0
        L6f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18348.m42768(boolean):java.util.ArrayList");
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to calculate best type for var: r2v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r2v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r2v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r2v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r2v3 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0038: MOVE (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:17:0x0038 */
    @Override // l.AbstractC10503
    /* renamed from: ۧ */
    public final void mo8673() {
        /*
            r8 = this;
            l.۫᩵ܿ r0 = r8.mo8672()
            l.ۗ᩵ܿ r0 = r0.m30885()
            l.ۗ᩵ܿ r1 = l.EnumC3447.MISSING
            r2 = 0
            if (r0 != r1) goto L40
            r0 = 0
            l.ۧ᩹ܿ r3 = r8.f57020     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            l.᩵᩶ܿ r3 = r3.mo27937()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            l.ܶ᩵ܿ r4 = r8.f31505     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            java.lang.String r4 = r4.mo23554()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            r5 = 0
            r3.m45375(r4, r5)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            r3.f63634 = r0
            return
        L22:
            r2 = move-exception
            goto L38
        L24:
            r4 = move-exception
            goto L2b
        L26:
            r3 = move-exception
            goto L3b
        L28:
            r3 = move-exception
            r4 = r3
            r3 = r2
        L2b:
            l.۬᩵ܿ r5 = l.EnumC13324.CREATE_DIRECTORY_SINGLE     // Catch: java.lang.Throwable -> L22
            l.ܶ᩵ܿ r6 = r8.f31505     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = r6.mo23554()     // Catch: java.lang.Throwable -> L22
            l.᩹᩵ܿ r2 = l.C22497.m50453(r5, r6, r2, r4)     // Catch: java.lang.Throwable -> L22
            throw r2     // Catch: java.lang.Throwable -> L22
        L38:
            r7 = r3
            r3 = r2
            r2 = r7
        L3b:
            if (r2 == 0) goto L3f
            r2.f63634 = r0
        L3f:
            throw r3
        L40:
            l.۬᩵ܿ r0 = l.EnumC13324.CREATE_DIRECTORY_SINGLE
            l.᩸᩵ܿ r1 = l.EnumC21792.ALREADY_EXISTS
            l.ܶ᩵ܿ r3 = r8.f31505
            java.lang.String r3 = r3.mo23554()
            l.᩹᩵ܿ r0 = l.C22497.m50454(r0, r1, r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18348.mo8673():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    @Override // l.AbstractC10503
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo8676() {
        /*
            r8 = this;
            l.۫᩵ܿ r0 = r8.mo8672()
            l.ۗ᩵ܿ r1 = r0.m30885()
            l.ۗ᩵ܿ r2 = l.EnumC3447.MISSING
            r3 = 0
            if (r1 == r2) goto L64
            l.ۗ᩵ܿ r1 = r0.m30885()
            l.ۗ᩵ܿ r2 = l.EnumC3447.REGULAR
            if (r1 == r2) goto L2d
            l.ۗ᩵ܿ r0 = r0.m30885()
            l.ۗ᩵ܿ r1 = l.EnumC3447.LINK
            if (r0 != r1) goto L1e
            goto L2d
        L1e:
            l.۬᩵ܿ r0 = l.EnumC13324.DELETE_FILE_OR_LINK
            l.᩸᩵ܿ r1 = l.EnumC21792.NOT_REGULAR_FILE
            l.ܶ᩵ܿ r2 = r8.f31505
            java.lang.String r2 = r2.mo23554()
            l.᩹᩵ܿ r0 = l.C22497.m50454(r0, r1, r2, r3)
            throw r0
        L2d:
            r0 = 0
            l.ۧ᩹ܿ r2 = r8.f57020     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c
            l.᩵᩶ܿ r2 = r2.mo27937()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c
            l.ܶ᩵ܿ r4 = r8.f31505     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            java.lang.String r4 = r4.mo23554()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r2.m45363(r4)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            l.ۧ᩹ܿ r4 = r8.f57020     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r4.mo27930()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r2.f63634 = r0
            return
        L46:
            r3 = move-exception
            goto L5c
        L48:
            r4 = move-exception
            goto L4f
        L4a:
            r2 = move-exception
            goto L5f
        L4c:
            r2 = move-exception
            r4 = r2
            r2 = r3
        L4f:
            l.۬᩵ܿ r5 = l.EnumC13324.DELETE_FILE_OR_LINK     // Catch: java.lang.Throwable -> L46
            l.ܶ᩵ܿ r6 = r8.f31505     // Catch: java.lang.Throwable -> L46
            java.lang.String r6 = r6.mo23554()     // Catch: java.lang.Throwable -> L46
            l.᩹᩵ܿ r3 = l.C22497.m50453(r5, r6, r3, r4)     // Catch: java.lang.Throwable -> L46
            throw r3     // Catch: java.lang.Throwable -> L46
        L5c:
            r7 = r3
            r3 = r2
            r2 = r7
        L5f:
            if (r3 == 0) goto L63
            r3.f63634 = r0
        L63:
            throw r2
        L64:
            l.۬᩵ܿ r0 = l.EnumC13324.DELETE_FILE_OR_LINK
            l.᩸᩵ܿ r1 = l.EnumC21792.NOT_FOUND
            l.ܶ᩵ܿ r2 = r8.f31505
            java.lang.String r2 = r2.mo23554()
            l.᩹᩵ܿ r0 = l.C22497.m50454(r0, r1, r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18348.mo8676():void");
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to calculate best type for var: r2v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r2v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r2v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r2v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r2v3 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0039: MOVE (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:15:0x0039 */
    @Override // l.AbstractC10503
    /* renamed from: ᩳ */
    public final void mo8677() {
        /*
            r8 = this;
            l.۫᩵ܿ r0 = r8.mo8672()
            l.۬᩵ܿ r1 = l.EnumC13324.DELETE_EMPTY_DIRECTORY
            r8.m42770(r0, r1)
            r0 = 0
            r2 = 0
            l.ۧ᩹ܿ r3 = r8.f57020     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            l.᩵᩶ܿ r3 = r3.mo27937()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            l.ܶ᩵ܿ r4 = r8.f31505     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            java.lang.String r4 = r4.mo23554()     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            r3.m45379(r4)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            l.ۧ᩹ܿ r4 = r8.f57020     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            r4.mo27930()     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            r3.f63634 = r0
            return
        L23:
            r2 = move-exception
            goto L39
        L25:
            r4 = move-exception
            goto L2c
        L27:
            r3 = move-exception
            goto L3c
        L29:
            r3 = move-exception
            r4 = r3
            r3 = r2
        L2c:
            l.۬᩵ܿ r5 = l.EnumC13324.DELETE_EMPTY_DIRECTORY     // Catch: java.lang.Throwable -> L23
            l.ܶ᩵ܿ r6 = r8.f31505     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = r6.mo23554()     // Catch: java.lang.Throwable -> L23
            l.᩹᩵ܿ r2 = l.C22497.m50453(r5, r6, r2, r4)     // Catch: java.lang.Throwable -> L23
            throw r2     // Catch: java.lang.Throwable -> L23
        L39:
            r7 = r3
            r3 = r2
            r2 = r7
        L3c:
            if (r2 == 0) goto L40
            r2.f63634 = r0
        L40:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18348.mo8677():void");
    }

    @Override // l.AbstractC10503
    /* renamed from: ֫ */
    public final void mo8670(AbstractC15440 abstractC15440) {
        if (!abstractC15440.mo27917()) {
            throw C22497.m50454(EnumC13324.RENAME_NO_REPLACE, EnumC21792.CROSS_BACKEND, this.f31505.mo23554(), abstractC15440.mo23554());
        }
        EnumC3447 m30885 = mo8672().m30885();
        EnumC3447 enumC3447 = EnumC3447.MISSING;
        if (m30885 == enumC3447) {
            throw C22497.m50454(EnumC13324.RENAME_NO_REPLACE, EnumC21792.NOT_FOUND, this.f31505.mo23554(), abstractC15440.mo23554());
        }
        if (abstractC15440.mo23558().mo8672().m30885() != enumC3447) {
            throw C22497.m50454(EnumC13324.RENAME_NO_REPLACE, EnumC21792.ALREADY_EXISTS, this.f31505.mo23554(), abstractC15440.mo23554());
        }
        C19697 c19697 = null;
        try {
            try {
                c19697 = this.f57020.mo27937();
                c19697.m45383(this.f31505.mo23554(), abstractC15440.mo23554());
                this.f57020.mo27930();
                if (abstractC15440 instanceof C11293) {
                    ((C11293) abstractC15440).mo27930();
                }
                c19697.f63634 = 0L;
            } catch (IOException e) {
                throw C22497.m50453(EnumC13324.RENAME_NO_REPLACE, this.f31505.mo23554(), abstractC15440.mo23554(), e);
            }
        } catch (Throwable th) {
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC10503
    /* renamed from: ۧ */
    public final void mo10993(AbstractC15440 abstractC15440) {
        if (!abstractC15440.mo27917()) {
            throw C22497.m50454(EnumC13324.REPLACE, EnumC21792.CROSS_BACKEND, this.f31505.mo23554(), abstractC15440.mo23554());
        }
        if (mo8672().m30885() == EnumC3447.MISSING) {
            throw C22497.m50454(EnumC13324.REPLACE, EnumC21792.NOT_FOUND, this.f31505.mo23554(), abstractC15440.mo23554());
        }
        C19697 c19697 = null;
        try {
            try {
                c19697 = this.f57020.mo27937();
                c19697.m45383(this.f31505.mo23554(), abstractC15440.mo23554());
                this.f57020.mo27930();
                if (abstractC15440 instanceof C11293) {
                    ((C11293) abstractC15440).mo27930();
                }
                c19697.f63634 = 0L;
            } catch (IOException e) {
                throw C22497.m50453(EnumC13324.REPLACE, this.f31505.mo23554(), abstractC15440.mo23554(), e);
            }
        } catch (Throwable th) {
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12619 m42769(AbstractC15440 abstractC15440, C17642 c17642) {
        EnumC3447 enumC3447;
        char m41288 = c17642.m41288();
        if (m41288 == 'l') {
            enumC3447 = EnumC3447.LINK;
        } else if (m41288 == '-') {
            enumC3447 = EnumC3447.REGULAR;
        } else if (m41288 == 'd') {
            enumC3447 = EnumC3447.DIRECTORY;
        } else {
            enumC3447 = EnumC3447.OTHER;
        }
        EnumC3447 enumC34472 = enumC3447;
        return new C12619(abstractC15440, enumC34472, enumC34472 == EnumC3447.DIRECTORY ? -1L : c17642.m41290(), c17642.m41284(), enumC34472 == EnumC3447.LINK ? c17642.m41285() : null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42770(C12619 c12619, EnumC13324 enumC13324) {
        EnumC3447 m30885 = c12619.m30885();
        EnumC3447 enumC3447 = EnumC3447.MISSING;
        AbstractC15440 abstractC15440 = this.f31505;
        if (m30885 == enumC3447) {
            throw C22497.m50454(enumC13324, EnumC21792.NOT_FOUND, abstractC15440.mo23554(), (String) null);
        }
        if (c12619.m30885() != EnumC3447.DIRECTORY) {
            throw C22497.m50454(enumC13324, EnumC21792.NOT_DIRECTORY, abstractC15440.mo23554(), (String) null);
        }
    }
}
