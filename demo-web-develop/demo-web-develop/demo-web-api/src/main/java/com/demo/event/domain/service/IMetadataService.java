package com.demo.event.domain.service;

import com.amazonaws.services.s3.model.S3Object;
import com.demo.event.domain.model.FileMeta;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface IMetadataService {
    public void upload(MultipartFile file) throws IOException;

    public S3Object download(Long id);

    public List<FileMeta> list();

    String uploadAndGenerateDownloadLink(byte[] excelBytes);

    Boolean deleteFile(final String fileName);

    List<String> listFiles();
}
