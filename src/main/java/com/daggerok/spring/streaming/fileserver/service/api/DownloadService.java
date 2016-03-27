package com.daggerok.spring.streaming.fileserver.service.api;

import com.daggerok.spring.streaming.fileserver.domain.FileItem;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface DownloadService {
    List<FileItem> search(String path);

    void download(String id, HttpServletResponse response);
}