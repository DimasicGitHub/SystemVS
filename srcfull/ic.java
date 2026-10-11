/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ic
implements ScheduledExecutorService {
    private final /* synthetic */ ScheduledExecutorService a;

    public /* synthetic */ ic(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override
    public /* bridge */ /* synthetic */ void shutdown() {
        this.a.shutdown();
    }

    private /* bridge */ /* synthetic */ boolean a() {
        return this.a.isShutdown() || this.a.isTerminated();
    }

    @Override
    public /* bridge */ /* synthetic */ void execute(Runnable runnable) {
        if (this.a()) {
            return;
        }
        try {
            this.a.execute(runnable);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            // empty catch block
        }
    }

    @Override
    public /* bridge */ /* synthetic */ boolean isTerminated() {
        return this.a.isTerminated();
    }

    public /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long l2, TimeUnit timeUnit) {
        if (this.a()) {
            return eS.INSTANCE;
        }
        try {
            return this.a.schedule(runnable, l2, timeUnit);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            return eS.INSTANCE;
        }
    }

    public /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long l2, TimeUnit timeUnit) {
        if (this.a()) {
            return eS.a();
        }
        try {
            return this.a.schedule(callable, l2, timeUnit);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            return eS.a();
        }
    }

    @Override
    public /* bridge */ /* synthetic */ boolean isShutdown() {
        return this.a.isShutdown();
    }

    public /* bridge */ /* synthetic */ List invokeAll(Collection collection, long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.a.invokeAll(collection, l2, timeUnit);
    }

    public /* bridge */ /* synthetic */ List invokeAll(Collection collection) throws InterruptedException {
        return this.a.invokeAll(collection);
    }

    public /* bridge */ /* synthetic */ Object invokeAny(Collection collection) throws InterruptedException, ExecutionException {
        return this.a.invokeAny(collection);
    }

    public /* bridge */ /* synthetic */ Object invokeAny(Collection collection, long l2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.a.invokeAny(collection, l2, timeUnit);
    }

    @Override
    public /* bridge */ /* synthetic */ boolean awaitTermination(long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.a.awaitTermination(l2, timeUnit);
    }

    public /* bridge */ /* synthetic */ Future submit(Callable callable) {
        if (this.a()) {
            return CompletableFuture.completedFuture(null);
        }
        try {
            return this.a.submit(callable);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            return CompletableFuture.completedFuture(null);
        }
    }

    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object object) {
        if (this.a()) {
            return CompletableFuture.completedFuture(object);
        }
        try {
            return this.a.submit(runnable, object);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            return CompletableFuture.completedFuture(object);
        }
    }

    public /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        if (this.a()) {
            return CompletableFuture.completedFuture(null);
        }
        try {
            return this.a.submit(runnable);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            return CompletableFuture.completedFuture(null);
        }
    }

    public /* bridge */ /* synthetic */ List shutdownNow() {
        return this.a.shutdownNow();
    }

    public /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        if (this.a()) {
            return eS.INSTANCE;
        }
        try {
            return this.a.scheduleWithFixedDelay(runnable, l2, l3, timeUnit);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            return eS.INSTANCE;
        }
    }

    public /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        if (this.a()) {
            return eS.INSTANCE;
        }
        try {
            return this.a.scheduleAtFixedRate(runnable, l2, l3, timeUnit);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            return eS.INSTANCE;
        }
    }
}

