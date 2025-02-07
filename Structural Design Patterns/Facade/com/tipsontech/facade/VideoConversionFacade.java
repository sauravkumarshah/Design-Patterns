package com.tipsontech.facade;

import com.tipsontech.facade.subsystem.AudioMixer;
import com.tipsontech.facade.subsystem.BitrateReader;
import com.tipsontech.facade.subsystem.Codec;
import com.tipsontech.facade.subsystem.CodecFactory;
import com.tipsontech.facade.subsystem.MPEG4CompressionCodec;
import com.tipsontech.facade.subsystem.OggCompressionCodec;
import com.tipsontech.facade.subsystem.VideoFile;

public class VideoConversionFacade {
    public VideoFile convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: Converting video...");
        
        VideoFile file = new VideoFile(fileName, "mp4");
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;

        if (format.equals("ogg")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile convertedVideo = BitrateReader.convert(buffer, destinationCodec);
        new AudioMixer().fixAudio(convertedVideo);

        System.out.println("Conversion complete: " + convertedVideo.getName() + "." + convertedVideo.getFormat());
        return convertedVideo;
    }
}
