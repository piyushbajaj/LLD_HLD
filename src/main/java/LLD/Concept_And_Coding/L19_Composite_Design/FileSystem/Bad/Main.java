package LLD.Concept_And_Coding.L19_Composite_Design.FileSystem.Bad;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L19_Composite_Design.FileSystem.Bad
 * <p>
 * User: piyushbajaj
 * Date: 18/04/23
 * Time: 8:39 pm
 */
public class Main {

    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");

        File border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
}
