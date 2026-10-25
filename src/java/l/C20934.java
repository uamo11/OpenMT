package l;

import java.io.IOException;
import java.io.StringReader;
import java.util.function.IntConsumer;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

/* compiled from: TBJG */
/* renamed from: l.᩷ܳۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20934 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ErrorHandler f67695 = new C6200();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9645 f67696;

    public C20934(C9645 c9645) {
        this.f67696 = c9645;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47756(StringReader stringReader, C13960 c13960) {
        int i;
        boolean z;
        StringBuilder sb;
        int i2;
        int i3;
        StringBuilder sb2;
        int i4;
        final StringBuilder sb3;
        StringBuilder sb4;
        StringBuilder sb5;
        StringBuilder sb6;
        StringBuilder sb7;
        StringBuilder sb8;
        AbstractC1883 m34830 = C14582.m34830(stringReader);
        i = c13960.f41663;
        c13960.f41663 = i + m34830.mo6231();
        z = c13960.f41664;
        if (!z) {
            boolean z2 = m34830 instanceof C23755;
            if (!z2) {
                sb4 = c13960.f41665;
                int lastIndexOf = sb4.lastIndexOf("\n");
                sb5 = c13960.f41665;
                if (lastIndexOf != sb5.length() - 1) {
                    sb6 = c13960.f41665;
                    int lastIndexOf2 = sb6.lastIndexOf("\r");
                    sb7 = c13960.f41665;
                    if (lastIndexOf2 != sb7.length() - 1) {
                        sb8 = c13960.f41665;
                        sb8.append("\n");
                    }
                }
            }
            if (!z2) {
                i4 = c13960.f41663;
                sb3 = c13960.f41665;
                C13803.range(0, i4).forEach(new IntConsumer() { // from class: l.ۤܿۡ
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i5) {
                        sb3.append(C20934.this.f67696.m24579());
                    }

                    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                        return C9407.$default$andThen(this, intConsumer);
                    }
                });
            }
        }
        if (m34830 instanceof C6822) {
            final StringBuilder sb9 = new StringBuilder(30);
            i3 = c13960.f41663;
            C13803.range(0, i3).forEach(new IntConsumer() { // from class: l.ۤܿۡ
                @Override // java.util.function.IntConsumer
                public final void accept(int i5) {
                    sb9.append(C20934.this.f67696.m24579());
                }

                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return C9407.$default$andThen(this, intConsumer);
                }
            });
            sb2 = c13960.f41665;
            String m6233 = m34830.m6233();
            String sb10 = sb9.toString();
            if (!m6233.startsWith("</") && !m6233.startsWith("<%") && !m6233.startsWith("<?") && !m6233.startsWith("<[")) {
                try {
                    m6233 = new C4000(this.f67696).m12055(new C19523().m44929(m6233), sb10);
                } catch (C15993 unused) {
                }
            }
            sb2.append(m6233);
        } else {
            sb = c13960.f41665;
            sb.append(m34830.m6233());
        }
        i2 = c13960.f41663;
        c13960.f41663 = i2 + m34830.mo6229();
        c13960.f41664 = m34830.mo6232();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m47758(String str) {
        StringBuilder sb;
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setValidating(false);
            newInstance.setNamespaceAware(true);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            xMLReader.setErrorHandler(f67695);
            xMLReader.parse(new InputSource(new StringReader(str)));
        } catch (Exception e) {
            if (e instanceof SAXParseException) {
                System.err.println("WARN: " + e.getMessage());
            } else {
                throw new IllegalArgumentException(e);
            }
        }
        StringReader stringReader = new StringReader(str);
        C13960 c13960 = new C13960();
        while (true) {
            try {
                stringReader.mark(1);
                int read = stringReader.read();
                stringReader.reset();
                if (read == -1) {
                    break;
                }
                m47756(stringReader, c13960);
            } catch (IOException e2) {
                System.out.println(e2.getMessage());
            }
        }
        stringReader.close();
        sb = c13960.f41665;
        return sb.toString();
    }
}
