package l;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Q87M */
/* renamed from: l.ۛۖ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5779 implements InterfaceC15779 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7190 f17770;

    public C5779(C7190 c7190) {
        this.f17770 = c7190;
    }

    @Override // l.InterfaceC15779
    /* renamed from: ֫ */
    public final boolean mo3327(Object obj) {
        return ((C13539) obj).m32582();
    }

    @Override // l.InterfaceC15779
    /* renamed from: ۧ */
    public final String mo3328(Object obj) {
        return ((C13539) obj).m32581();
    }

    @Override // l.InterfaceC15779
    /* renamed from: ֫ */
    public final List mo3326(String str) {
        C1545 c1545;
        C7190 c7190 = this.f17770;
        try {
            String substring = AbstractC16891.m39731(str).substring(1);
            ArrayList arrayList = new ArrayList();
            String str2 = null;
            while (true) {
                c1545 = c7190.f22027;
                ObjectListing m448 = c1545.m448(new ListObjectsRequest(C7190.m19260(c7190), substring, str2, "/", 1000));
                Iterator it = m448.m609().iterator();
                while (it.hasNext()) {
                    arrayList.add(new C13539((String) it.next()));
                }
                Iterator it2 = m448.m613().iterator();
                while (it2.hasNext()) {
                    S3ObjectSummary s3ObjectSummary = (S3ObjectSummary) it2.next();
                    if (!s3ObjectSummary.m659().endsWith("/")) {
                        arrayList.add(new C13539(s3ObjectSummary));
                    }
                }
                if (!m448.m612() || Thread.currentThread().isInterrupted()) {
                    break;
                }
                str2 = m448.m611();
            }
            return arrayList;
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }
}
