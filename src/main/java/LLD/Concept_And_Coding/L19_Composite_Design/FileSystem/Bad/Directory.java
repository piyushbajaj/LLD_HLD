package LLD.Concept_And_Coding.L19_Composite_Design.FileSystem.Bad;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L19_Composite_Design.FileSystem.Bad
 * <p>
 * User: piyushbajaj
 * Date: 18/04/23
 * Time: 8:35 pm
 */
public class Directory {
    String directoryName;
    List<Object> objects;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        objects = new ArrayList<>();
    }

    public void add(Object object) {
        objects.add(object);
    }

    public void ls() {
        System.out.println("Directory Name: " + directoryName);
        for (Object o : objects) {
            if (o instanceof File) {
                ((File) o).ls();
            } else if (o instanceof Directory) {
                ((Directory) o).ls();
            }
        }
    }
}
