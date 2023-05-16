package com.Credentials.Service;

import com.Credentials.Model.Log;

import java.util.List;

public interface LogService {
    void saveLog(Log log);

    List<Log> getAllLogs();
}
