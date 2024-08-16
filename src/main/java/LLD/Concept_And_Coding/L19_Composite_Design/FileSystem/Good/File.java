package LLD.Concept_And_Coding.L19_Composite_Design.FileSystem.Good;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L19_Composite_Design.FileSystem.Bad.FileSystem
 * <p>
 * User: piyushbajaj
 * Date: 18/04/23
 * Time: 8:48 pm
 */
public class File implements FileSystem {
    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("File Name: " + fileName);
    }
}
