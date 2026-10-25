package com.amazonaws.util.json;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.json.GsonFactory;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l.C20195;

/* loaded from: classes.dex */
public class JsonUtils {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AwsJsonFactory f867 = new GsonFactory();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Map m811(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        StringReader stringReader = new StringReader(str);
        ((GsonFactory) f867).getClass();
        GsonFactory.GsonReader gsonReader = new GsonFactory.GsonReader(stringReader);
        try {
            if (gsonReader.m803() == null) {
                return Collections.EMPTY_MAP;
            }
            HashMap hashMap = new HashMap();
            gsonReader.m802();
            while (gsonReader.m808()) {
                String m805 = gsonReader.m805();
                if (gsonReader.m807()) {
                    gsonReader.m809();
                } else {
                    hashMap.put(m805, gsonReader.m810());
                }
            }
            gsonReader.m806();
            gsonReader.m804();
            return C20195.unmodifiableMap(hashMap);
        } catch (IOException e) {
            throw new AmazonClientException("Unable to parse JSON String.", e);
        }
    }
}
