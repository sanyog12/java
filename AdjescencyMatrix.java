/**
 * AdjancencyList
 */
public class AdjescencyMatrix {

    private boolean[][] adjmat;
    private int vertices;

    public AdjescencyMatrix(int vertices) {
        this.vertices = vertices;
        adjmat = new boolean[vertices][vertices];
    }

    public void addEdge(int i, int j) {
        adjmat[i][j] = true;
        adjmat[j][i] = true;

    }

    public void removeEdge(int i, int j) {
        adjmat[i][j] = false;
        adjmat[j][i] = false;
    }

    public String toString() {
        StringBuilder ob = new StringBuilder();
        for (int i = 0; i < adjmat.length; i++) {
            for (int j = 0; j < adjmat.length; j++) {
                ob.append("\t");
                ob.append((adjmat[i][j] ? 1 : 0));
            }
            ob.append("\n");
        }
        return ob.toString();
    }

    public static void main(String[] args) {
        AdjescencyMatrix ob = new AdjescencyMatrix(5);
        ob.addEdge(0, 1);
        ob.addEdge(0, 2);
        ob.addEdge(1, 3);
        ob.addEdge(2, 3);
        ob.addEdge(2, 4);
        System.out.print(ob);
    }
}
