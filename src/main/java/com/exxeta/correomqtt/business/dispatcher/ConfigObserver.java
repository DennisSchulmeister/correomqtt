package com.exxeta.correomqtt.business.dispatcher;

public interface ConfigObserver extends BaseObserver {
    void onConfigDirectoryEmpty();
    void onConfigDirectoryNotAccessible();
    void onAppDataNull();
    void onUserHomeNull();
    void onFileAlreadyExists();
    void onInvalidPath();
    void onInvalidJsonFormat();
    void onSavingFailed();
    void onSettingsUpdated();
    void onConnectionsUpdated();
    void onConfigPrepareFailed();
}
