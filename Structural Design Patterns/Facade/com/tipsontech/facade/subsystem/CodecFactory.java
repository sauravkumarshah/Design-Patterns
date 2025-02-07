package com.tipsontech.facade.subsystem;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        if (file.getFormat().equals("mp4")) {
            return new MPEG4CompressionCodec();
        } else {
            return new OggCompressionCodec();
        }
    }
}

