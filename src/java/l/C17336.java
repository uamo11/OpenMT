package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

/* compiled from: 0AM9 */
/* renamed from: l.ܿ۫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17336 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Bundle m40666(C15818... c15818Arr) {
        Bundle bundle = new Bundle(c15818Arr.length);
        for (C15818 c15818 : c15818Arr) {
            String str = (String) c15818.m37450();
            Object m37451 = c15818.m37451();
            if (m37451 == null) {
                bundle.putString(str, null);
            } else if (m37451 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) m37451).booleanValue());
            } else if (m37451 instanceof Byte) {
                bundle.putByte(str, ((Number) m37451).byteValue());
            } else if (m37451 instanceof Character) {
                bundle.putChar(str, ((Character) m37451).charValue());
            } else if (m37451 instanceof Double) {
                bundle.putDouble(str, ((Number) m37451).doubleValue());
            } else if (m37451 instanceof Float) {
                bundle.putFloat(str, ((Number) m37451).floatValue());
            } else if (m37451 instanceof Integer) {
                bundle.putInt(str, ((Number) m37451).intValue());
            } else if (m37451 instanceof Long) {
                bundle.putLong(str, ((Number) m37451).longValue());
            } else if (m37451 instanceof Short) {
                bundle.putShort(str, ((Number) m37451).shortValue());
            } else if (m37451 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) m37451);
            } else if (m37451 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) m37451);
            } else if (m37451 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) m37451);
            } else if (m37451 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) m37451);
            } else if (m37451 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) m37451);
            } else if (m37451 instanceof char[]) {
                bundle.putCharArray(str, (char[]) m37451);
            } else if (m37451 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) m37451);
            } else if (m37451 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) m37451);
            } else if (m37451 instanceof int[]) {
                bundle.putIntArray(str, (int[]) m37451);
            } else if (m37451 instanceof long[]) {
                bundle.putLongArray(str, (long[]) m37451);
            } else if (m37451 instanceof short[]) {
                bundle.putShortArray(str, (short[]) m37451);
            } else if (m37451 instanceof Object[]) {
                Class<?> componentType = m37451.getClass().getComponentType();
                C11233.m27799(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) m37451);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) m37451);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) m37451);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) m37451);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (m37451 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) m37451);
            } else if (m37451 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) m37451);
            } else if (m37451 instanceof Size) {
                C18042.m42096(bundle, str, (Size) m37451);
            } else if (m37451 instanceof SizeF) {
                C18042.m42097(bundle, str, (SizeF) m37451);
            } else {
                throw new IllegalArgumentException("Illegal value type " + m37451.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }
}
