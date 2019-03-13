package com.atyouyou;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {

    public List<AbstractFile> fileList = new ArrayList<>();

    String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        for (Object obj :fileList) {
            ((AbstractFile)obj).killVirus();
        }
    }
}
