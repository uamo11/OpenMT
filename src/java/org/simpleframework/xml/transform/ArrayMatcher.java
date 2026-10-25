package org.simpleframework.xml.transform;

/* loaded from: classes2.dex */
public class ArrayMatcher implements Matcher {
    public final Matcher primary;

    public ArrayMatcher(Matcher matcher) {
        this.primary = matcher;
    }

    @Override // org.simpleframework.xml.transform.Matcher
    public Transform match(Class cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType == Character.TYPE) {
            return new CharacterArrayTransform(componentType);
        }
        if (componentType == Character.class) {
            return new CharacterArrayTransform(componentType);
        }
        if (componentType == String.class) {
            return new StringArrayTransform();
        }
        return matchArray(componentType);
    }

    private Transform matchArray(Class cls) {
        Transform match = this.primary.match(cls);
        if (match == null) {
            return null;
        }
        return new ArrayTransform(match, cls);
    }
}
