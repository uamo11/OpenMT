package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: 969A */
/* renamed from: l.ۤۜܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC10128 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f30483;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f30484;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f30485;

    /* renamed from: ֫ */
    public abstract void mo5346(C16560 c16560);

    /* renamed from: ۧ */
    public boolean mo19969(C16560 c16560) {
        return true;
    }

    /* renamed from: ܳ */
    public boolean mo9841() {
        return true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean mo25408() {
        return true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean mo25409() {
        return false;
    }

    public AbstractC10128(int i, int i2) {
        this.f30485 = i;
        this.f30483 = i2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m25407() {
        return this.f30485;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m25404() {
        return this.f30483;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25405(AbstractC10128 abstractC10128) {
        if (this.f30484 == null) {
            this.f30484 = new ArrayList();
        }
        this.f30484.add(abstractC10128);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m25406() {
        ArrayList arrayList = this.f30484;
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }
}
