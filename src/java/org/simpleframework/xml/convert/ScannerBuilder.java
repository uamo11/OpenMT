package org.simpleframework.xml.convert;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.util.ConcurrentCache;

/* loaded from: classes2.dex */
public class ScannerBuilder extends ConcurrentCache {
    public Scanner build(Class cls) {
        Scanner scanner = (Scanner) get(cls);
        if (scanner != null) {
            return scanner;
        }
        Entry entry = new Entry(cls);
        put(cls, entry);
        return entry;
    }

    public class Entry extends ConcurrentCache implements Scanner {
        public final Class root;

        public Entry(Class cls) {
            this.root = cls;
        }

        @Override // org.simpleframework.xml.convert.Scanner
        public Annotation scan(Class cls) {
            if (!contains(cls)) {
                Annotation find = find(cls);
                if (cls != null && find != null) {
                    put(cls, find);
                }
            }
            return (Annotation) get(cls);
        }

        private Annotation find(Class cls) {
            for (Class cls2 = this.root; cls2 != null; cls2 = cls2.getSuperclass()) {
                Annotation annotation = cls2.getAnnotation(cls);
                if (annotation != null) {
                    return annotation;
                }
            }
            return null;
        }
    }
}
