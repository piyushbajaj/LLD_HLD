package LLD.Concept_And_Coding.L19_Composite_Design.FileSystem.Good;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L19_Composite_Design.FileSystem.Bad.FileSystem
 * <p>
 * User: piyushbajaj
 * Date: 18/04/23
 * Time: 8:50 pm
 */
public class Directory implements FileSystem {

    String directoryName;
    List<FileSystem> fileSystems;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileSystems = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name: " + directoryName);

        for (FileSystem fileSystem : fileSystems) {
            fileSystem.ls();
        }
    }
}
