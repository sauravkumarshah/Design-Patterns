package com.tipsontech.facade.subsystem;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("Reading file using " + codec.getType() + " codec...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("Converting file to " + codec.getType() + " format...");
        return new VideoFile(buffer.getName(), codec.getType());
    }
}

