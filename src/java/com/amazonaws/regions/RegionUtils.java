package com.amazonaws.regions;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class RegionUtils {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Log f409 = LogFactory.m303("com.amazonaws.request");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList f410;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m424() {
        synchronized (RegionUtils.class) {
            if (System.getProperty("com.amazonaws.regions.RegionUtils.fileOverride") != null) {
                try {
                    m425();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException("Couldn't find regions override file specified", e);
                }
            }
            if (f410 == null) {
                Log log = f409;
                if (log.mo293()) {
                    log.mo294("Initializing the regions with default regions");
                }
                f410 = RegionDefaults.m419();
            }
            if (f410 == null) {
                throw new RuntimeException("Failed to initialize the regions.");
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Region m423(String str) {
        ArrayList arrayList;
        synchronized (RegionUtils.class) {
            if (f410 == null) {
                m424();
            }
            arrayList = f410;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Region region = (Region) it.next();
            if (region.m416().equals(str)) {
                return region;
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m425() {
        String property = System.getProperty("com.amazonaws.regions.RegionUtils.fileOverride");
        Log log = f409;
        if (log.mo293()) {
            log.mo294("Using local override of the regions file (" + property + ") to initiate regions data...");
        }
        FileInputStream fileInputStream = new FileInputStream(new File(property));
        try {
            new RegionMetadataParser();
            f410 = RegionMetadataParser.m422(fileInputStream);
        } catch (Exception e) {
            log.mo298("Failed to parse regional endpoints", e);
        }
    }
}
