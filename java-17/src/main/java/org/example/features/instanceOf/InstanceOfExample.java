package org.example.features.instanceOf;

public class InstanceOfExample {
    public static void main(String[] args) {
        AbstractFile abstractFile = new MusicFile();
        //Now all the methods in Music file are not accessible
        //abstractFile.playMusic;
        //Only implemented abstract methods are available.
        //To access those methods we can use typecasting
        useInstanceOf(abstractFile);
        //Now we can use playMusic which is part of the MusicFile class

    }

    private static void useInstanceOf(AbstractFile abstractFile) {
        //Old way
        if (abstractFile instanceof MusicFile){
            ((MusicFile)abstractFile).playMusic();
        }

        //New way
        //It creates a variable
        if(abstractFile instanceof MusicFile musicFile){
            musicFile.playMusic();
        }
    }


}
