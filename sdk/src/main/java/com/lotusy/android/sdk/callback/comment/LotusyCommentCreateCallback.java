package com.lotusy.android.sdk.callback.comment;

import com.lotusy.android.sdk.object.LotusyComment;
import com.lotusy.android.sdk.task.LotusyCallback;
import com.lotusy.android.sdk.task.LotusyTaskResult;

/**
 * Created by pshen on 2014-07-18.
 */
abstract public class LotusyCommentCreateCallback extends LotusyCallback {

    @Override
    protected void doCallback(Object args) {

    }

    abstract public void callback(LotusyTaskResult result, LotusyComment comment);
}
