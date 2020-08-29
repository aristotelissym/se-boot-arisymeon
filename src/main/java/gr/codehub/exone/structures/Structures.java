package gr.codehub.exone.structures;

public class Structures {
    List list = new List();
    Duplicate duplicate = new Duplicate();
    Descending descending = new Descending();
    StackReverse stack = new StackReverse();
    Symmetric symmetric = new Symmetric();

    public void Structures () {
        //Ex201
        list.getPrimeList();

        //Ex202
        duplicate.findDuplicates();

        //Ex203
        descending.descDigit();

        //Ex204
        stack.stackString();

        //Ex205
        symmetric.findSymmetric();
    }
}
