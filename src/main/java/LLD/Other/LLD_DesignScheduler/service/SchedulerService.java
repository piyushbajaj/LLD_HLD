package LLD.Other.LLD_DesignScheduler.service;

/**
 * Project: DSAlgo
 * Package: LLD.Other.LLD_DesignScheduler.service
 * <p>
 * User: piyushbajaj
 * Date: 17/04/23
 * Time: 5:31 pm
 */
public interface SchedulerService {
    public void schedule(Runnable task, int delay);
}
