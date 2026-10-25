package res;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import java.nio.ByteOrder;
import l.C6270;
import l.InterfaceC7765;
import l.InterfaceC7785;

/* loaded from: MT2.26.10.apk:assets/Hex.class */
public class Hex {
    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
        	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    public Hex(l.RunnableC5152 r3) {
        /*
            r2 = this;
            r0 = r2
            super/*android.accessibilityservice.AccessibilityService*/.onCreate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: res.Hex.m30326(l.ۚۚᩳ):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    /* JADX WARN: Type inference failed for: r0v11, types: [long[], void] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.animation.Animator, void] */
    /* renamed from: ֫ */
    public static void m30327(C6270 c6270) {
        ?? onDestroy = AccessibilityService.onDestroy();
        ?? settingsActivityName = AccessibilityServiceInfo.getSettingsActivityName();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        settingsActivityName.cancel();
        ?? end = settingsActivityName.end();
        ?? r0 = new long[onDestroy.length / 8];
        end.getDuration();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int[], void] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.animation.Animator, long] */
    /* renamed from: ֫ */
    public static void m30328(InterfaceC7765 interfaceC7765) {
        ?? onDestroy = AccessibilityService.onDestroy();
        ?? settingsActivityName = AccessibilityServiceInfo.getSettingsActivityName();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        settingsActivityName.cancel();
        ?? startDelay = settingsActivityName.getStartDelay();
        ?? r0 = new int[onDestroy.length / 4];
        startDelay.isPaused();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    /* JADX WARN: Type inference failed for: r0v11, types: [long, short[], void] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.animation.Animator, boolean] */
    /* renamed from: ֫ */
    public static void m30329(InterfaceC7785 interfaceC7785) {
        ?? onDestroy = AccessibilityService.onDestroy();
        ?? settingsActivityName = AccessibilityServiceInfo.getSettingsActivityName();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        settingsActivityName.cancel();
        ?? isRunning = settingsActivityName.isRunning();
        ?? r0 = new short[onDestroy.length / 2];
        isRunning.setDuration(r0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v28 ??, still in use, count: 2, list:
          (r0v28 ?? I:java.lang.Throwable) from 0x00d1: THROW (r0v28 ?? I:java.lang.Throwable)
          (r0v28 ?? I:android.animation.Animator) from 0x00ce: INVOKE (r0v28 ?? I:android.animation.Animator) SUPER call: android.animation.Animator.start():void A[MD:():void (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.animation.Animator, java.lang.RuntimeException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.animation.Animator, java.lang.RuntimeException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, void] */
    /* JADX WARN: Type inference failed for: r0v5, types: [byte[], void] */
    /* renamed from: ֫ */
    public static void m30127(l.InterfaceC7785 r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: res.Hex.m30127(l.۟᩺ᩳ, boolean):void");
    }
}
