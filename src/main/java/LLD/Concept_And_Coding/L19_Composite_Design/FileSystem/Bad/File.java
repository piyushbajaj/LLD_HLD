package LLD.Concept_And_Coding.L19_Composite_Design.FileSystem.Bad;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L19_Composite_Design.FileSystem.Bad
 * <p>
 * User: piyushbajaj
 * Date: 18/04/23
 * Time: 8:34 pm
 */
public class File {
    String fileName;

    public File(String name) {
        this.fileName = name;
    }

    public void ls() {
        System.out.println("File Name: " + fileName);
    }
}
