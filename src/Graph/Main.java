package Graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
//        graph.addVertex("D");

        if (graph.addEdge("A", "B") && graph.addEdge("A", "C")) {
            graph.printGraph();
        } else {
            System.out.println("There is some issue with the Vertexes, Please check your graph.");
            graph.printGraph();
        }

        if (graph.removeVertex("D")) {
            System.out.println("Vertex deleted..!!");
            graph.printGraph();
        } else {
            System.out.println("Vertex not available.");
            graph.printGraph();
        }

//        if(graph.removeEdge("A","B")){
//            System.out.println("Edge deleted successfully..!");
//            graph.printGraph();
//        } else {
//            System.out.println("There is some issue with the edges, Please the graph.");
//            graph.printGraph();
//        }

    }
}
