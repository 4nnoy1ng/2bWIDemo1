package at.dan.oo.projects.handy;

import java.util.ArrayList;
import java.util.List;

public class MemoryCard {
    private int capacity;
    private List<PhoneFile> files;

    public MemoryCard(int capacity){
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public void save (PhoneFile file){
        files.add(file);
    }

    public int getCapacity() {
        return capacity;
    }

    public  List<PhoneFile> getFiles() {
        return files;
    }

    public int getFreeSpace() {
        int size = 0;
        for (PhoneFile phoneFile : files) {
            size += phoneFile.getSize();
        }
        return capacity -size;
    }
}
