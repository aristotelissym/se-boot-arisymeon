package gr.codehub.exone.structures;

public class Structures {
    List list = new List();
    Duplicate duplicate = new Duplicate();
    Descending descending = new Descending();
    StackReverse stackReverse = new StackReverse();
    Symmetric symmetric = new Symmetric();
    Stack stack = new Stack();

    public void Structures () {
        //Ex201
        list.getPrimeList();

        //Ex202
        duplicate.findDuplicates();

        //Ex203
        descending.descDigit();

        //Ex204
        stack.stackSimulation();

        //Ex205
        stackReverse.stackString();

        //Ex206
        symmetric.findSymmetric();
    }
}
