package org.bouncycastle.jcajce;

import java.util.Collection;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

/* loaded from: classes.dex */
public interface PKIXCertStore extends Store {
    @Override // org.bouncycastle.util.Store
    Collection getMatches(Selector selector);
}
