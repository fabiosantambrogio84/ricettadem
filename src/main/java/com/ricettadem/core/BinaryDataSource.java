package com.ricettadem.core;

import javax.activation.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BinaryDataSource implements DataSource {

    private InputStream inputStream;

    private String fileName;

    private String contentType;

    public BinaryDataSource(InputStream inputStream, String fileName, String contentType){
        this.inputStream = inputStream;
        this.fileName = fileName;
        this.contentType = contentType;
    }

    public String getContentType() {
        return contentType;
    }

    public InputStream getInputStream() throws IOException {
        return inputStream;
    }

    public String getName() {
        return fileName;
    }

    public OutputStream getOutputStream() throws IOException {
        throw new IOException("Cannot write to this file");
    }
}
