package com.github.huangjianfu.db;

import com.github.huangjianfu.entities.ThreadInfo;

import java.util.List;

/**
 * Created by huangjianfu on 16/5/18.
 */
public interface ThreadDAO {
    public void insertThread(ThreadInfo threadInfo);
    public void deleteThread(String url,int thread_id);
    public void updateThread(String url,int thread_id,int finished);
    public List<ThreadInfo> getThreads(String url);
    public boolean isExists(String url,int thread_id);
}
