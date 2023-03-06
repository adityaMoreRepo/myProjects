package org.example.features.sealed_classes;

//We'll give final modifier so no one will extend this sealed class.
//If I gave non-sealed everyone could extend MP3File class.
//If I gave sealed again I have to use permits clause.
//Hence, it adds robustness to the code.
public final class MP3File extends AudioFile{

}
