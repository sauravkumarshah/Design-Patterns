package com.tipsontech.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        VideoConversionFacade facade = new VideoConversionFacade();
        
        // Converting a video from MP4 to OGG
        facade.convertVideo("sample_video", "ogg");
    }
}
