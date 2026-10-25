package org.simpleframework.xml.stream;

import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Field;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public class MyPullProvider implements Provider {
    public final XmlPullParserFactory factory;

    public static void inject() {
        try {
            Field declaredField = NodeBuilder.class.getDeclaredField("PROVIDER");
            declaredField.setAccessible(true);
            declaredField.set(null, new MyPullProvider());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MyPullProvider() {
        XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
        this.factory = newInstance;
        newInstance.setNamespaceAware(true);
        newInstance.setFeature("http://xmlpull.org/v1/doc/features.html#relaxed", true);
    }

    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(InputStream inputStream) {
        XmlPullParser newPullParser = this.factory.newPullParser();
        if (inputStream != null) {
            newPullParser.setInput(inputStream, null);
        }
        return new PullReader(newPullParser);
    }

    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(Reader reader) {
        XmlPullParser newPullParser = this.factory.newPullParser();
        if (reader != null) {
            newPullParser.setInput(reader);
        }
        return new PullReader(newPullParser);
    }
}
