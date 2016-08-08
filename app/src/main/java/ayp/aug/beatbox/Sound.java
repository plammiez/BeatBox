package ayp.aug.beatbox;

import android.util.Log;

import java.io.File;

/**
 * Created by Waraporn on 8/8/2016.
 */
public class Sound {

    private static final String TAG = "Sound";

    private String assetPath;
    private String name;
    private Integer soundID;

    public Sound(String assetPath){
        this.assetPath = assetPath;
        Log.d(TAG, "Asset Path= " + assetPath);

        String[] components = assetPath.split(File.separator);
        String fileName = components[components.length-1];
        name = fileName.replace(".wav", "");

        Log.d(TAG, "name= " + name + ", assetPath= " + assetPath);
    }

    public String getAssetPath(){
        return assetPath;
    }

    public String getName() {
        return name;
    }

    public Integer getSoundID() {
        return soundID;
    }

    public void setSoundID(Integer soundID) {
        this.soundID = soundID;
    }
}
