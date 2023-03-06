package org.example.features.sealed_classes;

//So we have sealed classes that can explicitly tell who can
//extend our class or who can implement our interface
//we can add a new modifier called sealed
//We need to give permits clause to tell who can extend this class
//But all the extending classes should be final, sealed, nonsealed
public sealed abstract class AudioFile permits MP3File{
}
