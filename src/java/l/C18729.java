package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.Writer;

/* compiled from: 65V2 */
/* renamed from: l.ᩴۨ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18729 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3912 f59201;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f59202;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f59203;

    public C18729(AbstractC3912 abstractC3912, int i) {
        this.f59201 = abstractC3912;
        this.f59202 = i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m43364() {
        return this.f59202;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43378(int i) {
        this.f59202 = i;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m43362() {
        int i;
        m43355();
        int i2 = this.f59202;
        int i3 = i2 + 1;
        AbstractC3912 abstractC3912 = this.f59201;
        byte mo11933 = abstractC3912.mo11933(i2);
        int i4 = mo11933 & 255;
        if (i4 <= 127) {
            i = (i4 << 25) >> 25;
        } else {
            int i5 = i2 + 2;
            byte mo119332 = abstractC3912.mo11933(i3);
            int i6 = mo119332 & 255;
            int i7 = ((mo119332 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (mo11933 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i6 <= 127) {
                i = (i7 << 18) >> 18;
            } else {
                int i8 = i2 + 3;
                byte mo119333 = abstractC3912.mo11933(i5);
                int i9 = mo119333 & 255;
                int i10 = i7 | ((mo119333 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14);
                if (i9 <= 127) {
                    i = (i10 << 11) >> 11;
                    i3 = i8;
                } else {
                    i5 = i2 + 4;
                    byte mo119334 = abstractC3912.mo11933(i8);
                    int i11 = mo119334 & 255;
                    int i12 = i10 | ((mo119334 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21);
                    if (i11 <= 127) {
                        i = (i12 << 4) >> 4;
                    } else {
                        int i13 = i2 + 5;
                        int mo119335 = abstractC3912.mo11933(i5) & 255;
                        if (mo119335 > 127) {
                            throw new C15431(null, "Invalid sleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f59202));
                        }
                        int i14 = i12 | (mo119335 << 28);
                        i3 = i13;
                        i = i14;
                    }
                }
            }
            i3 = i5;
        }
        this.f59202 = i3;
        return i;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m43368() {
        return m43353(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m43353(boolean z) {
        m43355();
        int i = this.f59202;
        int i2 = i + 1;
        AbstractC3912 abstractC3912 = this.f59201;
        byte mo11933 = abstractC3912.mo11933(i);
        int i3 = mo11933 & 255;
        if (i3 > 127) {
            int i4 = i + 2;
            byte mo119332 = abstractC3912.mo11933(i2);
            int i5 = mo119332 & 255;
            int i6 = ((mo119332 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (mo11933 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i5 > 127) {
                int i7 = i + 3;
                byte mo119333 = abstractC3912.mo11933(i4);
                int i8 = mo119333 & 255;
                i3 = ((mo119333 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | i6;
                if (i8 > 127) {
                    i2 = i + 4;
                    byte mo119334 = abstractC3912.mo11933(i7);
                    int i9 = mo119334 & 255;
                    i3 |= (mo119334 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21;
                    if (i9 > 127) {
                        int i10 = i + 5;
                        byte mo119335 = abstractC3912.mo11933(i2);
                        if (mo119335 < 0) {
                            throw new C15431(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f59202));
                        }
                        if ((mo119335 & 15) > 7 && !z) {
                            throw new C15431(null, "Encountered valid uleb128 that is out of range at offset 0x%x", Integer.valueOf(this.f59202));
                        }
                        i3 |= mo119335 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                        i2 = i10;
                    }
                } else {
                    i2 = i7;
                }
            } else {
                i3 = i6;
                i2 = i4;
            }
        }
        this.f59202 = i2;
        return i3;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m43363() {
        return m43353(true);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m43360() {
        m43355();
        int i = this.f59202;
        int i2 = i + 1;
        AbstractC3912 abstractC3912 = this.f59201;
        byte mo11933 = abstractC3912.mo11933(i);
        int i3 = mo11933 & 255;
        if (i3 > 127) {
            int i4 = i + 2;
            byte mo119332 = abstractC3912.mo11933(i2);
            int i5 = mo119332 & 255;
            int i6 = ((mo119332 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (mo11933 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i5 > 127) {
                int i7 = i + 3;
                byte mo119333 = abstractC3912.mo11933(i4);
                int i8 = mo119333 & 255;
                i3 = ((mo119333 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | i6;
                if (i8 > 127) {
                    i2 = i + 4;
                    byte mo119334 = abstractC3912.mo11933(i7);
                    int i9 = mo119334 & 255;
                    i3 |= (mo119334 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21;
                    if (i9 > 127) {
                        int i10 = i + 5;
                        byte mo119335 = abstractC3912.mo11933(i2);
                        if (mo119335 < 0) {
                            throw new C15431(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f59202));
                        }
                        i3 |= mo119335 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                        i2 = i10;
                    }
                } else {
                    i2 = i7;
                }
            } else {
                i3 = i6;
                i2 = i4;
            }
        }
        this.f59202 = i2;
        return i3;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m43354() {
        m43355();
        int i = this.f59202;
        int i2 = i + 1;
        AbstractC3912 abstractC3912 = this.f59201;
        if (abstractC3912.mo11933(i) < 0) {
            int i3 = i + 2;
            if (abstractC3912.mo11933(i2) < 0) {
                i2 = i + 3;
                if (abstractC3912.mo11933(i3) < 0) {
                    i3 = i + 4;
                    if (abstractC3912.mo11933(i2) < 0) {
                        i2 = i + 5;
                        if (abstractC3912.mo11933(i3) < 0) {
                            throw new C15431(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f59202));
                        }
                    }
                }
            }
            i2 = i3;
        }
        this.f59202 = i2;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m43366() {
        return this.f59201.m11936(this.f59202);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m43371() {
        return this.f59201.m11942(this.f59202);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m43358() {
        int i = this.f59202;
        int m11942 = this.f59201.m11942(i);
        this.f59202 = i + 1;
        return m11942;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m43377() {
        int i = this.f59202;
        byte mo11933 = this.f59201.mo11933(i);
        this.f59202 = i + 1;
        return mo11933;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m43376() {
        this.f59202++;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43356(int i) {
        this.f59202 += i;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m43379() {
        return this.f59201.m11936(this.f59202 + 2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m43365(int i) {
        return this.f59201.mo11937(this.f59202 + i);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m43373() {
        return this.f59201.mo11943(this.f59202 + 2);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m43369() {
        return this.f59201.mo11933(this.f59202 + 1);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m43370(int i) {
        int mo11933;
        int mo119332;
        int mo119333;
        m43355();
        int i2 = this.f59202;
        AbstractC3912 abstractC3912 = this.f59201;
        if (i != 1) {
            if (i == 2) {
                mo119332 = abstractC3912.mo11933(i2) & 255;
                mo119333 = abstractC3912.mo11933(i2 + 1) << 8;
            } else if (i == 3) {
                mo119332 = (abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8);
                mo119333 = abstractC3912.mo11933(i2 + 2) << 16;
            } else if (i == 4) {
                mo119332 = (abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16);
                mo119333 = abstractC3912.mo11933(i2 + 3) << 24;
            } else {
                throw new C15431(null, "Invalid size %d for sized int at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f59202));
            }
            mo11933 = mo119333 | mo119332;
        } else {
            mo11933 = abstractC3912.mo11933(i2);
        }
        this.f59202 = i2 + i;
        return mo11933;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m43380(int i) {
        m43355();
        int i2 = this.f59202;
        AbstractC3912 abstractC3912 = this.f59201;
        int i3 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        byte mo11933 = abstractC3912.mo11933(i2 + 3);
                        if (mo11933 < 0) {
                            throw new C15431(null, "Encountered valid sized uint that is out of range at offset 0x%x", Integer.valueOf(this.f59202));
                        }
                        i3 = mo11933 << 24;
                    } else {
                        throw new C15431(null, "Invalid size %d for sized uint at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f59202));
                    }
                }
                i3 |= (abstractC3912.mo11933(i2 + 2) & 255) << 16;
            }
            i3 |= (abstractC3912.mo11933(i2 + 1) & 255) << 8;
        }
        int mo119332 = (abstractC3912.mo11933(i2) & 255) | i3;
        this.f59202 = i2 + i;
        return mo119332;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m43372(int i) {
        int mo11933;
        int mo119332;
        byte mo119333;
        m43355();
        int i2 = this.f59202;
        AbstractC3912 abstractC3912 = this.f59201;
        if (i != 1) {
            if (i == 2) {
                mo119332 = (abstractC3912.mo11933(i2) & 255) << 16;
                mo119333 = abstractC3912.mo11933(i2 + 1);
            } else if (i == 3) {
                mo119332 = ((abstractC3912.mo11933(i2) & 255) << 8) | ((abstractC3912.mo11933(i2 + 1) & 255) << 16);
                mo119333 = abstractC3912.mo11933(i2 + 2);
            } else if (i == 4) {
                mo119332 = (abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16);
                mo119333 = abstractC3912.mo11933(i2 + 3);
            } else {
                throw new C15431(null, "Invalid size %d for sized, right extended int at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f59202));
            }
            mo11933 = (mo119333 << 24) | mo119332;
        } else {
            mo11933 = abstractC3912.mo11933(i2) << 24;
        }
        this.f59202 = i2 + i;
        return mo11933;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m43367(int i) {
        long mo11933;
        long mo119332;
        byte mo119333;
        m43355();
        int i2 = this.f59202;
        AbstractC3912 abstractC3912 = this.f59201;
        switch (i) {
            case 1:
                mo11933 = abstractC3912.mo11933(i2) << 56;
                this.f59202 = i2 + i;
                return mo11933;
            case 2:
                mo119332 = (abstractC3912.mo11933(i2) & 255) << 48;
                mo119333 = abstractC3912.mo11933(i2 + 1);
                mo11933 = mo119332 | (mo119333 << 56);
                this.f59202 = i2 + i;
                return mo11933;
            case 3:
                mo119332 = ((abstractC3912.mo11933(i2) & 255) << 40) | ((255 & abstractC3912.mo11933(i2 + 1)) << 48);
                mo119333 = abstractC3912.mo11933(i2 + 2);
                mo11933 = mo119332 | (mo119333 << 56);
                this.f59202 = i2 + i;
                return mo11933;
            case 4:
                mo119332 = ((abstractC3912.mo11933(i2) & 255) << 32) | ((abstractC3912.mo11933(i2 + 1) & 255) << 40) | ((255 & abstractC3912.mo11933(i2 + 2)) << 48);
                mo119333 = abstractC3912.mo11933(i2 + 3);
                mo11933 = mo119332 | (mo119333 << 56);
                this.f59202 = i2 + i;
                return mo11933;
            case 5:
                mo119332 = ((abstractC3912.mo11933(i2 + 1) & 255) << 32) | ((abstractC3912.mo11933(i2) & 255) << 24) | ((abstractC3912.mo11933(i2 + 2) & 255) << 40) | ((255 & abstractC3912.mo11933(i2 + 3)) << 48);
                mo119333 = abstractC3912.mo11933(i2 + 4);
                mo11933 = mo119332 | (mo119333 << 56);
                this.f59202 = i2 + i;
                return mo11933;
            case 6:
                mo119332 = ((abstractC3912.mo11933(i2 + 2) & 255) << 32) | ((abstractC3912.mo11933(i2) & 255) << 16) | ((abstractC3912.mo11933(i2 + 1) & 255) << 24) | ((abstractC3912.mo11933(i2 + 3) & 255) << 40) | ((255 & abstractC3912.mo11933(i2 + 4)) << 48);
                mo119333 = abstractC3912.mo11933(i2 + 5);
                mo11933 = mo119332 | (mo119333 << 56);
                this.f59202 = i2 + i;
                return mo11933;
            case 7:
                mo119332 = ((abstractC3912.mo11933(i2 + 3) & 255) << 32) | ((abstractC3912.mo11933(i2) & 255) << 8) | ((abstractC3912.mo11933(i2 + 1) & 255) << 16) | ((abstractC3912.mo11933(i2 + 2) & 255) << 24) | ((abstractC3912.mo11933(i2 + 4) & 255) << 40) | ((255 & abstractC3912.mo11933(i2 + 5)) << 48);
                mo119333 = abstractC3912.mo11933(i2 + 6);
                mo11933 = mo119332 | (mo119333 << 56);
                this.f59202 = i2 + i;
                return mo11933;
            case 8:
                mo119332 = ((abstractC3912.mo11933(i2 + 4) & 255) << 32) | (abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16) | ((abstractC3912.mo11933(i2 + 3) & 255) << 24) | ((abstractC3912.mo11933(i2 + 5) & 255) << 40) | ((255 & abstractC3912.mo11933(i2 + 6)) << 48);
                mo119333 = abstractC3912.mo11933(i2 + 7);
                mo11933 = mo119332 | (mo119333 << 56);
                this.f59202 = i2 + i;
                return mo11933;
            default:
                throw new C15431(null, "Invalid size %d for sized, right extended long at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f59202));
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m43374(int i) {
        int mo11933;
        int mo119332;
        int mo119333;
        long j;
        long mo119334;
        long mo119335;
        long mo119336;
        long mo119337;
        m43355();
        int i2 = this.f59202;
        AbstractC3912 abstractC3912 = this.f59201;
        switch (i) {
            case 1:
                mo11933 = abstractC3912.mo11933(i2);
                j = mo11933;
                this.f59202 = i2 + i;
                return j;
            case 2:
                mo119332 = abstractC3912.mo11933(i2) & 255;
                mo119333 = abstractC3912.mo11933(i2 + 1) << 8;
                mo11933 = mo119332 | mo119333;
                j = mo11933;
                this.f59202 = i2 + i;
                return j;
            case 3:
                mo119332 = (abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8);
                mo119333 = abstractC3912.mo11933(i2 + 2) << 16;
                mo11933 = mo119332 | mo119333;
                j = mo11933;
                this.f59202 = i2 + i;
                return j;
            case 4:
                mo119334 = (abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16);
                mo119335 = abstractC3912.mo11933(i2 + 3) << 24;
                j = mo119334 | mo119335;
                this.f59202 = i2 + i;
                return j;
            case 5:
                mo119334 = (abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16) | ((255 & abstractC3912.mo11933(i2 + 3)) << 24);
                mo119335 = abstractC3912.mo11933(i2 + 4) << 32;
                j = mo119334 | mo119335;
                this.f59202 = i2 + i;
                return j;
            case 6:
                mo119336 = ((abstractC3912.mo11933(i2 + 4) & 255) << 32) | (abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16) | ((abstractC3912.mo11933(i2 + 3) & 255) << 24);
                mo119337 = abstractC3912.mo11933(i2 + 5) << 40;
                j = mo119337 | mo119336;
                this.f59202 = i2 + i;
                return j;
            case 7:
                mo119336 = ((abstractC3912.mo11933(i2 + 4) & 255) << 32) | (abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16) | ((abstractC3912.mo11933(i2 + 3) & 255) << 24) | ((255 & abstractC3912.mo11933(i2 + 5)) << 40);
                mo119337 = abstractC3912.mo11933(i2 + 6) << 48;
                j = mo119337 | mo119336;
                this.f59202 = i2 + i;
                return j;
            case 8:
                mo119334 = ((abstractC3912.mo11933(i2 + 6) & 255) << 48) | ((abstractC3912.mo11933(i2 + 4) & 255) << 32) | (abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16) | ((abstractC3912.mo11933(i2 + 3) & 255) << 24) | ((abstractC3912.mo11933(i2 + 5) & 255) << 40);
                mo119335 = abstractC3912.mo11933(i2 + 7) << 56;
                j = mo119334 | mo119335;
                this.f59202 = i2 + i;
                return j;
            default:
                throw new C15431(null, "Invalid size %d for sized long at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f59202));
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m43361(int i) {
        m43355();
        int[] iArr = new int[1];
        String m20525 = C7671.m20525(this.f59201, this.f59202, i, iArr);
        this.f59202 += iArr[0];
        return m20525;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43357(int i, Writer writer, boolean z) {
        m43355();
        int i2 = this.f59202;
        this.f59202 = C7671.m20524(writer, this.f59201, i2, i, z) + i2;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m43359() {
        if (this.f59203) {
            return;
        }
        this.f59203 = true;
        this.f59201.m11934(this);
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m43375() {
        this.f59203 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43355() {
        if (this.f59203) {
            throw new IllegalStateException("Recycled");
        }
    }
}
