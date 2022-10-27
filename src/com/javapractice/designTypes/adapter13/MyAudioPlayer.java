package com.javapractice.designTypes.adapter13;

public class MyAudioPlayer implements AudioPlayer{
    @Override
    public void playAudio(String fileName){
        System.out.println("Playing. Name:"+ fileName);
    }
}
