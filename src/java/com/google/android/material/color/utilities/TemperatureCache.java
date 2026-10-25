package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.C20195;
import l.C4331;
import l.C8200;

/* loaded from: classes.dex */
public final class TemperatureCache {
    public final Hct input;
    public Hct precomputedComplement;
    public List precomputedHctsByHue;
    public List precomputedHctsByTemp;
    public Map precomputedTempsByHct;

    public static boolean isBetween(double d, double d2, double d3) {
        return d2 < d3 ? d2 <= d && d <= d3 : d2 <= d || d <= d3;
    }

    public TemperatureCache() {
        throw new UnsupportedOperationException();
    }

    public TemperatureCache(Hct hct) {
        this.input = hct;
    }

    public Hct getComplement() {
        Hct hct = this.precomputedComplement;
        if (hct != null) {
            return hct;
        }
        double hue = getColdest().getHue();
        double doubleValue = ((Double) getTempsByHct().get(getColdest())).doubleValue();
        double hue2 = getWarmest().getHue();
        double doubleValue2 = ((Double) getTempsByHct().get(getWarmest())).doubleValue() - doubleValue;
        boolean isBetween = isBetween(this.input.getHue(), hue, hue2);
        double d = isBetween ? hue2 : hue;
        if (!isBetween) {
            hue = hue2;
        }
        Hct hct2 = (Hct) getHctsByHue().get((int) Math.round(this.input.getHue()));
        double relativeTemperature = 1.0d - getRelativeTemperature(this.input);
        double d2 = 1000.0d;
        for (double d3 = 0.0d; d3 <= 360.0d; d3 += 1.0d) {
            double sanitizeDegreesDouble = MathUtils.sanitizeDegreesDouble((1.0d * d3) + d);
            if (isBetween(sanitizeDegreesDouble, d, hue)) {
                Hct hct3 = (Hct) getHctsByHue().get((int) Math.round(sanitizeDegreesDouble));
                double abs = Math.abs(relativeTemperature - ((((Double) getTempsByHct().get(hct3)).doubleValue() - doubleValue) / doubleValue2));
                if (abs < d2) {
                    hct2 = hct3;
                    d2 = abs;
                }
            }
        }
        this.precomputedComplement = hct2;
        return hct2;
    }

    public List getAnalogousColors() {
        return getAnalogousColors(5, 12);
    }

    public List getAnalogousColors(int i, int i2) {
        int round = (int) Math.round(this.input.getHue());
        Hct hct = (Hct) getHctsByHue().get(round);
        double relativeTemperature = getRelativeTemperature(hct);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hct);
        double d = 0.0d;
        int i3 = 0;
        double d2 = 0.0d;
        while (i3 < 360) {
            double relativeTemperature2 = getRelativeTemperature((Hct) getHctsByHue().get(MathUtils.sanitizeDegreesInt(round + i3)));
            d2 += Math.abs(relativeTemperature2 - relativeTemperature);
            i3++;
            relativeTemperature = relativeTemperature2;
        }
        double d3 = d2 / i2;
        double relativeTemperature3 = getRelativeTemperature(hct);
        int i4 = 1;
        while (true) {
            if (arrayList.size() >= i2) {
                break;
            }
            Hct hct2 = (Hct) getHctsByHue().get(MathUtils.sanitizeDegreesInt(round + i4));
            double relativeTemperature4 = getRelativeTemperature(hct2);
            d += Math.abs(relativeTemperature4 - relativeTemperature3);
            boolean z = d >= ((double) arrayList.size()) * d3;
            int i5 = 1;
            while (z && arrayList.size() < i2) {
                arrayList.add(hct2);
                double d4 = relativeTemperature4;
                z = d >= ((double) (arrayList.size() + i5)) * d3;
                i5++;
                relativeTemperature4 = d4;
            }
            double d5 = relativeTemperature4;
            i4++;
            if (i4 > 360) {
                while (arrayList.size() < i2) {
                    arrayList.add(hct2);
                }
            } else {
                relativeTemperature3 = d5;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.input);
        int floor = (int) Math.floor((i - 1.0d) / 2.0d);
        for (int i6 = 1; i6 < floor + 1; i6++) {
            int i7 = 0 - i6;
            while (i7 < 0) {
                i7 += arrayList.size();
            }
            if (i7 >= arrayList.size()) {
                i7 %= arrayList.size();
            }
            arrayList2.add(0, (Hct) arrayList.get(i7));
        }
        int i8 = i - floor;
        for (int i9 = 1; i9 < i8; i9++) {
            int i10 = i9;
            while (i10 < 0) {
                i10 += arrayList.size();
            }
            if (i10 >= arrayList.size()) {
                i10 %= arrayList.size();
            }
            arrayList2.add((Hct) arrayList.get(i10));
        }
        return arrayList2;
    }

    public double getRelativeTemperature(Hct hct) {
        double doubleValue = ((Double) getTempsByHct().get(getWarmest())).doubleValue() - ((Double) getTempsByHct().get(getColdest())).doubleValue();
        double doubleValue2 = ((Double) getTempsByHct().get(hct)).doubleValue() - ((Double) getTempsByHct().get(getColdest())).doubleValue();
        if (doubleValue == 0.0d) {
            return 0.5d;
        }
        return doubleValue2 / doubleValue;
    }

    public static double rawTemperature(Hct hct) {
        double[] labFromArgb = ColorUtils.labFromArgb(hct.toInt());
        double sanitizeDegreesDouble = MathUtils.sanitizeDegreesDouble(Math.toDegrees(Math.atan2(labFromArgb[2], labFromArgb[1])));
        return (Math.cos(Math.toRadians(MathUtils.sanitizeDegreesDouble(sanitizeDegreesDouble - 50.0d))) * (Math.pow(Math.hypot(labFromArgb[1], labFromArgb[2]), 1.07d) * 0.02d)) - 0.5d;
    }

    private Hct getColdest() {
        return (Hct) getHctsByTemp().get(0);
    }

    private List getHctsByHue() {
        List list = this.precomputedHctsByHue;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            arrayList.add(Hct.from(d, this.input.getChroma(), this.input.getTone()));
        }
        List unmodifiableList = C20195.unmodifiableList(arrayList);
        this.precomputedHctsByHue = unmodifiableList;
        return unmodifiableList;
    }

    private List getHctsByTemp() {
        List list = this.precomputedHctsByTemp;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.input);
        Collections.sort(arrayList, C8200.comparing(new C4331(2, this), new TemperatureCache$$ExternalSyntheticLambda1()));
        this.precomputedHctsByTemp = arrayList;
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$getHctsByTemp$0(Hct hct) {
        return (Double) getTempsByHct().get(hct);
    }

    private Map getTempsByHct() {
        Map map = this.precomputedTempsByHct;
        if (map != null) {
            return map;
        }
        ArrayList arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.input);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Hct hct = (Hct) it.next();
            hashMap.put(hct, Double.valueOf(rawTemperature(hct)));
        }
        this.precomputedTempsByHct = hashMap;
        return hashMap;
    }

    private Hct getWarmest() {
        return (Hct) getHctsByTemp().get(getHctsByTemp().size() - 1);
    }
}
