import java.util.PriorityQueue;

public class Dijkstra {
  public static void main(String[] args) {
    // Creazione dei nodi del grafo
    Node a = new Node("a");
    Node b = new Node("b");
    Node c = new Node("c");
    Node d = new Node("d");
    Node e = new Node("e");
    Node f = new Node("f");
    Node g = new Node("g");
    Node h = new Node("h");
    Node i = new Node("i");

    // Aggiunta degli archi al grafo
    a.addEdge(new Edge(b, 4));
    a.addEdge(new Edge(h, 8));
    b.addEdge(new Edge(a, 4));
    b.addEdge(new Edge(c, 8));
    b.addEdge(new Edge(h, 11));
    c.addEdge(new Edge(b, 8));
    c.addEdge(new Edge(d, 7));
    c.addEdge(new Edge(f, 4));
    c.addEdge(new Edge(i, 2));
    d.addEdge(new Edge(c, 7));
    d.addEdge(new Edge(e, 9));
    d.addEdge(new Edge(f, 14));
    e.addEdge(new Edge(d, 9));
    e.addEdge(new Edge(f, 10));
    f.addEdge(new Edge(c, 4));
    f.addEdge(new Edge(d, 14));
    f.addEdge(new Edge(e, 10));
    f.addEdge(new Edge(g, 2));
    g.addEdge(new Edge(f, 2));
    g.addEdge(new Edge(h, 1));
    g.addEdge(new Edge(i, 6));
    h.addEdge(new Edge(a, 8));
    h.addEdge(new Edge(b, 11));
    h.addEdge(new Edge(g, 1));
    h.addEdge(new Edge(i, 7));
    i.addEdge(new Edge(c, 2));
    i.addEdge(new Edge(g, 6));
    i.addEdge(new Edge(h, 7));

    // Applicazione dell'algoritmo di Dijkstra
    dijkstra(a);

    // Stampa delle distanze minime
    System.out.println("Punto d'inizio \t Distanza dalla fine");
    for (Node node : new Node[] { a, b, c, d, e, f, g, h, i }) {
      System.out.println(node.getId() + " \t\t " + node.getMinDistance());
    }
  }

  public static void dijkstra(Node source) {
    source.setMinDistance(0);

    PriorityQueue<Node> queue = new PriorityQueue<Node>();
    queue.add(source);

    while (!queue.isEmpty()) {
      Node u = queue.poll();

      for (Edge e : u.getEdges()) {
        Node v = e.getTarget();
        int weight = e.getWeight();
        int distanceThroughU = u.getMinDistance() + weight;

        if (distanceThroughU < v.getMinDistance()) {
          queue.remove(v);
          v.setMinDistance(distanceThroughU);
          v.setPrevious(u);
          queue.add(v);
        }
      }
    }
  }
}

