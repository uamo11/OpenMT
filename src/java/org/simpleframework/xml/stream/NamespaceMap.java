package org.simpleframework.xml.stream;

import java.util.Iterator;

/* loaded from: classes2.dex */
public interface NamespaceMap extends Iterable {
    String getPrefix();

    String getPrefix(String str);

    String getReference(String str);

    @Override // java.lang.Iterable
    Iterator iterator();

    String setReference(String str);

    String setReference(String str, String str2);
}
