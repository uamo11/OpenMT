.class public Lcom/umeng/commonsdk/internal/crash/UMCrashManager;
.super Ljava/lang/Object;
.source "UMCrashManager.java"


# static fields
.field public static final CM_VERSION:Ljava/lang/String; = "2.0"

.field public static isReportCrash:Z

.field public static mObject:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->mObject:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static buildEnvelope(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public static reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V
    .locals 3

    .line 35
    sget-object v0, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->mObject:Ljava/lang/Object;

    monitor-enter v0

    .line 36
    :try_start_0
    sget-boolean v1, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->isReportCrash:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 38
    sput-boolean v1, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->isReportCrash:Z

    .line 39
    invoke-static {p1}, Lcom/umeng/commonsdk/internal/crash/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    .line 41
    invoke-static {p0}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    move-result-object v1

    const v2, 0x8012

    .line 40
    invoke-static {p0, v2, v1, p1}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 44
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
